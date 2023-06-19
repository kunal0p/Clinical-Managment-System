package pack;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class pr26 {
    public void cal() {
        JFrame f5;
        JLabel lbmi, lweight, lheight, lresult, l61, l62, lwaist, lhip, l663, lratio, lresult2;
        JTextField weight, height, result, concl1, hip, result2, concl2, waist;
        JPanel pan61;
        JButton btn8, btn9;

        f5 = new JFrame();
        f5.getContentPane().setBackground(Color.cyan);
        f5.setSize(1930, 1080);
        f5.setVisible(true);
        f5.setLayout(null);
        //f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color lib = new Color(51,51,255);

        Border blackline = BorderFactory.createLineBorder(Color.black);
        String spaces = "        ";
        l61 = new JLabel(spaces + "Calculations" + spaces);
        l61.setFont(new Font("Verdana", Font.BOLD, 50));
        l61.setForeground(Color.white);
        pan61 = new JPanel();
        ImageIcon img1 = new ImageIcon("1.jpg");
        JLabel backg1 = new JLabel(img1);
        backg1.setBounds(0, 10, 78, 78);
        pan61.add(backg1);
        pan61.setBackground(lib);
        pan61.add(l61);
        pan61.setBounds(10, 10, 1900, 80);
        pan61.setBorder(blackline);
        JLabel backg2 = new JLabel(img1);
        pan61.add(backg2);
        f5.add(pan61);

        l62 = new JLabel("BMI");
        l62.setFont(new Font("Verdana", Font.BOLD, 20));
        l62.setBounds(50, 140, 350, 30);
        f5.add(l62);

        lbmi = new JLabel("Inputs To Calculate BMI :");
        lbmi.setBounds(50, 200, 400, 40);
        lbmi.setFont(new Font("Verdana", Font.BOLD, 20));
        f5.add(lbmi);

        lweight = new JLabel("Weight :");
        lweight.setBounds(100, 290, 200, 40);
        lweight.setFont(new Font("Verdana", Font.BOLD, 20));
        f5.add(lweight);
        weight = new JTextField();
        weight.setBounds(300, 290, 350, 50);
        weight.setFont(new Font("Verdana", Font.BOLD, 16));
        weight.setBorder(blackline);
        f5.add(weight);

        lheight = new JLabel("Height :");
        lheight.setBounds(100, 380, 200, 40);
        lheight.setFont(new Font("Verdana", Font.BOLD, 20));
        f5.add(lheight);
        height = new JTextField();
        height.setBounds(300, 380, 350, 50);
        height.setFont(new Font("Verdana", Font.BOLD, 16));
        height.setBorder(blackline);
        f5.add(height);

        lresult = new JLabel("Resultant BMI:");
        lresult.setBounds(100, 470, 200, 40);
        lresult.setFont(new Font("Verdana", Font.BOLD, 20));
        f5.add(lresult);
        result = new JTextField();
        result.setBounds(300, 470, 350, 50);
        result.setFont(new Font("Verdana", Font.BOLD, 16));
        result.setBorder(blackline);
        f5.add(result);

        btn8 = new JButton("Calculate");
        btn8.setBounds(300, 560, 350, 50);
        btn8.setFont(new Font("Verdana", Font.BOLD, 18));
        btn8.setBackground(lib);
        btn8.setForeground(Color.white);
        btn8.setBorder(blackline);
        f5.add(btn8);

        concl1 = new JTextField();
        concl1.setFont(new Font("Verdana", Font.BOLD, 18));
        concl1.setBounds(300, 650, 450, 50);
        f5.add(concl1);

        String l63 = "BMI is Normal";
        String l64 = "OverWeight";
        String l65 = "Obesity Level 1";
        String l66 = "Obesity Level 2";
        String l67 = "Obesity Level 3";
        btn8.addActionListener(l -> {
            Float h = Float.parseFloat(height.getText());
            Float w = Float.parseFloat(weight.getText());

            Float resultb = w / (h * h);
            result.setText(resultb + "");

            if (resultb >= 19.0 && resultb <= 24.9) {
                concl1.setText(l63);
            } else if (resultb >= 25.0 && resultb <= 29.9) {
                concl1.setText(l64);
            } else if (resultb >= 30.0 && resultb <= 34.9) {
                concl1.setText(l65);
            } else if (resultb >= 35.0 && resultb <= 39.9) {
                concl1.setText(l66);
            } else if (resultb >= 40.0) {
                concl1.setText(l67);
            }

        });

        l663 = new JLabel("WHR");
        l663.setFont(new Font("Verdana", Font.BOLD, 20));
        l663.setBounds(1000, 140, 350, 30);
        f5.add(l663);

        lratio = new JLabel("Inputs To Calculate WHR :");
        lratio.setBounds(1000, 200, 400, 40);
        lratio.setFont(new Font("Verdana", Font.BOLD, 20));
        f5.add(lratio);

        JLabel lgen = new JLabel("Gender(1=M 2=F) :");
        lgen.setBounds(1000, 290, 300, 40);
        lgen.setFont(new Font("Verdana", Font.BOLD, 20));
        f5.add(lgen);
        JTextField gen = new JTextField();
        gen.setBounds(1220, 290, 350, 50);
        gen.setFont(new Font("Verdana", Font.BOLD, 16));
        gen.setBorder(blackline);
        f5.add(gen);

        lwaist = new JLabel("Waist(in) :");
        lwaist.setBounds(1000, 380, 200, 40);
        lwaist.setFont(new Font("Verdana", Font.BOLD, 20));
        f5.add(lwaist);
        waist = new JTextField();
        waist.setBounds(1220, 380, 350, 50);
        waist.setFont(new Font("Verdana", Font.BOLD, 16));
        waist.setBorder(blackline);
        f5.add(waist);

        lhip = new JLabel("Hip(in) :");
        lhip.setBounds(1000, 470, 200, 40);
        lhip.setFont(new Font("Verdana", Font.BOLD, 20));
        f5.add(lhip);
        hip = new JTextField();
        hip.setBounds(1220, 470, 350, 50);
        hip.setFont(new Font("Verdana", Font.BOLD, 16));
        hip.setBorder(blackline);
        f5.add(hip);

        lresult2 = new JLabel("Resultant WHR:");
        lresult2.setBounds(1000, 560, 200, 40);
        lresult2.setFont(new Font("Verdana", Font.BOLD, 20));
        f5.add(lresult2);
        result2 = new JTextField();
        result2.setBounds(1220, 560, 350, 50);
        result2.setFont(new Font("Verdana", Font.BOLD, 16));
        result2.setBorder(blackline);
        f5.add(result2);

        btn9 = new JButton("Calculate");
        btn9.setBounds(1220, 650, 350, 50);
        btn9.setFont(new Font("Verdana", Font.BOLD, 18));
        btn9.setBackground(lib);
        btn9.setForeground(Color.white);
        btn9.setBorder(blackline);
        f5.add(btn9);

        concl2 = new JTextField();
        concl2.setFont(new Font("Verdana", Font.BOLD, 18));
        concl2.setBounds(1220, 740, 450, 50);
        f5.add(concl2);

        String l68 = "WHR is Normal";
        String l69 = "OverWeight";
        String l70 = "Obesity";
        btn9.addActionListener(l -> {
            Float w1 = Float.parseFloat(waist.getText());
            Float h1 = Float.parseFloat(hip.getText());

            Float resultc = w1 / h1;
            result2.setText(resultc + "");

            int s =Integer.parseInt(gen.getText());
            if (s == 1) {
                if (resultc < 0.90) {
                    concl2.setText(l68);
                } else if (resultc >= 0.90 && resultc <= 0.99) {
                    concl2.setText(l69);
                } else if (resultc >= 1.0) {
                    concl2.setText(l70);
                }
            } else {
                if (resultc < 0.80) {
                    concl2.setText(l68);
                } else if (resultc >= 0.80 && resultc <= 0.84) {
                    concl2.setText(l69);
                } else if (resultc >= 0.85) {
                    concl2.setText(l70);
                }
            }

        });

    }
}
