package com.tugalsan.api.function.client;

public interface TGS_CallableType2_Run<A, B> extends TGS_CallableType2<Void, A, B> {

    @Override
    default Void call(A input0, B input1) {
        run(input0, input1);
        return TGS_CallableUtils.Null();
    }

    public void run(A input0, B input1);
}
