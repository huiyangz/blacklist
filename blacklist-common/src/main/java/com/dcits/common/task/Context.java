package com.dcits.common.task;

public class Context {
    private static final ThreadLocal<Context> context= new ThreadLocal<>();

    private ReqHeader reqHeader;
    private RespHeader respHeader;

    public ReqHeader getReqHeader() {
        return reqHeader;
    }
        
    public RespHeader getRespHeader() {
        return respHeader;
    }
    
    Context(ReqHeader reqHeader){
        this.reqHeader=reqHeader;
        this.respHeader=new RespHeader(reqHeader);
        context.set(this);
    }

    static void clear(){
        context.remove();
    }
    static Context get(){
        return context.get();
    }
}
