package pack;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class pr27 {
    public void disp() {
        JFrame f6;
        JLabel l71, l72, lchai, ldischai, ltrust, ldistrust, lsec, ldissec, ltre, ldistre, lpre, ldispre, ldean,
                ldisdean, l73, l74;
        // JTextField a;
        JPanel pan71, pan72, pan73, pan74;
        // JButton btn8, btn9;

        f6 = new JFrame();
        f6.getContentPane().setBackground(Color.cyan);
        f6.setSize(1930, 1080);
        f6.setVisible(true);
        f6.setLayout(null);
        //f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color lib = new Color(51,51,255);

        Border blackline = BorderFactory.createLineBorder(Color.black);
        String spaces = "        ";
        l71 = new JLabel(spaces + "Genral Body Of Hospital" + spaces);
        l71.setFont(new Font("Verdana", Font.BOLD, 50));
        l71.setForeground(Color.white);
        pan71 = new JPanel();
        ImageIcon img1 = new ImageIcon("1.jpg");
        JLabel backg1 = new JLabel(img1);
        backg1.setBounds(0, 10, 78, 78);
        pan71.add(backg1);
        pan71.setBackground(lib);
        pan71.setBorder(blackline);
        JLabel backg2 = new JLabel(img1);
        pan71.add(l71);
        pan71.add(backg2);
        pan71.setBounds(10, 10, 1900, 80);
        f6.add(pan71);

        l72 = new JLabel("Board Members");
        l72.setFont(new Font("Verdana", Font.BOLD, 24));
        l72.setForeground(Color.white);
        l72.setBounds(850, 140, 350, 40);
        f6.add(l72);
        pan72 = new JPanel();
        pan72.setBackground(lib);
        pan72.setBounds(780, 140, 350, 40);
        f6.add(pan72);
        pan72.setBorder(blackline);

        lchai = new JLabel("Chairman :");
        lchai.setBounds(110, 200, 200, 40);
        lchai.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(lchai);
        ldischai = new JLabel("Mr Jaykrishn Banarjee");
        ldischai.setBounds(270, 200, 350, 40);
        ldischai.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(ldischai);

        ltrust = new JLabel("Trustee :");
        ltrust.setBounds(740, 200, 200, 40);
        ltrust.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(ltrust);
        ldistrust = new JLabel("Mrs Shantipriya Rao");
        ldistrust.setBounds(860, 200, 400, 40);
        ldistrust.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(ldistrust);

        lsec = new JLabel("Secretary :");
        lsec.setBounds(1340, 200, 200, 40);
        lsec.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(lsec);
        ldissec = new JLabel("Mr Ramadas Ayangar");
        ldissec.setBounds(1470, 200, 350, 40);
        ldissec.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(ldissec);

        lpre = new JLabel("President :");
        lpre.setBounds(110, 290, 200, 40);
        lpre.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(lpre);
        ldispre = new JLabel("Dr Manohar Keni");
        ldispre.setBounds(270, 290, 350, 40);
        ldispre.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(ldispre);

        ltre = new JLabel("Tresurer :");
        ltre.setBounds(740, 290, 200, 40);
        ltre.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(ltre);
        ldistre = new JLabel("Mrs Pankaj Malhotra");
        ldistre.setBounds(860, 290, 300, 40);
        ldistre.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(ldistre);

        ldean = new JLabel("Dean :");
        ldean.setBounds(1340, 290, 200, 40);
        ldean.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(ldean);
        ldisdean = new JLabel("Dr Rajshree Devgire");
        ldisdean.setBounds(1420, 290, 350, 40);
        ldisdean.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(ldisdean);

        l73 = new JLabel("Department Head");
        l73.setFont(new Font("Verdana", Font.BOLD, 24));
        l73.setForeground(Color.white);
        l73.setBounds(830, 400, 350, 40);
        f6.add(l73);
        pan73 = new JPanel();
        pan73.setBackground(lib);
        pan73.setBounds(780, 400, 350, 40);
        f6.add(pan73);
        pan73.setBorder(blackline);

        JLabel depcard, depdiscard, depneuro, depdisneuro, deporth, depdisorth, depgas, depdisgas, dephaem, depdishaem,
                depmat, depdismat;
        JLabel depnap, depdisnap, depgyn, depdisgyn, depphy, depdisphy;

        depcard = new JLabel("Cardiology :");
        depcard.setBounds(110, 460, 200, 40);
        depcard.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depcard);
        depdiscard = new JLabel("Dr Tejas Bhardwaj");
        depdiscard.setBounds(270, 460, 350, 40);
        depdiscard.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depdiscard);

        depneuro = new JLabel("Neurology :");
        depneuro.setBounds(740, 460, 200, 40);
        depneuro.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depneuro);
        depdisneuro = new JLabel("Dr Radhika Sharma");
        depdisneuro.setBounds(900, 460, 400, 40);
        depdisneuro.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depdisneuro);

        deporth = new JLabel("Orthology :");
        deporth.setBounds(1340, 460, 200, 40);
        deporth.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(deporth);
        depdisorth = new JLabel("Dr Vinayak Rao");
        depdisorth.setBounds(1470, 460, 350, 40);
        depdisorth.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depdisorth);

        depgas = new JLabel("Gastrology :");
        depgas.setBounds(110, 550, 200, 40);
        depgas.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depgas);
        depdisgas = new JLabel("Dr Seema Das");
        depdisgas.setBounds(270, 550, 350, 40);
        depdisgas.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depdisgas);

        dephaem = new JLabel("Haematology :");
        dephaem.setBounds(740, 550, 200, 40);
        dephaem.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(dephaem);
        depdishaem = new JLabel("Dr Pranay Pawar");
        depdishaem.setBounds(920, 550, 400, 40);
        depdishaem.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depdishaem);

        depmat = new JLabel("Maternity :");
        depmat.setBounds(1340, 550, 200, 40);
        depmat.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depmat);
        depdismat = new JLabel("Dr Sakshi Gade");
        depdismat.setBounds(1470, 550, 350, 40);
        depdismat.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depdismat);

        depnap = new JLabel("Nephrology :");
        depnap.setBounds(110, 640, 200, 40);
        depnap.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depnap);
        depdisnap = new JLabel("Dr Harshal Parekh");
        depdisnap.setBounds(270, 640, 350, 40);
        depdisnap.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depdisnap);

        depgyn = new JLabel("Gynecology :");
        depgyn.setBounds(740, 640, 200, 40);
        depgyn.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depgyn);
        depdisgyn = new JLabel("Dr Vidya Pawar");
        depdisgyn.setBounds(900, 640, 400, 40);
        depdisgyn.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depdisgyn);

        depphy = new JLabel("Physiotherapy :");
        depphy.setBounds(1340, 640, 200, 40);
        depphy.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depphy);
        depdisphy = new JLabel("Dr Soufiya Shaikh");
        depdisphy.setBounds(1520, 640, 350, 40);
        depdisphy.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depdisphy);

        l74 = new JLabel("Other Staff Head");
        l74.setFont(new Font("Verdana", Font.BOLD, 24));
        l74.setBounds(830, 750, 350, 40);
        l74.setForeground(Color.white);
        f6.add(l74);
        pan74 = new JPanel();
        pan74.setBackground(lib);
        pan74.setBounds(780, 750, 350, 40);
        f6.add(pan74);
        pan74.setBorder(blackline);

        JLabel depsecu, depdissecu, depharma, depdisharma, deptech, depdistech;

        depsecu = new JLabel("Security :");
        depsecu.setBounds(110, 810, 200, 40);
        depsecu.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depsecu);
        depdissecu = new JLabel("Mr Sardar Singh");
        depdissecu.setBounds(270, 810, 350, 40);
        depdissecu.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depdissecu);

        depharma = new JLabel("Pharmacy :");
        depharma.setBounds(740, 810, 200, 40);
        depharma.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depharma);
        depdisharma = new JLabel("Shubhanhi JAdhav");
        depdisharma.setBounds(900, 810, 400, 40);
        depdisharma.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depdisharma);

        deptech = new JLabel("Technical :");
        deptech.setBounds(1340, 810, 200, 40);
        deptech.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(deptech);
        depdistech = new JLabel("Atharva Anandrao");
        depdistech.setBounds(1470, 810, 350, 40);
        depdistech.setFont(new Font("Verdana", Font.BOLD, 20));
        f6.add(depdistech);

        JButton btn = new JButton("Back");
        btn.setBounds(1470, 900, 300, 50);
        f6.add(btn);
        btn.setFont(new Font("Verdana", Font.BOLD, 18));
        btn.setForeground(Color.white);
        btn.setBackground(lib);

    }
}
