package java8workshop.SmartCityTransportSystem.utils;

@FunctionalInterface
public interface FareCalculator {
    double calculateFare(double distance);
}