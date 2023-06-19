package pack;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class pr25 {
    public void av1() {

        JFrame f4;
        JLabel lbed, licu, lvent, lsyrenge, lgluco, l51;
        JTextField bed, icu, vent, syrenge, gluco;
        JPanel pan51;
        JComboBox by5;
        JButton r51, r52, r53, r54, r55, r56, r57, r58, r59, r510;

        f4 = new JFrame();
        f4.getContentPane().setBackground(Color.cyan);
        f4.setSize(1930, 1080);
        f4.setVisible(true);
        f4.setLayout(null);
        // f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color lib = new Color(51, 51, 255);

        Border blackline = BorderFactory.createLineBorder(Color.black);
        String spaces = "        ";
        l51 = new JLabel(spaces + "Availablity" + spaces);
        l51.setFont(new Font("Verdana", Font.BOLD, 50));
        l51.setForeground(Color.white);
        pan51 = new JPanel();
        ImageIcon img1 = new ImageIcon("1.jpg");
        JLabel backg1 = new JLabel(img1);
        backg1.setBounds(0, 10, 78, 78);
        pan51.add(backg1);
        pan51.setBackground(lib);
        pan51.add(l51);
        pan51.setBorder(blackline);
        JLabel backg2 = new JLabel(img1);
        pan51.add(backg2);
        pan51.setBounds(10, 10, 1900, 80);
        f4.add(pan51);

        lbed = new JLabel("Bed :");
        lbed.setBounds(400, 200, 200, 40);
        lbed.setFont(new Font("Verdana", Font.BOLD, 20));
        f4.add(lbed);
        String a1 = "67";
        bed = new JTextField(a1);
        bed.setBounds(560, 200, 350, 50);
        bed.setFont(new Font("Verdana", Font.BOLD, 20));
        bed.setBorder(blackline);
        f4.add(bed);
        r51 = new JButton("+");
        r51.setBounds(950, 200, 100, 40);
        r52 = new JButton("-");
        r52.setBounds(1200, 200, 100, 40);
        r51.setFont(new Font("Verdana", Font.BOLD, 18));
        r51.setForeground(Color.white);
        r51.setBackground(lib);
        r52.setFont(new Font("Verdana", Font.BOLD, 18));
        r52.setForeground(Color.white);
        r52.setBackground(lib);
        f4.add(r51);
        f4.add(r52);
        r51.addActionListener(l -> {
            int a11 = Integer.parseInt(bed.getText());
            int result1 = a11 + 1;
            bed.setText(result1 + "");
        });
        r52.addActionListener(l -> {
            int a12 = Integer.parseInt(bed.getText());
            int result2 = a12 - 1;
            bed.setText(result2 + "");
        });

        licu = new JLabel("ICU :");
        licu.setBounds(400, 290, 200, 40);
        licu.setFont(new Font("Verdana", Font.BOLD, 20));
        f4.add(licu);
        String a2 = "50";
        icu = new JTextField(a2);
        icu.setBounds(560, 290, 350, 50);
        icu.setFont(new Font("Verdana", Font.BOLD, 20));
        icu.setBorder(blackline);
        f4.add(icu);
        r53 = new JButton("+");
        r53.setBounds(950, 290, 100, 40);
        r54 = new JButton("-");
        r54.setBounds(1200, 290, 100, 40);
        r53.setFont(new Font("Verdana", Font.BOLD, 18));
        r53.setForeground(Color.white);
        r53.setBackground(lib);
        r54.setFont(new Font("Verdana", Font.BOLD, 18));
        r54.setForeground(Color.white);
        r54.setBackground(lib);
        f4.add(r53);
        f4.add(r54);
        r53.addActionListener(l -> {
            int a21 = Integer.parseInt(icu.getText());
            int result1 = a21 + 1;
            icu.setText(result1 + "");
        });
        r54.addActionListener(l -> {
            int a22 = Integer.parseInt(icu.getText());
            int result2 = a22 - 1;
            icu.setText(result2 + "");
        });

        lvent = new JLabel("Ventilator :");
        lvent.setBounds(400, 380, 200, 40);
        lvent.setFont(new Font("Verdana", Font.BOLD, 20));
        f4.add(lvent);
        String a3 = "39";
        vent = new JTextField(a3);
        vent.setBounds(560, 380, 350, 50);
        vent.setFont(new Font("Verdana", Font.BOLD, 20));
        vent.setBorder(blackline);
        f4.add(vent);
        r55 = new JButton("+");
        r55.setBounds(950, 380, 100, 40);
        r56 = new JButton("-");
        r56.setBounds(1200, 380, 100, 40);
        r55.setFont(new Font("Verdana", Font.BOLD, 18));
        r55.setForeground(Color.white);
        r55.setBackground(lib);
        r56.setFont(new Font("Verdana", Font.BOLD, 18));
        r56.setForeground(Color.white);
        r56.setBackground(lib);
        f4.add(r55);
        f4.add(r56);
        r55.addActionListener(l -> {
            int a31 = Integer.parseInt(vent.getText());
            int result3 = a31 + 1;
            vent.setText(result3 + "");
        });
        r56.addActionListener(l -> {
            int a32 = Integer.parseInt(vent.getText());
            int result3 = a32 - 1;
            vent.setText(result3 + "");
        });

        lsyrenge = new JLabel("Syrange :");
        lsyrenge.setBounds(400, 470, 200, 40);
        lsyrenge.setFont(new Font("Verdana", Font.BOLD, 20));
        f4.add(lsyrenge);
        String a4 = "7584";
        syrenge = new JTextField(a4);
        syrenge.setBounds(560, 470, 350, 50);
        syrenge.setFont(new Font("Verdana", Font.BOLD, 20));
        syrenge.setBorder(blackline);
        f4.add(syrenge);
        r57 = new JButton("+");
        r57.setBounds(950, 470, 100, 40);
        r58 = new JButton("-");
        r58.setBounds(1200, 470, 100, 40);
        r57.setFont(new Font("Verdana", Font.BOLD, 18));
        r57.setForeground(Color.white);
        r57.setBackground(lib);
        r58.setFont(new Font("Verdana", Font.BOLD, 18));
        r58.setForeground(Color.white);
        r58.setBackground(lib);
        f4.add(r57);
        f4.add(r58);
        r57.addActionListener(l -> {
            int a41 = Integer.parseInt(syrenge.getText());
            int result4 = a41 + 1;
            syrenge.setText(result4 + "");
        });
        r58.addActionListener(l -> {
            int a42 = Integer.parseInt(syrenge.getText());
            int result4 = a42 - 1;
            syrenge.setText(result4 + "");
        });

        lgluco = new JLabel("Glucose :");
        lgluco.setBounds(400, 560, 200, 40);
        lgluco.setFont(new Font("Verdana", Font.BOLD, 20));
        f4.add(lgluco);
        String a5 = "4328";
        gluco = new JTextField(a5);
        gluco.setBounds(560, 560, 350, 50);
        gluco.setFont(new Font("Verdana", Font.BOLD, 20));
        gluco.setBorder(blackline);
        f4.add(gluco);
        r59 = new JButton("+");
        r59.setBounds(950, 560, 100, 40);
        r510 = new JButton("-");
        r510.setBounds(1200, 560, 100, 40);
        r59.setFont(new Font("Verdana", Font.BOLD, 18));
        r59.setForeground(Color.white);
        r59.setBackground(lib);
        r510.setFont(new Font("Verdana", Font.BOLD, 18));
        r510.setForeground(Color.white);
        r510.setBackground(lib);
        f4.add(r59);
        f4.add(r510);
        r59.addActionListener(l -> {
            int a51 = Integer.parseInt(gluco.getText());
            int result5 = a51 + 1;
            gluco.setText(result5 + "");
        });
        r510.addActionListener(l -> {
            int a52 = Integer.parseInt(gluco.getText());
            int result5 = a52 - 1;
            gluco.setText(result5 + "");
        });

        JLabel lby = new JLabel("edited By :");
        lby.setFont(new Font("Verdana", Font.BOLD, 20));
        lby.setBounds(400, 650, 200, 40);
        f4.add(lby);
        String[] li = { "Mr.Date S.V.", "Mrs.Kamat D.P.", "Mr.Bhosle P.C.", "Mr.Jadhav S.L." };
        JComboBox by4 = new JComboBox<>(li);
        by4.setFont(new Font("Verdana", Font.BOLD, 16));
        by4.setBorder(blackline);
        by4.setBounds(560, 650, 350, 50);
        f4.add(by4);

        JButton btn = new JButton("Save");
        btn.setBackground(lib);
        btn.setForeground(Color.white);
        btn.setBounds(650, 740, 400, 50);
        btn.setFont(new Font("Verdana", Font.BOLD, 20));
        f4.add(btn);
        btn.addActionListener(l -> {
            JOptionPane.showMessageDialog(f4, " Changes Saved Sucessfully.", "Confirmation",
                    JOptionPane.INFORMATION_MESSAGE);
        });

    }
}
