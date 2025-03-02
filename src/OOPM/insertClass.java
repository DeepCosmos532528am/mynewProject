package OOPM;

import java.util.Arrays;

public class insertClass {
    public static void main(String[] args) {
        int [] myArray = {1,3,2,5,4,6,3,2,0,0};
        int value = 28;
        int atIndex = 3;

        System.out.println(Arrays.toString(myArray));

        for ( int maxIndex = myArray.length-1; maxIndex>=atIndex; maxIndex--){
            myArray[maxIndex] = myArray[maxIndex-1];
        }
        myArray[3] = value;
        System.out.println(Arrays.toString(myArray));


         int [] myArray2 = new int[7];
         myArray2[0]= 2;
         myArray2[1]= 3;
         myArray2[2]= 7;
         myArray2[3]= 1;
         myArray2[4]= 2;


        int value2 = 28;
        int atIndex2 = 3;

        System.out.println(Arrays.toString(myArray2));

        for ( int maxIndex = myArray2.length-1; maxIndex>=atIndex; maxIndex--){
            myArray2[maxIndex] = myArray2[maxIndex-1];
        }
        myArray2[3] = value;
        System.out.println(Arrays.toString(myArray2));

        // Deletion Algo...
        for( int minIndex = atIndex2 ; minIndex <=myArray2.length-2; minIndex++){
            myArray2[minIndex]  =  myArray2[minIndex+1];
        }
        System.out.println(Arrays.toString(myArray2));

    }
}
