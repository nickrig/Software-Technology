package com.applic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class App3 extends JFrame
{

    public JList listSelectedCandidates;
    private JButton giveType1RecommendationButton;
    private JButton giveType2RecommendationButton;
    private JButton giveType3RecommendationButton;
    private JButton sendAllRecommendationsButton;
    private JList listType1;
    private JList listType2;
    private JList listType3;
    private JPanel Panel3;
    private JButton backButton;
    public DefaultListModel listModelCandidates = new DefaultListModel();
    private DefaultListModel listModelType1 = new DefaultListModel();
    private DefaultListModel listModelType2 = new DefaultListModel();
    private DefaultListModel listModelType3 = new DefaultListModel();


    App3()
    {
        super("Letter Of Recommendation");
        this.setContentPane(this.Panel3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        giveType1RecommendationButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                listModelType1.addElement(listSelectedCandidates.getSelectedValue());
                listType1.setModel(listModelType1);
                int index = listSelectedCandidates.getSelectedIndex();
                if(index >= 0){ //Remove only if a particular item is selected
                    listModelCandidates.removeElementAt(index);
                }
            }
        });
        giveType2RecommendationButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                listModelType2.addElement(listSelectedCandidates.getSelectedValue());
                listType2.setModel(listModelType2);
                int index = listSelectedCandidates.getSelectedIndex();
                if(index >= 0){ //Remove only if a particular item is selected
                    listModelCandidates.removeElementAt(index);
                }
            }
        });
        giveType3RecommendationButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                listModelType3.addElement(listSelectedCandidates.getSelectedValue());
                listType3.setModel(listModelType3);
                int index = listSelectedCandidates.getSelectedIndex();
                if(index >= 0){ //Remove only if a particular item is selected
                    listModelCandidates.removeElementAt(index);
                }
            }
        });
        sendAllRecommendationsButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "Recommendations sent successfully!");
                System.exit(1);
            }
        });
        backButton.addActionListener(new ActionListener()
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
}
