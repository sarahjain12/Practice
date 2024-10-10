package com.collections;

public class TechnumenTest1 {

    public static void main(String[] args) {

    }
}

class Car{


}

class SUV extends Car{

}

class Sedan extends Car{

}

class CarFactory{

    public Car getCar(String carType){
        if(carType=="Sedan"){
            return new Sedan();
        }
        else if(carType == "SUV"){
            return new SUV();
        }
        return new Car();
    }

}