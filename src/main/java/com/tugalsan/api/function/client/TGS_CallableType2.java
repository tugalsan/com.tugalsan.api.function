package com.tugalsan.api.function.client;

public interface TGS_CallableType2<R, A, B> {

    public R call(A input0, B input1);

    default R Void() {
        return TGS_CallableUtils.Null();
    }
}
