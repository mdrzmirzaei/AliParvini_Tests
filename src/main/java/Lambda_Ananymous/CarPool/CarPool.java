package Lambda_Ananymous.CarPool;

import java.util.ArrayList;

public class CarPool {

    ArrayList<Car> CarPool_Array = new ArrayList<>();
    int CarCount;
    int CarRent;

    public CarPool() {
        for (int i = 0; i < 10; i++) {
            CarPool_Array.add(new Car("pride")) ;
        }
        CarCount=CarPool_Array.size();
    }

    Car rentCar() {
        if (CarCount>0) {
            System.out.println("Car is Rent");
            CarCount--;
            CarRent++;

        }
        else
            System.out.println("There is no more Car for Rent!!! PLs Wait");


        return CarPool_Array.get(CarCount);


    }

    void releaseCar(){
        System.out.println("Car is Released");
        CarCount++;
        CarRent--;

    }

    void report()
    {
        System.out.println("Car of rents are : "+ CarRent);
        System.out.println("Car of stack are : "+ CarCount);
    }



}

