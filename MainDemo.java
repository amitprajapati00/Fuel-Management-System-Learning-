import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main implements ActionListener
{
JFrame f;
JButton b1,b2,b3,b4;
JLabel l1;
Font f1,f2;
ImageIcon im;

Main()
{
	f=new JFrame("Mhadev Fuel Fillig station");
	f.setSize(500,500);
	f.setResizable(false);
	f.setLocationRelativeTo(null);
	f.setLayout(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

im=new ImageIcon("fuelmain.jpg");
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

b1=new JButton("Sales");
b1.setBounds(125,150,250,30);
b1.setFont(f1);
b1.addActionListener(this);
b1.setForeground(Color.BLUE);
bg.add(b1);
 
b2=new JButton("Purchase");
b2.setBounds(125,230,250,30);
b2.addActionListener(this);
b2.setForeground(Color.BLUE);
b2.setFont(f1);
bg.add(b2);

b3=new JButton("Log out");
b3.setBounds(320,400,150,30);
b3.setFont(f1);
b3.addActionListener(this);
b3.setForeground(Color.RED);
bg.add(b3);

b4=new JButton("Stocks");
b4.setBounds(125,310,250,30);
b4.addActionListener(this);
b4.setFont(f1);
b4.setForeground(Color.BLUE);
bg.add(b4);
 
f.setVisible(true);
}// constructor

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
//JOptionPane.showMessageDialog(f,"Welcome to admine loan detail");
Fuelsale l=new Fuelsale();
f.dispose();
}//b1

else if(ae.getSource()==b2)
{
//JOptionPane.showMessageDialog(f,"If you to change something in admin loan details?press ok");
//UpdateLoan l=new UpdateLoan();
f.dispose();
}//b2

else if(ae.getSource()==b3)
{
Login l=new Login();
f.dispose();
}//b3

}//action method
}//class

class MainDemo
{
public static void main(String[] a)
{
Main l=new Main();
}
}



