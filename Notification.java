package FarmerModule;

public class Notification {
    private String notificationId;
    private String farmerId;
    private String message;
    private String phoneNum;
    private String timestamp;  
    private String status;

    public Notification(String notificationId, String farmerId, String phoneNum, String message, String timestamp) {
        this.notificationId = notificationId;
        this.farmerId = farmerId;
        this.phoneNum = phoneNum;
        this.message = message;
        this.timestamp = timestamp;
        this.status = "PENDING";
    }

    public void sendSMS() {
        System.out.println("SMS to " + phoneNum + " at " + timestamp + ": " + message);
        this.status = "SENT";
    }

    public void sendInApp() {  
        System.out.println("In-app notification at " + timestamp + ": " + message);
        this.status = "SENT";
    }

    public String getNotificationId() { return notificationId; }
    public String getFarmerId() { return farmerId; }
    public String getStatus() { return status; }
}
