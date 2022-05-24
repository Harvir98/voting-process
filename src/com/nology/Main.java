package com.nology;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Voter voter1 = new Voter("Harvir", "Gill", 1234, "matt");


        VoterRepository voterRepository = new VoterRepository();
        voterRepository.addVoter(voter1);

        Candidate candidate1 = new Candidate("Boris", "Johnson", "Conservatives");
        Candidate candidate2 = new Candidate("Keir", "Starmer", "Labour");
        Candidate candidate3 = new Candidate("Donald", "Trump", "Republican");
        Candidate candidate4 = new Candidate("Kanye", "West", "Independent");

        CandidateRepository candidateRespository = new CandidateRepository();
        candidateRespository.addCandidate(candidate1);
        candidateRespository.addCandidate(candidate2);
        candidateRespository.addCandidate(candidate3);
        candidateRespository.addCandidate(candidate4);

        AdminSystem adminSystem1 = new AdminSystem(voterRepository, candidateRespository);

        adminSystem1.run();



    }
}
