public class Car extends Vehicle{
    private String modelName;

    public Car(String manufacturer, String modelName) {
        super(manufacturer);
        this.modelName = modelName;
    }

    public Car(long vehicleId, String manufacturer, String modelName) {
        super(vehicleId, manufacturer);
        this.modelName = modelName;
    }

    public Car(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
