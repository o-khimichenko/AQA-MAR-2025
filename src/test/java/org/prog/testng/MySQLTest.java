package org.prog.testng;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.SneakyThrows;
import org.prog.dto.PersonDto;
import org.prog.dto.ResultDto;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.List;

//TODO: Install Docker and run SQL container (as today)
//TODO: create table GoodsId (int), GoodsName (varchar (255)), Goods_price (varchar)
//TODO: After you search for mobile phone in allo.ua, store its name and price to DB

public class MySQLTest {

    @SneakyThrows
    @Test
    public void sqlReadTest() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db",
                    "root", "password");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Persons");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("FirstName") + " " +
                        resultSet.getString("LastName"));
            }
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    @SneakyThrows
    @Test
    public void sqlWriteTest() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db",
                    "root", "password");
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO Persons (FirstName, LastName, Title, Gender, Nat) VALUES (?,?,?,?,?)");

            List<PersonDto> clients = getRandomClients(30);

            for (PersonDto client : clients) {
                statement.setString(1, client.getName().getFirst());
                statement.setString(2, client.getName().getLast());
                statement.setString(3, client.getName().getTitle());
                statement.setString(4, client.getGender());
                statement.setString(5, client.getNat());
                try {
                    statement.execute();
                } catch (SQLException e) {
                    System.out.println("Failed to store client " + client);
                }
            }
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    private List<PersonDto> getRandomClients(int amount) {
        RequestSpecification request = RestAssured.given();
        request.baseUri("https://randomuser.me");
        request.basePath("/api/");
        request.header("Content-Type", "application/json");
        request.param("inc", "gender,name,nat");
        request.param("noinfo");
        request.param("results", amount);
        Response response = request.get();
        return response.as(ResultDto.class).getResults();
    }
}
