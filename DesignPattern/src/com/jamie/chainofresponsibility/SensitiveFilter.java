package com.jamie.chainofresponsibility;

/**
 * @author JamieBai
 * @create 2018/01/02
 */
public class SensitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.requestStr = request.requestStr.replace("被就业", "就业")
                .replace("敏感", "") + "---SesitiveFilter()";
        chain.doFilter(request, response, chain);
        response.responseStr += "---SesitiveFilter()";

    }


}
