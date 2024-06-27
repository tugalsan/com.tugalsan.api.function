package com.tugalsan.api.function.client;

public interface TGS_CallableType3_Run<A, B, C> extends TGS_CallableType3<Void, A, B, C> {

    @Override
    default Void call(A input0, B input1, C input2) {
        run(input0, input1, input2);
        return TGS_CallableUtils.Null();
    }

    public void run(A input0, B input1, C input2);
}
