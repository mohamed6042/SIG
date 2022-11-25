
package model;

public class LineData {
   
    private double priceOfItem;
    private String itemName;
    private int itemCount;
    private InvoiceData invoiceData;

    public LineData() {
    }

    @Override
    public String toString() {
        return "LineData{" + "num=" + invoiceData.getNum() + ", priceOfItem=" + priceOfItem + ", itemName=" + itemName + ", itemCount=" + itemCount + '}';
    }

    public LineData( double priceOfItem, String itemName, int itemCount,InvoiceData invoiceData) {
        this.priceOfItem = priceOfItem;
        this.itemName = itemName;
        this.itemCount = itemCount;
        this.invoiceData = invoiceData;
    }

    public InvoiceData getInvoiceData() {
        return invoiceData;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    

    public double getPriceOfItem() {
        return priceOfItem;
    }

    public void setPriceOfItem(double priceOfItem) {
        this.priceOfItem = priceOfItem;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public double getLinetotal() {
        return priceOfItem * itemCount;
    }
    
    
}
