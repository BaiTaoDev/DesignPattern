package com.jamie.decorator;

/**
 * @author baitao
 * @date 2019/1/3
 */
public class TomcatHttpRequestDecorator extends HttpRequestDecorator {

    public TomcatHttpRequestDecorator(HttpRequest httpRequest) {
        super(httpRequest);
    }

    @Override
    public String getRemoteIp() {
        System.out.println("自己包装的HttpRequest - start");
        String str = httpRequest.getRemoteIp();
        System.out.println("自己包装的HttpRequest - end");
        return str;
    }
}
