package com.raksow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame("Stopnie Fahrenheit'a");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(512, 512);
        window.setLocationRelativeTo(null);
        window.setLayout(null);

        JLabel celsius = new JLabel("Stopnie celsjusza");
        celsius.setBounds(10, 10, 100, 40);
        window.add(celsius);

        JLabel fahr = new JLabel("");
        fahr.setBounds(10, 55, 350, 40);
        window.add(fahr);

        JTextField text = new JTextField();
        text.setBounds(120, 22, 100, 20);
        window.add(text);

        JButton button = new JButton("Zamień");
        button.setBounds(130, 45, 80, 20);
        window.add(button);

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String num = text.getText();

                double fah = 1.8 * Double.parseDouble(num) + 32.0;

                fahr.setText(num+ " Stopni celsjusza to " +fah+ " stopni fahrenheit'a");
            }
        });

        window.setVisible(true);
    }
}
