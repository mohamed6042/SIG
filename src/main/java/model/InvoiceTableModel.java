
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class InvoiceTableModel extends AbstractTableModel {
    
    private ArrayList<InvoiceData>invoiceData;
    private String[] columns = {"No.", "Date", "Customer", "Total"};

    public InvoiceTableModel() {
    }

    public InvoiceTableModel(ArrayList<InvoiceData> invoiceData) {
        this.invoiceData = invoiceData;
    }
    
    @Override
    public int getRowCount() {
        return invoiceData.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
     @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceData invoice = invoiceData.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return invoice.getNum();
            case 1: return invoice.getDate();
            case 2: return invoice.getCustomer();
            case 3: return invoice.getInvoicetotal();
            default : return "";
        }
    }
    
}
