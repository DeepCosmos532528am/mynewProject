package OOPM;

import java.util.Scanner;

public class SwapIt {
    public static void main(String[] args) {
        int[] poly1 = {5, 2, 3};
        int[] poly2 = {1, 7, 4};
        Scanner sc = new Scanner(System.in);
        for (int i = poly1.length - 1; i >= 0; i--) {
            System.out.print(poly1[i] + (i > 0 ? "x^" + i + " + " : " "));
        }
        System.out.println("Expression Representation");
        System.out.println("please enter the value of x to evaluate it ");
        // int x = sc.nextInt();
        System.out.println();
        //

        for (int i = poly2.length - 1; i >= 0; i--) {
            if (poly1.length - 1 >= i) {
                System.out.print((poly1[i] + poly2[i]) + (i > 0 ? "x^" + i + " + " : " "));
            } else {
                System.out.print(poly2[i] + (i > 0 ? "x^" + i + " + " : " "));

            }
        }
        System.out.print("Enter value of x : ");
        int enterValOfx = sc.nextInt();
        System.out.print("Your Expression is now: ");
        for (int i = poly2.length - 1; i >= 0; i--) {
            if (poly1.length - 1 > i) {
                System.out.print((poly1[i] + poly2[i]) + (i > 0 ? "." + enterValOfx + "^" + i + " + " : " "));
            } else {
                System.out.print(poly2[i] + (i > 0 ? "x^" + i + " + " : " "));

            }


        }
        System.out.println("On evaluating the Expression answer is : ");
        int digits = 0;
        int x;
        for (int i = poly2.length - 1; i >= 0; i--) {
            x = enterValOfx;

            for (int j = i; j > 0; j--) {
                x *= x;
            }
            if (poly1.length - 1 > i) {

                digits = (poly1[i] + poly2[i]) * x;
            } else {
                digits = poly2[i] * x;
            }
            digits += digits;

        }
        System.out.println(digits);

        System.out.println(
                SwapIt.BinarySearch()

        );
    }


    /* Binary Search- It is a fast Searching algo, with the time complexity of O(log n)
                    - This algo id based on the idea of divide and conquer,
                    -for using this approach the elements must be in sorted manner in the array either in ascending or descending order
     */
    public static int BinarySearch() {

        System.out.println("BinarySearch");
        int[] arr3 = {5, 12, 15, 20, 25};
        int low = 0;
        int high = arr3.length - 1;
        int mid = 0;
        int x = 2;
        while (low <= high) {
            mid = (low + high) / 2;

            if (x == arr3[mid]) {

            }
            if (arr3[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return mid;
    }




}
