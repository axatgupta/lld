package org.example.behavioral.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualSplitStrategy implements SplitStrategy {
    @Override
    public Map<User, Long> applyStrategy(long amount, List<User> participants) {
        Map<User, Long> userShare = new HashMap<>();
        for(User participant : participants){
            userShare.put(participant, amount/participants.size());
        }
        return userShare;
    }
}
