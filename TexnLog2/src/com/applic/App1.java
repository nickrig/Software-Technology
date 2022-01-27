package com.applic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class App1 extends JFrame{
    private JPanel PanelApp1;
    private JButton showInterestedStudentsButton;

    App1()
    {
        super("Letter Of Recommendation");
        this.setContentPane(this.PanelApp1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        showInterestedStudentsButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                App2 app2 = new App2();
                app2.setVisible(true);

                app2.PinakasFoithtwn();

                for (int i=0;i<50;i++)
                {
                    Foithths f = new Foithths(parseInt(App2.Bathmoi.get(i).get(0)), App2.Bathmoi.get(i).get(1), App2.Bathmoi.get(i).get(2), parseInt(App2.Bathmoi.get(i).get(3)));
                    app2.addFoithth(f);

                }

                app2.refreshFoithtesList();

                dispose();
            }
        });
    }

    public static void main(String[] args)
    {
        App1 app1  = new App1();
        app1.setVisible(true);
    }
}
