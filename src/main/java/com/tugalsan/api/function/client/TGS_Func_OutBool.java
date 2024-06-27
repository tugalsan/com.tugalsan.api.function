package com.tugalsan.api.function.client;

public interface TGS_Func_OutBool extends TGS_Func_OutTyped<Boolean> {

    @Override
    default Boolean call() {
        return validate();
    }

    public boolean validate();
}
