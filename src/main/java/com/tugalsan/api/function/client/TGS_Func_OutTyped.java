package com.tugalsan.api.function.client;

import java.util.concurrent.Callable;

public interface TGS_Func_OutTyped<R> extends Callable<R> {

    @Override
    public R call();

    default R Void() {
        return TGS_FuncUtils.Null();
    }
}
