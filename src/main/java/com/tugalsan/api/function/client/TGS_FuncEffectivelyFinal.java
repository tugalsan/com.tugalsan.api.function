package com.tugalsan.api.function.client;

//import com.tugalsan.api.unsafe.client.*;
import java.util.*;

public class TGS_FuncEffectivelyFinal<T> {

    //CONSTRUCTOR
    private T bufferedValue;

    public TGS_FuncEffectivelyFinal(T initVal) {
        bufferedValue = initVal;
    }

    public static <T> TGS_FuncEffectivelyFinal<T> of(Class<T> clazz) {
        return new TGS_FuncEffectivelyFinal(null);
    }

    public static <T> TGS_FuncEffectivelyFinal<T> of(T initialValue) {
        return new TGS_FuncEffectivelyFinal(initialValue);
    }

    public static TGS_FuncEffectivelyFinal<String> ofStr() {
        return new TGS_FuncEffectivelyFinal(null);
    }

    public static TGS_FuncEffectivelyFinal<Long> ofLng() {
        return new TGS_FuncEffectivelyFinal(null);
    }

    public static TGS_FuncEffectivelyFinal<Integer> ofInt() {
        return new TGS_FuncEffectivelyFinal(null);
    }

    public static TGS_FuncEffectivelyFinal<Double> ofDbl() {
        return new TGS_FuncEffectivelyFinal(null);
    }

    public static TGS_FuncEffectivelyFinal<Boolean> ofBool() {
        return new TGS_FuncEffectivelyFinal(null);
    }

    //LOADERS
    private static enum Type {
        SKIPPER, STOPPER
    }

    private class Act<T> {

        public Act(TGS_Func_OutTyped_In1<T, T> setter, TGS_Func_OutBool_In1<T> validator, Type type) {
            this.setter = setter;
            this.validator = validator;
            this.type = type;
        }
        public TGS_Func_OutTyped_In1<T, T> setter;
        public TGS_Func_OutBool_In1<T> validator;
        public Type type;

    }
    private final List<Act<T>> pack = new ArrayList();

    public TGS_FuncEffectivelyFinal<T> anoint(TGS_Func_OutTyped_In1<T, T> val) {
        pack.add(new Act(val, null, Type.SKIPPER));
        return this;
    }

    public TGS_FuncEffectivelyFinal<T> coronateIf(TGS_Func_OutBool_In1<T> validate) {
        pack.add(new Act(null, validate, Type.STOPPER));
        return this;
    }

    public TGS_FuncEffectivelyFinal<T> anointIf(TGS_Func_OutBool_In1<T> validate, TGS_Func_OutTyped_In1<T, T> val) {
        pack.add(new Act(val, validate, Type.SKIPPER));
        return this;
    }

    public TGS_FuncEffectivelyFinal<T> anointAndCoronateIf(TGS_Func_OutBool_In1<T> validate, TGS_Func_OutTyped_In1<T, T> val) {
        pack.add(new Act(val, validate, Type.STOPPER));
        return this;
    }

//    //TODO coronateWithException EXCEPTION HANDLING, NOT TESTED
//    @Deprecated
//    public TGS_Tuple2<T, Exception> coronateWithException() {
//        return TGS_UnSafe.call(() -> TGS_Tuple2.of(coronate(), null), e -> TGS_Tuple2.of(null, e));
//    }
    public T coronateAs(TGS_Func_OutTyped_In1<T, T> setter) {
        pack.add(new Act(setter, null, Type.STOPPER));
        return coronate();
    }

//FETCHER
    public T coronate() {
        for (var comp : pack) {
            if (comp.validator != null && !comp.validator.validate(bufferedValue)) {
                continue;
            }
            if (comp.setter != null) {
                bufferedValue = comp.setter.call(bufferedValue);
            }
            if (comp.type == Type.STOPPER) {
                return bufferedValue;
            }
        }
        return bufferedValue;
    }
}
