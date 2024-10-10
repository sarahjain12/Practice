package com.collections;

import java.util.Arrays;
import java.util.List;

public class CDKGlobalTest2 {


    /*
    s= "Surbhi jain is a java developer"
    n= 6

    o/p:

    Surbhi
    -jain-
    is-a-
    java-
    develo
    per

    "Surbhi jain is developer & coder"

    o/p:

    Surbhi
    -jain-
    is-
    develo
    per
    -&-
    coder

    [2,3,4,1,5,9,4,1,6,2,3]

     */
    public static void main(String[] args) {

        int[] list = {-2,-3,-4,-1,-5,-9,-4,-1,-6,-2,-3};

        int max = 0;

        for(int i=2; i<list.length-2; i++){
            if((list[i-1] + list[i-2]) < list[i]
                && (list[i+1] + list[i+2] < list[i])
                ){
                if(Math.abs(list[i])>max){
                    max = list[i];
                }
            }
        }

        System.out.println(max);

        /*String str = "Surbhi jain is a java developer";
        int count = 6;

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(count==0){
                System.out.println(c);
            }else{
                if()
                System.out.print(c);
                count--;
            }

        }*/

    }
}
