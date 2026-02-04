package java8workshop.SmartCityTransportSystem.service;

import java8workshop.SmartCityTransportSystem.model.TransportService;

public class MetroService implements TransportService {

    public String getServiceName() { return "Metro Rail"; }
    public String getRoute() { return "C → D"; }
    public double getFare() { return 40.0; }
    public String getDepartureTime() { return "08:10"; }
}