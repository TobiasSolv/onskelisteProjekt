package com.example.onskelisteprojekt.repository;

import com.example.onskelisteprojekt.model.Ønskeliste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ØnskelisteRepository {

    private Connection conn = DatabaseConnectionManager.getConnection();



    public List<Ønskeliste> getØnskelistes()  {

        List<Ønskeliste> ønskelistes = new ArrayList<>();

        try {
            PreparedStatement psts = conn.prepareStatement("SELECT * FROM ønskeliste");
            ResultSet resultSet = psts.executeQuery();

            while (resultSet.next()) {
                ønskelistes.add(new Ønskeliste(
                        resultSet.getString("wish")
                ));
            }

            }catch(SQLException e){
            throw new RuntimeException(e);

        }
        return ønskelistes;
    }

    public void create(Ønskeliste ønskeliste)  {

        try {
            PreparedStatement psts = conn.prepareStatement("INSERT INTO øskeliste (wish) values (?)");
            psts.setString(1,ønskeliste.getWish());
            psts.executeUpdate();


        } catch (SQLException e){
            throw new RuntimeException(e);
        }


    }

}
