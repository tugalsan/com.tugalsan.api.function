package com.tugalsan.api.function.client;

public interface TGS_Func_OutTyped_In2<R, A, B> {

    public R call(A input0, B input1);

    default R Void() {
        return TGS_FuncUtils.Null();
    }
}
