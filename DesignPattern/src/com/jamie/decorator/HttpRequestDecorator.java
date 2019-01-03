package com.jamie.decorator;

/**
 * @author baitao
 * @date 2019/1/3
 */
public abstract class HttpRequestDecorator implements HttpRequest {

    protected HttpRequest httpRequest;

    public HttpRequestDecorator(HttpRequest httpRequest) {
        this.httpRequest = httpRequest;
    }
}
