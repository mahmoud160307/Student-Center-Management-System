/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import Secretary.Secretary_control;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pro-Mahmoud Reda
 */
public class LogInAsASecretary extends javax.swing.JFrame {

    //********************************************************************************************************************
    //declare all the static variable here
    static Connection con;                  // this is object from connection with the mysql database
    static String dt = getDate();           // this is the current date.           
    static String tm = getTime();           // this take the current time.

    //*********************************************************************************************************************
    // the constructor
    public LogInAsASecretary() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "root");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "البرنامج لا يستطيع التواصل مع قاعدة البيانات الرجاء الاتصال بالدعم الفني", "عذرا", 0);
        }
        initComponents();
        setIcon();
    }

    // a function that take the current date
    public static String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    //a function that take the current time
    public static String getTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(cal.getTime());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(30, 170, 250, 40);

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(30, 240, 250, 40);

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("كود المستخدم");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 170, 220, 40);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/تسجيل دخول.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 320, 150, 60);

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("كلمة المرور");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(240, 240, 220, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/mlogout.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 40, 40);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/login_frame.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 640, 404);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(640, 404));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
                                 //***************declaring the variable**************//
        
        Secretary_control a;                // object from the frame secretary control to go to it
        PreparedStatement stmt;             // a prepared statement to record the login and insert it into system view
        PreparedStatement stmt2;            // a prepared statement search for the id and the pass of the secretary in the database
        ResultSet set;                      // the result from searching about the secretary
        String input_id="";                    // the id the secretary will enter
        String input_pass="";                  // the password the secretary will enter
        //*******************************************************************************************************************
        
                                 //*****************for secretary login check**************//
        try {
            stmt = con.prepareStatement("select * from secretary where id= ? and pass= ?");
            stmt.setString(1, input_id);
            stmt.setString(2, input_pass);
            set = stmt.executeQuery();
            input_id = jTextField1.getText();
            input_pass = jPasswordField1.getText();

            if ("".equals(input_id) || input_pass.equals("")) {
                JOptionPane.showMessageDialog(null, "من فضلك ادخل كل البيانات بحرص  لتسجيل الدخول");
                return;
            }
            
            while (set.next()) {
                if (input_id.equals((set.getString("id"))) && input_pass.equals((set.getString("pass")))) {
                    this.setVisible(false);
                    a = new Secretary_control();
                    a.setVisible(true);
                }
            }
            if (!input_id.equals((set.getString("id"))) || !input_pass.equals((set.getString("pass")))) {
                JOptionPane.showMessageDialog(null, "ان الكود الخاص بك أو كلمه المرور بهم خطأ ,من فضلك افحص البيانات مره اخرى", "Sorry", JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ان الكود الخاص بك أو كلمه المرور بهم خطأ ,من فضلك افحص البيانات مره اخرى", "Sorry", JOptionPane.INFORMATION_MESSAGE);

            System.out.println("Error" + ex.getErrorCode());
        }
        try {
            ////////////////for System view ////////////
            stmt2 = con.prepareStatement("insert into system values(?,?,?,?)");
            stmt2.setString(1, dt);
            stmt2.setString(2, tm);
            stmt2.setString(3, "دخول سكرتير الكود الخاص به هو " + jTextField1.getText());
            stmt2.setString(4, "تسجيل دخول");
            stmt2.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LogInAsASecretary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int replay = JOptionPane.showConfirmDialog(this, "هل انت متاكد من انك تريد الرجوع", "", JOptionPane.YES_NO_OPTION, 1);
        if (replay == JOptionPane.YES_OPTION) {
            LogInAs s = new LogInAs();
            this.setVisible(false);
            s.setVisible(true);
        }    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jPasswordField1.requestFocus();
        }

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                dt = getDate();
                tm = getTime();
                ////////////////for System view ////////////
                PreparedStatement stmt2 = con.prepareStatement("insert into system values(?,?,?,?)");
                stmt2.setString(1, dt);
                stmt2.setString(2, tm);
                stmt2.setString(3, "دخول سكرتير الكود الخاص به هو " + jTextField1.getText());
                stmt2.setString(4, "تسجيل دخول");

                PreparedStatement stmt = con.prepareStatement("select * from secretary");
                ResultSet set = stmt.executeQuery();
                String check_id = jTextField1.getText();
                String check_pass = jPasswordField1.getText();

                if ("".equals(check_id) || check_pass.equals("")) {
                    JOptionPane.showMessageDialog(null, "من فضلك ادخل كل البيانات بحرص  لتسجيل الدخول");
                    return;
                }

                while (set.next()) {
                    if (check_id.equals((set.getString("id"))) && check_pass.equals((set.getString("pass")))) {
                        this.setVisible(false);
                        Secretary.Secretary_control a = new Secretary_control();
                        a.setVisible(true);
                        stmt2.executeUpdate();
                        break;
                    }
                }
                if (!check_id.equals((set.getString("id"))) || !check_pass.equals((set.getString("pass")))) {
                    JOptionPane.showMessageDialog(null, "ان الكود الخاص بك أو كلمه المرور بهم خطأ ,من فضلك افحص البيانات مره اخرى", "Sorry", JOptionPane.INFORMATION_MESSAGE);

                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ان الكود الخاص بك أو كلمه المرور بهم خطأ ,من فضلك افحص البيانات مره اخرى", "Sorry", JOptionPane.INFORMATION_MESSAGE);

                System.out.println("Error" + ex.getErrorCode());
            }

        }

    }//GEN-LAST:event_jPasswordField1KeyPressed

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
            java.util.logging.Logger.getLogger(LogInAsASecretary.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInAsASecretary.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInAsASecretary.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInAsASecretary.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInAsASecretary().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Photos/logo2.jpg")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
