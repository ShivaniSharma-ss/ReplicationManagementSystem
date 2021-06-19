/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewRMS;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Hp
 */
public class ReplicaRecord extends javax.swing.JFrame {

    /**
     * Creates new form ReplicaRecord
     */
    public ReplicaRecord() {
        initComponents();
        this.setLocationRelativeTo(null);
        Toolkit tk = getToolkit();
         Dimension size= tk.getScreenSize();
         //setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
         //setSize(800,800);
         scaleImage();
         JTableHeader header= jTable1.getTableHeader();
       header.setBackground(Color.black);
        header.setForeground(Color.blue);
        Font font=new Font("Tahoma",Font.BOLD,16);
        header.setFont(font);
    
     }
     public void scaleImage(){
    ImageIcon icon = new ImageIcon("C:\\Users\\Hp\\Downloads\\replica1.jpg");
    Image img= icon.getImage();
    Image imgScale =img.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(), Image.SCALE_SMOOTH);
   
    ImageIcon scaledIcon = new ImageIcon(imgScale);
    jLabel1.setIcon(scaledIcon);
            }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        replicaRecord = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Lucida Calligraphy", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 118, 48));

        logout.setBackground(new java.awt.Color(255, 204, 204));
        logout.setFont(new java.awt.Font("Lucida Calligraphy", 3, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(51, 51, 255));
        logout.setText("Logout");
        logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 114, 48));

        replicaRecord.setBackground(new java.awt.Color(255, 204, 204));
        replicaRecord.setFont(new java.awt.Font("Lucida Calligraphy", 3, 18)); // NOI18N
        replicaRecord.setForeground(new java.awt.Color(51, 102, 255));
        replicaRecord.setText("Show Replica Record");
        replicaRecord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        replicaRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replicaRecordActionPerformed(evt);
            }
        });
        jPanel1.add(replicaRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 260, 50));

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 102, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FileId", "FileName", "ReplicaServerIP", "date", "time", "File Size"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(204, 255, 204));
        jTable1.setRowHeight(20);
        jTable1.setSelectionBackground(new java.awt.Color(51, 255, 204));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(145);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(120);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 900, 380));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-139, 0, 1220, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void replicaRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replicaRecordActionPerformed
      try
      {
              Class.forName("com.mysql.jdbc.Driver");
              java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/rms","root","");
              String sql="select * from replica_record";
              Statement statement=conn.createStatement();
              ResultSet rs=statement.executeQuery(sql);
              while(rs.next())
               {
                 String fileId=String.valueOf(rs.getInt("replica_id"));
                 String fileName=rs.getString("fileName");
                 String serverIP=rs.getString("ReplicaServerIP");
                 String date=rs.getString("date");
                 String time=rs.getString("time");
                  String fileSize=rs.getString("fileSize");
                 String replica_data[]={fileId,fileName,serverIP,date,time,fileSize};
                
                 DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
                 
                 tblModel.addRow(replica_data);
               }
             
               }
               catch(Exception e)
           
               {
               e.printStackTrace();
               }

    }//GEN-LAST:event_replicaRecordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ReplicaCreator r=new ReplicaCreator();
        r.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
      int a=JOptionPane.showConfirmDialog(logout,"Are You sure");
     if(a==JOptionPane.YES_OPTION)
      {
         dispose();
         loginForm l=new loginForm();
        l.setVisible(true);
      }
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(ReplicaRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReplicaRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReplicaRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReplicaRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReplicaRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JButton logout;
    private javax.swing.JButton replicaRecord;
    // End of variables declaration//GEN-END:variables
}
