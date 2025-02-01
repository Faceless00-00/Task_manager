import classes.Task;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:database.db";
        try(Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()){
            String sql = "CREATE TABLE IF NOT EXISTS users (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "NAME VARCHAR(40))";
            stmt.execute(sql);

            System.out.print("База данных подключена");
        } catch (SQLException e){
            System.out.print("Ошибка " + e.getMessage());
        }
    }
}