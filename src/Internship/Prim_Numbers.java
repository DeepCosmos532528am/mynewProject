package Internship;

import java.util.Scanner;

public class Prim_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
       int num ;


            for(num = 2; num <= i; num++ ){
                if((i / num)==1 || (i /i) == 0 ){
                    System.out.println("this is the PrimeNumber Bro...!");
                break;
                }
            }
        }
    }

