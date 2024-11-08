package com.xworkz.interfaces;

public class CityBus implements Bus{
        private int numberOfSeats;
        private String route;

        CityBus(int numberOfSeats, String route) {
            this.numberOfSeats = numberOfSeats;
            this.route = route;
        }

        @Override
        public void start() {
            System.out.println("CityBus is starting");
        }

        @Override
        public void stop() {
            System.out.println("CityBus is stopping");
        }

        @Override
        public void boardPassengers() {
            System.out.println("Passengers are boarding the CityBus");
        }

        @Override
        public void alightPassengers() {
            System.out.println("Passengers are alighting from the CityBus");
        }

        @Override
        public int getNumberOfSeats() {
            return numberOfSeats;
        }

        @Override
        public String getRoute() {
            return route;
        }

}
