# Array Utility Project

## Overview

The Array Utility Project provides a set of utility functions for manipulating integer arrays. This project includes methods to find the minimum and maximum values in an array, as well as to count unique integers. The project is implemented in Java and consists of the `ArrayUtil` class and a test class, `ArrayUtil_Test`, which demonstrates the functionality of the utility methods.

## Classes

### ArrayUtil

The `ArrayUtil` class contains methods for array manipulation:

- **Fields:**

  - `int[] intArray`: The integer array used for calculations.

- **Methods:**
  - `ArrayUtil()`: Default constructor.
  - `int[] getArray()`: Returns the current integer array.
  - `void setIntArray(int[] mum)`: Sets the integer array for the utility.
  - `int minValue()`: Returns the minimum value in the integer array. If the array is empty, it returns `0`.
  - `int maxValue()`: Returns the maximum value in the integer array. If the array is empty, it returns `0`.
  - `int countUniqueIntegers()`: Returns the count of unique integers in the integer array. If the array is empty, it returns `0`.

### ArrayUtil_Test

The `ArrayUtil_Test` class is a test harness for the `ArrayUtil` class. It performs various tests to validate the methods implemented in `ArrayUtil`.

- **Main Method**:
  - The `main` method creates instances of `ArrayUtil`, sets different integer arrays, and prints the results of minimum value, maximum value, and count of unique integers.
  - The `validate(int expected, int answer)` method checks the output against expected results and indicates whether the test passed or failed.

## Running the Project

1. **Clone the Repository**:

   ```
   git clone <repository-url>
   ```

2. **Compile the Java Files**:

   ```
   javac ArrayUtil.java ArrayUtil_Test.java
   ```

3. **Run the Test Class**:

   ```
   java ArrayUtil_Test
   ```

   ## Example Output

   When the tests are run, the output will display results indicating the minimum value, maximum value, and the count of unique integers for each test case. Here is a sample output:

   ```
   Array Utility Project

   Test 0 - min value: The result 0 match expected: 0 --->> OK Test 0 - max value: The result 0 match expected: 0 --->> OK Test 0 - count unique: The result 0 match expected: 0 --->> OK
   ```

## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue for any suggestions or improvements.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
