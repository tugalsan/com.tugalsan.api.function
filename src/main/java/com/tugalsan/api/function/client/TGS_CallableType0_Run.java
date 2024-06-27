package com.tugalsan.api.function.client;

public interface TGS_CallableType0_Run extends Runnable, TGS_CallableType0<Void> {

    @Override
    default Void call() {
        run();
        return TGS_CallableUtils.Null();
    }

    @Override
    public void run();
}
