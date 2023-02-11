import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainSales implements ActionListener
{
JFrame f;
JButton b1,b2,b3;
JLabel l1;
Font f1,f2;
ImageIcon im;

MainSales()
{
	f=new JFrame("Mhadev Fuel Fillig station");
	f.setSize(500,500);
	f.setResizable(false);
	f.setLocationRelativeTo(null);
	f.setLayout(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

im=new ImageIcon("WhatsApp Image loan.jpeg");
JLabel bg=new JLabel("",im,JLabel.CENTER);
bg.setBounds(0,0,500,500);
f.add(bg);

f1=new Font("Arial Black",Font.BOLD,14);
f2=new Font("Arial Black", Font.BOLD,22);

l1=new JLabel("Sales Details");
l1.setBounds(150,50,200,50);
l1.setFont(f2);
l1.setForeground(Color.RED);
bg.add(l1);

b1=new JButton("Petrol");
b1.setBounds(125,180,250,30);
b1.setFont(f1);
b1.addActionListener(this);
//b1.setForeground(Color.YELLOW);
bg.add(b1);
 
b2=new JButton("Diesel");
b2.setBounds(125,300,250,30);
b2.addActionListener(this);
b2.setFont(f1);
bg.add(b2);

b3=new JButton("Back");
b3.setBounds(350,400,100,30);
b3.setFont(f1);
b3.addActionListener(this);
bg.add(b3);

 
f.setVisible(true);
}// constructor

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
JOptionPane.showMessageDialog(f,"Welcome to admine loan detail");
//Loan i=new Loan();
f.dispose();
}//b1

else if(ae.getSource()==b2)
{
JOptionPane.showMessageDialog(f,"If you to change something in admin loan details?press ok");
//UpdateLoan l=new UpdateLoan();
f.dispose();
}//b2

else if(ae.getSource()==b3)
{
Main l=new Main();
f.dispose();
}//b3

}//action method
}//class

class MainSalesDemo
{
public static void main(String[] a)
{
MainSales l=new MainSales();
}
}



