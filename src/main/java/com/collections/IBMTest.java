package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IBMTest {

    public static void main(String[] args) {
        //List<String> versions = new ArrayList<>(Arrays.asList("1.0.0", "3.2"));
        String[] arr = {"1.0.0", "3.2"};

        String[] val1 = arr[0].split("\\.");
        String[] val2 = arr[1].split("\\.");
        int x = val1.length>val2.length ? val1.length : val2.length;
        for(int i=0; i<x; i++){
            int v1 = Integer.valueOf(val1[i]);
            int v2 = Integer.valueOf(val2[i]);
            if(v1==v2){
            }
            else{
                if(v1>v2){
                    System.out.println(arr[0]);
                }else{
                    System.out.println(arr[1]);
                }
                break;
            }

            List<Integer> list = Arrays.asList(1,2,3,4,5);

            //list.stream().findFirst().flatMap(x -> {System.out.println(x);});

            /*Arrays.asList("SAM", "DAM", "MSA").stream()
                    .flatMap(si -> si.charAt(0));
            */        //.reduce("", (z,y) -> z+y.charAt(1)).;
            //System.out.println(s);
        }

/*        int x =0, y=1;
        //while(x<arr[0].length() && y<arr[1].length()){
          for(int i=0; ;i++){
            if(arr[0].charAt(i)==arr[1].charAt(i)){
                continue;
            }
            else{

            }
        }*/
    }
}
