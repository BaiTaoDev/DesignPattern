package com.jamie.proxy.ownimpl;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class Proxy {
    private static String pathName = "E:/JavaStudy/proxy/";
    private static String dirname = pathName + "com/jamie/proxy";
    private static String classname = "$Proxy1";
    private static String filename = classname + ".java";

    public static Object newProxyInstance(Class commonInterface, InvocationHandler h) throws Exception {

        String interfaceName = commonInterface.getName();

        generateFile(interfaceName, commonInterface, h);

        //get the compiler
        //编译源码，生成class,注意编译环境要换成jdk1.6才有compiler,单纯的jre没有compiler，会空指针错误
        JavaCompiler jc = ToolProvider.getSystemJavaCompiler();
        //文件管事器
        StandardJavaFileManager fileMgr = jc.getStandardFileManager(null, null, null);
        //编译单元
        Iterable units = fileMgr.getJavaFileObjects(new File(dirname + "/" + filename));
        //编译任务
        CompilationTask t = jc.getTask(null, fileMgr, null, null, null, units);
        //编译
        t.call();

        //把类load到内存里
        URL[] urls = new URL[]{new URL("file:/" + pathName)};
        URLClassLoader uc = new URLClassLoader(urls);
        Class c = uc.loadClass("com.jamie.proxy." + classname);
        //生成实例
        Constructor ctr = c.getConstructor(InvocationHandler.class);
        return ctr.newInstance(h);
    }

    private static boolean generateFile(String interfaceName, Class interfaceClass, InvocationHandler h) throws Exception {
        boolean isGenerated = false;
        String javaString = "";
        String rt = "\r\n";
        javaString += "package com.jamie.proxy;" + rt +
                "import " + interfaceName + ";" + rt +
                "import java.lang.reflect.Method;" + rt +
                "public class " + classname + " implements " + interfaceName + " {" + rt +
                "    private InvocationHandler h;" + rt + rt +
                "    public " + classname + "(InvocationHandler h) {" + rt +
                "        super();" + rt +
                "        this.h = h;" + rt +
                "    }" + rt + rt;

        Method[] methods = interfaceClass.getMethods();
        for (Method method : methods) {
            String methodname = method.getName();
            javaString +=
                    "    @Override" + rt +
                            "    public void " + methodname + "() throws Exception {" + rt +
                            "        Method md = " + interfaceClass.getName() + ".class.getMethod(\"move\");" + rt +
                            "        h.invoke(this, md);" + rt +
                            "    }" + rt + rt;
        }
        javaString += "}";

        File dir = new File(dirname);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File javafile = new File(dirname + "/" + filename);
        isGenerated = javafile.createNewFile();
        FileWriter out = new FileWriter(javafile);
        out.write(javaString);
        out.flush();
        out.close();
        return isGenerated;
    }
}
