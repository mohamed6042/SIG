
package view;

import controller.Controllers;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;
import model.InvoiceData;
import model.InvoiceTableModel;


public class FrameOfInvoice extends javax.swing.JFrame {
    
    private ArrayList<InvoiceData>invoiceData;
    private InvoiceTableModel invoicesTableModel;

    
    public FrameOfInvoice() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTable_left = new javax.swing.JTable();
        invoiceTable_left.getSelectionModel().addListSelectionListener(controller);
        create_invoice = new javax.swing.JButton();
        create_invoice.addActionListener(controller);
        cancel_invoice = new javax.swing.JButton();
        cancel_invoice.addActionListener(controller);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemTable_right = new javax.swing.JTable();
        create_item = new javax.swing.JButton();
        create_item.addActionListener(controller);
        delete_item = new javax.swing.JButton();
        delete_item.addActionListener(controller);
        numberOfInvoice = new javax.swing.JLabel();
        timeOfInvoice = new javax.swing.JLabel();
        totalOfInvoice = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileButton = new javax.swing.JMenu();
        loadFileButton = new javax.swing.JMenuItem();
        loadFileButton.addActionListener(controller);
        saveFileButton = new javax.swing.JMenuItem();
        saveFileButton.addActionListener(controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoiceTable_left.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(invoiceTable_left);

        create_invoice.setText("Create Invoice");

        cancel_invoice.setText("Cancel Invoice");

        jLabel1.setText(" Invoice No.");

        jLabel2.setText("Customer Name");

        jLabel3.setText("Invoice Date");

        jLabel4.setText("Total of Invoice");

        itemTable_right.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(itemTable_right);

        create_item.setText("Create Item");

        delete_item.setText("Delete Item");

        fileButton.setText("File");

        loadFileButton.setText("Load File");
        fileButton.add(loadFileButton);

        saveFileButton.setText("Save File");
        fileButton.add(saveFileButton);

        jMenuBar1.add(fileButton);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numberOfInvoice)
                                    .addComponent(totalOfInvoice)
                                    .addComponent(customerName)
                                    .addComponent(timeOfInvoice)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(create_invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(cancel_invoice)
                        .addGap(73, 73, 73)
                        .addComponent(create_item, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(delete_item, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(numberOfInvoice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timeOfInvoice)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customerName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(totalOfInvoice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancel_invoice)
                        .addComponent(create_item)
                        .addComponent(delete_item))
                    .addComponent(create_invoice))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameOfInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameOfInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameOfInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameOfInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameOfInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_invoice;
    private javax.swing.JButton create_invoice;
    private javax.swing.JButton create_item;
    private javax.swing.JLabel customerName;
    private javax.swing.JButton delete_item;
    private javax.swing.JMenu fileButton;
    private javax.swing.JTable invoiceTable_left;
    private javax.swing.JTable itemTable_right;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadFileButton;
    private javax.swing.JLabel numberOfInvoice;
    private javax.swing.JMenuItem saveFileButton;
    private javax.swing.JLabel timeOfInvoice;
    private javax.swing.JLabel totalOfInvoice;
    // End of variables declaration//GEN-END:variables

    public ArrayList<InvoiceData> getInvoiceData() {
        return invoiceData;
    }

    public void setInvoiceData(ArrayList<InvoiceData> invoiceData) {
        this.invoiceData = invoiceData;
    }
    
    private Controllers controller = new Controllers(this);
    
    public InvoiceTableModel getInvoicesTableModel() {
        if (invoicesTableModel == null) {
            invoicesTableModel = new InvoiceTableModel(getInvoiceData());
        }
        return invoicesTableModel;
    }

    public void setInvoicesTableModel(InvoiceTableModel invoicesTableModel) {
        this.invoicesTableModel = invoicesTableModel;
    }

    public JTable getInvoiceTable_left() {
        return invoiceTable_left;
    }

    public JLabel getNumberOfInvoice() {
        return numberOfInvoice;
    }

    public JTable getItemTable_right() {
        return itemTable_right;
    }

    public JLabel getCustomerName() {
        return customerName;
    }

    public JLabel getTimeOfInvoice() {
        return timeOfInvoice;
    }

    public JLabel getTotalOfInvoice() {
        return totalOfInvoice;
    }

   

    public Controllers getController() {
        return controller;
    }
    
    public int getNextInvoiceNum() {
        int num = 0;
        
        for (InvoiceData invoice : getInvoiceData()) {
            if (invoice.getNum() > num) 
                num = invoice.getNum();
        }
        
        return ++num;
    }
    
}

