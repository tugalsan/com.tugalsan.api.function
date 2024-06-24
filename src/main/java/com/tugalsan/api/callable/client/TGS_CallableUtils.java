package com.tugalsan.api.callable.client;

public class TGS_CallableUtils {

    public static <T> T Null() {
        return (T) null;
    }

    public static TGS_CallableType0 doNothing0() {
        return () -> Null();
    }

    public static TGS_CallableType1 doNothing1() {
        return w1 -> Null();
    }

    public static TGS_CallableType2 doNothing2() {
        return (w1, w2) -> Null();
    }

    public static TGS_CallableType3 doNothing3() {
        return (w1, w2, w3) -> Null();
    }

    public static TGS_CallableType4 doNothing4() {
        return (w1, w2, w3, w4) -> Null();
    }

    public static TGS_CallableType5 doNothing5() {
        return (w1, w2, w3, w4, w5) -> Null();
    }

    public static TGS_CallableType0Void toVoid(TGS_CallableType0 call) {
        return () -> call.call();
    }

    public static <R, A> TGS_CallableType1Void<A> toVoid(TGS_CallableType1<R, A> call) {
        return a -> call.call(a);
    }

    public static <R, A, B> TGS_CallableType2Void<A, B> toVoid(TGS_CallableType2<R, A, B> call) {
        return (a, b) -> call.call(a, b);
    }

    public static <R, A, B, C> TGS_CallableType3Void<A, B, C> toVoid(TGS_CallableType3<R, A, B, C> call) {
        return (a, b, c) -> call.call(a, b, c);
    }

    public static <R, A, B, C, D> TGS_CallableType4Void<A, B, C, D> toVoid(TGS_CallableType4<R, A, B, C, D> call) {
        return (a, b, c, d) -> call.call(a, b, c, d);
    }

    public static <R, A, B, C, D, E> TGS_CallableType5Void<A, B, C, D, E> toVoid(TGS_CallableType5<R, A, B, C, D, E> call) {
        return (a, b, c, d, e) -> call.call(a, b, c, d, e);
    }
}
