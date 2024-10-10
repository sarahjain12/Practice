package com.collections;

public class NetCrackerTest3 {


/*
    select d.name, e.name from employee e, department d, salary s group by d.deptid, e.id
        order by s.salary asc;
*/

    /*
    scramble('rkqodlw', 'world') ==> True
    scramble('cedewaraaossoqqyt', 'codewars') ==> True
    scramble('katas', 'steak') ==> False
     */
    public static void main(String[] args) {
        System.out.println(new NetCrackerTest3().scramble("katas", "steak"));
    }

    public boolean scramble(String s1, String s2){
        char[] characters = s1.toCharArray();

        for(int i=0; i<s2.length(); i++){
            if(s1.indexOf(s2.charAt(i)) == -1){
                return false;
            }
        }
        return true;
    }
}
