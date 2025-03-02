package OOPM;

public class BinarySearch {
    static int initialVal = 0;
    static int finalVal;
    static int midVal;
    static int BinarySearch(int[] arr, int target) {


        finalVal = arr.length-1;
        while (initialVal <= finalVal) {
            midVal = (initialVal + finalVal) / 2;

            if (arr[midVal] == target) {
                System.out.println("sas");
                return midVal;
            } else if (arr[midVal] > target) {
                finalVal = midVal - 1;
            } else {
                initialVal = midVal + 1;
            }



        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 18, 20, 21, 31};
        System.out.println(BinarySearch(arr, 50));

    }
}
