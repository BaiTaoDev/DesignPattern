package com.jamie.decorator;

/**
 * @author baitao
 * @date 2019/1/3
 */
public class Client {

    public static void main(String[] args) {
        HttpRequest httpRequest = new TomcatHttpRequest();
        httpRequest.getRemoteIp();

        System.out.println("=================================================");

        HttpRequest httpRequest2 = new TomcatHttpRequestDecorator(httpRequest);
        httpRequest2.getRemoteIp();

    }
}
