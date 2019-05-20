package leccion41.model;

import java.io.*;
import java.sql.*;
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

    public void guardar() throws SQLException {
        String consulta = "select count(*) as count from people where id=?";
        PreparedStatement statement = connection.prepareStatement(consulta);
        String insertSql =
                "insert into people (id, name, age, employment_status, tax_id, us_citizen, gender, occupation)" +
                        " values (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement insertStatement = connection.prepareStatement(insertSql);

        String updateSql = "update people set name=?, age=?, employment_status=?, tax_id=?, us_citizen=?," +
                " gender=?, occupation=? where id=?";
        PreparedStatement updateStatement = connection.prepareStatement(updateSql);

        int id;
        int count;
        for (Person p: people) {
            id = p.getId();
            String name = p.getName();
            String occupation = p.getOccupation();
            AgeCategory age = p.getAgeCategory();
            EmploymentCategory emp = p.getEmpCat();
            String tax = p.getTaxId();
            boolean isUs = p.isUsCitizen();
            Gender gender = p.getGender();
            id = p.getId();
            statement.setInt(1, id);
            ResultSet resultado = statement.executeQuery();
            resultado.next();
            count = resultado.getInt(1);

            if (count == 0) {
                System.out.println("Insertando persona por ID: " + id);
                int col = 1;
                insertStatement.setInt(col++, id);
                insertStatement.setString(col++, name);
                insertStatement.setString(col++, age.name());
                insertStatement.setString(col++, emp.name());
                insertStatement.setString(col++, tax);
                insertStatement.setBoolean(col++, isUs);
                insertStatement.setString(col++, gender.name());
                insertStatement.setString(col++, occupation);

                insertStatement.executeUpdate();

            } else {
                System.out.println("Actualizando persona por ID: " + id);
                int col = 1;
                updateStatement.setString(col++, name);
                updateStatement.setString(col++, age.name());
                updateStatement.setString(col++, emp.name());
                updateStatement.setString(col++, tax);
                updateStatement.setBoolean(col++, isUs);
                updateStatement.setString(col++, gender.name());
                updateStatement.setString(col++, occupation);
                updateStatement.setInt(col++, id);

                updateStatement.executeUpdate();
            }

        }
        updateStatement.close();
        insertStatement.close();
        statement.close();
    }

    public void load() throws SQLException {
        people.clear();

        String sql = "select id, name, age, employment_status, tax_id, us_citizen, gender, occupation from people order by name";
        Statement selectStatement = connection.createStatement();

        ResultSet results = selectStatement.executeQuery(sql);

        while(results.next()) {
            int id = results.getInt("id");
            String name = results.getString("name");
            String age = results.getString("age");
            String emp = results.getString("employment_status");
            String taxId = results.getString("tax_id");
            boolean isUs = results.getBoolean("us_citizen");
            String gender = results.getString("gender");
            String occ = results.getString("occupation");

            Person person = new Person(name id, name, occ, AgeCategory.valueOf(age), EmploymentCategory.valueOf(emp), taxId, isUs, Gender.valueOf(gender));
            people.add(person);
        }

        results.close();
        selectStatement.close();
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
