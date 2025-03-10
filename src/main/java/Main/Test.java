package Main;

import Models.Person;
import Services.IService;
import Services.PersonService;
import Utils.DataSource;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        PersonService ps = new PersonService();
        try {
            // ps.add(new Person(20, "newsrine", "fazzeni"));
            ps.delete(new Person(4, 2, "", ""));
            System.out.println(ps.getAll());

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
