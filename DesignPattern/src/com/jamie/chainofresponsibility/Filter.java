package com.jamie.chainofresponsibility;

/**
 * @author JamieBai
 * @create 2018/01/02
 */
public interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);
}
