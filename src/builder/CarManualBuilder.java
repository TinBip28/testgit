package builder;

public class CarManualBuilder implements Builder {
    private Manual manual = new Manual();

    @Override
    public Builder reset() {
        manual = new Manual();
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        manual.setSeats(seats);
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        manual.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer(TripComputer tripComputer) {
        manual.setTripComputer(tripComputer);
        return this;
    }

    @Override
    public Builder setGPS(GPS gps) {
        manual.setGps(gps);
        return this;
    }

    public Manual getProduct(){
        Manual product = manual;
        reset();
        return product;
    }
}
