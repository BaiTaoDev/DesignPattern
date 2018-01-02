package com.jamie.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JamieBai
 * @create 2018/01/02
 */
public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<Filter>();
    int index = 0;

    public FilterChain addFilter(Filter f) {
        this.filters.add(f);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if (index == filters.size()) {
            return;
        }

        Filter f = filters.get(index);
        index++;
        f.doFilter(request, response, chain);
    }
}
