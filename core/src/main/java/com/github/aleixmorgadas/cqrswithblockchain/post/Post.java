package com.github.aleixmorgadas.cqrswithblockchain.post;

import java.util.Date;

public interface Post {
    String getTitle();

    String getBody();

    Date getTimestamp();
}
