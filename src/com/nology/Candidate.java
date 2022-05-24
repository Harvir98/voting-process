package com.nology;

public class Candidate extends Person {

    private String party;
    private int votes;

    public Candidate(String firstName, String lastName, String party) {
        super(firstName, lastName);
        this.party = party;
        this.votes = 0;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public int getVotes() {
        return votes;
    }

    public void incrementVote() {
        votes++;
    }
}
