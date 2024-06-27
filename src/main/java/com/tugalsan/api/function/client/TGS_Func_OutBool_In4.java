package com.tugalsan.api.function.client;

public interface TGS_Func_OutBool_In4<A, B, C, D> extends TGS_Func_OutTyped_In4<Boolean, A, B, C, D> {

    @Override
    default Boolean call(A input0, B input1, C input2, D input3) {
        return validate(input0, input1, input2,input3);
    }

    public boolean validate(A input0, B input1, C input2, D input3);
}
