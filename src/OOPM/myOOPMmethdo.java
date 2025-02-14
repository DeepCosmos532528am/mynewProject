package OOPM;

public class myOOPMmethdo {
    public static void printMessage(String str) {
        System.out.println("String method called");
    }
    public  void printMessage(Object obj) {
        System.out.println("Object method called");
    }

    public static void main(String ...arg) {
        myOOPMmethdo.printMessage(null);
        // can ALSO BE CALLED BY ONLY printMessage(null);

   /*     deletion d = new deletion();
deletion.deletedValues();*/
/*
        int arr [] = {1,60, -10, 70,-80,85};
        int check  = 0;
        int hhj = Integer.MAX_VALUE;
        int sum2 = 0;
        int sum1 = 0;

        for (int a = 0; a<arr.length; a++){
            for(int b = 0; b< arr.length; b++){
                check  = 0-(arr[a]+arr[b]);
                if(check<hhj ){
                     sum1 = arr[a];
                     sum2 = arr[b];
                    hhj = check;
                }
            }
        }
        System.out.println(sum1 +" "+sum2+" "+hhj);*/
    insert ins = new insert();
        System.out.println("Look at this ");
        ins.insertion();

    }
}
class insert{

    int addOn = 2;
    int add = 9;
    int [] arr = {1,2,3,4,5,6};
    int [] arr2 = new int[arr.length+1];

    void insertion(){
        for(int i =arr.length-1  ; i>=addOn; i-- ){

                arr2[i+1] = arr[i];


        } arr2[addOn] = add;
        for(int getIt : arr2){
            System.out.println(getIt);
        }
    }
}
/*class deletion{
    public static void deletedValues(){
        int [] arr = {10,20,30,40,50};
        int removeFrom = 2;

        for( int a =0 ,b = 0; b<arr.length; a++,b++){
            if((a == removeFrom ) ){
             b++;}
            {

            }
                arr[a] = arr[b];
        }

        for(int printarr : arr){
            System.out.println(printarr);
        }
    }
}*/






















/* This is recursion Question, for 2 ka table , isko bhi karo jald se jald
package OOPM;

public class myOOPMmethdo {
        public static void main (String[]args){
        myOOPMmethdo mi = new myOOPMmethdo();
            int j = mi.sachin(0);
            System.out.println(j);
        }

    public int sachin(int u) {
        System.out.println(u);
        int i = 10;
        if (i > 0) {
            int a = sachin(2 * i);
            i--;

            return a;
        }
        return i;
    }


}
*/
