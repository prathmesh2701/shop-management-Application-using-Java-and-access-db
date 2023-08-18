import java.io.*;
import java.sql.*;
import javax.swing.*;
class servicesrepo
{
	public servicesrepo()
	{
		try
		{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

    		Connection con=DriverManager.getConnection("Jdbc:Odbc:tailer");

    		Statement st=con.createStatement();

    		BufferedWriter bw=new BufferedWriter(new FileWriter("salereport.html"));
    		bw.write("<html>");
    		bw.write("<title>Sale Report</title>");
    		bw.write("<head> </head>");
    		bw.write("<body>");
    		bw.write("<h1><center> <font color='purple'>S.S.TAILERS</font></center></h1>");
    		bw.write("<hr><hr><h2><center> <font color='purple'>K.V.Road, Near Manik Computers. Pincode:413709</font></center></h2>");
    		bw.write("<h1><center> <font color='purple'>Tailers Shop</font></center></h1>");
    		bw.write("<h3><center> <font color='Red'>Shrirampur</font></center></h1>");
    		bw.write("<h2><center> <font color='green'>SALE DETAILS REPORT</font></center></h1>");
    		bw.write("<hr color=black size=5>");
    		bw.write("<table border=1 cellpadding=10 align=center>");

    		ResultSet rs=st.executeQuery("select * from sale");

			ResultSetMetaData rsmd=rs.getMetaData();

			int col=rsmd.getColumnCount();

			bw.write("<tr>");
			for(int i=1;i<=col;i++)
			{
				bw.write("<th><font color='Blue'>"+rsmd.getColumnName(i));
			}
			while(rs.next())
			{
				bw.write("<tr>");
				for(int i=1;i<=col;i++)
				{
					bw.write("<td><font color='Red'>"+rs.getString(i));

				}
			}


			bw.write("</table>");


			Runtime r=Runtime.getRuntime();
			r.exec("explorer salereport.html");
			bw.close();
		}
		catch(Exception e)
		{
			System.out.print("\n Error="+e);
		}
	}
	public static void main(String arg[])
	{
		servicesrepo ob=new servicesrepo();
	}
}