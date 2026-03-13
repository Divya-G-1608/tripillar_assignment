package MODULE_4;
interface interface_vehicle {
    void start();
}
class Car implements interface_vehicle{
    public void start(){
        System.out.println("Car is starting");
    }

    public static void main(String[] args) {
        Car c=new Car();
        c.start();
    }
}
