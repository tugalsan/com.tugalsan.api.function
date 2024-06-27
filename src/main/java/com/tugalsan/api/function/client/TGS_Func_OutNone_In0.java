package com.tugalsan.api.function.client;

public interface TGS_Func_OutNone_In0 extends Runnable, TGS_Func_OutTyped_In0<Void> {

    @Override
    default Void call() {
        run();
        return TGS_FuncUtils.Null();
    }

    @Override
    public void run();
}
