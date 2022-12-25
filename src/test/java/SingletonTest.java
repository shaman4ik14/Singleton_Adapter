import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singleton.User;

public class SingletonTest {
    @Test
    public void testName(){
        User user = new User("Kyrylo", "kyrylo.shamanskyi@ucu.edu.ua", 18);
        Assertions.assertEquals(user.getName(), "Kyrylo");
    }

    @Test
    public void testEmail(){
        User user = new User("Kyrylo", "kyrylo.shamanskyi@ucu.edu.ua", 18);
        Assertions.assertEquals(user.getEmail(), "kyrylo.shamanskyi@ucu.edu.ua");
    }

    @Test
    public void testAge(){
        User user = new User("Kyrylo", "kyrylo.shamanskyi@ucu.edu.ua", 18);
        Assertions.assertEquals(user.getAge(), 18);
    }
}
