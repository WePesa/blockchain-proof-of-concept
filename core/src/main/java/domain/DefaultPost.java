package domain;

import java.util.Date;

final public class DefaultPost implements Post {
    final String title;
    final String body;
    final Date timestamp;

    public DefaultPost(String title, String body, Date date) {
        this.title = title;
        this.body = body;
        this.timestamp = date;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getBody() {
        return body;
    }

    @Override
    public Date getTimestamp() {
        return timestamp;
    }
}
