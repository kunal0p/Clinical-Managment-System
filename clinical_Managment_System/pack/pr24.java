package pack;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class pr24 {
    public void Complain_form() {
        JFrame f3;
        JLabel lname, lon, lcomp, lby, l41, l42, l43;
        JTextField name, on;
        JTextArea comp;
        JPanel pan41;
        JComboBox by4;

        f3 = new JFrame();
        f3.getContentPane().setBackground(Color.cyan);
        f3.setSize(1930, 1080);
        f3.setVisible(true);
        f3.setLayout(null);
        // f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color lib = new Color(51, 51, 255);

        Border blackline = BorderFactory.createLineBorder(Color.black);
        String spaces = "        ";
        l41 = new JLabel(spaces + "Complain" + spaces);
        l41.setFont(new Font("Verdana", Font.BOLD, 50));
        l41.setForeground(Color.white);
        pan41 = new JPanel();
        ImageIcon img1 = new ImageIcon("1.jpg");
        JLabel backg1 = new JLabel(img1);
        backg1.setBounds(0, 10, 78, 78);
        pan41.add(backg1);
        pan41.setBackground(lib);
        pan41.add(l41);
        pan41.setBorder(blackline);
        JLabel backg2 = new JLabel(img1);
        pan41.add(backg2);
        pan41.setBounds(10, 10, 1900, 80);
        f3.add(pan41);

        lname = new JLabel("Complain By :");
        lname.setBounds(100, 200, 200, 40);
        lname.setFont(new Font("Verdana", Font.BOLD, 20));
        f3.add(lname);
        name = new JTextField();
        name.setBounds(300, 200, 350, 50);
        name.setFont(new Font("Verdana", Font.BOLD, 20));
        name.setBorder(blackline);
        f3.add(name);

        lon = new JLabel("Complain On :");
        lon.setBounds(100, 290, 200, 40);
        lon.setFont(new Font("Verdana", Font.BOLD, 20));
        f3.add(lon);
        on = new JTextField();
        on.setBounds(300, 290, 350, 50);
        on.setFont(new Font("Verdana", Font.BOLD, 16));
        on.setBorder(blackline);
        f3.add(on);

        lcomp = new JLabel("Complain :");
        lcomp.setBounds(100, 380, 200, 40);
        lcomp.setFont(new Font("Verdana", Font.BOLD, 20));
        f3.add(lcomp);
        comp = new JTextArea();
        comp.setBounds(300, 380, 900, 500);
        comp.setFont(new Font("Verdana", Font.BOLD, 19));
        comp.setBorder(blackline);
        f3.add(comp);

        lby = new JLabel("Complain taking Incharge :");
        lby.setFont(new Font("Verdana", Font.BOLD, 20));
        lby.setBounds(950, 200, 400, 40);
        f3.add(lby);
        String[] li = { "Mr.Date S.V.", "Mrs.Kamat D.P.", "Mr.Bhosle P.C.", "Mr.Jadhav S.L." };
        by4 = new JComboBox<>(li);
        by4.setFont(new Font("Verdana", Font.BOLD, 16));
        by4.setBorder(blackline);
        by4.setBounds(1300, 200, 300, 40);
        f3.add(by4);

        JButton btn7 = new JButton("Submit");
        btn7.setBackground(lib);
        btn7.setForeground(Color.white);
        btn7.setBounds(1300, 580, 400, 50);
        btn7.setFont(new Font("Verdana", Font.BOLD, 20));
        f3.add(btn7);

        l42 = new JLabel("Status : ");
        l42.setBounds(1300, 680, 200, 50);
        l42.setFont(new Font("Verdana", Font.BOLD, 20));
        f3.add(l42);

        l43 = new JLabel("Not Submitted");
        l43.setBounds(1450, 680, 300, 50);
        l43.setFont(new Font("Verdana", Font.BOLD, 20));
        f3.add(l43);

        btn7.addActionListener(l -> {
            JOptionPane.showMessageDialog(f3, " Complain is submitted Sucessfully.", "Confirmation",
                    JOptionPane.INFORMATION_MESSAGE);
            btn7.setText("Submited");
            l43.setText("Submitted");
        });
    }

}
