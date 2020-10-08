package lesson1;

public class TestTaskThreePhone {
    private String Value;
    private String Manufacturer;

    public TestTaskThreePhone() {
    }

    public TestTaskThreePhone(String value, String manufacturer) {
        this.Value = value;
        this.Manufacturer = manufacturer;
    }

    public String getValue() {
        return this.Value;
    }

    public void setValue(String value) {
        this.Value = value;
    }

    public String getManufacturer() {
        return this.Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.Manufacturer = manufacturer;
    }
}
