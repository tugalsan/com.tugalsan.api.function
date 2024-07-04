package com.tugalsan.api.function.client;

import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface TGS_Func_OutTyped<R> extends Callable<R>, Supplier<R> {

    @Override
    default R get() {
        return call();
    }

    @Override
    public R call();

    default R Void() {
        return TGS_FuncUtils.Null();
    }
}
