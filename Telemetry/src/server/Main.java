package server;

public class Main {
    public static void main(String[] args) {
        JAXB jaxb = new JAXB("telemetry.xml");
        System.out.println(jaxb.getTelemetry().getCars().getCar().get(1).getName());
    }
}
