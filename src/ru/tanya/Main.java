package ru.tanya;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import javax.swing.*;
import java.awt.event.*;
public class Main  extends JPanel {

    public static void main(String[] args) {

        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.


                JFrame MFrame = new JFrame("КАЛЬКУЛЯТОР!!!");
        MFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MFrame.setSize(400,500);
        MFrame.setLayout(null);
        MFrame.setVisible(true);

        Calc calc = new Calc();


        /*
        JPanel JP = new JPanel();
        JP.setLayout(new FlowLayout());
        MFrame.add(JP);
         */

        //кнопки

        JButton b1 = new JButton("1");
        b1.setBounds(40,130,50,50);
        MFrame.add(b1);

        JButton b2 = new JButton("2");
        b2.setBounds(40,190,50,50);
        MFrame.add(b2);
        JButton b3 = new JButton("3");
        b3.setBounds(40,250,50,50);
        MFrame.add(b3);
        JButton b4 = new JButton("4");
        b4.setBounds(100,130,50,50);
        MFrame.add(b4);
        JButton b5 = new JButton("5");
        b5.setBounds(100,190,50,50);
        MFrame.add(b5);
        JButton b6 = new JButton("6");
        b6.setBounds(100,250,50,50);
        MFrame.add(b6);
        JButton b7 = new JButton("7");
        b7.setBounds(160,130,50,50);
        MFrame.add(b7);
        JButton b8 = new JButton("8");
        b8.setBounds(160,190,50,50);
        MFrame.add(b8);
        JButton b9 = new JButton("9");
        b9.setBounds(160,250,50,50);
        MFrame.add(b9);
        JButton b0 = new JButton("0");
        b0.setBounds(100,310,50,50);
        MFrame.add(b0);

        JButton bPs = new JButton("+");
        bPs.setBounds(220,130,70,50);
        MFrame.add(bPs);




        //lable
        JLabel t1;
        t1 = new JLabel("1");
        t1.setBounds(40,40,90,20);
        MFrame.add(t1);

        JLabel t2;
        t2 = new JLabel("11");
        t2.setBounds(200,80,90,20);
        MFrame.add(t2);

        //textarea
        JTextArea jt1 = new JTextArea();
        jt1.setBounds(40,40,90,20);
        MFrame.add(jt1);

        JTextArea jt2 = new JTextArea();
        jt2.setBounds(200,40,90,20);
        MFrame.add(jt2);




        //ивенты
        bPs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                var label = t1.getText();
                int x = Integer.parseInt(label);

                var label2 = jt2.getText();
                int z = Integer.parseInt(label2);


                var U = Integer.toString(x+z);



                t2.setText(U);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                var o = (JButton) e.getSource();
                var label = o.getText();
                t1.setText(t1.getText()+ label);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                var o = (JButton) e.getSource();
                var label = o.getText();
                t1.setText(t1.getText()+ label);
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                var o = (JButton) e.getSource();
                var label = o.getText();
                t1.setText(t1.getText()+ label);
            }
        });
    }

}