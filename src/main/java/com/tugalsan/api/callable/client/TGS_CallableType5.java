package com.tugalsan.api.callable.client;

public interface TGS_CallableType5<R, A, B, C, D, E> {

    public R call(A result1, B result2, C result3, D result4, E result5);

    default Void Void() {
        return TGS_CallableVoid.of();
    }
}
