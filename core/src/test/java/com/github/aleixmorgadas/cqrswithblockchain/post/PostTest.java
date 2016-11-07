package com.github.aleixmorgadas.cqrswithblockchain.post;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PostTest {

    @Test
    public void shouldContainTitleBodyAndTimestamp() {
        Date date = new Date();
        Post post = new DefaultPost("Title", "Body", date);
        assertEquals("Title", post.getTitle());
        assertEquals("Body", post.getBody());
        assertEquals(date, post.getTimestamp());
    }
}
