package sk.akademiasovy.java;

public class Main {
    public static void main(String[] args) {
        Car car1,car2;
        car1=new Car();

        //car1.brand="Audi A8"
        car1.setBrand("Audi A8");
        car1.setGasConsumption(9.9f);
        car1.printInfo();

        car2=new Car("Skoda 120L",9.5f);
        car2.printInfo();
        car2.startEngine();

        car2.increaseSpeed();
        car2.printInfo();
        System.out.println("Cost KE<->Prag : "+ car2.getPrice(1600,1.33f));

        car1.increaseSpeed();
        car1.increaseSpeed(85);
        car2.increaseSpeed(81);

        if(car1.getSpeed() > car2.getSpeed()) {
            System.out.println();
        }

        Car car3;
        car3=car2;
        car3.stop();

        car3=new Car("Seat Ibiza",7.1f,"Trencin");




    }



}
