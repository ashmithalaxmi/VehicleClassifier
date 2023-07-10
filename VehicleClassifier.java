class Vehicle {
    public void start() {
        System.out.println("Vehicle started.");
    }

    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped.");
    }
}

class VehicleClassifier {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle car1 = new Car();
        Vehicle motorcycle1 = new Motorcycle();

        vehicle1.start();
        vehicle1.stop();

        car1.start();
        car1.stop();

        motorcycle1.start();
        motorcycle1.stop();
    }
}