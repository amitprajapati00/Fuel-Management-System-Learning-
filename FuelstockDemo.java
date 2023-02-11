import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Fuelstock
{
JFrame f;
JLabel l1,l2,l3,l4,l5,l6;
JComboBox t1;
JTextField t2,t3,t4,t5,t6;
JButton b1,b2,b3;
Font f1;
Connection con;
ResultSet rs;
PreparedStatement st;
ImageIcon im;

Fuelstock()
{
f=new JFrame("Fuel Stock");
f.setSize(700,650);
f.setResizable(false);
f.setLocationRelativeTo(null);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

im=new ImageIcon("fuelsale.jpg");
JLabel bg=new JLabel("",JLabel.CENTER);
bg.setBounds(0,0,700,600);
f.add(bg);

f1=new Font("Arial Black",Font.BOLD,14);

l1=new JLabel("Fuel");
l1.setBounds(50,50,150,30);
l1.setFont(f1);
l1.setForeground(Color.BLUE);
bg.add(l1);

t1=new JComboBox();
t1.setBounds(400,50,200,30);
t1.addItem("Petrole");
t1.addItem("Diesel");
t1.setFont(f1);
//t1.addKeyListener(this);
bg.add(t1);

l2=new JLabel("Stocks");
l2.setBounds(50,130,150,30);
l2.setFont(f1);
l2.setForeground(Color.BLUE);
bg.add(l2);

t2=new JTextField();
t2.setBounds(400,130,200,30);
t2.setFont(f1);
//t2.addKeyListener(this);
bg.add(t2);

l3=new JLabel("Sales");
l3.setBounds(50,210,150,30);
l3.setFont(f1);
l3.setForeground(Color.BLUE);
bg.add(l3);

t3=new JTextField();
t3.setBounds(400,210,200,30);
t3.setFont(f1);
//t3.addKeyListener(this);
bg.add(t3);

l4=new JLabel("Purchase");
l4.setBounds(50,290,150,30);
l4.setFont(f1);
l4.setForeground(Color.BLUE);
bg.add(l4);

t4=new JTextField();
t4.setBounds(400,290,200,30);
t4.setFont(f1);
//t4.addKeyListener(this);
bg.add(t4);

l5=new JLabel("Purchase Price");
l5.setBounds(50,370,200,30);
l5.setFont(f1);
l5.setForeground(Color.BLUE);
bg.add(l5);

t5=new JTextField();
t5.setBounds(400,370,200,30);
t5.setFont(f1);
//t5.addKeyListener(this);
bg.add(t5);

l6=new JLabel("Sales Price");
l6.setBounds(50,450,200,30);
l6.setFont(f1);
l6.setForeground(Color.BLUE);
bg.add(l6);

t6=new JTextField();
t6.setBounds(400,450,200,30);
t6.setFont(f1);
//t6.addKeyListener(this);
bg.add(t6);

b1=new JButton("Back");
b1.setBounds(125,550,100,30);
b1.setForeground(Color.BLACK);
b1.setFont(f1);
//b1.addActionListener(this);
bg.add(b1);

b2=new JButton("Clear");
b2.setBounds(275,550,100,30);
b2.setForeground(Color.BLACK);
b2.setFont(f1);
//b2.addActionListener(this);
bg.add(b2);

b3=new JButton("Search");
b3.setBounds(425,550,100,30);
b3.setForeground(Color.BLACK);
b3.setFont(f1);
//b3.addActionListener(this);
bg.add(b3);

f.setVisible(true);
}//cons
}//class

class FuelstockDemo
{
public static void main(String[] s)
{
Fuelstock l=new Fuelstock();
}
}
