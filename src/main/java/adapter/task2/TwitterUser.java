package adapter.task2;

import java.time.LocalDate;

public class TwitterUser {
    private String email;
    private Country country;
    private LocalDate ActiveTime;

    public TwitterUser(String email, Country country, LocalDate activeTime) {
        this.email = email;
        this.country = country;
        ActiveTime = activeTime;
    }

    public String getEmail() {
        return email;
    }

    public Country getCountry() {
        return country;
    }

    public LocalDate getActiveTime() {
        return ActiveTime;
    }
}
