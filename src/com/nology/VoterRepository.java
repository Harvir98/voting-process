package com.nology;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VoterRepository {

    private final List<Voter> voterList = new ArrayList<>();

    public VoterRepository(List<Voter> voterList) {
        this.voterList.addAll(voterList);
    }

    public VoterRepository() {
    }

    public void addVoter(Voter voter) {
        voterList.add(voter);
    }

    public boolean verifyUser(int id, String password) {
        for (Voter voter: voterList) {
            if(voter.getId() == id && voter.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public Voter getVoterById(int id) {
        return voterList.stream().filter(voter -> voter.getId() == id)
                .findFirst()
                .get();
    }
}
