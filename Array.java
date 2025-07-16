1. Declare and Print an Array

public class ArrayDeclarePrint {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

2. Input and Output Elements of an Array

import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

3. Find the Sum of Elements in an Array

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int sum = 0;
        for (int num : arr) sum += num;
        System.out.println("Sum: " + sum);
    }
}

4. Find the Average of Elements in an Array

public class AverageArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int sum = 0;
        for (int num : arr) sum += num;
        double avg = (double) sum / arr.length;
        System.out.println("Average: " + avg);
    }
}

5. Find the Maximum Element

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 90};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        System.out.println("Max: " + max);
    }
}

6. Find the Minimum Element

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {10, 50, 5, 90};
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        System.out.println("Min: " + min);
    }
}

7. Count Even and Odd Numbers

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 6, 2};
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }
}

8. Print Elements at Even Indices

public class EvenIndices {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}

9. Print Elements at Odd Indices

public class OddIndices {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}

10. Count Positive and Negative Numbers

public class CountPosNeg {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5};
        int pos = 0, neg = 0;
        for (int num : arr) {
            if (num >= 0) pos++;
            else neg++;
        }
        System.out.println("Positive: " + pos + ", Negative: " + neg);
    }
}

11. Replace All Negative Numbers with Zero

public class ReplaceNegative {
    public static void main(String[] args) {
        int[] arr = {-5, 4, -2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] = 0;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

12. Search an Element (Linear Search)

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9};
        int target = 7;
        boolean found = false;
        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Found" : "Not Found");
    }
}

13. Copy an Array

public class CopyArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int num : arr2) System.out.print(num + " ");
    }
}

14. Reverse an Array

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
        for (int num : arr) System.out.print(num + " ");
    }
}

15. Swap First and Last Elements

public class SwapFirstLast {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        for (int num : arr) System.out.print(num + " ");
    }
}

16. Print Array in Reverse Order

public class PrintReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

17. Count Frequency of a Given Number

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 2};
        int target = 2;
        int count = 0;
        for (int num : arr) {
            if (num == target) count++;
        }
        System.out.println("Frequency of " + target + ": " + count);
    }
}

18. Find the Index of a Specific Element

public class FindIndex {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int target = 15;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("Index: " + index);
    }
}

19. Replace All Even Numbers with -1

public class ReplaceEven {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) arr[i] = -1;
        }
        for (int num : arr) System.out.print(num + " ");
    }
}

20. Multiply All Elements of the Array

public class MultiplyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int prod = 1;
        for (int num : arr) prod *= num;
        System.out.println("Product: " + prod);
    }
}