package com.tugalsan.api.callable.client;

public interface TGS_CallableType3<R, A, B, C> {

    public R call(A result1, B result2, C result3);

    default R Void() {
        return TGS_CallableUtils.Null();
    }
}
