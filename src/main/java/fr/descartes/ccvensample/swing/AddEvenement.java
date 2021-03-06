/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.descartes.ccvensample.swing;

import static fr.descartes.cvvensample.Application.getSessionFactory;
import fr.descartes.cvvensample.dao.Evenement;
import fr.descartes.cvvensample.dao.Type_Evenement;
import fr.descartes.cvvensample.services.EvenementService;
import org.hibernate.SessionFactory;

/**
 *
 * @author buyuk
 */
public class AddEvenement extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddEvenement
     */
    SessionFactory sessionFactory;
    public AddEvenement() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button2 = new java.awt.Button();
        TexteFieldIntitule = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TexteFieldTheme = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TexteFielDuree = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TexteFieldDescription = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TexteFieldOrganisateur = new javax.swing.JTextField();
        TexteFieldDateDebut1 = new javax.swing.JTextField();
        Listederoulant = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Add Evenement");

        button2.setActionCommand("AddEventSend");
        button2.setLabel("Send");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        TexteFieldIntitule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexteFieldIntituleActionPerformed(evt);
            }
        });

        jLabel1.setText("intitule:");

        jLabel2.setText("Theme:");

        TexteFieldTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexteFieldThemeActionPerformed(evt);
            }
        });

        jLabel3.setText("Date Début:");

        TexteFielDuree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexteFielDureeActionPerformed(evt);
            }
        });

        jLabel4.setText("Duree:");

        jLabel5.setText("Decription:");

        TexteFieldDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexteFieldDescriptionActionPerformed(evt);
            }
        });

        jLabel6.setText("Organisateur:");

        TexteFieldDateDebut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexteFieldDateDebut1ActionPerformed(evt);
            }
        });

        Listederoulant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colloque", "congrès", "séminaire" }));

        jLabel7.setText("Type d'evenement");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(TexteFieldIntitule)
                                .addComponent(jLabel1)
                                .addComponent(TexteFieldTheme, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                            .addComponent(TexteFieldOrganisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Listederoulant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TexteFielDuree, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(TexteFieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(TexteFieldDateDebut1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(TexteFieldIntitule, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TexteFieldTheme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(TexteFieldOrganisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(Listederoulant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TexteFieldDateDebut1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TexteFielDuree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20)
                        .addComponent(TexteFieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        sessionFactory=getSessionFactory();
        Evenement Evenement1 = new Evenement(TexteFieldIntitule,TexteFieldTheme,TexteFielDuree,TexteFielDuree,TexteFieldDescription,TexteFieldOrganisateur);
        EvenementService serv1 = new EvenementService(sessionFactory);
                
        serv1.insertEvenement(Evenement1);
        
    }//GEN-LAST:event_button2ActionPerformed

    private void TexteFielDureeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexteFielDureeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexteFielDureeActionPerformed

    private void TexteFieldIntituleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexteFieldIntituleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexteFieldIntituleActionPerformed

    private void TexteFieldThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexteFieldThemeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexteFieldThemeActionPerformed

    private void TexteFieldDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexteFieldDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexteFieldDescriptionActionPerformed

    private void TexteFieldDateDebut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexteFieldDateDebut1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexteFieldDateDebut1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Listederoulant;
    private javax.swing.JTextField TexteFielDuree;
    private javax.swing.JTextField TexteFieldDateDebut1;
    private javax.swing.JTextField TexteFieldDescription;
    private javax.swing.JTextField TexteFieldIntitule;
    private javax.swing.JTextField TexteFieldOrganisateur;
    private javax.swing.JTextField TexteFieldTheme;
    private java.awt.Button button2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
