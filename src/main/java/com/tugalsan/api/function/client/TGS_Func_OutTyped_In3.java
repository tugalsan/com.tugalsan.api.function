package com.tugalsan.api.function.client;

public interface TGS_Func_OutTyped_In3<R, A, B, C> {

    public R call(A input0, B input1, C input2);

    default R Void() {
        return TGS_FuncUtils.Null();
    }
}
