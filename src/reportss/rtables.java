/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportss;


import config.dbconnect;
import static Employeeuser.editemployee.getHeightFromWidth;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author acer
 */
public class rtables extends javax.swing.JInternalFrame {

    /**
     * Creates new form pendinggs
     */
    public rtables() {
        initComponents();
        
          
       this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
       
   tables.getTableHeader().setOpaque(true); // Set to true to ensure the background color is visible
tables.getTableHeader().setBackground(new java.awt.Color(0, 128, 0)); // Set background to green
tables.getTableHeader().setForeground(Color.white); // Set text color to white

    }
        
        
        public void displaycandidates(){
       
        try{
            dbconnect dbc = new dbconnect();
            try (ResultSet rs = dbc.getData("SELECT * FROM candidates")) {
                tables.setModel(DbUtils.resultSetToTableModel(rs));
                tables.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }
        public void displaypartylist(){
       
        try{
            dbconnect dbc = new dbconnect();
            try (ResultSet rs = dbc.getData("SELECT * FROM partylist WHERE pid != 15;")) {
                tables.setModel(DbUtils.resultSetToTableModel(rs));
                tables.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                 tables.getTableHeader().repaint();
               TableColumnModel columnModel = tables.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(50);
                columnModel.getColumn(1).setPreferredWidth(101);
                columnModel.getColumn(2).setPreferredWidth(101);
                columnModel.getColumn(3).setPreferredWidth(101);
                columnModel.getColumn(4).setPreferredWidth(101);
                columnModel.getColumn(5).setPreferredWidth(101);
                columnModel.getColumn(6).setPreferredWidth(101);
                columnModel.getColumn(7).setPreferredWidth(101);
            }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }
        public void displayapplication(){
          try{
            dbconnect dbc = new dbconnect();
            
            try (ResultSet rs = dbc.getData(
                "SELECT applications.aid, candidates.lname, candidates.fname, " +
                "positions.position, partylist.pname,applications.status FROM applications " +
                "INNER JOIN candidates ON applications.cid = candidates.cid " +
                "INNER JOIN positions ON applications.ppid = positions.pid " +
                "INNER JOIN partylist ON applications.pid = partylist.pid " );) 
            {
                tables.setModel(DbUtils.resultSetToTableModel(rs));
                tables.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                TableColumnModel columnModel = tables.getColumnModel();
                
                columnModel.getColumn(0).setHeaderValue("ID");
                columnModel.getColumn(1).setHeaderValue("Lastname");
                columnModel.getColumn(2).setHeaderValue("Firstname");
                columnModel.getColumn(3).setHeaderValue("Position");
                columnModel.getColumn(4).setHeaderValue("pname");
                columnModel.getColumn(5).setHeaderValue("Status");
                tables.getTableHeader().repaint();
                columnModel.getColumn(0).setPreferredWidth(50);
                columnModel.getColumn(1).setPreferredWidth(142);
                columnModel.getColumn(2).setPreferredWidth(142);
                columnModel.getColumn(3).setPreferredWidth(142);
                columnModel.getColumn(4).setPreferredWidth(142);
                columnModel.getColumn(5).setPreferredWidth(142);
            }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

        

    }
        
        public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tables = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        tablechoice = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setBackground(new java.awt.Color(0, 153, 153));
        jLabel26.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("  TABLES");
        jLabel26.setOpaque(true);
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 780, 40));

        tables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tables);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 780, 350));

        jPanel4.setPreferredSize(new java.awt.Dimension(800, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 800, 35));

        tablechoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "deduction" }));
        tablechoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablechoiceActionPerformed(evt);
            }
        });
        getContentPane().add(tablechoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 170, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablechoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablechoiceActionPerformed
       if(tablechoice.getSelectedItem().toString().equals("Candidates")){
        displaycandidates();
        return;
        }if(tablechoice.getSelectedItem().toString().equals("Partylist")){
        displaypartylist();
        return;
        }if(tablechoice.getSelectedItem().toString().equals("Applications")){
        displayapplication();
        }
    }//GEN-LAST:event_tablechoiceActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       displaycandidates();
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> tablechoice;
    private javax.swing.JTable tables;
    // End of variables declaration//GEN-END:variables
}
