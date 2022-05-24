package com.nology;

import java.util.ArrayList;
import java.util.List;

public class CandidateRepository {

    private final List<Candidate> candidateList = new ArrayList<>();

    public CandidateRepository(List<Candidate> candidateList) {
        this.candidateList.addAll(candidateList);
    }

    public CandidateRepository() {
    }

    public void addCandidate(Candidate candidate) {
        candidateList.add(candidate);
    }

    public void printCandidates() {
        int counter = 0;
        for(Candidate candidate:candidateList) {
            counter++;
            System.out.println(counter + ". "
                    + candidate.getFirstName() + " " + candidate.getLastName());
        }
    }

    public void castVote(int i) {
        candidateList.get(i).incrementVote();
        System.out.println("You have cast a vote for " + candidateList.get(i).getFirstName() + " " + candidateList.get(i).getLastName());
    }


}
