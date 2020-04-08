package oop.transport;

public class TransportTester {

    public static void main(String[] args) {

        Transport airplane = new Airplane();
        Transport bus = new Bus();
        Transport bicycle = new Bicycle();
        Transport car = new Car();
        Transport motorbike = new Motorbike();
        Transport scooter = new Scooter();
        Transport tram = new Tram();
        Transport train = new Train();
        moveTransport(bicycle);
        moveTransport(car);
        moveTransport(motorbike);
        moveTransport(scooter);
        moveTransport(tram);
        moveTransport(train);
        moveTransport(airplane);
        moveTransport(bus);
    }

    public static void moveTransport(Transport transport){
        transport.move();
    }

}
