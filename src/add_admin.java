/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * add_admin.java
 *
 * Created on Jun 30, 2023, 11:00:58 PM
 */

/**
 *
 * @author prath
 */
import java.sql.*;
import java.io.*;
import javax.swing.*;
public class add_admin extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    /** Creates new form add_admin */
    public add_admin() {
        initComponents();


         try
       {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con=DriverManager.getConnection("Jdbc:Odbc:tailer");

    }catch(Exception e)
    {
       JOptionPane.showMessageDialog(this, "Error="+e);
    }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        b4 = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        b3 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(246, 229, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 102));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 24));
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Username :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(370, 330, 150, 50);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 24));
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Admin Name :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(370, 220, 170, 50);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 24));
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Phone No :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(370, 580, 150, 50);

        t4.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jPanel2.add(t4);
        t4.setBounds(590, 570, 314, 60);

        b4.setBackground(new java.awt.Color(255, 153, 153));
        b4.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        b4.setForeground(new java.awt.Color(0, 0, 102));
        b4.setText("Submit");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel2.add(b4);
        b4.setBounds(460, 730, 110, 50);

        t2.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jPanel2.add(t2);
        t2.setBounds(590, 329, 314, 60);

        b3.setBackground(new java.awt.Color(255, 153, 153));
        b3.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        b3.setForeground(new java.awt.Color(0, 0, 102));
        b3.setText("Login");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel2.add(b3);
        b3.setBounds(650, 730, 110, 50);

        t1.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jPanel2.add(t1);
        t1.setBounds(590, 213, 314, 60);

        t3.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jPanel2.add(t3);
        t3.setBounds(590, 451, 314, 60);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 24));
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("password :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(370, 450, 150, 50);

        panel1.setBackground(new java.awt.Color(0, 5, 102));
        panel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("New Admin");
        panel1.add(jLabel1);
        jLabel1.setBounds(10, 301, 247, 89);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registration");
        panel1.add(jLabel2);
        jLabel2.setBounds(80, 370, 257, 64);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1105, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1093, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        try {
            pst=con.prepareStatement("insert into admin values(?,?,?,?)");
            pst.setString(1,t1.getText());
            pst.setString(2,t2.getText());
            pst.setInt(3,Integer.parseInt(t3.getText()));
            pst.setString(4,t4.getText());
            pst.execute();
            JOptionPane.showMessageDialog(this,"User Registration Successfully!!...");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this,"Error="+e);
        }
}//GEN-LAST:event_b4ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        this.hide();
        login ob=new login();
        ob.setVisible(true);
        ob.show();
    }//GEN-LAST:event_b3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private java.awt.Panel panel1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables

}
