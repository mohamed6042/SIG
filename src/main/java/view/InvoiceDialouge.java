/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author dell
 */
public class InvoiceDialouge extends JDialog {
    private JTextField customerNameField;
    private JTextField invDateField;
    private JLabel custNameLbl;
    private JLabel invDateLbl;
    private JButton okBtn;
    private JButton cancelButton;

    public InvoiceDialouge(FrameOfInvoice frame) {
        custNameLbl = new JLabel("Customer Name:");
        customerNameField = new JTextField(20);
        invDateLbl = new JLabel("Invoice Date:");
        invDateField = new JTextField(20);
        okBtn = new JButton("OK");
        cancelButton = new JButton("Cancel");
        
        okBtn.setActionCommand("NewInvoiceOK");
        cancelButton.setActionCommand("NewInvoiceCancel");
        
        okBtn.addActionListener(frame.getController());
        cancelButton.addActionListener(frame.getController());
        setLayout(new GridLayout(3, 2));
        
        add(invDateLbl);
        add(invDateField);
        add(custNameLbl);
        add(customerNameField);
        add(okBtn);
        add(cancelButton);
        
        pack();
        
    }

    public JTextField getCustomerNameField() {
        return customerNameField;
    }

    public JTextField getInvDateField() {
        return invDateField;
    }
    
}
