package com.collections.list.vector;


// Java program to demonstrate working of Comparator
// interface and Collections.sort() to sort according
// to user defined criteria.
        import java.util.*;
        import java.lang.*;
        import java.util.function.Function;
        import java.util.stream.Collectors;

// A class to represent a student.
class Student
{
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name,
                   String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name +
                " " + this.address;
    }
}

class Sortbyroll implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}

// Driver class
class VectorSort
{
    public static void main (String[] args)
    {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));

        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyroll());

        System.out.println("\nSorted by rollno");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));


        HashMap<Student, String> map = new HashMap<>();
        map.put((new Student(111, "bbbb", "london")), "bbbb");
        map.put((new Student(222, "ccc", "london")), "ccc");
        map.put((new Student(333, "ddd", "london")), "ddd");
        map.put((new Student(444, "eee", "london")), "eee");

        map.entrySet().stream().sorted(Comparator.comparing(t -> t.getKey().getRollno())).forEach(System.out::println);

        map.entrySet().stream().sorted(Comparator.comparing(t -> t.getKey().getRollno()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue
                        , (e1, e2) -> e1, LinkedHashMap::new))
                .forEach((k, v) -> System.out.println(k));
    }
}
