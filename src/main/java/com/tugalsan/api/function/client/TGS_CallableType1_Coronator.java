package com.tugalsan.api.function.client;

//import com.tugalsan.api.unsafe.client.*;
import java.util.*;

public class TGS_CallableType1_Coronator<T> {

    //CONSTRUCTOR
    private T bufferedValue;

    public TGS_CallableType1_Coronator(T initVal) {
        bufferedValue = initVal;
    }

    public static <T> TGS_CallableType1_Coronator<T> of(Class<T> clazz) {
        return new TGS_CallableType1_Coronator(null);
    }

    public static <T> TGS_CallableType1_Coronator<T> of(T initialValue) {
        return new TGS_CallableType1_Coronator(initialValue);
    }

    public static TGS_CallableType1_Coronator<String> ofStr() {
        return new TGS_CallableType1_Coronator(null);
    }

    public static TGS_CallableType1_Coronator<Long> ofLng() {
        return new TGS_CallableType1_Coronator(null);
    }

    public static TGS_CallableType1_Coronator<Integer> ofInt() {
        return new TGS_CallableType1_Coronator(null);
    }

    public static TGS_CallableType1_Coronator<Double> ofDbl() {
        return new TGS_CallableType1_Coronator(null);
    }

    public static TGS_CallableType1_Coronator<Boolean> ofBool() {
        return new TGS_CallableType1_Coronator(null);
    }

    //LOADERS
    private static enum Type {
        SKIPPER, STOPPER
    }

    private class Act<T> {

        public Act(TGS_CallableType1<T, T> setter, TGS_CallableType1_Validate<T> validator, Type type) {
            this.setter = setter;
            this.validator = validator;
            this.type = type;
        }
        public TGS_CallableType1<T, T> setter;
        public TGS_CallableType1_Validate<T> validator;
        public Type type;

    }
    private final List<Act<T>> pack = new ArrayList();

    public TGS_CallableType1_Coronator<T> anoint(TGS_CallableType1<T, T> val) {
        pack.add(new Act(val, null, Type.SKIPPER));
        return this;
    }

    public TGS_CallableType1_Coronator<T> coronateIf(TGS_CallableType1_Validate<T> validate) {
        pack.add(new Act(null, validate, Type.STOPPER));
        return this;
    }

    public TGS_CallableType1_Coronator<T> anointIf(TGS_CallableType1_Validate<T> validate, TGS_CallableType1<T, T> val) {
        pack.add(new Act(val, validate, Type.SKIPPER));
        return this;
    }

    public TGS_CallableType1_Coronator<T> anointAndCoronateIf(TGS_CallableType1_Validate<T> validate, TGS_CallableType1<T, T> val) {
        pack.add(new Act(val, validate, Type.STOPPER));
        return this;
    }

//    //TODO coronateWithException EXCEPTION HANDLING, NOT TESTED
//    @Deprecated
//    public TGS_Tuple2<T, Exception> coronateWithException() {
//        return TGS_UnSafe.call(() -> TGS_Tuple2.of(coronate(), null), e -> TGS_Tuple2.of(null, e));
//    }
    public T coronateAs(TGS_CallableType1<T, T> setter) {
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
