package com.tugalsan.api.function.client;

import java.util.function.BiFunction;

public interface TGS_Func_OutTyped_In2<R, A, B> extends BiFunction<A, B, R>{

    @Override
    default R apply(A input0, B input1) {
        return call(input0, input1);
    }

    public R call(A input0, B input1);

    default R Void() {
        return TGS_FuncUtils.Null();
    }
}
