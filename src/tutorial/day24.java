package tutorial;

public class day24
{
    day24()
    {
        System.out.println("object is now created");
    }
    public static void main(String[] args)
    {
        System.out.println("day 24");



        System.out.println();
        day24 obj=new day24();



        System.out.println();
        Vehicle car=new Vehicle();
        System.out.println(car.wheels+" wheels");
        System.out.println(car.headLights+" head lights");



        System.out.println();
        Vehicle bike =new Vehicle(2);
        System.out.println(bike.wheels+" wheels");
        System.out.println(bike.headLights+" head lights");



        System.out.println();
        Vehicle BMW =new Vehicle("BMW");
        System.out.println(BMW.carName+" wheels");
        System.out.println(BMW.carName+" head lights");
        System.out.println(BMW.carName+" is the brand name");

    }
}
class Vehicle
{
    int wheels;
    int headLights;
    String carName;
    Vehicle()
    {
        wheels=4;
        headLights=2;
    }
    Vehicle(int noOfWheels)
    {
        wheels=noOfWheels;
        headLights=2;
    }
    Vehicle(String carName)
    {
        this.carName=carName;
    }
}










































































