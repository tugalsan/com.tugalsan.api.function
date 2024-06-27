package com.tugalsan.api.function.client;

public interface TGS_Func_OutTyped_In4<R, A, B, C, D> {

    public R call(A input0, B input1, C input2, D input3);

    default R Void() {
        return TGS_FuncUtils.Null();
    }
}
