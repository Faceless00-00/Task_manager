package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    static public void createDatabase(){
        String url = "jdbc:sqlite:database.db";
        try(Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()){
            String sql = "CREATE TABLE IF NOT EXISTS tasks (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "title VARCHAR(100)," +
                    "description VARCHAR(200)," +
                    "deadline DATE," +
                    "priority VARCHAR(10)," +
                    "status VARCHAR(20))";
            stmt.execute(sql);

            System.out.print("База данных подключена");
        } catch (SQLException e){
            System.out.print("Ошибка " + e.getMessage());
        }
    }
    static public void selectData(){}
    static public void insertData(int id, String title, String description, String deadline, String priority, String status){}
}

