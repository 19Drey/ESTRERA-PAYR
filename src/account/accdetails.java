/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

import static Employeeuser.editemployee.getHeightFromWidth;
import config.Session;
import ESTRERA.loginform;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author acer
 */
public class accdetails extends javax.swing.JInternalFrame {

    /**
     * Creates new form accdetails
     */
    public accdetails() {
        initComponents();
        this.setBorder(javax.swing. BorderFactory.createEmptyBorder(0,0,0,0)); 
       BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
       bi.setNorthPane (null);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        accountid = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        sexx = new javax.swing.JLabel();
        usertype = new javax.swing.JLabel();
        birthdate = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();
        accountid1 = new javax.swing.JLabel();
        username1 = new javax.swing.JLabel();
        fname1 = new javax.swing.JLabel();
        lname1 = new javax.swing.JLabel();
        email1 = new javax.swing.JLabel();
        sexx1 = new javax.swing.JLabel();
        usertype1 = new javax.swing.JLabel();
        birthdate1 = new javax.swing.JLabel();
        status1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(800, 500));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        image.setBackground(new java.awt.Color(0, 204, 0));
        jPanel1.add(image);
        image.setBounds(0, 0, 110, 110);

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 110, 110));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 200, 150));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("  Account information:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 430, 50));

        accountid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        accountid.setText("Account ID:");
        getContentPane().add(accountid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 240, 30));

        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.setText("username");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 240, 30));

        fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fname.setText("Fname");
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 240, 30));

        lname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lname.setText("Lname");
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 240, 30));

        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email.setText("Email");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 240, 30));

        sexx.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sexx.setText("Sex");
        getContentPane().add(sexx, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 130, 30));

        usertype.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usertype.setText("User type");
        getContentPane().add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 130, 30));

        birthdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        birthdate.setText("birthdate");
        getContentPane().add(birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 130, 30));

        status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        status.setText("status");
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 130, 30));

        fullname.setBackground(new java.awt.Color(255, 255, 255));
        fullname.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        fullname.setText(" Firstname, Lastname ");
        getContentPane().add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 360, 90));

        accountid1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        accountid1.setText("Account ID:");
        getContentPane().add(accountid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, 30));

        username1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username1.setText("username");
        getContentPane().add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 240, 30));

        fname1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fname1.setText("Fname");
        getContentPane().add(fname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 240, 30));

        lname1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lname1.setText("Lname");
        getContentPane().add(lname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 240, 30));

        email1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email1.setText("Email");
        getContentPane().add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 240, 30));

        sexx1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sexx1.setText("Sex");
        getContentPane().add(sexx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 130, 30));

        usertype1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usertype1.setText("User type");
        getContentPane().add(usertype1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 130, 30));

        birthdate1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        birthdate1.setText("birthdate");
        getContentPane().add(birthdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 130, 30));

        status1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        status1.setText("status");
        getContentPane().add(status1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        Session sess = Session.getInstance();
        if(sess.getId() == 0){
        JOptionPane.showMessageDialog(null,"No account found, login first!");
        loginform lfm = new loginform();
        lfm.setVisible(true);
        this.dispose();
        }else{
        
        fullname.setText("  "+sess.getLname()+",  "+sess.getFname());
        accountid.setText(""+sess.getId());
        fname.setText(""+sess.getFname());
        lname.setText(""+sess.getLname());
        email.setText(""+sess.getEmail());
        birthdate.setText(""+sess.getBirthdate());
        sexx.setText(""+sess.getSex());
        usertype.setText(""+sess.getType());
        status.setText(""+sess.getStatus());
        username.setText(""+sess.getUsername());
        image.setIcon(ResizeImage(""+sess.getUimage(),null,image));
        }    }//GEN-LAST:event_formInternalFrameActivated

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountid;
    private javax.swing.JLabel accountid1;
    private javax.swing.JLabel birthdate;
    private javax.swing.JLabel birthdate1;
    private javax.swing.JLabel email;
    private javax.swing.JLabel email1;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel fname1;
    private javax.swing.JLabel fullname;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel lname1;
    private javax.swing.JLabel sexx;
    private javax.swing.JLabel sexx1;
    private javax.swing.JLabel status;
    private javax.swing.JLabel status1;
    private javax.swing.JLabel username;
    private javax.swing.JLabel username1;
    private javax.swing.JLabel usertype;
    private javax.swing.JLabel usertype1;
    // End of variables declaration//GEN-END:variables
}
