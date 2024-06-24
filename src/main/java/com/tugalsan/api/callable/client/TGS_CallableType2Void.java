package com.tugalsan.api.callable.client;

@Deprecated //WILL IT WORK ON GWT?
public interface TGS_CallableType2Void<A, B> extends TGS_CallableType2<Void, A, B> {

    @Override
    default Void call(A input0, B input1) {
        run(input0, input1);
        return TGS_CallableUtils.Null();
    }

    public void run(A input0, B input1);
}
