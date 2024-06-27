package com.tugalsan.api.function.client;

public interface TGS_Func_OutBool extends /*Validateable,*/ TGS_Func_OutTyped<Boolean> {

    @Override
    default Boolean call() {
        return validate();
    }

    public boolean validate();
}
