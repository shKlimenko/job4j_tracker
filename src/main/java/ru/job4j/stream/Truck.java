package ru.job4j.stream;

public class Truck {
    private String model;
    private String license;
    private Double weight;
    private Double height;
    private int wheels;
    private boolean trunk;
    private String steeringWheel;

    static class Builder {
        private String model;
        private String license;
        private Double weight;
        private Double height;
        private int wheels;
        private boolean trunk;
        private String steeringWheel;

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildLicense(String license) {
            this.license = license;
            return this;
        }

        Builder buildWeight(Double weight) {
            this.weight = weight;
            return this;
        }

        Builder buildHeight(Double height) {
            this.height = height;
            return this;
        }

        Builder buildWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        Builder buildTrunk(boolean trunk) {
            this.trunk = trunk;
            return this;
        }

        Builder buildSteeringWheel(String steeringWheel) {
            this.steeringWheel = steeringWheel;
            return this;
        }

        Truck build() {
            Truck truck = new Truck();
            truck.model = model;
            truck.license = license;
            truck.weight = weight;
            truck.height = height;
            truck.wheels = wheels;
            truck.trunk = trunk;
            truck.steeringWheel = steeringWheel;
            return truck;
        }
    }

    public static void main(String[] args) {
        Truck truck = new Builder().buildModel("Dodge")
                .buildLicense("Michigan")
                .buildWeight(3250.0D)
                .buildHeight(375D)
                .buildWheels(6)
                .buildTrunk(true)
                .buildSteeringWheel("Left")
                .build();
        System.out.println(truck);
    }

    @Override
    public String toString() {
        return "Truck {"
                + "model='" + model + '\''
                + ", license='" + license + '\''
                + ", weight=" + weight
                + ", height=" + height
                + ", wheels=" + wheels
                + ", trunk=" + trunk
                + ", steeringWheel='" + steeringWheel + '\''
                + '}';
    }
}
