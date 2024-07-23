package com.tugalsan.api.function.client;

public interface TGS_Func_In3<A, B, C> extends TGS_Func_OutTyped_In3<Void, A, B, C> {

    final public static TGS_Func_In3 empty = (a, b, c) -> {
    };

    @Override
    default Void call(A input0, B input1, C input2) {
        run(input0, input1, input2);
        return TGS_FuncUtils.Null();
    }

    public void run(A input0, B input1, C input2);
}
