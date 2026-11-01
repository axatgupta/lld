package org.example.behavioral.model;


import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Data
@Builder
public class Expense {
    final String id;
    final Date datetime;
    final String description;
    final User user;
    final List<User> participants;
    final long amount;
    private SplitStrategy splitStrategy;

    public Map<User, Long>  applyDiscount(long amount, List<User> participants){
        return splitStrategy.applyStrategy(amount, participants);
    }
}
