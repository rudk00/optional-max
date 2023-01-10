package com.epam.rd.autotasks.max;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        OptionalInt result;
        if (values != null && values.length > 0){
            result = OptionalInt.of(Arrays.stream(values).max().getAsInt());
        } else {
            result =OptionalInt.empty();
        }
        return result;
    }
}
