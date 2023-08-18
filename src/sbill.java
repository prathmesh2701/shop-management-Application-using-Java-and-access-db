import java.io.*;
import java.sql.*;
import java.lang.*;
import javax.swing.*;

class sbill
{
	public sbill(String order_id,String order_date,String cust_name,String pho_no,String city,String deli_date,String list1,String list2,String list3,String list4,String textarea1, String total)
	{ try{

           	BufferedWriter bw=new BufferedWriter(new FileWriter("sbill.html"));
    		bw.write("<html>");
    		bw.write("<title>  </title>");
    		bw.write("<head>   </head>");
    		bw.write("<body>");



        		bw.write("<table align=center  border=1 <tr><td><h2 align=center><font color='Red'>------Shop Name----</tr></table>");

			bw.write("<table align=center  border=1 width=50% height=5% bgcolor=white><tr><td><h4 align=center><font color='green'>--------Shop Address------ </tr></table>");

                	bw.write("<table align=center  border=1 width=50% height=5% bgcolor=white><tr><td><h4 align=left><font color='Red'>Bill No: "+order_id+"<td width=35%><h4><font color='Red'>Date: "+order_date+"</tr></table>");

			bw.write("<table align=center  border=1 width=50% height=5% bgcolor=White><tr><td><h3><font color='Red'>Name: "+cust_name+"<td width=35%><h4><font color='Red'>Mobile No:"+pho_no+"</tr></table>");

                        bw.write("<table align=center  border=1 width=50% height=5% bgcolor=White><tr><td><h3><font color='Red'>City Name: "+city+"<td width=35%><h4><font color='Red'>Delivery Date:"+deli_date+"</tr></table>");





    		bw.write("<table border=3 cellpadding=10 align=center width=50% >");

              
                {
		bw.write("<tr>");

		bw.write("<th><font color='Red'>Sr.No");
		bw.write("<th><font color='Red'>Product Name");
		bw.write("<th><font color='Red'>Qty");
                bw.write("<th><font color='Red'>Price");


		bw.write("</tr>");


	       		bw.write("<tr>");

      			bw.write("<td><font color='Blue'>"+list1);
                        bw.write("<td><font color='Blue'>"+list2);
                        bw.write("<td><font color='Blue'>"+list3);
                        bw.write("<td><font color='Blue'>"+list4);



			bw.write("</tr>");


		bw.write("<tr>");
                    }
                bw.write("<td>");
		bw.write("<td><b><font color='Blue'>Total:"+total);
                bw.write("</tr>");

                bw.write("</table>");
		

                bw.write("<table border=3 cellpadding=10 align=center width=50%>");

                bw.write("<tr>");
                  bw.write("<th><font color='Red'>Measurements:");
                  bw.write("<tr><td><font color='Blue'>"+textarea1);
                bw.write("</tr>");

             



                bw.write("</table>");
		
		bw.write("<table align=center  border=1 width=50% height=5% bgcolor=White><tr><td><h4 align='left'><font color='Blue'>Customer Signature.................<h4 align='right'><font color='Blue'>Authorised Signature:-.................</tr></table>");

		Runtime r=Runtime.getRuntime();
		r.exec("explorer sbill.html");
		bw.close();

		}
		catch(Exception e)
		{
			System.out.print("\n Error="+e);
		}
	}



}