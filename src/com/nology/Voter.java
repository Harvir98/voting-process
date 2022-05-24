package com.nology;

public class Voter extends Person{

    private final int id;
    private String password;
    private boolean hasVoted = false;

    public Voter(String firstName, String lastName, int id, String password) {
        super(firstName, lastName);
        this.id = id;
        this.password = password;

    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public boolean isHasVoted() {
        return hasVoted;
    }

    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted;
    }
}
