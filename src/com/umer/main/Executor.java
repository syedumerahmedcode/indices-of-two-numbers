package com.umer.main;

import com.umer.service.TwoSumIndicesFinderService;

public class Executor {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Question: Given an array of integers, find two numbers such that they add up
         * to a specific target number. Implement a function that returns the indices of
         * the two numbers.
         * 
         * Input: nums = [2, 7, 11, 15], target = 9
         * Output: [0, 1] // Because nums[0] + nums[1] = 9
         */

        TwoSumIndicesFinderService twoSumIndicesFinder = new TwoSumIndicesFinderService();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSumIndicesFinder.findIndices(nums, target);
        if (result.length < 1) {
            System.out.println("No two corresponding indices found.");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }

        target = 22;
        result = twoSumIndicesFinder.findIndices(nums, target);
        if (result.length < 1) {
            System.out.println("No two corresponding indices found.");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }

        target = 21;
        result = twoSumIndicesFinder.findIndices(nums, target);
        if (result.length < 1) {
            System.out.println("No two corresponding indices found.");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }

        int[] negativeNums = { -2, 7, 11, 15 };
        target = 5;
        result = twoSumIndicesFinder.findIndices(negativeNums, target);
        if (result.length < 1) {
            System.out.println("No two corresponding indices found.");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }

        int[] duplicateNums = { 2, 7, 7, 11, 15 };
        target = 14;
        result = twoSumIndicesFinder.findIndices(duplicateNums, target);
        if (result.length < 1) {
            System.out.println("No two corresponding indices found.");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }

    }
}
