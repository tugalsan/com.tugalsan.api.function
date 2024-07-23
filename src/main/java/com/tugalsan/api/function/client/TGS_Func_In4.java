package com.tugalsan.api.function.client;

public interface TGS_Func_In4<A, B, C, D> extends TGS_Func_OutTyped_In4<Void, A, B, C, D> {

    final public static TGS_Func_In4 empty = (a, b, c, d) -> {
    };

    @Override
    default Void call(A input0, B input1, C input2, D input3) {
        run(input0, input1, input2, input3);
        return TGS_FuncUtils.Null();
    }

    public void run(A input0, B input1, C input2, D input3);
}
