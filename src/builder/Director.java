package builder;

public class Director {
    public void constructSportCar(Builder builder) {
        builder.reset()
                .setSeats(2)
                .setEngine(new Engine(3.0, 2))
                .setTripComputer(new TripComputer())
                .setGPS(new GPS());
    }

    public void constructSUV(Builder builder) {
        builder.reset()
                .setSeats(6)
                .setEngine(new Engine(2.0, 1.0))
                .setGPS(new GPS());
    }
}
