package com.tugalsan.api.function.client;

public interface TGS_CallableType0_Validate extends TGS_CallableType0<Boolean> {

    @Override
    default Boolean call() {
        return validate();
    }

    public boolean validate();
}
