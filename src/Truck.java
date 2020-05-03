public class Truck extends Car {
    private int equipmentWeight;


    public Truck(String name, int capacity, double fuelConsumption) {
        super(name, capacity, fuelConsumption);
    }



    public void AirConditionerOn(Truck truck) {
        if (!truck.isAirConditionerOn()) {
            truck.setAirConditionerOn(true);
            truck.setFuelConsumption(truck.getFuelConsumption() + 1.6);
        }
    }

    public void AirConditionerOff(Truck truck) {
        if (truck.isAirConditionerOn()) {
            truck.setAirConditionerOn(false);
            truck.setFuelConsumption(truck.getFuelConsumption() - 1.6);
        }
    }

    public void equipment(Truck truck, int weight) {
        truck.setEquipmentWeight(weight);
        truck.setFuelConsumption(truck.getFuelConsumption()+(0.005*weight));
    }
    public double distance(Truck truck){
        return (truck.getCapacity()/truck.getFuelConsumption())*100;
    }

    public int getEquipmentWeight() {
        return equipmentWeight;
    }

    public void setEquipmentWeight(int equipmentWeight) {
        this.equipmentWeight = equipmentWeight;
    }
    public void printInfo(Car array[]){
        for(int i=0; i<=array.length-1; i++){
            System.out.println("NAME: " + array[i].getName() + " FUEL CONSUMPTION " + array[i].getFuelConsumption() +
                    " CAPACITY " + array[i].getCapacity() + " " +
            "airConditionerOn=" + array[i].isAirConditionerOn() + " DISTANCE POSSIBLE :" + array[i].distance(array[i]));
        }
    }

    @Override
    public String toString() {
        return "Car{ NAME: " + getName() + " FUEL CONSUMPTION " + getFuelConsumption() + " CAPACITY " + getCapacity() + " " +
                "airConditionerOn=" + isAirConditionerOn() +
                '}';
    }
}
