package RJITDataStructure;

public class array_StringsQuestionDSA{


    public static void main(String[] args)  {
        int[] arr_numbers = { -2, -3, -4, -5, -6, -70, -8, -9, -4, -9, -1, -550};
        String[] arr_String = {"String", "a", "b", "c", "d", "e"};


        // Problem 1: To get the size of an Array without using the pre-defined method to get Size , neither directly nor indirectly.

        int count_1 = findingSizeOfArray_1(arr_numbers);
        System.out.println("count_1 " + count_1);

        System.out.println("//-----------------------------------------------");

        // Problem 1: To get the size of an Array without directly using the pre-defined method to get Size.

        int count_2 = findingSizeOfArray_2(arr_numbers);
        System.out.println("count_2 " + count_2);

        System.out.println("//-----------------------------------------------");

        // Problem 2: To get the addition of alternate values in array.
        int count_3 = AddingAlternateValue_1(arr_numbers);
        System.out.println(
                "count_3 " + count_3
        );
        System.out.println("//-----------------------------------------------");

        // Problem 3: To find any value in the given array / or can be said to find the index of the given value in the array .
        findingValueInArray(arr_numbers);

        System.out.println("//-----------------------------------------------");
        System.out.println("//-----------------------------------------------");
        System.out.println("//-----------------------------------------------");

        findingFirstMaximum_Minimum(arr_numbers);
        int day = 3;
      for(int arya : arr_numbers){
        System.out.println(arya);
}

    }


    // Problem 1: To get the size of an Array without using the pre-defined method to get Size , neither directly nor indirectly.

    public static int findingSizeOfArray_1(int[] arr) {
        int a = 0;
        for (int Arr : arr) {
            a++;
            System.out.println("Printing value from findingSizeOfArray_1() Method " + a); // The value can be printed as well for just displaying in the program
        }
        System.out.printf("So the value is %d\n", a);
        return a; // the value can be returned to use further in the program
    }


    // Problem 1: To get the size of an Array without directly using the pre-defined method to get Size.

    public static int findingSizeOfArray_2(int[] arr) {
        int a = 0;
        for (int i = 1; i <= arr.length; i++) {
            a++;
        }
        System.out.println("Printing value from findingSizeOfArray_2() Method " + a);

        return a;

    }

    // Problem 2: To get the addition of alternate values in array.
    public static int AddingAlternateValue_1(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            a += arr[i];
        }
        System.out.println("Printing value from AddingAlternateValue() Method " + a + " Actual size is \n" + arr.length);
        // Another approach could be by using the Modulo,
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                b += arr[i];
            }
            if (arr.length == i) {
                System.out.println(" By Modulo way " + b);
            }
        }
        System.out.println(" By Modulo way " + b); // for printing this simple statement,there is no need to use if-else statement that is used above , to get this printing done
        // , if else is just created to show another approach to print the final added value for all alternate array's value

        // One more approach :
        int c = -1;
        int c2 = 0;
        for (int arri : arr) {
            c++;
            if (c % 2 == 0) {
                c2 += arr[c];
            }
        }
        System.out.println("This is for-each approach " + c2);

        return a;

    }
    // Problem 3: To find any value in the given array / or can be said to find the index of the given value in the array .

    public static void findingValueInArray( int [] arr )  {
        int findTheNum = 4;
        int escaping = 0;
        int hayo = 0;
        for ( int i = 0; i < arr.length ; i++ ){

        if(arr[i] == findTheNum && escaping == 0) {
            System.out.printf("The value: %d is present on index no: %d",arr[i], i  );
escaping++;
        }else if (arr[i] == findTheNum){
            System.out.println("," + i);
        }

        }

    }

    // Problem 4: To find first maximum and first minimum value in array.

    public static void findingFirstMaximum_Minimum(int [] arr){    // ye wala method explain hona h , baaki dusra method toh mereko aata h
 int max = arr[0];
 int min = arr[0];
 for( int a = 0 ; a<arr.length; a++ ){
     if ( max < arr[a])
         max = arr[a];
     else if (min > arr[a])
         min = arr[a];
 }
        System.out.printf("so the maximum is %d", max );
        System.out.printf("so the minimum is %d\n", min);


    }



}

