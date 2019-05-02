
package model;

import java.sql.Date;
import java.sql.Timestamp;


public class Invoice {
    
    private String hid, rcName, rcAddress,rPhone;
    private int cid,status;
    private Timestamp date;
    private double total;

    public Invoice() {
        
    }
    
    public Invoice(String hid, Timestamp date, int cid,String rcName, String rcAddress,String rPhone , int status, double total) {
        this.hid = hid;
        this.rcName = rcName;
        this.rcAddress = rcAddress;
        this.cid = cid;
        this.status = status;
        this.rPhone = rPhone;
        this.date = date;
        this.total = total;
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String getRcName() {
        return rcName;
    }

    public void setRcName(String rcName) {
        this.rcName = rcName;
    }

    public String getRcAddress() {
        return rcAddress;
    }

    public void setRcAddress(String rcAddress) {
        this.rcAddress = rcAddress;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getrPhone() {
        return rPhone;
    }

    public void setrPhone(String rPhone) {
        this.rPhone = rPhone;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
