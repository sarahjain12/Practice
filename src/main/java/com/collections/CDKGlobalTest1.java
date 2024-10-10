package com.collections;

import java.util.*;
import java.util.stream.Collectors;

public class CDKGlobalTest1 {


    /*
    aaabbccdddccbbba

    bbccdddccbbba

    bbccccbbba

    bbbbba

    a


    emp -
        id, name, dept id, age

        select ee.deptId, MAX(ee.age) from employee ee group by ee.deptId;

        createEmployee
        findEmployee

        post
        /employee
        {"name" : }

        @RestController("employee")
        class EmployeeController{

            @POST
            public ResponseEntity createEmployee(Employee employee){
                // call to service n dao to create employee
                return new ResponseEntity();
            }

            /findById/
            @GET
            @RequestBody("application/xml")
            public Employee findById(@RequestParam("id") ){

            }

        }


    */

    public static void main(String[] args) {

        Map<String, Employee1> map = new HashMap<>();

        Employee1 e1 = new Employee1(1, "A", 5, null);
        Employee1 e2 = new Employee1(2, "B", 5, null);


        map.put("A", e1);
        map.put("B", e2);

        map.entrySet().stream().forEach(System.out::println);

        /*CDKGlobalTest1 cdkGlobalTest1 = new CDKGlobalTest1();
        System.out.println(cdkGlobalTest1.candyCrush("aaabbccdddccbbba"));*/
    }

    public String candyCrush(String s){

        int i = 0;
        int j = i+1;
        int count = 0;
        String result = "";
        while(i<j){
            if(count == 2){
                i = j + 1;
                j = i + 1;
                count = 0;
                result = s.substring(i, s.length()-1);
                break;
            }
            if(s.charAt(i) == s.charAt(j)){
                count++;
                j++;
            }
            else{
                count=0;
            }
        }
        if(result.length() != s.length()){
            result = candyCrush(result);
        }
        return result;
    }
}
