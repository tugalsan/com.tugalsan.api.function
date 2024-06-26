package com.tugalsan.api.callable.client;

public interface TGS_CallableType1_Validate<A> extends TGS_CallableType1<Boolean, A> {

    @Override
    default Boolean call(A input0) {
        return validate(input0);
    }

    public boolean validate(A input0);
}
