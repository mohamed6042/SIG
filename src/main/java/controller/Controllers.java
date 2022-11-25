
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.InvoiceData;
import model.InvoiceTableModel;
import model.LineData;
import model.LineTableModel;
import view.FrameOfInvoice;
import view.InvoiceDialouge;
import view.LineDialouge;

public class Controllers implements ActionListener,ListSelectionListener {
    
    private FrameOfInvoice fInvoice;
    private InvoiceDialouge invoiceDialog;
    private LineDialouge lineDialog;
    
    public Controllers (FrameOfInvoice fInvoice){
        this.fInvoice = fInvoice;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        System.out.println("Action is: "+actionCommand);
        
        switch (actionCommand){
            case "Load File" :
                    loadFile();
            break;
            case "Save File" :
                    saveFile();
            break;
            case "Create Invoice" :
                    createInvoice();
            break;
            case "Cancel Invoice" :
                    cancelInvoice();
            break;
            case "Create Item" :
                    createItem();
            break;
            case "Delete Item" :
                    deleteItem();
            case "NewInvoiceOK" :
                newInvoiceOk();
            break;
            case "NewInvoiceCancel" :
                newInvoiceCancel();
            break;
            case "NewLineOK" :
                NewLineOK();
            break;
            case "NewLineCancel" :
                NewLineCancel();
            break;
                    
        }
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        int selectedIndex = fInvoice.getInvoiceTable_left().getSelectedRow();
        if (selectedIndex != -1) {
         System.out.println("You selected row: " + selectedIndex);
            InvoiceData currentInvoice = fInvoice.getInvoiceData().get(selectedIndex);
            fInvoice.getNumberOfInvoice().setText("" + currentInvoice.getNum());
            fInvoice.getTimeOfInvoice().setText(currentInvoice.getDate());
            fInvoice.getCustomerName().setText(currentInvoice.getCustomer());
            fInvoice.getTotalOfInvoice().setText(""+ currentInvoice.getInvoicetotal());
            LineTableModel linesTableModel = new LineTableModel(currentInvoice.getLines());
            fInvoice.getItemTable_right().setModel(linesTableModel);
            linesTableModel.fireTableDataChanged();
        }
    }

    private void loadFile() throws IOException {
        JFileChooser jfc = new JFileChooser();
        int results = jfc.showOpenDialog(fInvoice);
        if (results == JFileChooser.APPROVE_OPTION){
            File headerfile = jfc.getSelectedFile();
            Path headerpath = Paths.get(headerfile.getAbsolutePath());
            List<String>headerlines= Files.readAllLines(headerpath);  
            System.out.println("firstcheck");
            ArrayList<InvoiceData> ArrayOfInvoices = new ArrayList<>();
            for(String headerline:headerlines){
                String []headerSections = headerline.split(",");
                int invoiceNum = Integer.parseInt(headerSections[0]);
                String date = headerSections[1];
                String customerName = headerSections[2];
                InvoiceData invoiceData = new InvoiceData(invoiceNum,customerName,date);
                ArrayOfInvoices.add(invoiceData);
            }
            System.out.println("secondCheck");
            results = jfc.showOpenDialog(fInvoice);
        if (results == JFileChooser.APPROVE_OPTION){
            File linefile = jfc.getSelectedFile();
            Path linepath = Paths.get(linefile.getAbsolutePath());
            List<String>linelines= Files.readAllLines(linepath);
            System.out.println("secondcheck");
            for(String lineline:linelines){
                String []lineSections = lineline.split(",");
                int invoiceNum = Integer.parseInt(lineSections[0]);
                String item = lineSections[1];
                double itemPrice = Double.parseDouble(lineSections[2]);
                int count = Integer.parseInt(lineSections[3]);
                InvoiceData inv = null;
                for(InvoiceData invoice:ArrayOfInvoices){
                    if(invoice.getNum()==invoiceNum){
                        inv = invoice;
                        break;
                    }
                }
                LineData linedata = new LineData(itemPrice,item,count,inv);
                inv.getLines().add(linedata);
            }
            System.out.println("thirdcheck");
        }
             fInvoice.setInvoiceData(ArrayOfInvoices);
             InvoiceTableModel invoicesTableModel = new InvoiceTableModel(ArrayOfInvoices);
             fInvoice.setInvoicesTableModel(invoicesTableModel);
             fInvoice.getInvoiceTable_left().setModel(invoicesTableModel);
             fInvoice.getInvoicesTableModel().fireTableDataChanged();
        }
    }

    private void saveFile() {
    }

    private void createInvoice() {
         invoiceDialog = new InvoiceDialouge(fInvoice);
        invoiceDialog.setVisible(true);
    }

    private void cancelInvoice() {
         int selectedRow = fInvoice.getInvoiceTable_left().getSelectedRow();
        if (selectedRow != -1) {
            fInvoice.getInvoiceData().remove(selectedRow);
            fInvoice.getInvoicesTableModel().fireTableDataChanged();
        }
    }

    private void createItem() {
    }

    private void deleteItem() {
       int selectedRow = fInvoice.getItemTable_right().getSelectedRow();

        if (selectedRow != -1) {
            LineTableModel linesTableModel = (LineTableModel) fInvoice.getItemTable_right().getModel();
            linesTableModel.getLines().remove(selectedRow);
            linesTableModel.fireTableDataChanged();
            fInvoice.getInvoicesTableModel().fireTableDataChanged();
        }
    }

    private void newInvoiceOk() {
        String date = invoiceDialog.getInvDateField().getText();
        String customer = invoiceDialog.getCustomerNameField().getText();
    }

    private void newInvoiceCancel() {
        invoiceDialog.setVisible(false);
        invoiceDialog.dispose();
        invoiceDialog = null;
    }

    private void NewLineOK() {
    }

    private void NewLineCancel() {
    }

    
    
}

            
        