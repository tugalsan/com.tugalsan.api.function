package com.tugalsan.api.function.client;

public interface TGS_CallableType1_Run<A> extends TGS_CallableType1<Void, A> {

    @Override
    default Void call(A input0) {
        run(input0);
        return TGS_CallableUtils.Null();
    }

    public void run(A input0);
}
