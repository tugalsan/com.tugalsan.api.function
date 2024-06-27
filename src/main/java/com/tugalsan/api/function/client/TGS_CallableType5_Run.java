package com.tugalsan.api.function.client;

public interface TGS_CallableType5_Run<A, B, C, D, E> extends TGS_CallableType5<Void, A, B, C, D, E> {

    @Override
    default Void call(A input0, B input1, C input2, D input3, E input4) {
        run(input0, input1, input2, input3, input4);
        return TGS_CallableUtils.Null();
    }

    public void run(A input0, B input1, C input2, D input3, E input4);
}
