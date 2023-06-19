package pack;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class pr21 {

    public void pr() {
        JFrame f1;
        JLabel l21, l22, lname, lcity, lstate, ladd, lemail, lcon;
        JLabel lgender, lage, ldesc, ldia, lhyper, lappo, lredr, ltodr, lnamep, lrela, lconp;
        JPanel pan21;
        JTextField name, city, email, age, refdr, todr, con, namep, rela, conp;
        JTextArea add, desc, appo;
        JComboBox st;
        JRadioButton r1, r2, r3, r4, r5, r6;
        JCheckBox check1;
        JButton btn5;

        // FlowLayout layout = new FlowLayout();
        f1 = new JFrame();
        f1.getContentPane().setBackground(Color.cyan);
        // f1.setExtendedState(MAXIMIZED_BOTH);
        f1.setSize(1930, 1080);
        f1.setVisible(true);
        f1.setLayout(null);
        // f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color lib = new Color(51, 51, 255);

        Border blackline = BorderFactory.createLineBorder(Color.black);
        String spaces = "        ";
        l21 = new JLabel(spaces + "Application form for patient" + spaces);
        l21.setFont(new Font("Verdana", Font.BOLD, 50));
        l21.setForeground(Color.white);
        pan21 = new JPanel();
        ImageIcon img1 = new ImageIcon("1.jpg");
        JLabel backg1 = new JLabel(img1);
        pan21.add(backg1);
        pan21.setBackground(lib);
        pan21.add(l21);
        pan21.setBorder(blackline);
        JLabel backg2 = new JLabel(img1);
        pan21.add(backg2);
        pan21.setBounds(10, 10, 1900, 80);
        f1.add(pan21);

        l22 = new JLabel("PATIENT DEMOGRAPHICS");
        l22.setFont(new Font("Verdana", Font.BOLD, 20));
        l22.setBounds(800, 140, 350, 30);
        f1.add(l22);

        lname = new JLabel("Patient Name* :");
        lname.setBounds(50, 200, 200, 40);
        lname.setFont(new Font("Verdana", Font.BOLD, 18));
        f1.add(lname);
        name = new JTextField();
        name.setBounds(220, 200, 350, 50);
        name.setFont(new Font("Verdana", Font.BOLD, 18));
        name.setBorder(blackline);
        f1.add(name);

        ladd = new JLabel("Address* :");
        ladd.setBounds(680, 200, 200, 40);
        ladd.setFont(new Font("Verdana", Font.BOLD, 18));
        f1.add(ladd);
        add = new JTextArea();
        add.setBounds(800, 200, 400, 50);
        add.setFont(new Font("Verdana", Font.BOLD, 16));
        add.setBorder(blackline);
        f1.add(add);

        lcity = new JLabel("City* :");
        lcity.setBounds(1280, 200, 200, 40);
        lcity.setFont(new Font("Verdana", Font.BOLD, 18));
        f1.add(lcity);
        city = new JTextField();
        city.setBounds(1360, 200, 350, 50);
        city.setFont(new Font("Verdana", Font.BOLD, 18));
        city.setBorder(blackline);
        f1.add(city);

        lstate = new JLabel("State :");
        lstate.setFont(new Font("Verdana", Font.BOLD, 18));
        lstate.setBounds(50, 290, 200, 40);
        f1.add(lstate);
        String[] li1 = { "Andhra Pradesh", "Andaman and Nicobar", "Arunachal Pradesh", "Assam", "Bihar", "Chandigarh",
                "Chhattisgarh", "Dadar and Nagar Haveli", "Daman and Diu", "Delhi", "Lakshadweep", "Puducherry", "Goa",
                "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", " Kerala",
                "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab",
                "Rajasthan", "Sikkim", "TamilNadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand",
                "West Bengal" };
        st = new JComboBox<>(li1);
        st.setFont(new Font("Verdana", Font.BOLD, 16));
        st.setBorder(blackline);
        st.setBounds(210, 290, 350, 50);
        f1.add(st);

        lgender = new JLabel("Gender :");
        lgender.setFont(new Font("Verdana", Font.BOLD, 18));
        lgender.setBounds(680, 290, 200, 40);
        f1.add(lgender);
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Verdana", Font.BOLD, 18));
        r1.setBackground(Color.cyan);
        r1.setBounds(800, 290, 100, 50);
        f1.add(r1);
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Verdana", Font.BOLD, 18));
        r2.setBackground(Color.cyan);
        r2.setBounds(920, 290, 100, 50);
        f1.add(r2);

        lemail = new JLabel("Email* :");
        lemail.setBounds(1280, 290, 200, 40);
        lemail.setFont(new Font("Verdana", Font.BOLD, 18));
        f1.add(lemail);
        email = new JTextField();
        email.setBounds(1360, 290, 350, 50);
        email.setFont(new Font("Verdana", Font.BOLD, 16));
        email.setBorder(blackline);
        f1.add(email);

        lage = new JLabel("Age* :");
        lage.setBounds(50, 380, 200, 40);
        lage.setFont(new Font("Verdana", Font.BOLD, 18));
        f1.add(lage);
        age = new JTextField();
        age.setBounds(210, 380, 350, 50);
        age.setFont(new Font("Verdana", Font.BOLD, 18));
        age.setBorder(blackline);
        f1.add(age);

        ldesc = new JLabel("Description of Disease :");
        ldesc.setBounds(680, 380, 300, 40);
        ldesc.setFont(new Font("Verdana", Font.BOLD, 18));
        f1.add(ldesc);
        desc = new JTextArea();
        desc.setBounds(940, 380, 800, 90);
        desc.setFont(new Font("Verdana", Font.BOLD, 18));
        desc.setBorder(blackline);
        f1.add(desc);

        ldia = new JLabel("Diabetes :");
        ldia.setFont(new Font("Verdana", Font.BOLD, 18));
        ldia.setBounds(50, 530, 200, 40);
        f1.add(ldia);
        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Verdana", Font.BOLD, 18));
        r3.setBackground(Color.cyan);
        r3.setBounds(210, 530, 100, 50);
        f1.add(r3);
        r4 = new JRadioButton("No");
        r4.setFont(new Font("Verdana", Font.BOLD, 18));
        r4.setBackground(Color.cyan);
        r4.setBounds(340, 530, 100, 50);
        f1.add(r4);

        lhyper = new JLabel("Hypertension :");
        lhyper.setFont(new Font("Verdana", Font.BOLD, 18));
        lhyper.setBounds(50, 600, 200, 40);
        f1.add(lhyper);
        r5 = new JRadioButton("Yes");
        r5.setFont(new Font("Verdana", Font.BOLD, 18));
        r5.setBackground(Color.cyan);
        r5.setBounds(210, 600, 100, 50);
        f1.add(r5);
        r6 = new JRadioButton("No");
        r6.setFont(new Font("Verdana", Font.BOLD, 18));
        r6.setBackground(Color.cyan);
        r6.setBounds(340, 600, 100, 50);
        f1.add(r6);

        lappo = new JLabel("Appoinment Description :");
        lappo.setBounds(680, 530, 300, 40);
        lappo.setFont(new Font("Verdana", Font.BOLD, 18));
        f1.add(lappo);
        appo = new JTextArea();
        appo.setBounds(950, 530, 800, 100);
        appo.setFont(new Font("Verdana", Font.BOLD, 18));
        appo.setBorder(blackline);
        f1.add(appo);

        lredr = new JLabel("Referred By :");
        lredr.setBounds(50, 690, 200, 40);
        lredr.setFont(new Font("Verdana", Font.BOLD, 18));
        f1.add(lredr);
        refdr = new JTextField();
        refdr.setBounds(210, 690, 350, 50);
        refdr.setFont(new Font("Verdana", Font.BOLD, 18));
        refdr.setBorder(blackline);
        f1.add(refdr);

        ltodr = new JLabel("Referred To :");
        ltodr.setBounds(680, 690, 200, 40);
        ltodr.setFont(new Font("Verdana", Font.BOLD, 18));
        f1.add(ltodr);
        todr = new JTextField();
        todr.setBounds(840, 690, 400, 50);
        todr.setFont(new Font("Verdana", Font.BOLD, 16));
        todr.setBorder(blackline);
        f1.add(todr);

        lcon = new JLabel("Contact* :");
        lcon.setBounds(1280, 690, 200, 40);
        lcon.setFont(new Font("Verdana", Font.BOLD, 18));
        f1.add(lcon);
        con = new JTextField();
        con.setBounds(1390, 690, 350, 50);
        con.setFont(new Font("Verdana", Font.BOLD, 18));
        con.setBorder(blackline);
        f1.add(con);

        lredr = new JLabel("Person's Details Who going to Stay with Patient :");
        lredr.setBounds(50, 780, 600, 40);
        lredr.setFont(new Font("Verdana", Font.BOLD, 18));
        f1.add(lredr);

        lnamep = new JLabel("Person's Name :");
        lnamep.setBounds(50, 850, 200, 40);
        lnamep.setFont(new Font("Verdana", Font.BOLD, 18));
        f1.add(lnamep);
        namep = new JTextField();
        namep.setBounds(220, 850, 350, 50);
        namep.setFont(new Font("Verdana", Font.BOLD, 18));
        namep.setBorder(blackline);
        f1.add(namep);

        lrela = new JLabel("Relation :");
        lrela.setBounds(680, 850, 200, 40);
        lrela.setFont(new Font("Verdana", Font.BOLD, 18));
        f1.add(lrela);
        rela = new JTextField();
        rela.setBounds(800, 850, 400, 50);
        rela.setFont(new Font("Verdana", Font.BOLD, 16));
        rela.setBorder(blackline);
        f1.add(rela);

        lconp = new JLabel("Contact :");
        lconp.setBounds(1280, 850, 200, 40);
        lconp.setFont(new Font("Verdana", Font.BOLD, 18));
        f1.add(lconp);
        conp = new JTextField();
        conp.setBounds(1380, 850, 350, 50);
        conp.setFont(new Font("Verdana", Font.BOLD, 18));
        conp.setBorder(blackline);
        f1.add(conp);

        check1 = new JCheckBox("The Information All Entered Is Correct And Rechecked by Patienst party.");
        check1.setBounds(50, 910, 900, 80);
        check1.setBorder(blackline);
        check1.setFont(new Font("Verdana", Font.BOLD, 18));
        check1.setBorder(blackline);
        check1.setBackground(Color.cyan);
        f1.add(check1);

        btn5 = new JButton("Submit");
        btn5.setBounds(1380, 910, 300, 50);
        f1.add(btn5);
        btn5.setFont(new Font("Verdana", Font.BOLD, 18));
        btn5.setForeground(Color.white);
        btn5.setBackground(lib);

        btn5.addActionListener(l -> {
            String prname = name.getText();
            String prcity = city.getText();
            int instate = st.getSelectedIndex();
            String prstate = li1[instate];
            String premail = email.getText();
            String prage = age.getText();
            String pradd = add.getText();
            String prdesc = desc.getText();
            String prref = refdr.getText();
            String prto = todr.getText();
            String pcon = con.getText();

            if (prname.length() > 0 && prcity.length() > 0 && prage.length() > 0 && premail.length() > 0
                    && pradd.length() > 0 && pcon.length() > 0) {
                JOptionPane.showMessageDialog(f1, "your Form Is submitted Sucessfully press ok to review",
                        "Confirmation", JOptionPane.INFORMATION_MESSAGE);
                JFrame f11 = new JFrame();

                f11.getContentPane().setBackground(Color.cyan);

                f11.setSize(1930, 1080);
                f11.setVisible(true);
                f11.setLayout(null);
                // f11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JLabel l23 = new JLabel(spaces + "Rewiew Of Patient Form" + spaces);
                l23.setFont(new Font("Verdana", Font.BOLD, 50));
                l23.setForeground(Color.white);
                JPanel pan23 = new JPanel();
                pan23.setBackground(lib);
                ImageIcon img11 = new ImageIcon("1.jpg");
                JLabel backg11 = new JLabel(img11);
                pan23.add(backg11);
                pan23.add(l23);
                pan23.setBounds(10, 10, 1900, 80);
                JLabel backg21 = new JLabel(img11);
                pan23.add(backg21);
                f11.add(pan23);

                // f1.setExtendedState(MAXIMIZED_BOTH);

                JLabel name1, city1, state1, add1, email1, age1, desc1, ref1, to1, con1;
                JLabel dname1, dcity1, dstate1, dadd1, demail1, dage1, ddesc1, dref1, dto1, dcon1;
                JButton btnb;
                name1 = new JLabel("Patient Name: ");
                name1.setBounds(50, 200, 200, 40);
                name1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(name1);
                dname1 = new JLabel(prname);
                dname1.setBounds(210, 200, 350, 50);
                dname1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(dname1);

                city1 = new JLabel("City : ");
                city1.setBounds(50, 260, 200, 40);
                city1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(city1);
                dcity1 = new JLabel(prcity);
                dcity1.setBounds(210, 260, 350, 50);
                dcity1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(dcity1);

                state1 = new JLabel("State : ");
                state1.setBounds(50, 320, 200, 40);
                state1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(state1);
                dstate1 = new JLabel(prstate);
                dstate1.setBounds(210, 320, 350, 50);
                dstate1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(dstate1);

                add1 = new JLabel("Address : ");
                add1.setBounds(50, 380, 200, 40);
                add1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(add1);
                dadd1 = new JLabel(pradd);
                dadd1.setBounds(210, 380, 350, 50);
                dadd1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(dadd1);

                age1 = new JLabel("Age : ");
                age1.setBounds(50, 460, 200, 40);
                age1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(age1);
                dage1 = new JLabel(prage);
                dage1.setBounds(210, 460, 350, 50);
                dage1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(dage1);

                email1 = new JLabel("Email : ");
                email1.setBounds(50, 520, 200, 40);
                email1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(email1);
                demail1 = new JLabel(premail);
                demail1.setBounds(210, 520, 350, 50);
                demail1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(demail1);

                ref1 = new JLabel("Referred By : ");
                ref1.setBounds(50, 580, 200, 40);
                ref1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(ref1);
                dref1 = new JLabel(prref);
                dref1.setBounds(210, 580, 350, 50);
                dref1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(dref1);

                to1 = new JLabel("Referred To : ");
                to1.setBounds(50, 640, 200, 40);
                to1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(to1);
                dto1 = new JLabel(prto);
                dto1.setBounds(210, 640, 350, 50);
                dto1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(dto1);

                con1 = new JLabel("Contact : ");
                con1.setBounds(50, 700, 200, 40);
                con1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(con1);
                dcon1 = new JLabel(pcon);
                dcon1.setBounds(210, 700, 350, 50);
                dcon1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(dcon1);

                desc1 = new JLabel("Description : ");
                desc1.setBounds(700, 200, 200, 40);
                desc1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(desc1);
                ddesc1 = new JLabel(prdesc);
                ddesc1.setBounds(820, 200, 350, 50);
                ddesc1.setFont(new Font("Verdana", Font.BOLD, 20));
                f11.add(ddesc1);

                btnb = new JButton("back");
                btnb.setBounds(210, 760, 200, 40);
                f11.add(btnb);
                btnb.setFont(new Font("Verdana", Font.BOLD, 18));
                btnb.setForeground(Color.white);
                btnb.setBackground(lib);

                btnb.addActionListener(k -> {
                    pr();

                });
            } else {
                JOptionPane.showMessageDialog(f1, "Enter All Mandatory Details.",
                        "Incomplete", JOptionPane.INFORMATION_MESSAGE);

            }
        });

    }

}
