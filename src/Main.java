import classes.Database;
import classes.Task;

public class Main {
    public static void main(String[] args) {
        Database.createDatabase();
        Database.selectData();
    }
}