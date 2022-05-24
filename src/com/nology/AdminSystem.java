package com.nology;

import java.util.Random;
import java.util.Scanner;

public class AdminSystem {

    private Voter voter;
    private CandidateRepository candidateRepository;
    private final Scanner scanner = new Scanner(System.in);
    private VoterRepository voterRepository;

    public AdminSystem(VoterRepository voterRepository, CandidateRepository candidateRepository) {
        this.voterRepository = voterRepository;
        this.candidateRepository = candidateRepository;
    }

    public void run() {
        System.out.println("Choose an option: \n" +
                "1. Register \n" +
                "2. Log in");
        int userInput = scanner.nextInt();
        if(userInput == 1 ) {
            register();
        } else if (userInput == 2) {
            login();
        } else {
            System.out.println("Invalid input");
            run();
        }
    }

    public void register() {
        System.out.println("Please enter your first name");
        String firstName = scanner.next();
        System.out.println("Please enter your last name");
        String lastName = scanner.next();
        System.out.println("Please enter your ID");
        int id = scanner.nextInt();
        String password = generatePassword();
        System.out.println("Your password is " + password);
        Voter voter = new Voter(firstName, lastName, id, password);
        voterRepository.addVoter(voter);
        login();
    }

    public void login() {
        System.out.println("Please log in");
        System.out.println("Please enter your ID");
        int id = scanner.nextInt();
        System.out.println("Please enter your Password");
        String password = scanner.next();

        if(voterRepository.verifyUser(id, password)) {
            voter = voterRepository.getVoterById(id);
            votingSystem();
        } else {
            login();
        }
    }

    public String generatePassword() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // create random string builder
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 7;
        for(int i = 0; i < length; i++) {
            // generate random index number
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public void votingSystem() {
        System.out.println("Please enter the candidate you wish to vote for");
        candidateRepository.printCandidates();
        int vote = scanner.nextInt();

        candidateRepository.castVote(vote - 1);
    }




}
