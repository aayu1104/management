
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MRZLICH
 */
public class update extends javax.swing.JFrame {

    /**
     * Creates new form update
     */
    public update() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        street = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        mobileno = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        fathername = new javax.swing.JTextField();
        hostelno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("update");

        panel1.setPreferredSize(new java.awt.Dimension(1370, 730));
        panel1.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 255));
        jLabel14.setText("Mobile no.");
        panel1.add(jLabel14);
        jLabel14.setBounds(610, 580, 80, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 255));
        jLabel13.setText("Communications");
        panel1.add(jLabel13);
        jLabel13.setBounds(460, 580, 130, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 255));
        jLabel10.setText("Street");
        panel1.add(jLabel10);
        jLabel10.setBounds(610, 440, 80, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 255));
        jLabel12.setText("State");
        panel1.add(jLabel12);
        jLabel12.setBounds(610, 530, 30, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 255));
        jLabel9.setText("Address");
        panel1.add(jLabel9);
        jLabel9.setBounds(470, 440, 100, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Email");
        panel1.add(jLabel4);
        jLabel4.setBounds(470, 160, 50, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("Father's name");
        panel1.add(jLabel6);
        jLabel6.setBounds(470, 240, 130, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setText("Hostel no.");
        panel1.add(jLabel7);
        jLabel7.setBounds(470, 320, 110, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setText("Contact Details");
        panel1.add(jLabel8);
        jLabel8.setBounds(470, 380, 182, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Date of birth");
        panel1.add(jLabel5);
        jLabel5.setBounds(470, 280, 120, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 255));
        jLabel11.setText("City");
        panel1.add(jLabel11);
        jLabel11.setBounds(610, 490, 20, 15);

        search.setBackground(new java.awt.Color(0, 153, 255));
        search.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        panel1.add(search);
        search.setBounds(1050, 160, 90, 20);

        street.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetActionPerformed(evt);
            }
        });
        panel1.add(street);
        street.setBounds(690, 444, 350, 16);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Back");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        panel1.add(jLabel2);
        jLabel2.setBounds(1280, 640, 29, 17);

        city.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        panel1.add(city);
        city.setBounds(690, 490, 350, 16);

        state.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        panel1.add(state);
        state.setBounds(690, 530, 350, 16);

        mobileno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        panel1.add(mobileno);
        mobileno.setBounds(690, 584, 350, 16);

        update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        panel1.add(update);
        update.setBounds(790, 660, 100, 25);

        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        panel1.add(name);
        name.setBounds(610, 196, 430, 20);

        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        panel1.add(email);
        email.setBounds(610, 160, 430, 20);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.1.png"))); // NOI18N
        panel1.add(jLabel15);
        jLabel15.setBounds(590, 0, 380, 127);

        dob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        panel1.add(dob);
        dob.setBounds(610, 236, 430, 20);

        fathername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        panel1.add(fathername);
        fathername.setBounds(610, 280, 430, 20);

        hostelno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Girls hostel 1", "Girls hostel 2", "DR hostel", "Boys hostel 2", "Boys hostel 3", "Boys hostel 4", "Boys hostel 5", "Boys hostel 6", "Boys hostel 7", "Boys hostel 8" }));
        hostelno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        hostelno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostelnoActionPerformed(evt);
            }
        });
        panel1.add(hostelno);
        hostelno.setBounds(610, 320, 430, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Name");
        panel1.add(jLabel3);
        jLabel3.setBounds(470, 200, 80, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bbackground.jpg"))); // NOI18N
        panel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 730);

        jButton1.setText("jButton1");
        panel1.add(jButton1);
        jButton1.setBounds(750, 630, 73, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hostelnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostelnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hostelnoActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
//    edit t=new edit();
  //  t.setVisible(true);
    try {
            Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/name","harsh","rathore");
            PreparedStatement sp=c.prepareStatement("SELECT * FROM REGISTER where CAST(email AS VARCHAR(128))=?");
            sp.setString(1, email.getText());
            ResultSet rs=sp.executeQuery();
            while(rs.next())
            {
                
             if(email.getText().equals(rs.getString(8)))
            {
             name.setText(rs.getString(1));
            fathername.setText(rs.getString(2));
            dob.setText(rs.getString(3));
            hostelno.setSelectedIndex(Integer.parseInt(rs.getString(4)));
            street.setText(rs.getString(5));
            city.setText(rs.getString(6));
            state.setText(rs.getString(7));
           mobileno.setText(rs.getString(9));
           /* int check=sp.executeUpdate();
            if(check>0){
                JOptionPane.showMessageDialog(this,"Updated");
            }*/
        }
            } 
    }catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }  
  // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void streetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
          try {
            Connection c;
            c=DriverManager.getConnection("jdbc:derby://localhost:1527/name","harsh","rathore");
            PreparedStatement sp=c.prepareStatement("SELECT from EMAIL values(?)");
            ResultSet rs=sp.getResultSet();
            if(rs.next())
             name.setText(rs.getString(1));
            fathername.setText(rs.getString(4));
            dob.setText(rs.getString(2));
            /*sp.setString(4, (String) hostelno.getSelectedItem());
            sp.setString(5,street.getText());
            sp.setString(6,city.getText());
            sp.setString(7,state.getText());
            sp.setLong(8,Long.parseLong(mobileno.getText()));
            int check=sp.executeUpdate();
            if(check>0){
                JOptionPane.showMessageDialog(this,"Registered");
            }*/
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
edit t=new edit();
t.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
  
        try {
            Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/name","harsh","rathore");
            PreparedStatement sp=c.prepareStatement("UPDATE REGISTER SET NAME='"+name.getText()+"',FATHERSNAME='"+fathername.getText()+"',DOB='"+dob.getText()+"',HOSTELNO='"+hostelno.getSelectedIndex()+"',STREET='"+street.getText()+"',CITY='"+city.getText()+"',STATE='"+state.getText()+"',MOBILENO='"+mobileno.getText()+"' WHERE CAST(EMAIL AS VARCHAR (128))='"+email.getText()+"'");
            //ResultSet rs=sp.executeUpdate();
            
             int check=sp.executeUpdate();
            if(check>0){
                JOptionPane.showMessageDialog(this,"Updated");
            }
        }
             
    catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(this,ex.getMessage());
  
    }//GEN-LAST:event_updateActionPerformed
}
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
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField city;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fathername;
    private javax.swing.JComboBox<String> hostelno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mobileno;
    private javax.swing.JTextField name;
    private java.awt.Panel panel1;
    private javax.swing.JButton search;
    private javax.swing.JTextField state;
    private javax.swing.JTextField street;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}