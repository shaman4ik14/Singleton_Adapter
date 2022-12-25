package adapter.task3;


public class Authorization {
    public boolean authorize(DataBase db){
        db.retrieveUserData();
        return true;
    }
}
