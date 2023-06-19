import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.Color;
import pack.*;

class pr1 {
    public static void main(String[] args) {
        frameb obj = new frameb();
        obj.ind();
    }
}

class frameb extends JFrame {
    JFrame f;
    JLabel l1, l2, l3, l4;
    JPanel pan1, pan2, pan3, pan4, pan5;
    JButton btn1, btn2, btn3, btn4, btn5, btn6;

    public void ind() {
        f = new JFrame();
        f.getContentPane().setBackground(Color.cyan);
        // f.setExtendedState(MAXIMIZED_BOTH);
        f.setSize(1930, 1080);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Border blackline = BorderFactory.createLineBorder(Color.black);
        Color lib = new Color(51, 51, 255);
        Color liib = new Color(128, 128, 128);

        String spaces = "                                 ";
        l1 = new JLabel(spaces + "Clinical Managment System" + spaces);
        l1.setFont(new Font("Verdana", Font.BOLD, 50));
        l1.setForeground(Color.white);
        pan1 = new JPanel();
        pan1.setBorder(blackline);
        pan1.setBounds(10, 10, 1900, 80);
        pan1.setBackground(lib);
        pan1.add(l1);
        f.add(pan1);

        l4 = new JLabel(spaces + "Ramnarain Ruia Hospital" + spaces);
        l4.setFont(new Font("Verdana", Font.BOLD, 50));
        l4.setForeground(Color.white);
        pan3 = new JPanel();
        pan3.setBackground(liib);
        pan3.setBorder(blackline);
        pan3.setBounds(10, 91, 1900, 80);
        pan3.add(l4);
        f.add(pan3);

        btn1 = new JButton("Admission Form");
        btn1.setBackground(lib);
        btn1.setForeground(Color.white);
        btn1.setFont(new Font("Verdana", Font.BOLD, 22));

        btn2 = new JButton("Appoinment form");
        btn2.setBackground(lib);
        btn2.setForeground(Color.white);
        btn2.setFont(new Font("Verdana", Font.BOLD, 22));

        btn3 = new JButton("Complain");
        btn3.setBackground(lib);
        btn3.setForeground(Color.white);
        btn3.setFont(new Font("Verdana", Font.BOLD, 22));

        btn4 = new JButton("Availablity");
        btn4.setBackground(lib);
        btn4.setForeground(Color.white);
        btn4.setFont(new Font("Verdana", Font.BOLD, 22));

        btn5 = new JButton("Calculation");
        btn5.setBackground(lib);
        btn5.setForeground(Color.white);
        btn5.setFont(new Font("Verdana", Font.BOLD, 22));

        btn6 = new JButton("Board Member and Staff");
        btn6.setBackground(lib);
        btn6.setForeground(Color.white);
        btn6.setFont(new Font("Verdana", Font.BOLD, 22));

        pan4 = new JPanel();
        pan4.setBounds(100, 280, 600, 500);
        pan4.setBackground(Color.white);
        pan4.setBorder(blackline);
        pan4.setLayout(null);
        f.add(pan4);

        pan5 = new JPanel();
        pan5.setBounds(750,730,1000,120);
        pan5.setBackground(Color.white);
        pan5.setBorder(blackline);
        pan5.setLayout(null);
        f.add(pan5);

        btn1.setBounds(200, 340, 400, 60);
        f.add(btn1);
        btn2.setBounds(200, 440, 400, 60);
        f.add(btn2);
        btn3.setBounds(200, 540, 400, 60);
        f.add(btn3);
        btn4.setBounds(200, 640, 400, 60);
        f.add(btn4);
        btn5.setBounds(800, 760, 400, 60);
        f.add(btn5);
        btn6.setBounds(1300, 760, 400, 60);
        f.add(btn6);

        pan2 = new JPanel();
        ImageIcon img = new ImageIcon("5.png");
        JLabel backg = new JLabel(img);
        backg.setBounds(1100, 350, 400, 302);
        f.add(backg);
        pan2.setBackground(lib);
        pan2.setBorder(blackline);
        pan2.setBounds(1000, 300, 600, 400);
        // l2 = new JLabel(" " + "Welcome To Our Clinic");
        // l2.setFont(new Font("Verdana", Font.BOLD, 50));
        // l2.setForeground(Color.white);
        // pan2.add(l2);
        // l2.setBounds(880, 300, 900, 302);
        // f.add(l2);
        f.add(pan2);

        pr21 obj = new pr21();
        // obj.pr();
        btn1.addActionListener(l -> {
            obj.pr();
        });

        pr23 obj1 = new pr23();
        btn2.addActionListener(l -> {
            obj1.Appoinment_form();
        });

        pr24 obj2 = new pr24();
        btn3.addActionListener(l -> {
            obj2.Complain_form();
        });

        btn4.addActionListener(l -> {
            JFrame fp = new JFrame("Password");
            fp.getContentPane().setBackground(Color.CYAN);
            fp.setVisible(true);
            fp.setSize(500, 400);
            JTextField pass = new JTextField(20);
            pass.setBounds(50, 100, 100, 50);
            pass.setBorder(blackline);
            fp.add(pass);
            JButton btc = new JButton("Enter");
            btc.setBounds(300, 100, 100, 50);
            btc.setBackground(Color.red);
            btc.setForeground(Color.WHITE);
            btc.setBorder(blackline);
            btc.setFont(new Font("Verdana", Font.BOLD, 18));
            fp.add(btc);
            pr25 obj3 = new pr25();
            btc.addActionListener(p -> {
                int cpass = Integer.parseInt(pass.getText());
                if (cpass == 123) {
                    JOptionPane.showMessageDialog(fp, "Access Granted Press Ok To continue", "Confirm",
                            JOptionPane.INFORMATION_MESSAGE);
                    obj3.av1();
                } else {
                    JOptionPane.showMessageDialog(fp, "Incorrect Password try Again", "Error",
                            JOptionPane.INFORMATION_MESSAGE);
                    btc.setText("Denied");
                }

            });

        });

        pr26 obj4 = new pr26();
        btn5.addActionListener(l -> {
            obj4.cal();
        });

        pr27 obj5 = new pr27();
        btn6.addActionListener(l -> {
            obj5.disp();
        });

       

    }
}