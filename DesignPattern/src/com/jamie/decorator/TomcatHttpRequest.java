package com.jamie.decorator;

/**
 * @author baitao
 * @date 2019/1/3
 */
public class TomcatHttpRequest implements HttpRequest {
    @Override
    public String getRemoteIp() {
        System.out.println("TomcatHttpRequest真实执行请求");
        return "123";
    }
}
