package VBUtils;

import java.awt.Color;
import javax.swing.JFrame;

/**
 * Make color chooser
 * @author vinicius.reif
 */
public class VBColorChooser extends javax.swing.JDialog
{
    private Color color = null;
    
    /**
     * Open ColorChooser
     */
    public VBColorChooser()
    {
        super(new JFrame(), true);
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        tabColor = new javax.swing.JColorChooser();
        btOk = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Color");
        setResizable(false);

        btOk.setText("OK");
        btOk.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btOkActionPerformed(evt);
            }
        });

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(btCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btOk))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabColor, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabColor, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOk)
                    .addComponent(btCancel))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Set chose Color
     * @param evt 
     */
    private void btOkActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btOkActionPerformed
    {//GEN-HEADEREND:event_btOkActionPerformed
        this.color = this.tabColor.getColor();
        this.dispose();
    }//GEN-LAST:event_btOkActionPerformed

    /**
     * If cancel the color will be null
     * @param evt 
     */
    private void btCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btCancelActionPerformed
    {//GEN-HEADEREND:event_btCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btCancelActionPerformed

    /**
     * Get selected color
     * @return 
     */
    public Color getColor()
    {
        return color;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btOk;
    private javax.swing.JColorChooser tabColor;
    // End of variables declaration//GEN-END:variables
}
