
package model;


public class Product {
    
    private String sid;
    private int hid,quantity,status;
    private String sname,picture,description;
    private double price;

    public Product() {
    }

    public Product(String sid, int quantity, String sname, String picture, String description, double price) {
        this.sid = sid;
        this.quantity = quantity;
        this.sname = sname;
        this.picture = picture;
        this.description = description;
        this.price = price;
    }
 
    
    
    public Product(String sid, String sname, String picture, String description, double price,int quantity,int status, int hid) {
        this.sid = sid;
        this.sname = sname;
        this.picture = picture;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
        this.hid = hid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPicture() {
        return picture;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    
    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }  

    @Override
    public String toString() {
        return "Product{" + "sid=" + sid + ", hid=" + hid + ", quantity=" + quantity + ", status=" + status + ", sname=" + sname + ", picture=" + picture + ", description=" + description + ", price=" + price + '}';
    }
    
}
