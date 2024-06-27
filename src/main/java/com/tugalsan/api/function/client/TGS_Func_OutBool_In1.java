package com.tugalsan.api.function.client;

public interface TGS_Func_OutBool_In1<A> extends TGS_Func_OutTyped_In1<Boolean, A> {

    @Override
    default Boolean call(A input0) {
        return validate(input0);
    }

    public boolean validate(A input0);
}
