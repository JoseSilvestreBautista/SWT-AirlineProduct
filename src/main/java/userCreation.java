import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class userCreation extends javax.swing.JInternalFrame {


    /**
     * Creates new form userCreation
     */
    public userCreation() {
        initComponents();
        autoID();
    }

    Connection con;
    PreparedStatement pst;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtuserid = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();

        txtfirstname.setName("txtfirstname");
        txtlastname.setName("txtlastname");
        txtusername.setName("txtusername");
        txtpassword.setName("txtpassword");
        jButton1.setName("addBtn");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("User Creation"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("User ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("FirstName");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("LastName");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("User Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Password");

        txtuserid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtuserid.setForeground(new java.awt.Color(255, 0, 0));
        txtuserid.setText("jLabel6");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addGap(55, 55, 55)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtuserid)
                        .addComponent(txtfirstname)
                        .addComponent(txtlastname)
                        .addComponent(txtusername)
                        .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(208, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtuserid))
                                    .addGap(37, 37, 37)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(44, 44, 44)
                                    .addComponent(jLabel3))
                                .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(49, 49, 49)
                            .addComponent(jLabel4))
                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(46, 46, 46)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    /**
     * Retrieves users from the database and inserts them into an array
     *
     * @return - returns an ArrayList of existing users
     * @throws SQLException
     */
    public ArrayList getExistingUsers() throws SQLException {
        ArrayList Usernames = new ArrayList<String>();
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root", "password");
        ResultSet rs = con.createStatement().executeQuery("select username from user;");
        while(rs.next()){
            Usernames.add(rs.getString(1));
        }
        return Usernames;
    }

    /**
     * Checks if username is available and creates the user if it is
     *
     * @param evt - default ActionEvent parameter for GUI
     * @return boolean - returns whether the username in txtusername is available or not
     * @throws Exception
     */
    public boolean jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Boolean checkUsername = true;

        String id = txtuserid.getText();
        String firstname = txtfirstname.getText();
        String lastname = txtlastname.getText();
        String username = txtusername.getText();
        String password = txtpassword.getText();
        try {
            if (getExistingUsers().contains(username)) {
                JOptionPane.showMessageDialog(null, "User Already Exists, Try a New Username.");
                checkUsername = false;
            } else {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager
                        .getConnection("jdbc:mysql://localhost:3306/airline", "root", "password");
                    pst = con.prepareStatement(
                        "insert into user(id,firstname,lastname,username,password)values(?,?,?,?,?)");

                    pst.setString(1, id);
                    pst.setString(2, firstname);
                    pst.setString(3, lastname);
                    pst.setString(4, username);
                    pst.setString(5, password);

                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(null, "User Created");
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(addflight.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }catch (SQLException ex){
            Logger.getLogger(addflight.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkUsername;
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Closes the current window when jButton2 is pressed
     *
     * @param evt - default ActionEvent parameter for GUI
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Grab user ID and set txtuserid to the value in the database
     */
    public void autoID() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root", "password");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select MAX(id) from user");
            rs.next();
            rs.getString("MAX(id)");
            if (rs.getString("MAX(id)") == null) {
                txtuserid.setText("UO001");
            } else {
                long id = Long.parseLong(rs.getString("MAX(id)").substring(2, rs.getString("MAX(id)").length()));
                id++;
                txtuserid.setText("UO" + String.format("%03d", id));


            }


        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }


    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtfirstname;
    public javax.swing.JTextField txtlastname;
    public javax.swing.JPasswordField txtpassword;
    public javax.swing.JLabel txtuserid;
    public javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}