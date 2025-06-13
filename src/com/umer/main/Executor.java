package com.umer.main;

import java.util.Arrays;

import com.umer.service.TwoSumIndicesFinderService;

public class Executor {
    public static void main(String[] args) throws Exception {
        System.out.println("Finding indices of two numbers such that they add up to a specific target number.");
        giveGapInConsole();
        /**
         * Question: Given an array of integers, find two numbers such that they add up
         * to a specific target number. Implement a function that returns the indices of
         * the two numbers.
         * 
         * Input: nums = [2, 7, 11, 15], target = 9
         * Output: [0, 1] // Because nums[0] + nums[1] = 9
         */

        TwoSumIndicesFinderService twoSumIndicesFinder = new TwoSumIndicesFinderService();
        // Happy path
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSumIndicesFinder.findIndices(nums, target);
        displayContentsOfInputArray(nums);
        displayResult(result, target);
        giveGapInConsole();

        target = 22;
        result = twoSumIndicesFinder.findIndices(nums, target);
        displayContentsOfInputArray(nums);
        displayResult(result, target);
        giveGapInConsole();

        // Failure case
        target = 21;
        result = twoSumIndicesFinder.findIndices(nums, target);
        displayContentsOfInputArray(nums);
        displayResult(result, target);
        giveGapInConsole();

        // Edge case
        int[] negativeNums = { -2, 7, 11, 15 };
        target = 5;
        result = twoSumIndicesFinder.findIndices(negativeNums, target);
        displayContentsOfInputArray(negativeNums);
        displayResult(result, target);
        giveGapInConsole();

        // Edge case
        int[] duplicateNums = { 2, 7, 7, 11, 15 };
        target = 14;
        result = twoSumIndicesFinder.findIndices(duplicateNums, target);
        displayContentsOfInputArray(duplicateNums);
        displayResult(result, target);
        giveGapInConsole();

    }

    private static void giveGapInConsole() {
        System.out.println();
        System.out.println();
    }

    private static void displayContentsOfInputArray(int[] duplicateNums) {
        System.out.println("The input array: " + Arrays.toString(duplicateNums));
    }

    private static void displayResult(int[] result, int target) {
        if (result.length < 1) {
            System.out.println("For the target " + target + " ,no two corresponding indices found.");
        } else {
            System.out.println("The target " + target + " is a sum of the following two Indices: " + result[0] + ", "
                    + result[1] + " in the input array.");
        }
    }
}
