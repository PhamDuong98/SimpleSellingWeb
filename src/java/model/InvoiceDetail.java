
package model;


public class InvoiceDetail {
    
    private String hid,sid;
    private int quantity;
    private double price;

    public InvoiceDetail() {
    }
    
    public InvoiceDetail(String hid, String sid, int quantity, double price) {
        this.hid = hid;
        this.sid = sid;
        this.quantity = quantity;
        this.price = price;
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "InvoiceDetail{" + "hid=" + hid + ", sid=" + sid + ", quantity=" + quantity + ", price=" + price + '}';
    }
    
    
    
}
