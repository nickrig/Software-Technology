package com.applic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App2 extends JFrame
{
    private JPanel MainPanelApp2;
    private JButton showInterestedStudentsWithButton;
    private JButton showInterestedStudentsWithButton3;
    private JButton showInterestedStudentsWithButton1;
    private JButton showAllInterestedStudentsButton;
    private JList listFoithtes;
    private JButton giveRecommendationButton;
    private JButton nextButton;
    private JList listRecommandations;
    static ArrayList<Foithths> foithtes;
    static List<List<String>> Bathmoi = new ArrayList<>();
    private DefaultListModel listModel = new DefaultListModel();
    private DefaultListModel listModel2 = new DefaultListModel();
    static ArrayList<String> selectedFoithtes;

    App2()
    {
        super("Letter Of Recommendation");
        this.setContentPane(this.MainPanelApp2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        foithtes = new ArrayList<Foithths>();
        listFoithtes.setModel(listModel);


        selectedFoithtes = new ArrayList<String>();

        showInterestedStudentsWithButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                listModel.removeAllElements();
                System.out.println("Removing all students from list");
                for(Foithths f: foithtes)
                {
                    if(f.getMO()==7)
                    {
                        System.out.println("Adding student to list: " + f.getAM());
                        listModel.addElement("AM: "+f.getAM()+", ΟΝΟΜΑ: "+f.getFirst_Name()+ "  "+ f.getLast_Name()+", ΜΟ:  "+f.getMO());
                    }
                }

            }
        });
        showInterestedStudentsWithButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                listModel.removeAllElements();
                System.out.println("Removing all students from list");
                for(Foithths f: foithtes)
                {
                    if(f.getMO()==8)
                    {
                        System.out.println("Adding student to list: " + f.getAM());
                        listModel.addElement("AM: "+f.getAM()+", ΟΝΟΜΑ: "+f.getFirst_Name()+ "  "+ f.getLast_Name()+", ΜΟ:  "+f.getMO());
                    }
                }

            }
        });
        showInterestedStudentsWithButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                listModel.removeAllElements();
                System.out.println("Removing all students from list");
                for(Foithths f: foithtes)
                {
                    if(f.getMO()==9)
                    {
                        System.out.println("Adding student to list: " + f.getAM());
                        listModel.addElement("AM: "+f.getAM()+", ΟΝΟΜΑ: "+f.getFirst_Name()+ "  "+ f.getLast_Name()+", ΜΟ:  "+f.getMO());
                    }
                }

            }
        });
        showAllInterestedStudentsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                listModel.removeAllElements();
                System.out.println("Removing all students from list");
                for(Foithths f: foithtes)
                {
                    System.out.println("Adding student to list: "+f.getAM());
                    listModel.addElement("AM: "+f.getAM()+", ΟΝΟΜΑ: "+f.getFirst_Name()+ "  "+ f.getLast_Name()+", ΜΟ:  "+f.getMO());
                }
            }
        });
        giveRecommendationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                listModel2.addElement(listFoithtes.getSelectedValue());
                listRecommandations.setModel(listModel2);

            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                App3 app3 = new App3();
                app3.setVisible(true);

                for(int i=0;i<listModel2.getSize();i++)
                {
                    app3.listModelCandidates.addElement(listModel2.getElementAt(i));
                    app3.listSelectedCandidates.setModel(app3.listModelCandidates);
                }
                dispose();
            }
        });
    }

    public void refreshFoithtesList()
    {
        listModel.removeAllElements();
        System.out.println("Removing all students from list");
        for(Foithths f: foithtes)
        {
            System.out.println("Adding student to list: "+f.getAM());
            listModel.addElement("AM: "+f.getAM()+", ΟΝΟΜΑ: "+f.getFirst_Name()+ "  "+ f.getLast_Name()+", ΜΟ:  "+f.getMO());
        }
    }


    public void addFoithth(Foithths f)

    {
        foithtes.add(f);
    }


    public void PinakasFoithtwn()
    {
        App2 app2 = new App2();
        InputStream res = app2.getClass().getResourceAsStream("Bathmologies.txt");
        Scanner inputStream;

        try{
            inputStream = new Scanner(res);

            while(inputStream.hasNext()){
                String line= inputStream.next();
                String[] values = line.split(",");
                // this adds the currently parsed line to the 2-dimensional string array
                Bathmoi.add(Arrays.asList(values));
            }

            inputStream.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args)
    {
        App2 app2 = new App2();
        app2.setVisible(true);
    }
}
