/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculter;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import static java.lang.Thread.State.NEW;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ACER
 */
public class ev extends JFrame implements ActionListener ,ItemListener
{
    //varable
    int x=100,y=20;
    JButton b1,b2,b3,b4,b5,b6;
    JLabel l1,l2,l3;
    JPanel p1,p2,p3;
    JTextField t1,t2,t3;
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3;
    ButtonGroup g1;
    // end var
 public ev()
{
 this.setSize(300,600)   ;
 this.setVisible(true);
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.setResizable(false);
 this.setLocation(100, 20);
 //intionalization
l1=new JLabel("full name");
l2=new JLabel("bassword");
l3=new JLabel(  );

 p1=new JPanel();
 p2=new JPanel();
 p3=new JPanel();
 b1=new JButton("save");
 b2=new JButton("show");
 b3=new JButton("right");
 b4=new JButton("left");
 b5=new JButton("min");
 b6=new JButton("max");
 t1=new JTextField();
 t2=new JTextField();
 t3=new JTextField();
 
 r1=new JRadioButton("red");
 r2=new JRadioButton("blue");
 r3=new JRadioButton("brown");
 r4=new JRadioButton("yellow");

g1=new ButtonGroup();
c1=new JCheckBox("bold");
c2=new JCheckBox("SERIF");
c3=new JCheckBox("PLAIN");
// end inizalition 
 p1.setBackground(Color.red);
 p2.setBackground(Color.yellow);
 p3.setBackground(Color.blue);
 this.add(p1); this.add(p2);
 this.add(p3);
p1.setSize(500,200);
p2.setSize(500,200);
p3.setSize(500,200);
this.setLayout(new GridLayout(3,1));
p1.setLayout(null);p2.setLayout(null);
p3.setLayout(null);

l1.setBounds(30,10,100,25);p1.add(l1);
l2.setBounds(30,50,100,25);p1.add(l2);
t1.setBounds(120,10,150,25);p1.add(t1);
t2.setBounds(120,50,150,25);p1.add(t2);
b1.setBounds(50,100,75,25);p1.add(b1);
b2.setBounds(150,100,75,25);p1.add(b2);
b1.setBackground(Color.CYAN);b1.setForeground(Color.black);
b2.setBackground(Color.CYAN);b2.setForeground(Color.black);
t3.setBounds(30,30,220,25);p2.add(t3);
g1.add(r1);
g1.add(r2);
g1.add(r3);
g1.add(r4);

r1.setBounds(10,70,50,25);p2.add(r1);
r2.setBounds(65,70,60,25);p2.add(r2);r3.setBounds(135,70,70,25);p2.add(r3);r4.setBounds(210,70,70,25);p2.add(r4); 

l3.setBounds(100,20, 220, 25);p3.add(l3);
l3.setFont(new Font("lic",Font.BOLD,y));
c1.setBounds(10, 50, 75, 25);p3.add(c1);
c2.setBounds(100, 50, 75, 25);p3.add(c2);
c3.setBounds(190, 50, 75, 25);p3.add(c3);
b3.setBackground(Color.CYAN);b3.setForeground(Color.black);
b3.setBounds(0,100,75,25);p3.add(b3);
b4.setBackground(Color.CYAN);b4.setForeground(Color.black);
b4.setBounds(80,100,75,25);p3.add(b4);
b5.setBackground(Color.CYAN);b5.setForeground(Color.black);
b5.setBounds(160,100,75,25);p3.add(b5);
b6.setBackground(Color.CYAN);b6.setForeground(Color.black);
b6.setBounds(240,100,75,25);p3.add(b6);
 b1.addActionListener(this);
 b2.addActionListener(this);
 r1.addActionListener(this);
 r2.addActionListener(this);
 r3.addActionListener(this);
 r4.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
c1.addItemListener(this);
c2.addItemListener(this);
c3.addItemListener(this);

}

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String s1,s2;
        if(ae.getSource()==b1)
        {
            s1=t1.getText().toString();
            s2=t2.getText().toString();
            System.out.println(s1+" "+s2);

        }
        if(ae.getSource()==b2)
        
        {
            s1=t1.getText().toString();
            s2=t2.getText().toString();
            t3.setText(s1+"  "+s2);
            t1.setText("");t2.setText("");
            l3.setText(s1+" "+s2);
            
        }
        if(ae.getSource()==r1)
        {
            p1.setBackground(Color.BLACK);
            p2.setBackground(Color.red);
            t3.setForeground(Color.RED);
            l3.setForeground(Color.red);

        }
         if(ae.getSource()==r2)
        {
            p3.setBackground(Color.yellow);
            p2.setBackground(Color.blue);
            t3.setForeground(Color.blue);
            l3.setForeground(Color.blue);

        } 
         if(ae.getSource()==r3)
        {
            p2.setBackground(Color.GRAY);
            t3.setForeground(Color.GRAY);
            l3.setForeground(Color.gray);

        }
        if(ae.getSource()==r4)
        {
            p3.setBackground(Color.CYAN);
            p2.setBackground(Color.yellow);
            t3.setForeground(Color.yellow);
            l3.setForeground(Color.yellow);

        }
      
        if(ae.getSource()==b3)
        {
            x+=5;
            l3.setBounds(x, 30, 220, 25);
        }
        
        if(ae.getSource()==b4)
        {
            x-=5;
            l3.setBounds(x,30, 220, 25);
        }
     if(ae.getSource()==b5)
     {
         y-=2;
         l3.setFont(new Font("lic",Font.BOLD,y));

     }
     if(ae.getSource()==b6)
     {
         y+=2;
         l3.setFont(new Font("lic",Font.BOLD,y));

     }
    }
     
  @Override
  public void itemStateChanged(ItemEvent ie) 
    {
         
        if(c1.isSelected()&&c2.isSelected()&&c3.isSelected())
        {
             l3.setFont(new Font("lic",Font.BOLD+Font.PLAIN+Font.ITALIC,y));
        }
        if(c1.isSelected())
        {
               l3.setFont(new Font("l",Font.BOLD,y));

        }
        else if(c2.isSelected())
        {
                   l3.setFont(new Font("lic",Font.PLAIN,y));


        }
        if(c3.isSelected())
        {
                       l3.setFont(new Font("lic",Font.ITALIC,y));


            
        }
    }
     
     
    }

   
    

