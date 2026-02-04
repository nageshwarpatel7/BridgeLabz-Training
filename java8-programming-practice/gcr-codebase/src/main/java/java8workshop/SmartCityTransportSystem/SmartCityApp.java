package java8workshop.SmartCityTransportSystem;


import java8workshop.SmartCityTransportSystem.model.TransportService;
import java8workshop.SmartCityTransportSystem.model.EmergencyService;
import java8workshop.SmartCityTransportSystem.service.*;
import java8workshop.SmartCityTransportSystem.utils.*;

import java.util.*;
import java.util.stream.Collectors;
public class SmartCityApp {

    public static void main(String[] args) {

        List<TransportService> services = List.of(
                new BusService(),
                new MetroService(),
                new TaxiService(),
                new AmbulanceService()
        );

        System.out.println("=== LIVE DASHBOARD ===");
        services.forEach(TransportService::printServiceDetails);

        System.out.println("\n=== FILTER (Fare <= 50) & SORT (Time) ===");
        services.stream()
                .filter(s -> s.getFare() <= 50)
                .sorted(Comparator.comparing(
                        TransportService::getDepartureTime))
                .forEach(TransportService::printServiceDetails);

        System.out.println("\n=== GROUP BY ROUTE ===");
        Map<String, List<TransportService>> byRoute =
                services.stream()
                        .collect(Collectors.groupingBy(
                                TransportService::getRoute));
        byRoute.forEach((k, v) ->
                System.out.println(k + " -> " + v.size()));

        System.out.println("\n=== REVENUE SUMMARY ===");
        DoubleSummaryStatistics stats =
                services.stream()
                        .collect(Collectors.summarizingDouble(
                                TransportService::getFare));
        System.out.println("Total Revenue: " + stats.getSum());
        System.out.println("Average Fare: " + stats.getAverage());

        System.out.println("\n=== EMERGENCY PRIORITY CHECK ===");
        services.forEach(service -> {
            if (service instanceof EmergencyService) {
                System.out.println(
                    service.getServiceName() +
                    "  PRIORITY SERVICE");
            }
        });

        System.out.println("\n=== FARE CALCULATION USING LAMBDA ===");
        FareCalculator taxiFare =
                distance -> 10 * distance + 50;
        System.out.println(
                "Taxi Fare for 12 km: " +
                taxiFare.calculateFare(12));

        System.out.println("\n=== DISTANCE CALCULATION ===");
        System.out.println("Distance: " +
                GeoUtils.calculateDistance(10, 20, 13, 24));
    }
}
