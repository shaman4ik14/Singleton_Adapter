package adapter.task2;

import java.time.LocalDate;

public class TwitterClientWrapper implements Client{
    public TwitterUser user;

    public TwitterClientWrapper(TwitterUser user){
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public Country getCountry() {
        return user.getCountry();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return user.getActiveTime();
    }
}
