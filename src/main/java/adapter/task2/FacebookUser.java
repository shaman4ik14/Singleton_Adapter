package adapter.task2;

import java.time.LocalDate;

enum Country{
    USA, Ukraine, Spain, France, Poland;
}

public class FacebookUser {
    private String email;
    private Country country;
    private LocalDate ActiveTime;

    public FacebookUser(String email, Country country, LocalDate activeTime) {
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
