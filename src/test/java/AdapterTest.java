import adapter.task3.Authorization;
import adapter.task3.DataBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdapterTest {
    private DataBase db = new DataBase();
    private Authorization auth = new Authorization();

    @Test
    public void testAuthorization(){
        Assertions.assertEquals(auth.authorize(db), true);
    }

    @Test
    public void testDataBase(){
        Assertions.assertEquals(db.retrieveUserData(), "retrieve data about user");
    }
}
