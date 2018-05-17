package com.pgs.workshop;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class HeaderFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.addZuulRequestHeader("test", "test");

        return null;
    }
}
