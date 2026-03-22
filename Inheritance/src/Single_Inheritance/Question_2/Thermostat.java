package Single_Inheritance.Question_2;

public class Thermostat extends Devices{

    private double temperatureSetting;
    public Thermostat(int deviceId, String status,double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting=temperatureSetting;
    }

    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("Temperature setting : "+temperatureSetting);
    }
}
