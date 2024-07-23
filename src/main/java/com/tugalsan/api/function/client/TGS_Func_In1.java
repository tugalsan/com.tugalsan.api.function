package com.tugalsan.api.function.client;

import java.util.function.Consumer;

public interface TGS_Func_In1<A> extends TGS_Func_OutTyped_In1<Void, A>, Consumer<A> {

    final public static TGS_Func_In1 empty = a -> {
    };

    @Override
    default void accept(A input0) {
        run(input0);
    }

    @Override
    default Void call(A input0) {
        run(input0);
        return TGS_FuncUtils.Null();
    }

    public void run(A input0);
}
