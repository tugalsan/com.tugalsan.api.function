package com.tugalsan.api.function.client;

public interface TGS_CallableType1<R, A> {

    public R call(A input0);

    default R Void() {
        return TGS_CallableUtils.Null();
    }
}
