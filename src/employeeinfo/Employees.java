/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeinfo;

import ADMINDASH.editoption;
import ADMINDASH.maindash;
import ESTRERA.loginform;
import Employeeuser.manageuser;
import config.Session;
import config.dbconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import transactions.ViewPayroll;
import transactions.generatepayroll;


public class Employees extends javax.swing.JFrame {

   
    public Employees() {
        setUndecorated(true);
        initComponents();
         loadUserIDs();
    }
public boolean addEmployee(Connection conn, int uid, String position, String department, String hireDate, double salary) {
    String sql = "INSERT INTO employees (uid, position, department, hire_date, salary) VALUES (?, ?, ?, ?, ?)";

    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setInt(1, uid);
        pstmt.setString(2, position);
        pstmt.setString(3, department);
        pstmt.setDate(4, java.sql.Date.valueOf(hireDate)); // Make sure this is YYYY-MM-DD
        pstmt.setDouble(5, salary);
        return pstmt.executeUpdate() > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
public void loadUserIDs() {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_management", "root", "");
        String sql = "SELECT uid FROM users WHERE uid NOT IN (SELECT uid FROM employees)"; // only users not yet employees
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        comboUID.removeAllItems(); // clear if repopulating
        while (rs.next()) {
            comboUID.addItem(String.valueOf(rs.getInt("uid")));

        }

        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading user IDs: " + e.getMessage());
    }
}

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        mname = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        savebttn = new javax.swing.JLabel();
        clearr = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cid = new javax.swing.JLabel();
        select = new javax.swing.JLabel();
        partylist = new javax.swing.JComboBox<>();
        positionn = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        candidatestable = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        candidatestable1 = new javax.swing.JTable();
        main = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        users = new javax.swing.JLabel();
        myaccount = new javax.swing.JLabel();
        reportss = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        accname = new javax.swing.JLabel();
        editaccc = new javax.swing.JLabel();
        applcation = new javax.swing.JLabel();
        Empreg = new javax.swing.JLabel();
        Empreg1 = new javax.swing.JLabel();
        Empreg2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtSalary = new javax.swing.JTextField();
        txtPosition = new javax.swing.JTextField();
        txtDepartment = new javax.swing.JTextField();
        txtHireDate = new javax.swing.JTextField();
        addemployee = new javax.swing.JButton();
        comboUID = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrame1.setBorder(null);
        jInternalFrame1.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrame1formInternalFrameActivated(evt);
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
            }
        });
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("Firstname:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, 20));

        mname.setForeground(new java.awt.Color(204, 0, 0));
        mname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel2.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 240, 20));

        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("partylist");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 80, 20));

        jPanel4.setLayout(null);

        image.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        image.setForeground(new java.awt.Color(153, 153, 153));
        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imageMouseEntered(evt);
            }
        });
        jPanel4.add(image);
        image.setBounds(0, 0, 100, 100);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 100));

        jLabel26.setBackground(new java.awt.Color(255, 153, 102));
        jLabel26.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("  ADD APPLICATION");
        jLabel26.setOpaque(true);
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 40));

        savebttn.setBackground(new java.awt.Color(204, 0, 0));
        savebttn.setForeground(new java.awt.Color(255, 255, 255));
        savebttn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savebttn.setText("save");
        savebttn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        savebttn.setOpaque(true);
        savebttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savebttnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                savebttnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                savebttnMouseExited(evt);
            }
        });
        jPanel2.add(savebttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 90, 20));

        clearr.setBackground(new java.awt.Color(204, 0, 0));
        clearr.setForeground(new java.awt.Color(255, 255, 255));
        clearr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clearr.setText("Clear all");
        clearr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        clearr.setOpaque(true);
        clearr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearrMouseClicked(evt);
            }
        });
        jPanel2.add(clearr, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 90, 20));

        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        jLabel16.setText("Lastname:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, 20));

        lname.setForeground(new java.awt.Color(204, 0, 0));
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 240, 20));

        fname.setForeground(new java.awt.Color(204, 0, 0));
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 240, 20));

        jLabel17.setForeground(new java.awt.Color(204, 0, 0));
        jLabel17.setText("ID:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 70, 20));

        cid.setForeground(new java.awt.Color(204, 0, 0));
        cid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel2.add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 210, 20));

        select.setBackground(new java.awt.Color(204, 0, 0));
        select.setForeground(new java.awt.Color(255, 255, 255));
        select.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        select.setText("Select");
        select.setOpaque(true);
        select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectMouseClicked(evt);
            }
        });
        jPanel2.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 90, 20));

        jPanel2.add(partylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 240, 20));

        jPanel2.add(positionn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 240, 20));

        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("Position:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 80, 20));

        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("Middlename:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 80, 20));

        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("age");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 80, 20));

        age.setForeground(new java.awt.Color(204, 0, 0));
        age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jPanel2.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 240, 20));

        jInternalFrame1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 430));

        candidatestable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        candidatestable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(candidatestable);

        jInternalFrame1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 380, 390));

        jLabel27.setBackground(new java.awt.Color(255, 153, 102));
        jLabel27.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText(" SELECT CANDIDATE");
        jLabel27.setOpaque(true);
        jInternalFrame1.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 380, 40));

        jPanel6.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jInternalFrame1.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -30, 110, 35));

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

        jInternalFrame1.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 800, 35));

        candidatestable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        candidatestable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(candidatestable1);

        jInternalFrame1.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 380, 390));

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 270, 0, 0));

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(153, 255, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        main.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 30, 25));

        minimize.setBackground(new java.awt.Color(153, 255, 204));
        minimize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 255, 255));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.setOpaque(true);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        main.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 30, 25));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("     ADMINISTRATORS DASHBOARD");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jLabel1.setOpaque(true);
        main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 810, 70));

        sidebar.setBackground(new java.awt.Color(255, 255, 255));
        sidebar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        sidebar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 41, -1, -1));

        users.setBackground(new java.awt.Color(221, 21, 21));
        users.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        users.setForeground(new java.awt.Color(0, 153, 153));
        users.setText("  Users");
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersMouseExited(evt);
            }
        });
        sidebar.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 160, 40));

        myaccount.setBackground(new java.awt.Color(255, 255, 255));
        myaccount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        myaccount.setForeground(new java.awt.Color(0, 153, 153));
        myaccount.setText("  My account");
        myaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myaccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myaccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myaccountMouseExited(evt);
            }
        });
        sidebar.add(myaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, 40));

        reportss.setBackground(new java.awt.Color(204, 0, 0));
        reportss.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reportss.setForeground(new java.awt.Color(0, 153, 153));
        reportss.setText("  Reports");
        reportss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportssMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportssMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportssMouseExited(evt);
            }
        });
        sidebar.add(reportss, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, 40));

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(0, 153, 153));
        logout.setText("  Log out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        sidebar.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 160, 40));

        accname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Staff.png"))); // NOI18N
        sidebar.add(accname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, -1));

        editaccc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        editaccc.setForeground(new java.awt.Color(0, 153, 153));
        editaccc.setText("  Settings");
        editaccc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editacccMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editacccMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editacccMouseExited(evt);
            }
        });
        sidebar.add(editaccc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 160, 40));

        applcation.setBackground(new java.awt.Color(204, 0, 0));
        applcation.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        applcation.setForeground(new java.awt.Color(0, 153, 153));
        applcation.setText("My account");
        applcation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applcationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                applcationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                applcationMouseExited(evt);
            }
        });
        sidebar.add(applcation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, 40));

        Empreg.setBackground(new java.awt.Color(204, 0, 0));
        Empreg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Empreg.setForeground(new java.awt.Color(0, 153, 153));
        Empreg.setText("View payroll");
        Empreg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpregMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EmpregMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EmpregMouseExited(evt);
            }
        });
        sidebar.add(Empreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 160, 40));

        Empreg1.setBackground(new java.awt.Color(0, 153, 153));
        Empreg1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Empreg1.setText("Employess");
        Empreg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Empreg1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Empreg1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Empreg1MouseExited(evt);
            }
        });
        sidebar.add(Empreg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 160, 40));

        Empreg2.setBackground(new java.awt.Color(204, 0, 0));
        Empreg2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Empreg2.setForeground(new java.awt.Color(0, 153, 153));
        Empreg2.setText("generate payroll");
        Empreg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Empreg2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Empreg2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Empreg2MouseExited(evt);
            }
        });
        sidebar.add(Empreg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 160, 40));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        sidebar.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 170, 40));

        main.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 170, 610));

        jPanel3.setBackground(new java.awt.Color(248, 248, 248));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 370, 30));
        jPanel3.add(txtPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 370, 30));

        txtDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartmentActionPerformed(evt);
            }
        });
        jPanel3.add(txtDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 370, 30));
        jPanel3.add(txtHireDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 370, 30));

        addemployee.setText("Add");
        addemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addemployeeActionPerformed(evt);
            }
        });
        jPanel3.add(addemployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 190, 50));

        jPanel3.add(comboUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 100, 30));

        jLabel2.setText("Select user ID:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel4.setText("Position:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel6.setText("Department:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel7.setText("HireDate:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabel8.setText("Salary:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        main.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 780, 420));

        jLabel14.setText("View Employess");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        main.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 100, -1));

        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMouseClicked

    }//GEN-LAST:event_imageMouseClicked

    private void imageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMouseEntered

    }//GEN-LAST:event_imageMouseEntered

    private void savebttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebttnMouseClicked


    }//GEN-LAST:event_savebttnMouseClicked

    private void savebttnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebttnMouseEntered
        savebttn.setBackground(Color.white);
        savebttn.setForeground(new java.awt.Color(204,0,0));
    }//GEN-LAST:event_savebttnMouseEntered

    private void savebttnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebttnMouseExited

        savebttn.setBackground(new java.awt.Color(204,0,0));
        savebttn.setForeground(Color.white);
    }//GEN-LAST:event_savebttnMouseExited

    private void clearrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearrMouseClicked
        lname.setText("");
        lname.setText("");
        fname.setText("");
        cid.setText("");
        age.setText("");
        image.setIcon(null);
    }//GEN-LAST:event_clearrMouseClicked

    private void selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseClicked
   
    }//GEN-LAST:event_selectMouseClicked

    private void jInternalFrame1formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrame1formInternalFrameActivated
     
    }//GEN-LAST:event_jInternalFrame1formInternalFrameActivated

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Session sess = Session.getInstance();
        dbconnect dbc = new dbconnect();
        String action = "User with ID "+sess.getId()+" logged out";
        dbc.insertData("INSERT INTO logged(userid, action, date) VALUES ('" + +sess.getId() + "', '" + action + "', '" + LocalDateTime.now() + "')");

        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered

    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited

    }//GEN-LAST:event_jLabel5MouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered

    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited

    }//GEN-LAST:event_minimizeMouseExited

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
     maindash mm = new maindash();
     mm.setVisible(true);
     this.dispose();
        
    }//GEN-LAST:event_usersMouseClicked

    private void usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseEntered

    }//GEN-LAST:event_usersMouseEntered

    private void usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseExited

    }//GEN-LAST:event_usersMouseExited

    private void myaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myaccountMouseClicked


    }//GEN-LAST:event_myaccountMouseClicked

    private void myaccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myaccountMouseEntered

    }//GEN-LAST:event_myaccountMouseEntered

    private void myaccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myaccountMouseExited

    }//GEN-LAST:event_myaccountMouseExited

    private void reportssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportssMouseClicked

    }//GEN-LAST:event_reportssMouseClicked

    private void reportssMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportssMouseEntered

    }//GEN-LAST:event_reportssMouseEntered

    private void reportssMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportssMouseExited

    }//GEN-LAST:event_reportssMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        dbconnect dbc = new dbconnect();
        Session sess= Session.getInstance();

        String action = "User with ID "+sess.getId()+" logged out";
        dbc.insertData("INSERT INTO logged(userid, action, date) VALUES ('" +sess.getId() + "', '" + action + "', '" + LocalDateTime.now() + "')");

        loginform lfm = new loginform();
        lfm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered

    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited

    }//GEN-LAST:event_logoutMouseExited

    private void editacccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editacccMouseClicked
        editoption eo = new editoption();
        eo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editacccMouseClicked

    private void editacccMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editacccMouseEntered

    }//GEN-LAST:event_editacccMouseEntered

    private void editacccMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editacccMouseExited

    }//GEN-LAST:event_editacccMouseExited

    private void applcationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applcationMouseClicked

    }//GEN-LAST:event_applcationMouseClicked

    private void applcationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applcationMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_applcationMouseEntered

    private void applcationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applcationMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_applcationMouseExited

    private void EmpregMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpregMouseClicked
 ViewPayroll vv = new ViewPayroll();
 vv.setVisible(true);
this.dispose();
    }//GEN-LAST:event_EmpregMouseClicked

    private void EmpregMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpregMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpregMouseEntered

    private void EmpregMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpregMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpregMouseExited

    private void Empreg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Empreg1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Empreg1MouseClicked

    private void Empreg1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Empreg1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Empreg1MouseEntered

    private void Empreg1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Empreg1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Empreg1MouseExited

    private void Empreg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Empreg2MouseClicked
      generatepayroll gg = new generatepayroll();
      gg.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_Empreg2MouseClicked

    private void Empreg2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Empreg2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Empreg2MouseEntered

    private void Empreg2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Empreg2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Empreg2MouseExited

    private void txtDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartmentActionPerformed

    private void addemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addemployeeActionPerformed
      try {
        int selectedUID = Integer.parseInt((String) comboUID.getSelectedItem()); // ✅ fixed
        String position = txtPosition.getText().trim();
        String department = txtDepartment.getText().trim();
        String hireDate = txtHireDate.getText().trim();
        String salaryText = txtSalary.getText().trim();

        if (position.isEmpty() || department.isEmpty() ||
            hireDate.isEmpty() || salaryText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            return;
        }

        double salary = Double.parseDouble(salaryText);

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_management", "root", "");

        boolean success = addEmployee(conn, selectedUID, position, department, hireDate, salary);

        if (success) {
            JOptionPane.showMessageDialog(this, "Employee added successfully!");
            loadUserIDs(); // refresh UID list
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add employee.");
        }

        conn.close();
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_addemployeeActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       ViewEmployees vv = new ViewEmployees();
       vv.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Empreg;
    private javax.swing.JLabel Empreg1;
    private javax.swing.JLabel Empreg2;
    private javax.swing.JLabel accname;
    private javax.swing.JButton addemployee;
    private javax.swing.JLabel age;
    private javax.swing.JLabel applcation;
    private javax.swing.JTable candidatestable;
    private javax.swing.JTable candidatestable1;
    private javax.swing.JLabel cid;
    private javax.swing.JLabel clearr;
    private javax.swing.JComboBox<String> comboUID;
    private javax.swing.JLabel editaccc;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel image;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel logout;
    public javax.swing.JPanel main;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel mname;
    private javax.swing.JLabel myaccount;
    private javax.swing.JComboBox<String> partylist;
    private javax.swing.JComboBox<String> positionn;
    private javax.swing.JLabel reportss;
    private javax.swing.JLabel savebttn;
    private javax.swing.JLabel select;
    private javax.swing.JPanel sidebar;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtHireDate;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JLabel users;
    // End of variables declaration//GEN-END:variables
}
