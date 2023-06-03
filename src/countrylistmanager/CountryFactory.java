package countrylistmanager;

public class CountryFactory {
    public static CountryFactory instance;

    private CountryFactory() {

    }

    public static CountryFactory getInstance() {
        if (instance == null) {
            instance = new CountryFactory();
        }
        return instance;
    }

    public AbstractCountry createCountry(String type, CountryData data) {
        if (type.equals("Asia")) {
            return new AsiaCountry(data);
        } else if (type.equals("Africa")) {
            return new AfricaCountry(data);
        } else if (type.equals("Oceania")) {
            return new OceaniaCountry(data);
        } else if (type.equals("Europe")) {
            return new EuropeCountry(data);
        } else if (type.equals("North America")) {
            return new NorthAmericaCountry(data);
        } else {
            return new SouthAmericaCountry(data);
        }
    }
}
