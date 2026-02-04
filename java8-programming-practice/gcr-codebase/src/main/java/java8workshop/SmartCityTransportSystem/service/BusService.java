package java8workshop.SmartCityTransportSystem.service;

import java8workshop.SmartCityTransportSystem.model.TransportService;

public class BusService implements TransportService {

    public String getServiceName() { return "City Bus"; }
    public String getRoute() { return "A → B"; }
    public double getFare() { return 20.0; }
    public String getDepartureTime() { return "08:30"; }
}