package com.tugalsan.api.function.client;

public interface TGS_Func_In5<A, B, C, D, E> extends TGS_Func_OutTyped_In5<Void, A, B, C, D, E> {

    final public static TGS_Func_In5 empty = (a, b, c, d, e) -> {
    };

    @Override
    default Void call(A input0, B input1, C input2, D input3, E input4) {
        run(input0, input1, input2, input3, input4);
        return TGS_FuncUtils.Null();
    }

    public void run(A input0, B input1, C input2, D input3, E input4);
}
