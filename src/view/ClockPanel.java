/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Mi5
 */
public class ClockPanel extends javax.swing.JPanel {
    
// <editor-fold defaultstate="collapsed" desc="Generated Code"> 
    public JLabel getLblClock(){
        return clockLabel;
    }
    
    public JLabel getLblDate(){
        return dateLabel;
    }
    // </editor-fold>  
    /**
     * Creates new form ClockPanel
     */
    public ClockPanel() {
        initComponents();
        updateClock();
        Timer timer;
        timer = new Timer(500, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                updateClock();
            }
        });
        timer.start();
    }
    
    private void updateClock(){
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        //DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ENGLISH);
        String text = date.format(formatter);
        String text1 = date.format(formatter1);
        clockLabel.setText(text);
        dateLabel.setText(text1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        clockLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(239, 246, 238));
        setLayout(new java.awt.GridBagLayout());

        clockLabel.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        clockLabel.setText("Clock");
        add(clockLabel, new java.awt.GridBagConstraints());

        dateLabel.setFont(new java.awt.Font("Montserrat", 0, 15)); // NOI18N
        dateLabel.setText("date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        add(dateLabel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clockLabel;
    private javax.swing.JLabel dateLabel;
    // End of variables declaration//GEN-END:variables
}
