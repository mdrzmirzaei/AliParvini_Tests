package Lambda_Ananymous.CarPool;

public class TestCarPool {

    public static void main(String[] args) {

        CarPool cp=new CarPool();
        cp.report();

        cp.rentCar();
        cp.rentCar();
        cp.rentCar();
        cp.rentCar();
        cp.rentCar();
        cp.rentCar();
        cp.rentCar();
        cp.rentCar();
        cp.rentCar();
        cp.rentCar();

        cp.report();

        cp.rentCar();
        cp.report();

        cp.releaseCar();

        cp.report();

        cp.rentCar();
        cp.report();



    }

}
