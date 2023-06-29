package ru.tanya;

import javax.swing.*;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {

    private JPanel panel1;
    private JButton button1;
    private JButton button2;

    public static void main(String[] args) {

        //форма
        JFrame сalcFrame = new JFrame("КАЛЬКУЛЯТОР 2");
        сalcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        сalcFrame.setSize(338, 511);
        сalcFrame.setCursor(Cursor.HAND_CURSOR);


        UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
       /*
        for (UIManager.LookAndFeelInfo look : looks) {
            System.out.println(look.getClassName());
        }

        */

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        } catch (Exception e) {
            System.out.println("Look and Feel not set");
        }




        сalcFrame.setLayout(new GridLayout(3,1));
        сalcFrame.setVisible(true);

        //панельки
        JPanel panel1= new JPanel();
        //panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
        //panel1.setLayout(new FlowLayout());
        panel1.setLayout(new GridLayout(3,4));
        JPanel panel2= new JPanel();
        panel2.setLayout(new FlowLayout());
        JPanel panel3= new JPanel();
        panel3.setLayout(new GridLayout(3,4));

        panel2.setBackground(Color.PINK);

        сalcFrame.add(panel2);
        сalcFrame.add(panel3);
        сalcFrame.add(panel1);

        //боттомы
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");

        JButton brr1 = new JButton("?");
        JButton brr2 = new JButton("?");
        JButton brr3 = new JButton("?");
        JButton brr4 = new JButton("?");
        JButton brr5 = new JButton("?");
        JButton brr6 = new JButton("?");
        JButton brr7 = new JButton("?");
        JButton brr8 = new JButton("?");

        JButton bSter = new JButton("<");


        JButton buttonPs = new JButton("+");
        JButton buttonMin = new JButton("-");
        JButton buttonMnoj = new JButton("*");
        JButton buttonDel = new JButton("/");
        JButton buttonRavn = new JButton("=");


        //lable


        JLabel t1;
        t1 = new JLabel("1");
        t1.setBounds(40,40,90,20);

        JLabel tqq;
        tqq = new JLabel("?");
        tqq.setBounds(40,40,90,20);

        JLabel t2;
        t2 = new JLabel("11");
        t2.setBounds(200,80,90,20);

        JLabel tRavn;
        tRavn = new JLabel("=");
        tRavn.setBounds(40,40,90,20);

        JLabel t3;
        t3 = new JLabel("?");
        t3.setBounds(200,80,90,20);

        //adds

        panel2.add(t1);
        panel2.add(tqq);
        panel2.add(t2);
        panel2.add(tRavn);
        panel2.add(t3);

        panel3.add(brr1);
        panel3.add(brr2);
        panel3.add(brr3);
        panel3.add(bSter);
        panel3.add(brr4);
        panel3.add(brr5);
        panel3.add(brr6);

        panel3.add(buttonDel);

        panel3.add(button7);
        panel3.add(button8);
        panel3.add(button9);

        panel3.add(buttonMnoj);


        panel1.add(button4);
        panel1.add(button5);
        panel1.add(button6);
        panel1.add(buttonMin);

        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(buttonPs);
        panel1.add(brr7);
        panel1.add(button0);
        panel1.add(brr8);

        panel1.add(buttonRavn);




        //ивенты

        buttonRavn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                var label = t1.getText();
                int x = Integer.parseInt(label);
                var label2 = t2.getText();
                int z = Integer.parseInt(label2);


                var Plus = Integer.toString(x+z);
                var Min = Integer.toString(x-z);
                var Mnoj = Integer.toString(x*z);
                var Del = Integer.toString(x/z);

                String Proverka = tqq.getText();
                if (Proverka == "+") {
                    t3.setText(Plus);
                }
                else if (Proverka == "-") {
                    t3.setText(Min);
                }
                else if (Proverka == "*") {
                    t3.setText(Mnoj);
                }
                else if (Proverka == "/") {
                    t3.setText(Del);
                }
            }
        });

        buttonPs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tqq.setText("+");

                /*
                JLabel tGet;
                tGet = new JLabel(CalcFrame.getBounds().toString());
                panel2.add(tGet);
                 */

            }
        });
        buttonMin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tqq.setText("-");

            }
        });
        buttonMnoj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tqq.setText("*");

            }
        });
        buttonDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tqq.setText("/");

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Proverka = tqq.getText();
                if (!(Proverka != "?")) {
                    var o = (JButton) e.getSource();
                    var label = o.getText();
                    t1.setText(t1.getText() + label);
                }
                else {
                    var o = (JButton) e.getSource();
                    var label = o.getText();
                    t2.setText(t2.getText() + label);
                }

            }
        });



    }

}