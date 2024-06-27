package com.tugalsan.api.function.client;

public interface TGS_Func_OutNone_In1<A> extends TGS_Func_OutTyped_In1<Void, A> {

    @Override
    default Void call(A input0) {
        run(input0);
        return TGS_FuncUtils.Null();
    }

    public void run(A input0);
}
