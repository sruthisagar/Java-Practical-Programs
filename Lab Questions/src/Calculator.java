//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//public class Calculator extends JFrame implements ActionListener{
//
//    public static void main(String[] args) {
//        Calculator a=new Calculator();
//
//    }
//
//    JTextField t1,t2,t3;
//    JLabel l;
//    JButton add,sub,mul,div;
//    public Calculator(){
//        t1=new JTextField(20);
//        t2=new JTextField(20);
//        add=new JButton("+");
//        sub=new JButton("-");
//        mul=new JButton("x");
//        div=new JButton("/");
//        l=new JLabel("Result");
//        add(t1);
//        add(t2);
//        add(add);
//        add(sub);
//        add(mul);
//        add(div);
//        add(l);
//
//        add.addActionListener(this);
//        sub.addActionListener(this);
//        mul.addActionListener(this);
//        div.addActionListener(this);
//        setLayout(new FlowLayout());
//        setVisible(true);
//        setSize(400,400);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//    public void actionPerformed(ActionEvent ae){
//        double n1=Double.parseDouble(t1.getText());
//        double n2=Double.parseDouble(t2.getText());
//        double val=0;
//        if(ae.getSource() == add){
//            val=n1+n2;
//            l.setText(val+"");
//        }
//        if(ae.getSource() == sub){
//            val=n1-n2;
//            l.setText(val+"");}
//        if(ae.getSource() == mul){
//            val=n1*n2;
//            l.setText(val+"");}
//        if(ae.getSource() == div){
//            if(n2!=0){
//                val=n1/n2;
//                l.setText(val+"");}
//            else {
//                l.setText("Infinity");
//            }
//        }
//
//    }
//}

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener
{
    JTextField textField;
    JButton addn,subn,muln,divn,eqln,clrn,n0,n1,n2,n3,n4,n5,n6,n7,n8,n9;
    double p=0,q=0;
    String op;
    String str1="";
    public Calculator()
    {
        setLayout(new GridLayout(5,4));
        textField = new JTextField(20);
        setBackground(Color.white);
        textField.setEditable(false);
        textField.setText("0");

        n0 = new JButton("0");
        n1 = new JButton("1");
        n2 = new JButton("2");
        n3 = new JButton("3");
        n4 = new JButton("4");
        n5 = new JButton("5");
        n6 = new JButton("6");
        n7 = new JButton("7");
        n8 = new JButton("8");
        n9 = new JButton("9");
        addn = new JButton("+");
        subn = new JButton("-");
        muln = new JButton("*");
        divn = new JButton("/");
        eqln = new JButton("=");
        clrn = new JButton("C");

        add(n0);
        add(n1);
        add(n2);
        add(n3);
        add(n4);
        add(n5);
        add(n6);
        add(n7);
        add(n8);
        add(n9);
        add(addn);
        add(subn);
        add(muln);
        add(divn);
        add(eqln);
        add(clrn);

        n0.addActionListener(this);
        n1.addActionListener(this);
        n2.addActionListener(this);
        n3.addActionListener(this);
        n4.addActionListener(this);
        n5.addActionListener(this);
        n6.addActionListener(this);
        n7.addActionListener(this);
        n8.addActionListener(this);
        n9.addActionListener(this);
        addn.addActionListener(this);
        subn.addActionListener(this);
        muln.addActionListener(this);
        divn.addActionListener(this);
        eqln.addActionListener(this);
        clrn.addActionListener(this);
        add(textField);

//        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String str = ae.getActionCommand();
        if(str.equals("+"))
        {
            p=Integer.parseInt(textField.getText());
            op=str;
            textField.setText(str1="");
        }
        else if(str.equals("-"))
        {
            p=Integer.parseInt(textField.getText());
            op=str;
            textField.setText(str1="");
        }
        else if(str.equals("*"))
        {
            p=Integer.parseInt(textField.getText());
            op=str;
            textField.setText(str1="");
        }
        else if(str.equals("/"))
        {
            p=Integer.parseInt(textField.getText());
            op=str;
            textField.setText(str1="");
        }
        else if(str.equals("="))
        {
            str1="";
            if(op.equals("+"))
            {
                q=Integer.parseInt(textField.getText());
                textField.setText(String.valueOf((p+q)));
            }
            else if(op.equals("-"))
            {
                q=Integer.parseInt(textField.getText());
                textField.setText(String.valueOf((p-q)));
            }
            else if(op.equals("*"))
            {
                q=Integer.parseInt(textField.getText());
                textField.setText(String.valueOf((p*q)));
            }
            else if(op.equals("/"))
            {
                q=Integer.parseInt(textField.getText());
                if(q!=0)
                    textField.setText(String.valueOf((p/q)));
                else
                    textField.setText("Undefined");
            }
        }
        else if(str.equals("C"))
        {
            p=0;q=0;
            textField.setText("");
            str1="";
            textField.setText("0");
        }
        else
        {
            textField.setText(str1.concat(str));
            str1= textField.getText();
        }
    }

    public static void main(String args[])
    {
        Calculator obj=new Calculator();
    }
}

