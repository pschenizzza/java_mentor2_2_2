
package web.model;

public class Car {
    private long id;
    private String model;
    private int horsePower;

    public Car() {}

    public Car(long id, String model, int horsePower) {
        this.id = id;
        this.model = model;
        this.horsePower = horsePower;
    }

    public long getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}