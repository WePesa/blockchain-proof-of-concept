package domain;

import java.util.Date;

public class DefaultPost implements Post {
    public DefaultPost(String title, String body, Date date) {
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public String getBody() {
        return null;
    }

    @Override
    public Date getTimestamp() {
        return null;
    }
}
