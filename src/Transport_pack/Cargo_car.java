package Transport_pack;

import Transport_pack.driver.Driver_C;

public class Cargo_car<C extends Driver_C> implements Competing {
    private Weight weight;
    private String brand;
    private String model;
    private double engineVolume;

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public Cargo_car(String brand, String model, double engineVolume, Weight weight) {
        this.weight=weight;
        if (brand ==null){
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model ==null){
            this.model = "default";
        } else {
            this.model = model;
        }
        if (Double.compare(engineVolume,0)==0){
            this.engineVolume = 1.5;
        }else{
            this.engineVolume = engineVolume;
        }
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }


    public String startMoving(){
        return "Поехали!";
    }
    public String stopMoving(){
        return "Остановись!";
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    @Override
    public String takePitStop() {
        return takePitStop().toString();
    }

    @Override
    public String bestLapTime() {
        return bestLapTime().toString();
    }

    @Override
    public String maxSpeed() {
        return maxSpeed().toString();
    }
}
