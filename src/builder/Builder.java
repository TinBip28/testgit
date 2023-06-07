package builder;

public interface Builder {
   Builder reset();
   Builder setSeats(int seats);
   Builder setEngine(Engine engine);
   Builder setTripComputer(TripComputer tripComputer);
   Builder setGPS(GPS gps);
}
