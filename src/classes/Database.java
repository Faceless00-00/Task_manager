package classes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public static String url = "jdbc:sqlite:database.db";
    static public void createDatabase(){
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

            System.out.println("База данных подключена");
        } catch (SQLException e){
            System.out.print("Ошибка " + e.getMessage());
        }
    }
    static public void selectData(){
        record TeamDatabase(int id, String title, String description, String deadline, String priority, String status){}
        List<TeamDatabase> result = new ArrayList<>();
        try(Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tasks")){
            while(rs.next()){
                result.add(new TeamDatabase(rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getString("deadline"),
                        rs.getString("priority"),
                        rs.getString("status")));
            }
        } catch (SQLException e){
            System.out.print("Ошибка " + e.getMessage());
        }
        System.out.println(result);
    }
    static public void insertData(int id, String title, String description, String deadline, String priority, String status){}
}

