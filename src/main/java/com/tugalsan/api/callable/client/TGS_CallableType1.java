package com.tugalsan.api.callable.client;

public interface TGS_CallableType1<R, A> {

    public R call(A result);

    default Void Void() {
        return TGS_CallableVoid.of();
    }
}
