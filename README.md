## Objective

Given an array of integers `nums` and an integer `target`, it should return the indices of the two numbers such that they add up to target. Each input is guaranteed to have exactly one solution, and the same element is not used twice.

For Example

```java
Input

nums = [2, 7, 11, 15]
target = 9

Output

[0, 1]
```

## Explanation

Please watch the explanation here

> https://www.youtube.com/watch?v=8bBpQOzALzU

## Complexity Analysis

### Time Complexity

**O(n)** The algorithm traverses through all the elements in the array and uses the hashmap to store the indices of the numbers.

## Edge Cases

- **Minimum input size:** The samllest input size that the project can handle correctly is 2.
- **Negative number:** The project works correctly with negative numbers.

- **Duplicate number:** The project also works correctly with duplicate numbers which form the target sum.

In case no indices are found which collectively form the target sum, a suitable message is returned.

## Technologies Used

- Java 11

## Commands

To compile and test, please checkout the project on your local machine and run _main method_ in the Executor class.

## Contribution

Feature requests, issues, pull requests and questions are welcome.

## Contact Information

How to reach me? At [github specific gmail account](mailto:syedumerahmedcode@gmail.com?subject=[GitHub]%20Hello%20from%20Github).
