/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employeeuser;

import config.Session;
import config.dbconnect;
import static Employeeuser.editemployee.getHeightFromWidth;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author acer
 */
public class viewemployee extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewusers
     */
    public viewemployee() {
        initComponents();
        
        displayData();
        
       this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
       
      userstable.getTableHeader().setOpaque(true);
userstable.getTableHeader().setBackground(Color.white);
userstable.getTableHeader().setForeground(new java.awt.Color(0, 128, 0));

    }
public void displayData(){
        try{
            dbconnect dbc = new dbconnect();
            ResultSet rs = dbc.getData("SELECT uid, lname, utype FROM users");
            userstable.setModel(DbUtils.resultSetToTableModel(rs));
             userstable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
               TableColumnModel columnModel = userstable.getColumnModel();     
               
               columnModel.getColumn(0).setHeaderValue("ID");
               columnModel.getColumn(1).setHeaderValue("Lastname");
               columnModel.getColumn(2).setHeaderValue("Usertype");

        // Apply header changes
              userstable.getTableHeader().repaint();
                columnModel.getColumn(0).setPreferredWidth(50); 
                columnModel.getColumn(1).setPreferredWidth(155); 
                columnModel.getColumn(2).setPreferredWidth(155); 
             rs.close();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        userstable = new javax.swing.JTable();
        infopanel = new javax.swing.JPanel();
        fname = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        accountid = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sexx = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        usertype = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        birthdate = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        viewdetails = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        userstable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(userstable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 370, 380));

        infopanel.setBackground(new java.awt.Color(0, 255, 204));
        infopanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        infopanel.setForeground(new java.awt.Color(51, 255, 204));
        infopanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname.setBackground(new java.awt.Color(0, 153, 153));
        fname.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));
        fname.setText("Fname");
        fname.setOpaque(true);
        infopanel.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 200, 20));

        username.setBackground(new java.awt.Color(0, 153, 153));
        username.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("username");
        username.setOpaque(true);
        infopanel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 200, 20));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username:");
        infopanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 100, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Account ID:");
        infopanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, 20));

        email.setBackground(new java.awt.Color(0, 153, 153));
        email.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Email");
        email.setOpaque(true);
        infopanel.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 360, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Firstname:");
        infopanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 70, 20));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Lastname:");
        infopanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 70, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Email:");
        infopanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 70, 20));

        accountid.setBackground(new java.awt.Color(0, 204, 204));
        accountid.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        accountid.setForeground(new java.awt.Color(255, 255, 255));
        accountid.setText("Account ID:");
        accountid.setOpaque(true);
        infopanel.add(accountid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, 20));

        lname.setBackground(new java.awt.Color(0, 153, 153));
        lname.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setText("Lname");
        lname.setOpaque(true);
        infopanel.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 200, 20));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Sex:");
        infopanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 50, 20));

        sexx.setBackground(new java.awt.Color(0, 153, 153));
        sexx.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        sexx.setForeground(new java.awt.Color(255, 255, 255));
        sexx.setText("Sex");
        sexx.setOpaque(true);
        infopanel.add(sexx, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 90, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("User type:");
        infopanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 70, 20));

        usertype.setBackground(new java.awt.Color(0, 153, 153));
        usertype.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        usertype.setForeground(new java.awt.Color(255, 255, 255));
        usertype.setText("User type");
        usertype.setOpaque(true);
        infopanel.add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 140, 20));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11.setText("birthdate:");
        infopanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 70, 20));

        birthdate.setBackground(new java.awt.Color(0, 153, 153));
        birthdate.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        birthdate.setForeground(new java.awt.Color(255, 255, 255));
        birthdate.setText("birthdate");
        birthdate.setOpaque(true);
        infopanel.add(birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 140, 20));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 51));
        jLabel13.setText("status:");
        infopanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 40, 20));

        status.setBackground(new java.awt.Color(0, 153, 153));
        status.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("status");
        status.setOpaque(true);
        infopanel.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 90, 20));

        jLabel26.setBackground(new java.awt.Color(0, 153, 153));
        jLabel26.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText(" USER INFO");
        jLabel26.setOpaque(true);
        infopanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        jPanel4.setLayout(null);

        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.add(image);
        image.setBounds(0, 0, 140, 130);

        infopanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 140, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/photo-1574610758891-5b809b6e6e2e (1).jpg"))); // NOI18N
        infopanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 410, 440));

        getContentPane().add(infopanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 420));

        viewdetails.setBackground(new java.awt.Color(0, 153, 153));
        viewdetails.setForeground(new java.awt.Color(255, 255, 255));
        viewdetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewdetails.setText("view details");
        viewdetails.setOpaque(true);
        viewdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewdetailsMouseClicked(evt);
            }
        });
        getContentPane().add(viewdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 90, 20));

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 800, 35));

        jLabel12.setBackground(new java.awt.Color(0, 153, 153));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Clear");
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 90, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewdetailsMouseClicked
        Session sess = Session.getInstance();
        int rowIndex = userstable.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select an item!");
        }else {
            try {
                dbconnect dbc = new dbconnect();
                TableModel tbl = userstable.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM users WHERE uid = '" + tbl.getValueAt(rowIndex, 0) + "'");

                if (rs.next()) {
                    accountid.setText(" "+rs.getInt("uid"));
                    fname.setText(" "+rs.getString("fname"));
                    lname.setText(" "+rs.getString("lname"));
                    email.setText(" "+rs.getString("useremail"));
                    sexx.setText(" "+rs.getString("sex"));
                    usertype.setText(" "+rs.getString("utype"));
                    status.setText(" "+rs.getString("stats"));
                    username.setText(" "+rs.getString("ussername"));
                    birthdate.setText(" "+rs.getString("birthdate"));
                     image.setIcon(ResizeImage(rs.getString("Uimage"),null,image));
                }

            } catch (SQLException ex) {
                System.out.println("" + ex);
            }
        }
    }//GEN-LAST:event_viewdetailsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountid;
    private javax.swing.JLabel birthdate;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel image;
    private javax.swing.JPanel infopanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel sexx;
    private javax.swing.JLabel status;
    private javax.swing.JLabel username;
    private javax.swing.JTable userstable;
    private javax.swing.JLabel usertype;
    private javax.swing.JLabel viewdetails;
    // End of variables declaration//GEN-END:variables
}
