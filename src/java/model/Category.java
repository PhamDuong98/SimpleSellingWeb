
package model;


public class Category {
    private int hid,status;
    private String hname,website;

    public Category() {
    }

    public Category(String hname, String website,int status) {
        this.status = status;
        this.hname = hname;
        this.website = website;
    }

    public Category(int hid,String hname, String website) {
        this.hid = hid;
        this.hname = hname;
        this.website = website;
    }
    
    public Category(int hid, String hname, String website, int status) {
        this.hid = hid;
        this.status = status;
        this.hname = hname;
        this.website = website;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    
}
