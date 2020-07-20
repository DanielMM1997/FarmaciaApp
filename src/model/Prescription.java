package model;

public class Prescription {
    
    private int code;
    private Date periodOfTime;
    private String illness;
    private String drName;
    private Date date;
    
    public Prescription (int code, Date periodOfTime, String illess, String drName, Date date) {
        this.code = code;
        this.periodOfTime = periodOfTime;
        this.illness = illness;
        this.drName = drName;
        this.date = date;
    }
}
