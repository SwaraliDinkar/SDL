/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pict.view;

import library.server.User;

/**
 *
 * @author DELL_3542
 */
public class StudOptions extends javax.swing.JFrame {

    /**
     * Creates new form StudOptions
     */
    User lu; 
    public StudOptions(User lu) {
        initComponents();
        this.lu=lu;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewAllBooks = new javax.swing.JButton();
        viewAllAvailableBooks = new javax.swing.JButton();
        viewIssuedBooks = new javax.swing.JButton();
        checkAvailability = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        viewAllBooks.setText("VIEW ALL BOOKS");
        viewAllBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllBooksActionPerformed(evt);
            }
        });

        viewAllAvailableBooks.setText("VIEW ALL AVAILABLE BOOKS");
        viewAllAvailableBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllAvailableBooksActionPerformed(evt);
            }
        });

        viewIssuedBooks.setText("VIEW ISSUED BOOKS");
        viewIssuedBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewIssuedBooksActionPerformed(evt);
            }
        });

        checkAvailability.setText("CHECK AVAILABILITY");
        checkAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAvailabilityActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose any option");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WELCOME TO LIBRARY MANAGEMENT SYSTEM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewIssuedBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewAllBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewAllAvailableBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(viewAllAvailableBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewAllBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewIssuedBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewAllBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllBooksActionPerformed
        // TODO add your handling code here:
        ViewBooks v=new ViewBooks(lu);
        v.setVisible(true);
    }//GEN-LAST:event_viewAllBooksActionPerformed

    private void viewIssuedBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewIssuedBooksActionPerformed
        // TODO add your handling code here:
        ViewIssuedBooks b=new ViewIssuedBooks(lu);
        b.setVisible(true);
    }//GEN-LAST:event_viewIssuedBooksActionPerformed

    private void checkAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAvailabilityActionPerformed
        // TODO add your handling code here:
        CheckBookAvailable c=new CheckBookAvailable(lu);
        c.setVisible(true);
        
    }//GEN-LAST:event_checkAvailabilityActionPerformed

    private void viewAllAvailableBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllAvailableBooksActionPerformed
        // TODO add your handling code here:
        ViewAvailableBooks v=new ViewAvailableBooks(lu);
        v.setVisible(true);
    }//GEN-LAST:event_viewAllAvailableBooksActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkAvailability;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton viewAllAvailableBooks;
    private javax.swing.JButton viewAllBooks;
    private javax.swing.JButton viewIssuedBooks;
    // End of variables declaration//GEN-END:variables
}
