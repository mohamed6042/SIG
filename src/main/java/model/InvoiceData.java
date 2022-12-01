
package model;

import java.util.ArrayList;

public class InvoiceData {
    
    private int num;
    private String customer;
    private String date;
    private ArrayList<LineData>lines;

    public ArrayList<LineData> getLines() {
        if(lines==null){
            lines=new ArrayList<>();
        }
        return lines;
    }
    
     public double getInvoicetotal() {
        double total = 0.0;
        for (LineData line : getLines()) {
            total += line.getLinetotal();
        }
        return total;
    }

    public void setLines(ArrayList<LineData> lines) {
        this.lines = lines;
    }

    public InvoiceData() {
    }

    public InvoiceData(int num, String customer, String date) {
        this.num = num;
        this.customer = customer;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "InvoiceData{" + "num=" + num + ", customer=" + customer + ", date=" + date + '}';
    }
    
    

    
    public String getCSV() {
                        return num + "," + date + "," + customer;

    }
    
    
}
