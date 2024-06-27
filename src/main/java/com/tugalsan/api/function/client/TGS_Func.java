package com.tugalsan.api.function.client;

public interface TGS_Func extends Runnable, TGS_Func_OutTyped<Void> {

    @Override
    default Void call() {
        run();
        return TGS_FuncUtils.Null();
    }

    @Override
    public void run();
}
