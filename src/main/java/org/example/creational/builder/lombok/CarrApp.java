package org.example.creational.builder.lombok;

class CarrApp {
    public static void main(String[] args) {

        Car car = Car.builder()
                .model("Mustang")
                .engine("3.6")
                .interior("Leather")
                .hasSunroof(true)
                .color("Silver Metallic")
                .build();

        System.out.println(car);
    }
}
