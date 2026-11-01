package org.example.behavioral.model;

import java.util.List;
import java.util.Map;

public interface SplitStrategy {
    Map<User, Long> applyStrategy(long amount, List<User> userList);
}
