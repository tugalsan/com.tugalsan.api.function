package com.tugalsan.api.function.client;

public interface TGS_Func_OutBool_In5<A, B, C, D, E> extends TGS_Func_OutTyped_In5<Boolean, A, B, C, D, E> {

    @Override
    default Boolean call(A input0, B input1, C input2, D input3, E input4) {
        return validate(input0, input1, input2, input3, input4);
    }

    public boolean validate(A input0, B input1, C input2, D input3, E input4);
}
