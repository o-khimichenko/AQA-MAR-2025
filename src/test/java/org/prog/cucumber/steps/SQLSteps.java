package org.prog.cucumber.steps;

import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Assertions;
import org.prog.dto.PersonDto;
import org.prog.util.DataHolder;

import java.sql.*;
import java.util.List;

public class SQLSteps {

    public static String randomPersonFirstLastName;
    public static Connection connection;

    @Given("I pick random person from DB")
    public void iPickRandomPersonFromDB() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Persons ORDER BY RAND() LIMIT 1");
        if (resultSet.next()) {
            randomPersonFirstLastName = resultSet.getString("FirstName") + " " +
                    resultSet.getString("LastName");
        } else {
            Assertions.fail("No results found");
        }
    }

    @Given("I pick random person from DB as {string}")
    public void iPickRandomPersonFromDB(String alias) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Persons ORDER BY RAND() LIMIT 1");
        if (resultSet.next()) {
            DataHolder.HOLDER.put(alias, resultSet.getString("FirstName") + " " +
                    resultSet.getString("LastName"));
        } else {
            Assertions.fail("No results found");
        }
    }

    @Given("I store {string} id DB")
    public void iStoreIdDB(String alias) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO Persons (FirstName, LastName, Title, Gender, Nat) VALUES (?,?,?,?,?)");

        //TODO: find a way to transfer data from RestSteps
        List<PersonDto> clients = (List<PersonDto>) DataHolder.HOLDER.get(alias);

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
    }

    @Given("I store previously generated people id DB")
    public void iStorePreviouslyGeneratedPeopleIdDB() throws SQLException {
        PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO Persons (FirstName, LastName, Title, Gender, Nat) VALUES (?,?,?,?,?)");

        //TODO: find a way to transfer data from RestSteps
        List<PersonDto> clients = RestSteps.randomPersons;

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
    }
}
