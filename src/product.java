/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * product.java
 *
 * Created on Jun 24, 2023, 11:21:32 AM
 */

/**
 *
 * @author prath
 */
import java.sql.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JList.*;
import java.lang.String.*;
import java.math.*;
public class product extends javax.swing.JFrame {

    /** Creates new form product */
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public product() {
        initComponents();


         try
       {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con=DriverManager.getConnection("Jdbc:Odbc:tailer");
        pst=con.prepareStatement("select * from product");
        rs=pst.executeQuery();
        while(rs.next())
        {
            jComboBox1.addItem(rs.getString(1));
        }
        rs.close();

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
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        deli_date = new javax.swing.JTextField();
        order_date = new javax.swing.JTextField();
        order_id = new javax.swing.JTextField();
        cust_name = new javax.swing.JTextField();
        pho_no = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sr_no_text = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        qty_text = new javax.swing.JTextField();
        rate_text = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        list1 = new java.awt.List();
        list2 = new java.awt.List();
        list3 = new java.awt.List();
        list4 = new java.awt.List();
        jLabel11 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        list5 = new java.awt.List();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 5, 102));
        jPanel2.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ENTER SALE DETAILS :");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 388, 390, 137);

        jPanel1.setBackground(new java.awt.Color(246, 229, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Date :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 70, 100, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1030, 390, 80, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Number :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 140, 100, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 220, 100, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Phone Number :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(710, 220, 160, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("City :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(780, 60, 90, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Delivery Date :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(730, 140, 140, 50);

        city.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jPanel1.add(city);
        city.setBounds(870, 60, 200, 50);

        deli_date.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jPanel1.add(deli_date);
        deli_date.setBounds(870, 140, 200, 50);

        order_date.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        order_date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order_dateMouseClicked(evt);
            }
        });
        order_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_dateActionPerformed(evt);
            }
        });
        jPanel1.add(order_date);
        order_date.setBounds(380, 60, 200, 50);

        order_id.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        order_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order_idMouseClicked(evt);
            }
        });
        jPanel1.add(order_id);
        order_id.setBounds(380, 140, 200, 50);

        cust_name.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jPanel1.add(cust_name);
        cust_name.setBounds(380, 220, 200, 50);

        pho_no.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        pho_no.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pho_noFocusGained(evt);
            }
        });
        pho_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pho_noKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pho_noKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pho_noKeyTyped(evt);
            }
        });
        jPanel1.add(pho_no);
        pho_no.setBounds(870, 220, 200, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Sr. No");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(240, 340, 90, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Product Name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(390, 330, 140, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Qty");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(770, 330, 90, 50);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Rate");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(890, 330, 90, 50);

        sr_no_text.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        sr_no_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sr_no_textFocusGained(evt);
            }
        });
        sr_no_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sr_no_textActionPerformed(evt);
            }
        });
        sr_no_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sr_no_textKeyPressed(evt);
            }
        });
        jPanel1.add(sr_no_text);
        sr_no_text.setBounds(240, 380, 80, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "item1", "item2" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(360, 380, 130, 40);

        qty_text.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jPanel1.add(qty_text);
        qty_text.setBounds(770, 380, 80, 50);

        rate_text.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jPanel1.add(rate_text);
        rate_text.setBounds(890, 380, 110, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(310, 930, 90, 50);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(610, 980, 0, 0);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 102));
        jButton4.setText("PRINT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(600, 930, 120, 50);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 102));
        jButton5.setText("EXIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(890, 930, 110, 50);

        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });
        jPanel1.add(list1);
        list1.setBounds(240, 450, 80, 160);
        jPanel1.add(list2);
        list2.setBounds(510, 450, 200, 160);
        jPanel1.add(list3);
        list3.setBounds(770, 450, 80, 160);
        jPanel1.add(list4);
        list4.setBounds(890, 450, 110, 160);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("TOTAL :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(930, 640, 70, 40);

        total.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jPanel1.add(total);
        total.setBounds(1040, 630, 80, 50);

        textarea1.setColumns(20);
        textarea1.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        textarea1.setRows(5);
        jScrollPane1.setViewportView(textarea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(230, 710, 890, 150);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Measurement :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(240, 650, 130, 60);
        jPanel1.add(list5);
        list5.setBounds(1040, 450, 80, 160);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 102));
        jButton6.setText("Search Customer");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(1090, 230, 150, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1096, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1096, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1900, 1075));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void order_dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_dateMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_order_dateMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                        list1.add(sr_no_text.getText());
			list2.add(jComboBox1.getSelectedItem().toString());
			list3.add(qty_text.getText());
			list4.add(rate_text.getText());

                        Integer qty=Integer.parseInt(qty_text.getText());
                        Integer rate=Integer.parseInt(rate_text.getText());
                        Integer to=qty*rate;
                        String tot=to.toString();

                        list5.add(tot);

                        int sum = 0;

                         for (String item : list5.getItems()) {
                              int number = Integer.parseInt(item);
                              sum += number;
                              total.setText(""+sum);
                         }
			
			int no=Integer.parseInt(sr_no_text.getText());
              		no++;
             		sr_no_text.setText(""+no);
			qty_text.setText("");
             		rate_text.setText("");
			 // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try{



           BufferedWriter bw=new BufferedWriter(new FileWriter("sbill.html"));
    	
                
                     
           	bw.write("<html>");
    		bw.write("<title>  </title>");
    		bw.write("<head>   </head>");
    		bw.write("<body>");
                bw.write("<input value='Print' type='button' onclick='handlePrint()' />");
      bw.write("<script type='text/javascript'>");
         bw.write("const handlePrint = () => {");
           bw.write(" var actContents = document.body.innerHTML;");
            bw.write("document.body.innerHTML = actContents;");
            bw.write("window.print();");
            bw.write(" }");
                    bw.write("</script>");



        		bw.write("<table align=center  border=1 <tr><td><h2 align=center><font color='Red'>S.S. TAILERS JENTS SPECIALISTS</tr></table>");

			bw.write("<table align=center  border=1 width=80% height=5% bgcolor=white><tr><td><h4 align=center><font color='green'> <img src='C:/Users/prath/Documents/NetBeansProjects/TAILERING APPLICATION/src/logo1.png' width=50 height=25> K.V.Road, Near Manik Computers. Pincode:413709 <img src='C:/Users/prath/Documents/NetBeansProjects/TAILERING APPLICATION/src/logo1.png' width=50 height=25></tr></table>");

                	bw.write("<table align=center  border=1 width=80% height=5% bgcolor=white><tr><td><h4 align=left><font color='green'>Bill No: <font color='Blue'>"+order_id.getText()+"<td width=35%><h4><font color='green'>Date:<font color='Blue'> "+order_date.getText()+"</tr></table>");

			bw.write("<table align=center  border=1 width=80% height=5% bgcolor=White><tr><td><h3><font color='green'>Name:<font color='Blue'> "+cust_name.getText()+"<td width=35%><h4><font color='green'>Mobile No:<font color='Blue'>"+pho_no.getText()+"</tr></table>");

                        bw.write("<table align=center  border=1 width=80% height=5% bgcolor=White><tr><td><h3><font color='green'>City Name: <font color='Blue'>"+city.getText()+"<td width=35%><h4><font color='green'>Delivery Date:<font color='Blue'>"+deli_date.getText()+"</tr></table>");





    		bw.write("<table border=3 cellpadding=10 align=center width=80% >");

                 
                
		bw.write("<tr>");

		bw.write("<th><font color='green'>Sr.No");
		bw.write("<th><font color='green'>Product Name");
		bw.write("<th><font color='green'>Qty");
                bw.write("<th><font color='green'>Price");
                bw.write("<th><font color='green'>Sub Total");


		bw.write("</tr>");

                for(int i=0;i<list1.getItemCount();i++)
                    {
	       		bw.write("<tr>");

      			bw.write("<td><font color='Blue'>"+list1.getItem(i));
                        bw.write("<td><font color='Blue'>"+list2.getItem(i));
                        bw.write("<td><font color='Blue'>"+list3.getItem(i));
                        bw.write("<td><font color='Blue'>"+list4.getItem(i));
                        bw.write("<td><font color='Blue'>"+list5.getItem(i));



			bw.write("</tr>");

           }
		bw.write("<tr>");
                   
                bw.write("<td>");
                bw.write("<td>");
                bw.write("<td>");
		bw.write("<td><b><font color='green'>Total:");
                bw.write("<td><b><font color='green'>"+total.getText());
		bw.write("</tr>");

                bw.write("</table>");


               

		bw.write("<table align=center  border=1 width=80% height=5% bgcolor=White><tr><td><h4 align='left'><font color='Blue'>Customer Signature.................<h4 align='right'><font color='Blue'>Authorised Signature:-.................</tr></table>");

                 bw.write("<table border=3 cellpadding=10 align=center width=80%>");

                bw.write("<tr>");
                bw.write("----------------------------------------------------------------------------------------------------------------------------------");
                  bw.write("<th><font color='green'>Measurements:");
                  bw.write("<tr><td><font color='green'>Bill Number: <font color='Blue'>"+order_id.getText());
                  bw.write("<tr><td><font color='green'>Customer Name: "+cust_name.getText());
                  bw.write("<tr><td><font color='green'>Customer Mobile Number: "+pho_no.getText());

                  bw.write("<tr><td><font color='green'>Measurement: "+textarea1.getText());
                bw.write("</tr>");





                bw.write("</table>");
                    
		Runtime r=Runtime.getRuntime();
		r.exec("explorer sbill.html");
		bw.close();
                }
		
		catch(Exception e)
		{
			System.out.print("\n Error="+e);
		}
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        try

			{
           for(int i=0;i<list1.getItemCount();i++)
                                {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				con=DriverManager.getConnection("Jdbc:Odbc:tailer");

                             
				pst=con.prepareStatement("insert into sale values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

                                pst.setString(1,order_id.getText());
                                pst.setString(3,cust_name.getText());
                          	pst.setString(2,order_date.getText());

				
				pst.setString(4,pho_no.getText());


				pst.setString(5,city.getText());
				pst.setString(6,deli_date.getText());

			        
                                pst.setString(7,list1.getItem(i));
				pst.setString(8,list2.getItem(i));

                                pst.setString(9,list3.getItem(i));
                                pst.setString(10,list4.getItem(i));
                                pst.setString(13,list5.getItem(i));
                               
                                pst.setString(11,textarea1.getText());
                                pst.setString(12,total.getText());
                                 



				pst.executeUpdate();

                                JOptionPane.showMessageDialog(null,"Record Inserted Successfully!!");
                            }
        }
			catch(Exception ae)
			{
				JOptionPane.showMessageDialog(null,"Error="+ae);
			}
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
	 this.hide();
         mdi ob=new mdi();
         ob.setVisible(true);
         ob.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
        
    }//GEN-LAST:event_list1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
/*---
         try
      {
              
             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	     con=DriverManager.getConnection("Jdbc:Odbc:tailer");
for(int i=0;i<list1.getItemCount();i++)
             {
             
        String q="update sale set order_date=?, cust_name=?, pho_no=?, cust_city=?, deli_date=?, sr_no=?, pro_name=?, pro_qty=?, pro_rate=?, mesurement=?, total=?,sub_total=? where ord_id=?";
      pst=con.prepareStatement(q);
      pst.setString(1,order_date.getText());
      pst.setString(2,cust_name.getText());
      pst.setString(3,pho_no.getText());
      pst.setString(4,city.getText());
      pst.setString(5,deli_date.getText());
      pst.setString(6,list1.getItem(i));
      pst.setString(7,list2.getItem(i));
      pst.setString(8,list3.getItem(i));
      pst.setString(9,list4.getItem(i));
      pst.setString(10,textarea1.getText());
      pst.setString(11,total.getText());

      pst.setString(12,list5.getItem(i));
      pst.setString(13,order_id.getText());
      
      
      pst.execute();

      
          }
      JOptionPane.showMessageDialog(this, "Record Updated...");
          

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error="+e);
        }
        
     --*/   // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void pho_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pho_noKeyPressed
      //     // TODO add your handling code here:
    }//GEN-LAST:event_pho_noKeyPressed

    private void pho_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pho_noKeyTyped
       // TODO add your handling code here:
    }//GEN-LAST:event_pho_noKeyTyped

    private void pho_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pho_noKeyReleased
       // //Phone number Validation code...
        String phono= pho_no.getText();
        if(phono.matches("^[0-9]*$") && phono.length()==10)
        {
            JOptionPane.showMessageDialog(this, "Enter Valid Mobile Number...");
        }
        else
        {
            
        }

    }//GEN-LAST:event_pho_noKeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try
        {
             
            pst=con.prepareStatement("select * from sale where pho_no=?");
            pst.setInt(1,Integer.parseInt(pho_no.getText()));
            rs=pst.executeQuery();
            if(rs.next())
            {

                cust_name.setText(rs.getString(3));
                city.setText(rs.getString(5));
                
            }


           else
            {
                JOptionPane.showMessageDialog(this, "Not Found...He/She New Customer!!!");
             }
            rs.close();
            
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this,"error="+e);
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void order_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_idMouseClicked


        try
       {
           Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
           rs=st.executeQuery("select * from sale");
           rs.last();
           Integer a=Integer.parseInt(rs.getString(1));
           a+=1;
            order_id.setText(""+a);
           con.close();
       }catch(Exception e){
       JOptionPane.showMessageDialog(this,"Error:"+e);
       } // TODO add your handling code here:

     
    }//GEN-LAST:event_order_idMouseClicked

    private void order_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_order_dateActionPerformed

    private void pho_noFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pho_noFocusGained
       // TODO add your handling code here:
    }//GEN-LAST:event_pho_noFocusGained

    private void sr_no_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sr_no_textActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_sr_no_textActionPerformed

    private void sr_no_textFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sr_no_textFocusGained

            
                // TODO add your handling code here:
    }//GEN-LAST:event_sr_no_textFocusGained

    private void sr_no_textKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sr_no_textKeyPressed
            
              
                // TODO add your handling code here:
    }//GEN-LAST:event_sr_no_textKeyPressed
    private void order_dateWindowOpened(java.awt.event.WindowEvent evt) {
    JOptionPane.showMessageDialog(this, "WElcome...");
        java.util.Date d1=new java.util.Date();
        int dd=d1.getDate();
        int mm=d1.getMonth()+1;
        int yy=d1.getYear()+1900;
        order_date.setText(dd+"/"+mm+"/"+yy);
        // TODO add your handling code here:
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField city;
    private javax.swing.JTextField cust_name;
    private javax.swing.JTextField deli_date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.List list1;
    private java.awt.List list2;
    private java.awt.List list3;
    private java.awt.List list4;
    private java.awt.List list5;
    private javax.swing.JTextField order_date;
    private javax.swing.JTextField order_id;
    private javax.swing.JTextField pho_no;
    private javax.swing.JTextField qty_text;
    private javax.swing.JTextField rate_text;
    private javax.swing.JTextField sr_no_text;
    private javax.swing.JTextArea textarea1;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables

}
