/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dell
 */
public class LineTableModel extends AbstractTableModel {
    
    private ArrayList<LineData> lines;
    private String[] columns = {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public LineTableModel() {
    }

    public LineTableModel(ArrayList<LineData> lines) {
        this.lines = lines;
    }

    public ArrayList<LineData> getLines() {
        return lines;
    }

    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int columnNo) {
        return columns[columnNo];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LineData line = lines.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return line.getInvoiceData().getNum();
            case 1: return line.getItemName();
            case 2: return line.getPriceOfItem();
            case 3: return line.getItemCount();
            case 4: return line.getLinetotal();
            default : return "";
        }
    }
    
}
