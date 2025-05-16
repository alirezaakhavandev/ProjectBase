package com.application;

import java.sql.*;
import java.util.Scanner;

public class Patient_Finder {
    public static void find() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first name of the patient: ");
        String first_nameDB = input.nextLine();
        System.out.print("Enter the last name of the patient: ");
        String last_nameDB = input.nextLine();

        String query = "SELECT * FROM patients WHERE first_name = ? AND last_name = ?";

        String url = Sensitive.url;
        String username = Sensitive.getUsername();
        String password = Sensitive.getPassword();

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement preparedStatement = connection.prepareStatement(query)
        ) {
            preparedStatement.setString(1, first_nameDB);
            preparedStatement.setString(2, last_nameDB);

            ResultSet rs = preparedStatement.executeQuery();

            boolean foundAny = false;
            while (rs.next()) {
                foundAny = true;
                System.out.println("\n=== Patient Found ===");
                System.out.println("ID: " + rs.getString("patients_id"));
                System.out.println("Name: " + rs.getString("first_name") + " " + rs.getString("last_name"));
                System.out.println("Gender: " + rs.getString("gender"));
                System.out.println("Allergies: " + rs.getString("allergies"));
                System.out.println("Province ID: " + rs.getString("province_id"));
                input.close();
                connection.close();
            }

            if (!foundAny) {
                System.out.println("No patients found with that name.");
                input.close();
            }

        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
