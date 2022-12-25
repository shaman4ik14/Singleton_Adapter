package adapter.task3;

public class Main {
    public static void main(String[] args){
        DataBase db = new DataBase();
        Authorization auth = new Authorization();
        if (auth.authorize(db)) {
            ReportBuilder builder = new ReportBuilder(db);
        }
    }
}
