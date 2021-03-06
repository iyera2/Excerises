import javax.swing.*;
import java.awt.EventQueue;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Cal extends JFrame implements ActionListener{
    private static JFrame f;
    private JTextField t;

    private static JTextField l;

    String a, b, c;

    Cal(){
        a = b = c = "";
    }

    public static void main(String[] args) {
        f = new JFrame("Calculator");
        Cal cal = new Cal();
        cal.setVisible(true);

        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, div, sub, add, mut, per, equal, del, clear;

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        div = new JButton("/");
        sub = new JButton("-");
        add = new JButton("+");
        mut = new JButton("*");
        per = new JButton(".");
        equal = new JButton("=");
        del = new JButton("Delete");
        clear = new JButton("Clear");

       JPanel p = new JPanel();

       b0.addActionListener(cal);
       b1.addActionListener(cal);
       b2.addActionListener(cal);
       b3.addActionListener(cal);
       b4.addActionListener(cal);
       b5.addActionListener(cal);
       b6.addActionListener(cal);
       b7.addActionListener(cal);
       b8.addActionListener(cal);
       b9.addActionListener(cal);
       div.addActionListener(cal);
       sub.addActionListener(cal);
       add.addActionListener(cal);
       mut.addActionListener(cal);
       per.addActionListener(cal);
       equal.addActionListener(cal);
       del.addActionListener(cal);
       clear.addActionListener(cal);
    }

    public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
  
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') { 
            if (!a.equals("")) {
                b = b + s; 
            }
            else {
                a = a + s; 
  
            l.setText(a+ b + c); 
            }
        } 
    }
}
