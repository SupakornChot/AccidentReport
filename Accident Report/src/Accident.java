
public class Accident {
    private static int countId;
    private int accidentId;
    private String accidentName;
    private String facilityName;
    private String phoneNumber;
    private User user;
    private int status;

    public Accident(String accidentName, String facilityName, String phoneNumber, User user) {
        this.accidentName = accidentName;
        this.facilityName = facilityName;
        this.phoneNumber = phoneNumber;
        this.user = user;
        countId++;
        accidentId = countId;
    }

    public int getAccidentId() {
        return accidentId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
    
    @Override
    public String toString() {
        return "Accident\n"+user.toString()
                +"Accident ID: "+ accidentId+"\n"
                +"Accident Name : "+accidentName+"\n"
                +"Faccility : "+facilityName+"\n"
                +"Phone number : "+phoneNumber+"\n"+
                "Status : "+status;
    }
    
}
