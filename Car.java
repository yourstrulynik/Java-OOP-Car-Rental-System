public class Car {
    private String carID;
    private String brand;
    private String model;
    private double fairPerDay;
    private boolean isAvaiable;

    public Car(String carID, String brand, String model, double fairPerDay) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.fairPerDay = fairPerDay;
        this.isAvaiable = true;
    }

    public String getCarID() {
        return carID;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double rentalPrice(int rentalDays) {
        return fairPerDay * rentalDays;
    }

    public boolean isAvaiable() {
        return isAvaiable;
    }

    public void rent() {
        isAvaiable = false;
    }

    public void returnCar() {
        isAvaiable = true;
    }

}