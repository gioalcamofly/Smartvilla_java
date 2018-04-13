/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Mi5
 */
public class GifPanel extends javax.swing.JPanel {
    
    public JLabel getLblGif(){
        return gifLabel;
    }
    
    /**
     * Creates new form GifPanel
     */
    public GifPanel() {
        initComponents();
    }
    
    public void changeImage(String path){
        if(path.equals("restore")){
            gifLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/GIF_Loading_Test14.gif")));
        }else{
            gifLabel.setIcon(new ImageIcon(path));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GifPanel = new javax.swing.JPanel();
        gifLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(490, 450));

        GifPanel.setBackground(new java.awt.Color(239, 246, 238));
        GifPanel.setForeground(new java.awt.Color(239, 246, 238));

        gifLabel.setBackground(new java.awt.Color(51, 51, 51));
        gifLabel.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        gifLabel.setForeground(new java.awt.Color(51, 51, 51));
        gifLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/GIF_Loading_Test14.gif"))); // NOI18N

        javax.swing.GroupLayout GifPanelLayout = new javax.swing.GroupLayout(GifPanel);
        GifPanel.setLayout(GifPanelLayout);
        GifPanelLayout.setHorizontalGroup(
            GifPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GifPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gifLabel)
                .addGap(104, 104, 104))
        );
        GifPanelLayout.setVerticalGroup(
            GifPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GifPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gifLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GifPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GifPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GifPanel;
    private javax.swing.JLabel gifLabel;
    // End of variables declaration//GEN-END:variables
}
