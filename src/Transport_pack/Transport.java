package Transport_pack;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    //CONSTRUCTOR
    public Transport(String brand, String model, double engineVolume) {
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


    public abstract void getDiagnosed();
    public abstract void printType();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }


}
