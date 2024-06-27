package com.tugalsan.api.function.client;

public interface TGS_CallableType3_Validate<A, B, C> extends TGS_CallableType3<Boolean, A, B, C> {

    @Override
    default Boolean call(A input0, B input1, C input2) {
        return validate(input0, input1, input2);
    }

    public boolean validate(A input0, B input1, C input2);
}
