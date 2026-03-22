package Single_Inheritance.Question_2;

public class Devices {
    private int deviceId;
    private String status;

    public Devices(int deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;
    }
    public int getDeviceId() {
        return deviceId;
    }
    public String getStatus() {
        return status;
    }
    public void displayDetail(){
        System.out.println("Device id : "+deviceId);
        System.out.println("status : "+status);
    }
}
