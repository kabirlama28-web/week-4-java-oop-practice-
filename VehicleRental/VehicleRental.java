class Vehicle {
    String plateNumber;
    double baseRate;

    Vehicle(String plateNumber, double baseRate) {
        this.plateNumber = plateNumber;
        this.baseRate = baseRate;
    }

    double calculateRental(int days) {
        return 0;
    }
}

class Car extends Vehicle {
    Car(String plateNumber, double baseRate) {
        super(plateNumber, baseRate);
    }

    @Override
    double calculateRental(int days) {
        return baseRate * days;
    }
}

class Truck extends Vehicle {
    double loadFee;

    Truck(String plateNumber, double baseRate, double loadFee) {
        super(plateNumber, baseRate);
        this.loadFee = loadFee;
    }

    @Override
    double calculateRental(int days) {
        return (baseRate * days) + loadFee;
    }
}

class Bike extends Vehicle {
    Bike(String plateNumber, double baseRate) {
        super(plateNumber, baseRate);
    }

    @Override
    double calculateRental(int days) {
        return baseRate;
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle v1 = new Car("BA123", 2000);
        Vehicle v2 = new Truck("BA456", 3000, 5000);
        Vehicle v3 = new Bike("BA789", 1000);

        System.out.println(v1.calculateRental(3));
        System.out.println(v2.calculateRental(3));
        System.out.println(v3.calculateRental(3));
    }
}