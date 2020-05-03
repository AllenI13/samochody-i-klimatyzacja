public class Test {
    public static void main(String[] args) {
        Car array[] = new Car[4];
        array[0] = new Car("Audi", 70, 12);
        array[1] = new Car("Mercedes", 80, 10);
        array[2] = new Truck("Volvo", 150, 20);
        array[3] = new Truck("Volvo", 200, 22);
        Truck truck = (Truck) array[2];
        Truck truck1 = (Truck) array[3];
        truck.equipment(truck, 500);
        truck1.equipment(truck1, 5000);
        truck.printInfo(array);
        array[0].AirConditionerOn(array[0]);
        array[1].AirConditionerOn(array[1]);
        array[2].AirConditionerOn(array[2]);
        array[3].AirConditionerOn(array[3]);
        truck.printInfo(array);


    }
}
