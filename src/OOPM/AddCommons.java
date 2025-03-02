package OOPM;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*class sas{
    int [] arr = new int[6];
void a ( int ...alelo) {
   int g = alelo;
   for (int i = 0 ;i < arr.length ; i++ ) {
       arr[i] = alelo;
       System.out.println(Arrays.toString(arr));
   }
}
}
*/
public class AddCommons {
    int[] arr1;
    int[] arr2;
    HashSet<Integer> traversed = new HashSet<>();

    Scanner sc = new Scanner(System.in);

    void set_Arrays(int array_Size) {

        arr1 = new int[array_Size];
        arr2 = new int[array_Size];
        System.out.println("Array1-");
        for (int i = 0; i < array_Size; i++) { // First array intialize!
            System.out.printf("insert element %d : ", i + 1);
            arr1[i] = sc.nextInt();

        }
        System.out.println("Array1: " + Arrays.toString(arr1));

        System.out.println("Array2-");
        for (int i = 0; i < array_Size; i++) { // Second array intialize!
            System.out.printf("insert element %d : ", i + 1);

            arr2[i] = sc.nextInt();
        }
        System.out.println("Array1: " + Arrays.toString(arr2));

    }

    void get_Commons_With_Addition() {
        boolean found = true;
        boolean headerPrinted = false;

        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j] && !traversed.contains(arr1[i])) {
                    if (!headerPrinted) { // Print headers only once
                        System.out.println("Common values are: ");
                        System.out.println("values  " + "    location1  " + "      location2");
                        headerPrinted = true;

                    }
                    System.out.printf("   %d              %d               %d  \n", arr1[i], i, j);

                    traversed.add(arr1[i]);
                    sum += arr1[i];
                    found = false;
                }
            }
        }

        if (found) {
            System.out.println(" No common values found !");
        }
        System.out.println("Sum of common Elements is :" + sum);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddCommons arr = new AddCommons();
        arr.set_Arrays(5);
        arr.get_Commons_With_Addition();
        /*sas s = new sas();
        s.a(sc.nextInt());
    */
    }
}