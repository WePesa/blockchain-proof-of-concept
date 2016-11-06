package domain.post;

import java.util.Date;

final public class DefaultPost implements Post {
    private final String title;
    private final String body;
    private final Date timestamp;

    public DefaultPost(String title, String body, Date date) {
        this.title = title;
        this.body = body;
        this.timestamp = date;
    }

    //region getters
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
    //endregion
}
