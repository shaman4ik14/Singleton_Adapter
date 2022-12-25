package adapter.task2;

import java.time.LocalDate;

public class Login {
    public Client login(String method){
        if (method.equals("facebook")){
            return new FacebookClientWrapper(new FacebookUser("dobosevych", Country.Ukraine, LocalDate.of(2021, 11, 11)));
        } else if (method.equals("twitter")) {
            return new TwitterClientWrapper(new TwitterUser("dobosevych", Country.Ukraine, LocalDate.of(2021, 11, 11)));
        }
        return null;
    }
}
