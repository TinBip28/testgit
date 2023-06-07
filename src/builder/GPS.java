package builder;

public class GPS {
    private String route;

    public GPS() {
        this.route = "334, Nguyen Trai Street, Ha Noi to Hoa Binh province, 8-19 LTV, Hoa Binh";
    }

    public GPS(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
