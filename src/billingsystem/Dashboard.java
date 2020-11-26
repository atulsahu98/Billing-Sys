/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingsystem;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.Timer;

/**
 *
 * @author Windows
 */
public class Dashboard extends javax.swing.JFrame {

    /*GridBagLayout layout=new GridBagLayout();
     DataManagementPanel datamanagementPanel;
     BillPanel billPanel;*/
    public Dashboard() {
        initComponents();
        ShowTime();
        ShowDate();
        home.requestFocus();
        //set icon to frame.
        section();
        // maximize the screen.
        // setExtendedState(Dashboard.MAXIMIZED_BOTH);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        //make shortcut for bill.
        Action billAction = new AbstractAction("bill") {

            @Override
            public void actionPerformed(ActionEvent e) {

                new DataManagementFrame().setVisible(false);
                new BillFrame().setVisible(true);
            }
        };
        String key = "bill";
        this.bill.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_B, KeyEvent.CTRL_DOWN_MASK), key);
        this.bill.getActionMap().put(key, billAction);

        //make shortcut for dataManagrement.
        Action dataAction = new AbstractAction("data") {

            @Override
            public void actionPerformed(ActionEvent e) {

                new BillFrame().setVisible(false);
                new DataManagementFrame().setVisible(true);
            }
        };
        String key2 = "data";
        this.bill.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_DOWN_MASK), key2);
        this.bill.getActionMap().put(key2, dataAction);
        //make logout shortcut.
        Action logoutAction = new AbstractAction("logout") {

            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        };
        String key3 = "logout";
        this.logout.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK), key3);
        this.logout.getActionMap().put(key3, logoutAction);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        supplier_information = new javax.swing.JButton();
        supplier_details = new javax.swing.JButton();
        data_management = new javax.swing.JButton();
        bill = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        logo = new javax.swing.JLabel();
        normalpanel = new javax.swing.JPanel();
        timelab = new javax.swing.JLabel();
        datelab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trinaabh Billing Application");
        setMinimumSize(new java.awt.Dimension(1100, 650));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 714));

        home.setBackground(new java.awt.Color(0, 153, 153));
        home.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        home.setText("Home");
        home.setToolTipText("ctrl+H");
        home.setPreferredSize(new java.awt.Dimension(105, 40));
        home.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                homeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                homeFocusLost(evt);
            }
        });

        supplier_information.setBackground(new java.awt.Color(0, 153, 153));
        supplier_information.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        supplier_information.setText("Supplier Information");
        supplier_information.setToolTipText("ctrl+I");
        supplier_information.setPreferredSize(new java.awt.Dimension(103, 37));
        supplier_information.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                supplier_informationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                supplier_informationFocusLost(evt);
            }
        });
        supplier_information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplier_informationActionPerformed(evt);
            }
        });
        supplier_information.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                supplier_informationKeyPressed(evt);
            }
        });

        supplier_details.setBackground(new java.awt.Color(0, 153, 153));
        supplier_details.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        supplier_details.setText("Supplier Details");
        supplier_details.setToolTipText("ctrl+R");
        supplier_details.setPreferredSize(new java.awt.Dimension(103, 37));
        supplier_details.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                supplier_detailsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                supplier_detailsFocusLost(evt);
            }
        });
        supplier_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplier_detailsActionPerformed(evt);
            }
        });
        supplier_details.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                supplier_detailsKeyPressed(evt);
            }
        });

        data_management.setBackground(new java.awt.Color(0, 153, 153));
        data_management.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        data_management.setText("Data Management");
        data_management.setToolTipText("ctrl+D");
        data_management.setPreferredSize(new java.awt.Dimension(103, 37));
        data_management.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                data_managementFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                data_managementFocusLost(evt);
            }
        });
        data_management.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_managementActionPerformed(evt);
            }
        });
        data_management.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                data_managementKeyPressed(evt);
            }
        });

        bill.setBackground(new java.awt.Color(0, 153, 153));
        bill.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bill.setText("Bill");
        bill.setToolTipText("ctrl+B");
        bill.setBorder(null);
        bill.setPreferredSize(new java.awt.Dimension(103, 37));
        bill.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                billFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                billFocusLost(evt);
            }
        });
        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });
        bill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                billKeyPressed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(0, 153, 153));
        logout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logout.setText("Log Out ");
        logout.setToolTipText("ctrl+H");
        logout.setBorder(null);
        logout.setPreferredSize(new java.awt.Dimension(103, 37));
        logout.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                logoutFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                logoutFocusLost(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        logout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                logoutKeyPressed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 102, 204));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingsystem/t - Copy (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(supplier_information, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(supplier_details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(data_management, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplier_information, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplier_details, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(data_management, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bill, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        normalpanel.setBackground(new java.awt.Color(0, 204, 204));
        normalpanel.setMinimumSize(new java.awt.Dimension(1050, 695));
        normalpanel.setPreferredSize(new java.awt.Dimension(1050, 695));

        timelab.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N

        datelab.setFont(new java.awt.Font("Sylfaen", 1, 13)); // NOI18N

        javax.swing.GroupLayout normalpanelLayout = new javax.swing.GroupLayout(normalpanel);
        normalpanel.setLayout(normalpanelLayout);
        normalpanelLayout.setHorizontalGroup(
            normalpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(normalpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(normalpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timelab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datelab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(940, Short.MAX_VALUE))
        );
        normalpanelLayout.setVerticalGroup(
            normalpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(normalpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datelab, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timelab, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(normalpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(normalpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void data_managementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_managementActionPerformed

        new BillFrame().setVisible(false);
        //close();
        new DataManagementFrame().setVisible(true);

    }//GEN-LAST:event_data_managementActionPerformed

    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
        new DataManagementFrame().setVisible(false);
        new BillFrame().setVisible(true);
        //close();


    }//GEN-LAST:event_billActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

        System.exit(0);

    }//GEN-LAST:event_logoutActionPerformed

    private void homeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_homeFocusGained
        home.setBackground(Color.decode("0x00CCCC"));


    }//GEN-LAST:event_homeFocusGained

    private void homeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_homeFocusLost
        home.setBackground(Color.decode("0x009999"));
    }//GEN-LAST:event_homeFocusLost

    private void data_managementFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_data_managementFocusGained
        data_management.setBackground(Color.decode("0x00CCCC"));

    }//GEN-LAST:event_data_managementFocusGained

    private void data_managementFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_data_managementFocusLost
        data_management.setBackground(Color.decode("0x009999"));
    }//GEN-LAST:event_data_managementFocusLost

    private void billFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_billFocusLost
        bill.setBackground(Color.decode("0x009999"));
    }//GEN-LAST:event_billFocusLost

    private void billFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_billFocusGained
        bill.setBackground(Color.decode("0x00CCCC"));
    }//GEN-LAST:event_billFocusGained

    private void supplier_informationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supplier_informationFocusGained
        supplier_information.setBackground(Color.decode("0x00CCCC"));
    }//GEN-LAST:event_supplier_informationFocusGained

    private void supplier_informationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supplier_informationFocusLost
        supplier_information.setBackground(Color.decode("0x009999"));
    }//GEN-LAST:event_supplier_informationFocusLost

    private void supplier_detailsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supplier_detailsFocusGained
        supplier_details.setBackground(Color.decode("0x00CCCC"));
    }//GEN-LAST:event_supplier_detailsFocusGained

    private void supplier_detailsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supplier_detailsFocusLost
        supplier_details.setBackground(Color.decode("0x009999"));
    }//GEN-LAST:event_supplier_detailsFocusLost

    private void logoutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_logoutFocusGained
        logout.setBackground(Color.decode("0x00CCCC"));
    }//GEN-LAST:event_logoutFocusGained

    private void logoutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_logoutFocusLost
        logout.setBackground(Color.decode("0x009999"));
    }//GEN-LAST:event_logoutFocusLost

    private void data_managementKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_data_managementKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            new BillFrame().setVisible(false);
            new DataManagementFrame().setVisible(true);
        }
    }//GEN-LAST:event_data_managementKeyPressed

    private void billKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_billKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            new DataManagementFrame().setVisible(false);
            new BillFrame().setVisible(true);
        }
    }//GEN-LAST:event_billKeyPressed

    private void logoutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logoutKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.exit(0);
        }
    }//GEN-LAST:event_logoutKeyPressed

    private void supplier_informationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplier_informationActionPerformed
    //    JOptionPane.showMessageDialog(this, "Not Avialable .", "Error", JOptionPane.ERROR_MESSAGE);
        new SupplierInformation().setVisible(true);
        new BillFrame().setVisible(false);
        new DataManagementFrame().setVisible(false);
        new SupplierDetails().setVisible(false);
    }//GEN-LAST:event_supplier_informationActionPerformed

    private void supplier_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplier_detailsActionPerformed
    //    JOptionPane.showMessageDialog(this, "Not Avialable .", "Error", JOptionPane.ERROR_MESSAGE);
        new SupplierInformation().setVisible(false);
        new BillFrame().setVisible(false);
        new DataManagementFrame().setVisible(false);
        new SupplierDetails().setVisible(true);
    }//GEN-LAST:event_supplier_detailsActionPerformed

    private void supplier_informationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplier_informationKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        //    JOptionPane.showMessageDialog(this, "Not Avialable .", "Error", JOptionPane.ERROR_MESSAGE);
            new SupplierInformation().setVisible(true);
            new BillFrame().setVisible(false);
            new DataManagementFrame().setVisible(false);
            new SupplierDetails().setVisible(false);
        }
    }//GEN-LAST:event_supplier_informationKeyPressed

    private void supplier_detailsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplier_detailsKeyPressed
      //  JOptionPane.showMessageDialog(this, "Not Avialable.", "Error", JOptionPane.ERROR_MESSAGE);
        new SupplierInformation().setVisible(false);
        new BillFrame().setVisible(false);
        new DataManagementFrame().setVisible(false);
        new SupplierDetails().setVisible(true);
    }//GEN-LAST:event_supplier_detailsKeyPressed

    /*public static void main(String args[]) {
     /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
 /*   try {
     for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
     if ("Nimbus".equals(info.getName())) {
     javax.swing.UIManager.setLookAndFeel(info.getClassName());
     break;
     }
     }
     } catch (ClassNotFoundException ex) {
     java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (InstantiationException ex) {
     java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (IllegalAccessException ex) {
     java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
     java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     }
     //</editor-fold>

     /* Create and display the form */
 /* java.awt.EventQueue.invokeLater(new Runnable() {
     public void run() {
     // new Dashboard().setVisible(true);
     }
     });
     }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bill;
    private javax.swing.JButton data_management;
    private javax.swing.JLabel datelab;
    private javax.swing.JButton home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logout;
    private javax.swing.JPanel normalpanel;
    private javax.swing.JButton supplier_details;
    private javax.swing.JButton supplier_information;
    private javax.swing.JLabel timelab;
    // End of variables declaration//GEN-END:variables

    private void ShowTime() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                timelab.setText(s.format(d));
            }
        }
        ).start();

    }

    private void ShowDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        datelab.setText(s.format(d));
    }

    private void section() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Logo Trinaabh.png")));
    }

    private void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

    }
}
