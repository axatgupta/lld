package org.example.behavioral.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PercentageSplitStrategy implements SplitStrategy{

    private final List<Double> percentageShare;

    PercentageSplitStrategy(List<Double> percentageShare){
        this.percentageShare = percentageShare;
    }

    @Override
    public Map<User, Long> applyStrategy(long amount, List<User> participants) {
        if(participants == null){
            return (Map<User, Long>) new IllegalArgumentException("Participants cannot be empty");
        }

        Map<User, Long> userShare = new HashMap<>();
        for(int i =0; i<userShare.size(); i++){
            userShare.put(participants.get(i),
                    amount/ percentageShare.get(i).longValue());
        }
        return userShare;
    }
}
