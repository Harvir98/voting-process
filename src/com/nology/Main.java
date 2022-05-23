package com.nology;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Voter voter1 = new Voter("Harvir", "Gill", 1234, "matt");

        VoterRepository voterRepository = new VoterRepository();
        voterRepository.addVoter(voter1);

        AdminSystem adminSystem1 = new AdminSystem(voterRepository);


        adminSystem1.run();



    }
}
