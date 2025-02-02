import classes.Database;
import classes.Task;

public class Main {
    public static void main(String[] args) {
        Database.createDatabase();
        Database.insertData(1, "Первая заметка", "Описание", "20.10.2005", "high", "none");
        Database.selectData();
    }
}