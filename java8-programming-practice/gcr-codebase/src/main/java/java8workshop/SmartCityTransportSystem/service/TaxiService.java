package java8workshop.SmartCityTransportSystem.service;

import java8workshop.SmartCityTransportSystem.model.TransportService;

public class TaxiService implements TransportService {

    public String getServiceName() { return "Taxi"; }
    public String getRoute() { return "Door to Door"; }
    public double getFare() { return 150.0; }
    public String getDepartureTime() { return "Anytime"; }
}