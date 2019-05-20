package leccion37.model;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Database {
    private Connection connection;
    private List<Person> people;

    public Database() {
        people = new LinkedList<Person>();
    }

    public void conectar() throws ClassNotFoundException, SQLException {

        if (connection != null) return;

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/swingtest";
        String usuario = "root";
        String clave = "g+64vethU8%hfg";
        connection = DriverManager.getConnection(url, usuario, clave);
        System.out.println("Conectado a: " + connection);
    }

    public void desconectar() throws SQLException {
        if (connection != null)
            connection.close();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(int index) {
        people.remove(index);
    }

    public List<Person> getPeople() {
        return Collections.unmodifiableList(people);
    }

    public void saveToFile(File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Person[] persons = people.toArray(new Person[people.size()]);

        oos.writeObject(persons);

        oos.close();
    }

    public void loadFromFile(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            Person[] persons = (Person[]) ois.readObject();

            people.clear();

            people.addAll(Arrays.asList(persons));

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        ois.close();
    }
}
