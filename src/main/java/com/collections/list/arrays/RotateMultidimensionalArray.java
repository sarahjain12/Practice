package com.collections.list.arrays;

// Java Program to Illustrate Multidimensional ArrayList

// Importing required classes

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Main class
// MultidimensionalArrayList
class RotateMultidimensionalArray {

    // Method 1
    // To create and return 2D ArrayList
    static ArrayList<ArrayList<Integer>> create2DArrayList() {

        // Creating a 2D ArrayList of Integer type
        ArrayList<ArrayList<Integer>> x
                = new ArrayList<ArrayList<Integer>>();

        // One space allocated for R0
        x.add(new ArrayList<Integer>());

        // Adding 3 to R0 created above x(R0, C0)
        x.get(0).add(0, 1);
        x.get(0).add(1, 2);
        //x.get(0).add(2, 3);


        // Creating R1 and adding values
        // Note: Another way for adding values in 2D
        // collections
        x.add(
                new ArrayList<Integer>(Arrays.asList(3,4)));

        /*x.add(
                new ArrayList<Integer>(Arrays.asList(7, 8, 9)));
*/
        //System.out.println(x.get(0).size());
        // This method will return 2D array
        return x;
    }

    /*public class Solution {
        public void rotate(ArrayList<ArrayList<Integer>> a) {

            for(int i=0; i<a.size()-1; i++){
                int colSize = a.get(i).size();
                Integer firstElement = a.get(0).get(0);

                for(int j=0; j<colSize-1; j++){
                    int rowNum = i;
                    int colNum = j;

                    if(i)
                    Integer insertElement = a.get(i+2).get()
                    a.get(i).add(j, insertElement);
                }

                row.add(1, row.get(0));
                row.add(1, row.get(1));

            }

        }
    }
*/


    // Method 2
    // Main driver method
    public static void main(String args[]) {
        // Display message prior for better readability
        System.out.println("2D ArrayList :");

        // Printing 2D ArrayList by calling Method 1
        System.out.println(create2DArrayList());

        Solution2 solution = new Solution2();
        solution.rotate(create2DArrayList());
    }
}

class Solution2 {
    public void rotate(ArrayList<ArrayList<Integer>> a) {

        ArrayList<ArrayList<Integer>> newList = new ArrayList<ArrayList<Integer>>();

        int[][] list1 = new int[a.size()][a.get(0).size()];
        for (int i = 0; i < a.size(); i++) {
            //System.out.println(a.size() + " ::: "+a.get(0));
            for (int j = 0; j < a.get(0).size(); j++) {
                //newList.get(j).set(a.size() - i - 1, a.get(i).get(j));
                //newList.add(j, new ArrayList<Integer>(List.of(new Integer[]{a.get(i).get(j)})));
                list1[j][a.size() - i -1] = a.get(i).get(j);
                //System.out.print(list1[i][j]);
            }
        }
        //System.out.println(list1.length);
        for(int i=0; i<list1.length; i++){
            System.out.print("[");
            for(int j=0; j<list1.length; j++){
                System.out.print(list1[i][j]+" ");
            }
            System.out.print("]");
        }
        //System.out.println(Arrays.deepToString(list1));
    }
}
