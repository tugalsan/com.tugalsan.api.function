package com.tugalsan.api.function.client;

public interface TGS_Func_OutTyped_In1<R, A> {

    public R call(A input0);

    default R Void() {
        return TGS_FuncUtils.Null();
    }
}
