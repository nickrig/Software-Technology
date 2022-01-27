package com.applic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionDatabase{
    public static void main(String[] args)
    {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=postgres";
            Connection con = DriverManager.getConnection(url);

            PreparedStatement stmt = con.prepareStatement("select AM,First_Name,Last_Name,MO from BathmoiFoithtwn");
            ResultSet Rs = stmt.executeQuery();

            while (Rs.next())
            {
                System.out.println(Rs.getString(1)+ " , "+Rs.getString(2)+ " , "+Rs.getString(3)+ " , "+Rs.getString(14));
            }
        }
        catch (Exception x)
        {
            System.out.println(x.getMessage());
        }
    }
}
