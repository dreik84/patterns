package org.example.creational.builder.lombok;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class Car {
    private String model;
    private String engine;
    private String interior;
    private boolean hasSunroof;
    private String color = "Black";
}
