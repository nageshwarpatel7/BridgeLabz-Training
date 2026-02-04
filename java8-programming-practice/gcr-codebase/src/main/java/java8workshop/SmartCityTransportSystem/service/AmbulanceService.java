package java8workshop.SmartCityTransportSystem.service;

import java8workshop.SmartCityTransportSystem.model.EmergencyService;
import java8workshop.SmartCityTransportSystem.model.TransportService;

public class AmbulanceService
implements TransportService, EmergencyService {

	public String getServiceName() { 
		return "Ambulance";
		}
	public String getRoute() { 
		return "Emergency Route";
		}
	public double getFare() { 
		return 0.0; 
		}
	public String getDepartureTime() { 
		return "Immediate"; 
		}
}