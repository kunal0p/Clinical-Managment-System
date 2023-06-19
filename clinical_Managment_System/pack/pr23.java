package pack;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class pr23 {

    public void Appoinment_form() {

        JFrame f2;
        JLabel lname, lcon, laddress, lage, ldrname, ldesc, lemail, lexp_date, gender, lby;
        JTextField name, con, address, age, drname, email, exp_date;
        JTextArea desc;
        JButton btn6;
        JRadioButton r7, r8;
        JPanel pan31, pan32;
        JLabel l31, l32, l33, l34, l35, l36, l37, l38;

        f2 = new JFrame();
        f2.getContentPane().setBackground(Color.cyan);
        f2.setSize(1930, 1080);
        f2.setVisible(true);
        f2.setLayout(null);
        // f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color lib = new Color(51, 51, 255);

        Border blackline = BorderFactory.createLineBorder(Color.black);
        String spaces = "        ";
        l31 = new JLabel(spaces + "Appoinment Form" + spaces);
        l31.setFont(new Font("Verdana", Font.BOLD, 50));
        l31.setForeground(Color.white);
        pan31 = new JPanel();
        ImageIcon img1 = new ImageIcon("1.jpg");
        JLabel backg1 = new JLabel(img1);
        pan31.add(backg1);
        pan31.setBackground(lib);
        pan31.add(l31);
        pan31.setBorder(blackline);
        JLabel backg2 = new JLabel(img1);
        pan31.add(backg2);
        pan31.setBounds(10, 10, 1900, 80);
        f2.add(pan31);

        l32 = new JLabel("PATIENT DEMOGRAPHICS");
        l32.setFont(new Font("Verdana", Font.BOLD, 20));
        l32.setBounds(800, 140, 350, 30);
        f2.add(l32);

        lname = new JLabel("Patient Name* :");
        lname.setBounds(100, 200, 200, 40);
        lname.setFont(new Font("Verdana", Font.BOLD, 20));
        f2.add(lname);
        name = new JTextField();
        name.setBounds(310, 200, 350, 50);
        name.setFont(new Font("Verdana", Font.BOLD, 20));
        name.setBorder(blackline);
        f2.add(name);

        laddress = new JLabel("Address* :");
        laddress.setBounds(100, 290, 200, 40);
        laddress.setFont(new Font("Verdana", Font.BOLD, 20));
        f2.add(laddress);
        address = new JTextField();
        address.setBounds(300, 290, 350, 50);
        address.setFont(new Font("Verdana", Font.BOLD, 16));
        address.setBorder(blackline);
        f2.add(address);

        lcon = new JLabel("Contact* :");
        lcon.setBounds(100, 380, 200, 40);
        lcon.setFont(new Font("Verdana", Font.BOLD, 20));
        f2.add(lcon);
        con = new JTextField();
        con.setBounds(300, 380, 350, 50);
        con.setFont(new Font("Verdana", Font.BOLD, 16));
        con.setBorder(blackline);
        f2.add(con);

        lage = new JLabel("Age* :");
        lage.setBounds(100, 470, 200, 40);
        lage.setFont(new Font("Verdana", Font.BOLD, 20));
        f2.add(lage);
        age = new JTextField();
        age.setBounds(300, 470, 350, 50);
        age.setFont(new Font("Verdana", Font.BOLD, 16));
        age.setBorder(blackline);
        f2.add(age);

        lemail = new JLabel("Email* :");
        lemail.setBounds(100, 560, 200, 40);
        lemail.setFont(new Font("Verdana", Font.BOLD, 20));
        f2.add(lemail);
        email = new JTextField();
        email.setBounds(300, 560, 350, 50);
        email.setFont(new Font("Verdana", Font.BOLD, 16));
        email.setBorder(blackline);
        f2.add(email);

        ldrname = new JLabel("Doctor Name :");
        ldrname.setBounds(100, 650, 200, 40);
        ldrname.setFont(new Font("Verdana", Font.BOLD, 20));
        f2.add(ldrname);
        drname = new JTextField();
        drname.setBounds(300, 650, 350, 50);
        drname.setFont(new Font("Verdana", Font.BOLD, 16));
        drname.setBorder(blackline);
        f2.add(drname);

        lexp_date = new JLabel("Expected Date :");
        lexp_date.setBounds(100, 740, 200, 40);
        lexp_date.setFont(new Font("Verdana", Font.BOLD, 20));
        f2.add(lexp_date);
        exp_date = new JTextField();
        exp_date.setBounds(300, 740, 350, 50);
        exp_date.setFont(new Font("Verdana", Font.BOLD, 16));
        exp_date.setBorder(blackline);
        f2.add(exp_date);

        gender = new JLabel("Gender :");
        gender.setFont(new Font("Verdana", Font.BOLD, 20));
        gender.setBounds(100, 830, 200, 40);
        f2.add(gender);
        r7 = new JRadioButton("Male");
        r7.setFont(new Font("Verdana", Font.BOLD, 20));
        r7.setBackground(Color.cyan);
        r7.setBounds(300, 830, 100, 50);
        f2.add(r7);
        r8 = new JRadioButton("Female");
        r8.setFont(new Font("Verdana", Font.BOLD, 20));
        r8.setBackground(Color.cyan);
        r8.setBounds(430, 830, 200, 50);
        f2.add(r8);

        ldesc = new JLabel("Description :");
        ldesc.setBounds(1150, 200, 200, 40);
        ldesc.setFont(new Font("Verdana", Font.BOLD, 20));
        f2.add(ldesc);
        desc = new JTextArea();
        desc.setBounds(1150, 250, 700, 200);
        desc.setFont(new Font("Verdana", Font.BOLD, 20));
        desc.setBorder(blackline);
        f2.add(desc);

        lby = new JLabel("Form Filled By :");
        lby.setFont(new Font("Verdana", Font.BOLD, 20));
        lby.setBounds(1150, 510, 400, 40);
        f2.add(lby);
        String[] li = { "Mr.Date S.V.", "Mrs.Kamat D.P.", "Mr.Bhosle P.C.", "Mr.Jadhav S.L." };
        JComboBox by4 = new JComboBox<>(li);
        by4.setFont(new Font("Verdana", Font.BOLD, 16));
        by4.setBorder(blackline);
        by4.setBounds(1500, 510, 300, 40);
        f2.add(by4);

        l33 = new JLabel("1.Once appoinment form get verified then email and message");
        l34 = new JLabel("will send on registered \nemail and phone number.");
        l35 = new JLabel("2.If there is change in date other than your expecting date.");
        l36 = new JLabel("then we will inform you via same mode of contact.");
        l37 = new JLabel("3.For further query contact on our email or phnno.          ");
        l38 = new JLabel("----> Instructions <----");
        pan32 = new JPanel();
        l38.setForeground(Color.white);
        l38.setFont(new Font("Verdana", Font.BOLD, 24));
        pan32.add(l38);
        l33.setFont(new Font("Verdana", Font.BOLD, 20));
        l33.setForeground(Color.white);
        pan32.add(l33);
        l34.setFont(new Font("Verdana", Font.BOLD, 20));
        l34.setForeground(Color.white);
        pan32.add(l34);
        l35.setFont(new Font("Verdana", Font.BOLD, 20));
        l35.setForeground(Color.white);
        pan32.add(l35);
        l36.setFont(new Font("Verdana", Font.BOLD, 20));
        l36.setForeground(Color.white);
        pan32.add(l36);
        l37.setFont(new Font("Verdana", Font.BOLD, 20));
        l37.setForeground(Color.white);
        pan32.add(l37);
        pan32.setBounds(1150, 580, 700, 230);
        pan32.setBackground(lib);
        pan32.setBorder(blackline);
        f2.add(pan32);

        btn6 = new JButton("Submit & Review");
        btn6.setBackground(lib);
        btn6.setForeground(Color.white);
        btn6.setBounds(750, 870, 400, 50);
        btn6.setFont(new Font("Verdana", Font.BOLD, 20));
        f2.add(btn6);

        btn6.addActionListener(l -> {
            String prname = name.getText();
            String premail = email.getText();
            String prage = age.getText();
            String pradd = address.getText();
            String prdesc = desc.getText();
            String prref = drname.getText();
            String prto = exp_date.getText();
            String pcon = con.getText();
            int a = by4.getSelectedIndex();
            String prfillby = li[a];

            if (prname.length() > 0 && premail.length() > 0 && prage.length() > 0 && pradd.length() > 0
                    && pcon.length() > 0) {

                JFrame f11 = new JFrame();
                f11.getContentPane().setBackground(Color.cyan);

                f11.setSize(1930, 1080);
                f11.setVisible(true);
                f11.setLayout(null);
                // 7f11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JOptionPane.showMessageDialog(f2, "your Form Is submitted Sucessfully press ok to review",
                        "Confirmation", JOptionPane.INFORMATION_MESSAGE);

                JLabel l23 = new JLabel(spaces + "Rewiew Of Appoinment Form" + spaces);
                l23.setFont(new Font("Verdana", Font.BOLD, 50));
                l23.setForeground(Color.white);
                JPanel pan23 = new JPanel();
                ImageIcon img11 = new ImageIcon("1.jpg");
                JLabel backg11 = new JLabel(img11);
                pan23.add(backg11);
                pan23.setBackground(lib);
                pan23.add(l23);
                pan23.setBounds(10, 10, 1900, 80);
                JLabel backg21 = new JLabel(img11);
                pan23.add(backg21);
                f11.add(pan23);

                // f1.setExtendedState(MAXIMIZED_BOTH);

                JLabel name1, add1, email1, age1, desc1, ref1, to1, con1, fillby1;
                JLabel dname1, dadd1, demail1, dage1, ddesc1, dref1, dto1, dcon1, dfillby1;
                name1 = new JLabel("Patient Name: ");
                name1.setBounds(750, 200, 200, 40);
                name1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(name1);
                dname1 = new JLabel(prname);
                dname1.setBounds(950, 200, 350, 50);
                dname1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(dname1);

                add1 = new JLabel("Address : ");
                add1.setBounds(750, 260, 200, 40);
                add1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(add1);
                dadd1 = new JLabel(pradd);
                dadd1.setBounds(950, 260, 350, 50);
                dadd1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(dadd1);

                email1 = new JLabel("Email : ");
                email1.setBounds(750, 320, 200, 40);
                email1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(email1);
                demail1 = new JLabel(premail);
                demail1.setBounds(950, 320, 350, 50);
                demail1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(demail1);

                con1 = new JLabel("Contact : ");
                con1.setBounds(750, 380, 200, 40);
                con1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(con1);
                dcon1 = new JLabel(pcon);
                dcon1.setBounds(950, 380, 350, 50);
                dcon1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(dcon1);

                ref1 = new JLabel("Doctor Name : ");
                ref1.setBounds(750, 460, 200, 40);
                ref1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(ref1);
                dref1 = new JLabel(prref);
                dref1.setBounds(950, 460, 350, 50);
                dref1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(dref1);

                to1 = new JLabel("Expexted date : ");
                to1.setBounds(750, 520, 200, 40);
                to1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(to1);
                dto1 = new JLabel(prto);
                dto1.setBounds(950, 520, 350, 50);
                dto1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(dto1);

                age1 = new JLabel("Age : ");
                age1.setBounds(750, 580, 200, 40);
                age1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(age1);
                dage1 = new JLabel(prage);
                dage1.setBounds(950, 580, 350, 50);
                dage1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(dage1);

                fillby1 = new JLabel("Form Filled By :");
                fillby1.setBounds(750, 640, 200, 40);
                fillby1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(fillby1);
                dfillby1 = new JLabel(prfillby);
                dfillby1.setBounds(950, 640, 350, 50);
                dfillby1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(dfillby1);

                desc1 = new JLabel("Desceiption : ");
                desc1.setBounds(750, 700, 200, 40);
                desc1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(desc1);
                ddesc1 = new JLabel(prdesc);
                ddesc1.setBounds(950, 700, 350, 50);
                ddesc1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(ddesc1);
            } else {
                JOptionPane.showMessageDialog(f2, "Enter All Mandatory Details.", "Incomplete",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        });

    }

}
