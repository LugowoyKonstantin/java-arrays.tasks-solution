package com.lugowoy.tasks.onedimensional.getIntegersInAscendingOrderThatDoesNotBelongToThisArray;

import com.lugowoy.helper.models.arrays.Array;

import java.util.Arrays;
import java.util.Collections;

import static com.lugowoy.helper.other.ArrayChecker.checkArrayNonNull;
import static com.lugowoy.helper.other.ArrayChecker.checkLengthOfArrayIsGreaterZero;

/** Created by Konstantin Lugowoy on 11.04.2017. */

public interface Finding<T, V> {

    T find(V v);

    static int findMaxNumber(Array<Integer> array) {
        int resultValueOfMaxNumber = 0;
        try {
            if (checkArrayNonNull(array)) {
                if (checkLengthOfArrayIsGreaterZero(array.getLength())) {
                    resultValueOfMaxNumber = Collections.max(Arrays.asList(array.toArray(new Integer[array.getLength()])));
                }
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
        return resultValueOfMaxNumber;
    }

    static int findMinNumber(Array<Integer> array) {
        int resultValueOfMinNumber = 0;
        try {
            if (checkArrayNonNull(array)) {
                if (checkLengthOfArrayIsGreaterZero(array.getLength())) {
                    resultValueOfMinNumber = Collections.min(Arrays.asList(array.toArray(new Integer[array.getLength()])));
                }
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
        return resultValueOfMinNumber;
    }

}
