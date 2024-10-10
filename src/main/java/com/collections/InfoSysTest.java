package com.collections;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.function.Predicate;

/*

Emp{1, 'ABC', address:{city:'MUMBAI'}, 8}
Emp{2, 'DEF', address:{city:'DELHI'}, 4}
Emp{3, 'XYZ', address:{city:'MUMBAI'}, 12}
 */

class Employee1{
    int id;
    String name;
    int experience;

    Address address;

    public int getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return id == employee1.id && experience == employee1.experience && Objects.equals(name, employee1.name) && Objects.equals(address, employee1.address);
    }

    @Override
    public int hashCode() {
        return -1;
    }

    public Employee1(int id, String name, int experience, Address address) {
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.address = address;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
class Address{
    String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
public class InfoSysTest {
    public static void main(String[] args) {


        List<Employee1> employeeList = new ArrayList<>();

        Address address1 = new Address("MUMBAI");
        Address address2 = new Address("Hyd");
        Address address3 = new Address("Delhi");

        Employee1 employee11 = new Employee1(1, "ABC", 5, address1);
        Employee1 employee12 = new Employee1(2, "ABC", 4, address2);
        Employee1 employee13 = new Employee1(3, "ABC", 6, address3);
        Employee1 employee14 = new Employee1(4, "ABC", 2, address1);

        employeeList.add(employee11);
        employeeList.add(employee12);
        employeeList.add(employee13);
        employeeList.add(employee14);

        Optional<Employee1> list = employeeList.stream()
                .filter(e -> e.getAddress().getCity()=="MUMBAI")
                .min(Comparator.comparing(Employee1::getExperience));

        System.out.println(list.get());

        list.stream().forEach(e -> System.out.print(e.id));
                //.forEach(e -> System.out.println(e.getId()));




        Node node1 = new Node(1, null);
        Node node2 = new Node(2, node1);
        Node node3 = new Node(3, node2);
        Node node4 = new Node(4, node3);
        Node node5 = new Node(5, node4);
        Node node6 = new Node(6, node5);

        InfoSysTest infoSysTest = new InfoSysTest();
        infoSysTest.reverse(node6);

    }

    private void reverse(Node node) {
            if(node==null){
                return;
            }
            if(node.next==null){
                return;
            }
            Node temp = node.next.next;
            node.next.next = node;
            reverse(temp);
    }

}

class Node{
    Integer data;
    Node next;

    public Node(Integer data, Node next) {
        this.data = data;
        this.next = next;
    }
}
