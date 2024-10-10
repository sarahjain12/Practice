package com.collections;

import java.util.*;
import java.util.stream.Collectors;

public class NessDigitalTest {

    /*
        List of boarding passes one distination to other

     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("TN->MUM");
        list.add("CHN->DLH");
        list.add("MUM->CHN");


        HashSet<String> set = new HashSet<>();

        HashMap<String, String> map = new HashMap<>();
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String[] arr = iterator.next().split("->");

            map.put(arr[0], arr[1]);

            /*if(!set.add(arr[0])){
                set.remove(arr[0]);
            }
            else{
                set.add(arr[0]);
            }
            if(!set.add(arr[1])){
                set.remove(arr[1]);
            }
            else{
                set.add(arr[1]);
            }*/
        }

        Iterator itr = map.entrySet().iterator();
        /*while (itr.hasNext()){
            String previous = itr.
        }
        map.entrySet().stream().forEach((k,v) -> );
*/
        set.stream().forEach(System.out::println);

    }
}
