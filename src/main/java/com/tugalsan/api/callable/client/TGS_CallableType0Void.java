package com.tugalsan.api.callable.client;

@Deprecated //WILL IT WORK ON GWT?
public interface TGS_CallableType0Void extends Runnable, TGS_CallableType0<Void> {

    @Override
    default Void call() {
        run();
        return TGS_CallableUtils.Null();
    }

    @Override
    public void run();
}
