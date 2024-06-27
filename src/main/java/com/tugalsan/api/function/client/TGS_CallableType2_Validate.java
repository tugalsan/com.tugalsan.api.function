package com.tugalsan.api.function.client;

public interface TGS_CallableType2_Validate<A, B> extends TGS_CallableType2<Boolean, A, B> {

    @Override
    default Boolean call(A input0, B input1) {
        return validate(input0, input1);
    }

    public boolean validate(A input0, B input1);
}
