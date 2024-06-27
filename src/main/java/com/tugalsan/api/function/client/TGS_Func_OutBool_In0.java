package com.tugalsan.api.function.client;

public interface TGS_Func_OutBool_In0 extends TGS_Func_OutTyped_In0<Boolean> {

    @Override
    default Boolean call() {
        return validate();
    }

    public boolean validate();
}
