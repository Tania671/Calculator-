package ru.tanya;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc2 {
    private JPanel mainPanel;
    private JButton a0Button1;
    private JButton button2;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a0Button2;
    private JButton a6Button;
    private JButton button7;
    private JButton button8;
    private JButton a0Button;
    private JButton button11;
    private JButton button12;
    private JButton button9;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button15;
    private JButton a7Button;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton restartButton;
    private JButton a2Button;
    private JButton a3Button;
    private JButton button23;
    private JButton a1Button;
    private JLabel Label1;
    private JLabel Label2;
    private JLabel Label3;
    private JLabel Label5;

    public Calc2() {

        //var Plus =

        ActionListener BottActAct = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String bAct = "?";

                var o = (JButton) e.getSource();
                if (o == button23){
                    bAct ="+";
                }
                else if (o == button8) {
                    bAct="-";
                }
                else if (o == button15) {
                    bAct="*";
                }
                else if (o == button19) {
                    bAct="/";
                }

                button2.setText(bAct);
                Label1.setText("0");


            }
        };

        ActionListener BottAct = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                var o = (JButton) e.getSource();
                String bAct = button2.getText();
                var label = o.getText();
                String text1 = (Label1.getText()+label);
                String text0 = text1.substring(1);
                char qq0 = text1.charAt(0);
                String text = "0";


                if (qq0=='0') {
                    text = text0;
                }
                else {
                    text = text1;
                }


                    if (bAct == "?") {


                        Label1.setText(text);
                        a0Button1.setText(text);

                    } else {

                        Label1.setText(text);
                        a0Button2.setText(text);

                    }






            }
        };
        a1Button.addActionListener(BottAct);
        a2Button.addActionListener(BottAct);
        a3Button.addActionListener(BottAct);
        a4Button.addActionListener(BottAct);
        a5Button.addActionListener(BottAct);
        a6Button.addActionListener(BottAct);
        a7Button.addActionListener(BottAct);
        a8Button.addActionListener(BottAct);
        a9Button.addActionListener(BottAct);
        a0Button.addActionListener(BottAct);

        button23.addActionListener(BottActAct);
        button8.addActionListener(BottActAct);
        button15.addActionListener(BottActAct);
        button19.addActionListener(BottActAct);

        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                int x= Integer.parseInt(a0Button1.getText());
                int z= Integer.parseInt(a0Button2.getText());
                var Plus = Integer.toString(x+z);
                var Min = Integer.toString(x-z);
                var Mnoj = Integer.toString(x*z);
                var Del = Integer.toString(x/z);

                String Proverka = button2.getText();
                if (Proverka == "+") {
                    Label1.setText(Plus);
                }
                else if (Proverka == "-") {
                    Label1.setText(Min);
                }
                else if (Proverka == "*") {
                    Label1.setText(Mnoj);
                }
                else if (Proverka == "/") {
                    Label1.setText(Del);
                }

            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = Label1.getText().length();
                int number = length - 1;

                if ((length>0)&&(button2.getText()=="?")){
                    StringBuilder back = new StringBuilder(Label1.getText());
                    back.deleteCharAt(number);
                    Label1.setText(back.toString());
                    a0Button1.setText(back.toString());
                }
                else if ((length>0)&&!(button2.getText()=="?")){
                    StringBuilder back = new StringBuilder(Label1.getText());
                    back.deleteCharAt(number);
                    Label1.setText(back.toString());
                    a0Button2.setText(back.toString());
                }


            }
        });
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Label1.setText("0");
                a0Button1.setText("0");
                a0Button2.setText("0");
                button2.setText("?");
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Calc2 calc2 = new Calc2();
        jFrame.setContentPane(calc2.getMainPanel());
        jFrame.pack();
        jFrame.setVisible(true);

        UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo look : looks) {
            System.out.println(look.getClassName());
        }

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        } catch (Exception e) {
            System.out.println("Look and Feel not set");
        }


    }


}
