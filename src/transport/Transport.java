package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    private double bestLapTime;
    private int maxSpeed;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = (brand == null || brand.isEmpty() || brand.isBlank()) ? "default" : brand;
        this.model = (model == null || model.isEmpty() || model.isBlank()) ? "default" : model;
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void printType();

    public abstract boolean getDiagnosed() throws CantGetDiagnosed;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public double getBestLapTime() {
        return bestLapTime;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract String getTypeOfTransport();


    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) this.engineVolume = engineVolume;
    }

    public void setBestLapTime(double bestLapTime) {
        if (bestLapTime > 0) this.bestLapTime = bestLapTime;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) this.maxSpeed = maxSpeed;
    }
}
