package com.tugalsan.api.callable.client;

public interface TGS_CallableType1Void<A> extends TGS_CallableType1<Void, A> {

    @Override
    default Void call(A input0) {
        run(input0);
        return TGS_CallableUtils.Null();
    }

    public void run(A input0);
}
