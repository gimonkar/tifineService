package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Mess_system {
    List<One_fifty_thali> t = new ArrayList<>();

    public void add_new_thali(One_fifty_thali thali)throws Exception {
        String query = "insert into one_fifty_thali(price,dish1,dish2,dish3,dish4,dish5) values (?,?,?,?,?,?)";
        Connection connection = Conn.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,thali.getPrice());
        preparedStatement.setString(2,thali.getDish1());
        preparedStatement.setString(3,thali.getDish2());
        preparedStatement.setString(4,thali.getDish3());
        preparedStatement.setString(5,thali.getDish4());
        preparedStatement.setString(6,thali.getDish5());

        int update = preparedStatement.executeUpdate();
//        System.out.println("rows affected: "+ update);
    }

    public List<One_fifty_thali> get_thali() throws Exception{
        String query = "select * from one_fifty_thali";
        Connection connection = Conn.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            One_fifty_thali th= new One_fifty_thali();
            th.setThali_no(resultSet.getInt("thali_no"));
            th.setPrice(resultSet.getInt("price"));
            th.setDish1(resultSet.getString("dish1"));
            th.setDish2(resultSet.getString("dish2"));
            th.setDish3(resultSet.getString("dish3"));
            th.setDish4(resultSet.getString("dish4"));
            th.setDish5(resultSet.getString("dish5"));
            t.add(th);
        }
        return t;
    }
}
