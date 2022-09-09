package com.example.airline_api.components;

import com.example.airline_api.models.Flight;
import com.example.airline_api.models.Passenger;
import com.example.airline_api.services.FlightService;
import com.example.airline_api.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FlightService flightService;

    @Autowired
    PassengerService passengerService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Flight flight1 = new Flight("LCY", 2, "2022-12-15", "18:00");
        flightService.addNewFlight(flight1);

        Flight flight2 = new Flight("EDI", 100, "2022-12-11", "15:00");
        flightService.addNewFlight(flight2);

        Passenger bob = new Passenger("Bob", "bob123@hotmail.com");
        passengerService.addNewPassenger(bob);

        Passenger lisa = new Passenger("Lisa", "lisa123@hotmail.com");
        passengerService.addNewPassenger(lisa);

    }
}
