package com.umer.service;

import java.util.HashMap;

public class TwoSumIndicesFinderService {

    public int[] findIndices(int[] numbersToCheck, int target) {
        HashMap<Integer, Integer> complementIndexMap = new HashMap<>();
        for (int index = 0; index < numbersToCheck.length; index++) {
            int complement = target - numbersToCheck[index];
            if (complementIndexMap.containsKey(complement)) {
                return new int[] { complementIndexMap.get(complement), index };
            }
            complementIndexMap.put(numbersToCheck[index], index);
        }
        return new int[0];
    }

}
