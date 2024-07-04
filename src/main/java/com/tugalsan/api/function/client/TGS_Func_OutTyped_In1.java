package com.tugalsan.api.function.client;

import java.util.function.Function;

public interface TGS_Func_OutTyped_In1<R, A> extends Function<A, R> {

    @Override
    default R apply(A input0) {
        return call(input0);
    }

    public R call(A input0);

    default R Void() {
        return TGS_FuncUtils.Null();
    }
}
