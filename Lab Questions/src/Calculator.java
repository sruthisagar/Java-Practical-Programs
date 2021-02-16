import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener
{
    JPanel panel = new JPanel();
    JTextField textField;
    JButton add, sub, mul, div, eql, clr, n0, n1, n2, n3, n4, n5, n6, n7, n8, n9;
    double no1=0, no2=0, result;
    String operator;
    String firstDigit = "";
    
    public Calculator()
    {
        setTitle("Calculator");
        setResizable(false);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(0xffc299));
        panel.setLayout(new GridLayout(4, 4));
        textField = new JTextField(15);
        textField.setEditable(false);
        textField.setText("0");
        textField.setFont(new Font("Courier", Font.BOLD, 30));

        n0 = new JButton("0");
        n0.setFont(new Font("Courier", Font.BOLD, 30));
        n1 = new JButton("1");
        n1.setFont(new Font("Courier", Font.BOLD, 30));
        n2 = new JButton("2");
        n2.setFont(new Font("Courier", Font.BOLD, 30));
        n3 = new JButton("3");
        n3.setFont(new Font("Courier", Font.BOLD, 30));
        n4 = new JButton("4");
        n4.setFont(new Font("Courier", Font.BOLD, 30));
        n5 = new JButton("5");
        n5.setFont(new Font("Courier", Font.BOLD, 30));
        n6 = new JButton("6");
        n6.setFont(new Font("Courier", Font.BOLD, 30));
        n7 = new JButton("7");
        n7.setFont(new Font("Courier", Font.BOLD, 30));
        n8 = new JButton("8");
        n8.setFont(new Font("Courier", Font.BOLD, 30));
        n9 = new JButton("9");
        n9.setFont(new Font("Courier", Font.BOLD, 30));
        add = new JButton("+");
        add.setFont(new Font("Courier", Font.BOLD, 30));
        add.setBackground(new Color(0x80b3ff));
        sub = new JButton("-");
        sub.setFont(new Font("Courier", Font.BOLD, 30));
        sub.setBackground(new Color(0x80b3ff));
        mul = new JButton("*");
        mul.setFont(new Font("Courier", Font.BOLD, 30));
        mul.setBackground(new Color(0x80b3ff));
        div = new JButton("/");
        div.setFont(new Font("Courier", Font.BOLD, 30));
        div.setBackground(new Color(0x80b3ff));
        eql = new JButton("=");
        eql.setFont(new Font("Courier", Font.BOLD, 30));
        eql.setBackground(new Color(0x4dffd2));
        clr = new JButton("C");
        clr.setFont(new Font("Courier", Font.BOLD, 30));
        clr.setBackground(new Color(0xff6666));


        panel.add(n1);
        panel.add(n2);
        panel.add(n3);
        panel.add(clr);
        panel.add(n4);
        panel.add(n5);
        panel.add(n6);
        panel.add(add);
        panel.add(n7);
        panel.add(n8);
        panel.add(n9);
        panel.add(sub);
        panel.add(n0);
        panel.add(mul);
        panel.add(div);
        panel.add(eql);

        add(panel);
        add(textField);

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
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        eql.addActionListener(this);
        clr.addActionListener(this);

        pack();
    }

    public void actionPerformed(ActionEvent e)
    {
        String str = e.getActionCommand();
        if(str=="+" || str=="-" || str=="*" || str=="/")
        {
            no1 = Integer.parseInt(textField.getText());
            operator = str;
            firstDigit = "";
            textField.setText(str);
        }
        else if(str=="=")
        {
            firstDigit = "";
            no2 = Integer.parseInt(textField.getText());

            try
            {
                switch (operator)
                {
                    case "+":
                        result = no1 + no2;
                        break;
                    case "-":
                        result = no1 - no2;
                        break;
                    case "*":
                        result = no1 * no2;
                        break;
                    case "/":
                        result = no1 / no2;
                        break;
                }
                textField.setText((int)no1 + operator + (int)no2 + "=" + result);
            }
            catch (ArithmeticException ex)
            {
                textField.setText("Undefined");
            }
        }
        else if(str=="C")
        {
            textField.setText("0");
            firstDigit = "";
            operator = "";
        }
        else
        {
            textField.setText(firstDigit.concat(str));
            firstDigit = textField.getText();
        }
    }

    public static void main(String args[])
    {
        Calculator calculator = new Calculator();
    }
}
