import java.util.Scanner;

public class VotingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String presidentCandidate = "";
        String vicePresidentCandidate = "";
        String senatorCandidates1 = "";
        String senatorCandidates2 = "";
        String senatorCandidates3 = "";
        String senatorCandidates4 = "";
        String senatorCandidates5 = "";
        String senatorCandidates6 = "";
        
        // Store usernames and passwords 
        String[] usernames = {"user1", "user2", "user3", "user4", "user5", "user6", "user7", "user8"};
        String[] passwords = {"pass1", "pass2", "pass3","pass4", "pass5", "pass6", "pass7", "pass8"};
        
        // INTEGER VARIABLE
        // the purpose of this is to display the total votes for every candidates
        int VCFPT = 0;
        int VCFVPT = 0;
        int VCFS1T = 0;
        int VCFS2T = 0;
        int VCFS3T = 0;
        int VCFS4T = 0;
        int VCFS5T = 0;
        int VCFS6T = 0;
        int VCFPF = 0;
        int VCFVPF = 0;
        int VCFS1F = 0;
        int VCFS2F = 0;
        int VCFS3F = 0;
        int VCFS4F = 0;
        int VCFS5F = 0;
        int VCFS6F = 0;        

        System.out.println("Welcome to the Voting System!");
        System.out.println("Here's the PARTY LIST participant:\n   TINGOG COCIAN PARTYLIST:\n(A)CSG President: Rogelio Cutang Jr.\n(B)CSG Vice President: Carlyle George Epan\n(C)CSG Senator1: Maryjane Geraldizo\n(D)CSG Senator2: April Mae Hope Cabil\n(E)CSG Senator3: John Florence Taban\n(F)CSG Senator4: Maxyn Yare\n(G)CSG Senator5: Ghail Argos Hisula\n(H)CSG Senator6: Geralyn Brooks\n\n   FORDA PARTYLIST:\n(I)CSG President: Jean Rabor Hinnes\n(J)CSG Vice-president: Elly Jaudian Mansilao\n(K)CSG Senator1: Adrian Jay Alvidera Espiritu\n(L)CSG Senator2: Aljun Paulo Palmita Jotojot\n(M)CSG Senator3: Ellie Fatagane Palacios\n(N)CSG Senator4: James Raymund Paza Harayo\n(O)CSG Senator5: Larraine Precioso Tedor\n(P)CSG Senator6: Mariane Joy Dagangon Arevalo\n");
        
        System.out.println("Please vote wisely!!\n");
        System.out.println("Log in your Account Identification");
        
        //PAGE1
        while (true) {
            System.out.print("Enter username: ");
            String username = input.nextLine();
            System.out.print("Enter password: ");
            String password = input.nextLine();
            
            boolean found = false; // initialize a boolean variable to keep track of whether a match is found
            
            for (int i = 0; i < usernames.length; i++) { 
                if (username.equalsIgnoreCase(usernames[i]) && password.equals(passwords[i])) { // check if the username and password match the current array element
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Login successful! Welcome " + password + ".");
                    found = true; // set found to true if a match is found
                    break; // break out of the for loop if a match is found
                } 
            }
            if (!found) { // if no match is found in the for loop, display an error message and continue the while loop
                System.out.println("Invalid username or password. Please try again.");
                
            } else { // if a match is found, break out of the while loop
                break;
            }
        }

        while (true) {    
            System.out.print("Press (S) to skip or Enter the letter of the candidate you want to vote for President: ");
            presidentCandidate = input.nextLine();
            if (presidentCandidate.equalsIgnoreCase("S")) {
                break;
            }
            if (presidentCandidate.equalsIgnoreCase("A")) {
                VCFPT += 1;
                break;
            }
            if (presidentCandidate.equalsIgnoreCase("I")) {
                VCFPF += 1;
                break;
            } else {
                System.out.println("Invalid Input \nPlease try again!!");
            }
        }
        while (true){
            System.out.print("Press (S) to skip or Enter the letter of the candidate you want to vote for Vice President: ");
            vicePresidentCandidate = input.nextLine();
            if (vicePresidentCandidate.equalsIgnoreCase("S")) {
                break;
            }
            if (vicePresidentCandidate.equalsIgnoreCase("B")) {
                VCFVPT += 1;
                break;
            }
            if (vicePresidentCandidate.equalsIgnoreCase("J")) {
                VCFVPF += 1;
                break;
            } else {
                System.out.println("Invalid Input \nPlease try again!!");
            }
        }
        while (true) {
            System.out.print("Press (S) to skip or Enter the letter of the candidate you want to vote for Sinator1: ");
            senatorCandidates1 = input.nextLine();
            if (senatorCandidates1.equalsIgnoreCase("S")) {
                break;
            }
            if (senatorCandidates1.equalsIgnoreCase("C")) {
                VCFS1T += 1;
                break;
            }
            if (senatorCandidates1.equalsIgnoreCase("K")) {
                VCFS1F += 1;
                break;
            } else {
                System.out.println("Invalid Input \nPlease try again!!");
            }
        }
        while (true) {
            System.out.print("Press (S) to skip or Enter the letter of the candidate you want to vote for Sinator2: ");
            senatorCandidates2 = input.nextLine();
            if (senatorCandidates2.equalsIgnoreCase("S")) {
                break;
            }
            if (senatorCandidates2.equalsIgnoreCase("D")) {
                VCFS2T += 1;
                break;
            }
            if (senatorCandidates2.equalsIgnoreCase("L")) {
                VCFS2F += 1;
                break;
            } else {
                System.out.println("Invalid Input \nPlease try again!!");
            }
        }
        while (true) {
            System.out.print("Press (S) to skip or Enter the letter of the candidate you want to vote for Sinator3: ");
            senatorCandidates3 = input.nextLine();
            if (senatorCandidates3.equalsIgnoreCase("S")) {
                break;
            }
            if (senatorCandidates3.equalsIgnoreCase("E")) {
                VCFS3T += 1;
                break;
            }
            if (senatorCandidates3.equalsIgnoreCase("M")) {
                VCFS3F += 1;
                break;
            } else {
                System.out.println("Invalid Input \nPlease try again!!");
            }
        }
        while (true) {
            System.out.print("Press (S) to skip or Enter the letter of the candidate you want to vote for Sinator4: ");
            senatorCandidates4 = input.nextLine();
            if (senatorCandidates4.equalsIgnoreCase("S")) {
                break;
            }
            if (senatorCandidates4.equalsIgnoreCase("F")) {
                VCFS4T += 1;
                break;
            }
            if (senatorCandidates4.equalsIgnoreCase("N")) {
                VCFS4F += 1;
                break;
            } else {
                System.out.println("Invalid Input \nPlease try again!!");
            }
        }
        while (true) {
            System.out.print("Press (S) to skip or Enter the letter of the candidate you want to vote for Sinator5: ");
            senatorCandidates5 = input.nextLine();
            if (senatorCandidates5.equalsIgnoreCase("S")) {
                break;
            }
            if (senatorCandidates5.equalsIgnoreCase("G")) {
                VCFS5T += 1;
                break;
            }
            if (senatorCandidates5.equalsIgnoreCase("O")) {
                VCFS5F += 1;
                break;
            } else {
                System.out.println("Invalid Input \nPlease try again!!");
            }
        }
        while (true) {
            System.out.print("Press (S) to skip or Enter the letter of the candidate you want to vote for Sinator6: ");
            senatorCandidates6 = input.nextLine();
            if (senatorCandidates6.equalsIgnoreCase("S")) {
                break;
            }
            if (senatorCandidates6.equalsIgnoreCase("H")) {
                VCFS6T += 1;
                break;
            }
            if (senatorCandidates6.equalsIgnoreCase("P")) {
                VCFS6F += 1;
                break;
            } else {
                System.out.println("Invalid Input \nPlease try again!!");
            }
        }

        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("YOUR VOTING RESULTS");
        System.out.println("   TINGOG COCIAN PARTYLIST:\n(A)CSG President: Rogelio Cutang Jr.: "+VCFPT+"\n(B)CSG Vice President: Carlyle George Epan: "+VCFVPT+"\n(C)CSG Senator1: Maryjane Geraldizo: "+VCFS1T+"\n(D)CSG Senator2: April Mae Hope Cabil: "+VCFS2T+"\n(E)CSG Senator3: John Florence Taban: "+VCFS3T+"\n(F)CSG Senator4: Maxyn Yare: "+VCFS4T+"\n(G)CSG Senator5: Ghail Argos Hisula: "+VCFS5T+"\n(H)CSG Senator6: Geralyn Brooks: "+VCFS6T+"\n\n   FORDA PARTYLIST:\n(I)CSG President: Jean Rabor Hinnes: "+VCFPF+"\n(J)CSG Vice-president: Elly Jaudian Mansilao: "+VCFVPF+"\n(K)CSG Senator1: Adrian Jay Alvidera Espiritu: "+VCFS1F+"\n(L)CSG Senator2: Aljun Paulo Palmita Jotojot: "+VCFS2F+"\n(M)CSG Senator3: Ellie Fatagane Palacios: "+VCFS3F+"\n(N)CSG Senator4: James Raymund Paza Harayo: "+VCFS4F+"\n(O)CSG Senator5: Larraine Precioso Tedor: "+VCFS5F+"\n(P)CSG Senator6: Mariane Joy Dagangon Arevalo: "+VCFS6F);
        System.out.println("Thank You For Voting");
        System.out.println("Next Voter Please!!");
        System.out.println();
        //PAGE2
        // prompt user to log in
        System.out.println("Welcome to the Voting System! press any key to log in.");
        String loginChoice2 = input.nextLine();
        
        
        while (true) {
            System.out.print("Enter username: ");
            String username = input.nextLine();
            System.out.print("Enter password: ");
            String password = input.nextLine();
            
            boolean found = false; // initialize a boolean variable to keep track of whether a match is found
            
            for (int i = 0; i < usernames.length; i++) { 
                if (username.equals(usernames[i]) && password.equals(passwords[i])) { // check if the username and password match the current array element
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Login successful! Welcome " + password + ".");
                    found = true; // set found to true if a match is found
                    break; // break out of the for loop if a match is found
                } 
            }
            
            if (!found) { // if no match is found in the for loop, display an error message and continue the while loop
                System.out.println("Invalid username or password. Please try again.");
                
            } else { // if a match is found, break out of the while loop
                break;
            }
        }
        
        
        System.out.println("Here's the PARTY LIST participant:\n   TINGOG COCIAN PARTYLIST:\n(A)CSG President: Rogelio Cutang Jr.\n(B)CSG Vice President: Carlyle George Epan\n(C)CSG Senator1: Maryjane Geraldizo\n(D)CSG Senator2: April Mae Hope Cabil\n(E)CSG Senator3: John Florence Taban\n(F)CSG Senator4: Maxyn Yare\n(G)CSG Senator5: Ghail Argos Hisula\n(H)CSG Senator6: Geralyn Brooks\n\n   FORDA PARTYLIST:\n(I)CSG President: Jean Rabor Hinnes\n(J)CSG Vice-president: Elly Jaudian Mansilao\n(K)CSG Senator1: Adrian Jay Alvidera Espiritu\n(L)CSG Senator2: Aljun Paulo Palmita Jotojot\n(M)CSG Senator3: Ellie Fatagane Palacios\n(N)CSG Senator4: James Raymund Paza Harayo\n(O)CSG Senator5: Larraine Precioso Tedor\n(P)CSG Senator6: Mariane Joy Dagangon Arevalo\n");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        
        while (true) {    
            System.out.print("Press (S) to skip or Enter the letter of the candidate you want to vote for President: ");
            presidentCandidate = input.nextLine();
            if (presidentCandidate.equalsIgnoreCase("S")) {
                break;
            }
            if (presidentCandidate.equalsIgnoreCase("A")) {
                VCFPT += 1;
                break;
            }
            if (presidentCandidate.equalsIgnoreCase("I")) {
                VCFPF += 1;
                break;
            } else {
                System.out.println("Invalid Input \nPlease try again!!");
            }
        }
        while (true){
            System.out.print("Press (S) to skip or Enter the letter of the candidate you want to vote for Vice President: ");
            vicePresidentCandidate = input.nextLine();
            if (vicePresidentCandidate.equalsIgnoreCase("S")) {
                break;
            }
            if (vicePresidentCandidate.equalsIgnoreCase("B")) {
                VCFVPT += 1;
                break;
            }
            if (vicePresidentCandidate.equalsIgnoreCase("J")) {
                VCFVPF += 1;
                break;
            } else {
                System.out.println("Invalid Input \nPlease try again!!");
            }
        }
        while (true) {
            System.out.print("Press (S) to skip or Enter the letter of the candidate you want to vote for Sinator1: ");
            senatorCandidates1 = input.nextLine();
            if (senatorCandidates1.equalsIgnoreCase("S")) {
                break;
            }
            if (senatorCandidates1.equalsIgnoreCase("C")) {
                VCFS1T += 1;
                break;
            }
            if (senatorCandidates1.equalsIgnoreCase("K")) {
                VCFS1F += 1;
                break;
            } else {
                System.out.println("Invalid Input \nPlease try again!!");
            }
        }
        while (true) {
            System.out.print("Press (S) to skip or Enter the letter of the candidate you want to vote for Sinator2: ");
            senatorCandidates2 = input.nextLine();
            if (senatorCandidates2.equalsIgnoreCase("S")) {
                break;
            }
            if (senatorCandidates2.equalsIgnoreCase("D")) {
                VCFS2T += 1;
                break;
            }
            if (senatorCandidates2.equalsIgnoreCase("L")) {
                VCFS2F += 1;
                break;
            } else {
                System.out.println("Invalid Input \nPlease try again!!");
            }
        }
        while (true) {
            System.out.print("Press (S) to skip or Enter the letter of the candidate you want to vote for Sinator3: ");
            senatorCandidates3 = input.nextLine();
            if (senatorCandidates3.equalsIgnoreCase("S")) {
                break;
            }
            if (senatorCandidates3.equalsIgnoreCase("E")) {
                VCFS3T += 1;
                break;
            }
            if (senatorCandidates3.equalsIgnoreCase("M")) {
                VCFS3F += 1;
                break;
            } else {
                System.out.println("Invalid Input \nPlease try again!!");
            }
        }
        while (true) {
            System.out.print("Press (S) to skip or Enter the letter of the candidate you want to vote for Sinator4: ");
            senatorCandidates4 = input.nextLine();
            if (senatorCandidates4.equalsIgnoreCase("S")) {
                break;
            }
            if (senatorCandidates4.equalsIgnoreCase("F")) {
                VCFS4T += 1;
                break;
            }
            if (senatorCandidates4.equalsIgnoreCase("N")) {
                VCFS4F += 1;
                break;
            } else {
                System.out.println("Invalid Input \nPlease try again!!");
            }
        }
        while (true) {
            System.out.print("Press (S) to skip or Enter the letter of the candidate you want to vote for Sinator5: ");
            senatorCandidates5 = input.nextLine();
            if (senatorCandidates5.equalsIgnoreCase("S")) {
                break;
            }
            if (senatorCandidates5.equalsIgnoreCase("G")) {
                VCFS5T += 1;
                break;
            }
            if (senatorCandidates5.equalsIgnoreCase("O")) {
                VCFS5F += 1;
                break;
            } else {
                System.out.println("Invalid Input \nPlease try again!!");
            }
        }
        while (true) {
            System.out.print("Press (S) to skip or Enter the letter of the candidate you want to vote for Sinator6: ");
            senatorCandidates6 = input.nextLine();
            if (senatorCandidates6.equalsIgnoreCase("S")) {
                break;
            }
            if (senatorCandidates6.equalsIgnoreCase("H")) {
                VCFS6T += 1;
                break;
            }
            if (senatorCandidates6.equalsIgnoreCase("P")) {
                VCFS6F += 1;
                break;
            } else {
                System.out.println("Invalid Input \nPlease try again!!");
            }
        }

        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("YOUR VOTING RESULTS");
        System.out.println("President: " + presidentCandidate);
        System.out.println("Vice President: " + vicePresidentCandidate);
        System.out.println("Senator1: " + senatorCandidates1);
        System.out.println("Senator2: " + senatorCandidates2);
        System.out.println("Senator3: " + senatorCandidates3);
        System.out.println("Senator4: " + senatorCandidates4);
        System.out.println("Senator5: " + senatorCandidates5);
        System.out.println("Senator6: " + senatorCandidates6);
        System.out.println("Thank You For Voting");
        System.out.println("Next Voter Please!!"); 
        System.out.println();


        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("YOUR VOTING RESULTS");
        System.out.println("   TINGOG COCIAN PARTYLIST:\n(A)CSG President: Rogelio Cutang Jr.: "+VCFPT+"\n(B)CSG Vice President: Carlyle George Epan: "+VCFVPT+"\n(C)CSG Senator1: Maryjane Geraldizo: "+VCFS1T+"\n(D)CSG Senator2: April Mae Hope Cabil: "+VCFS2T+"\n(E)CSG Senator3: John Florence Taban: "+VCFS3T+"\n(F)CSG Senator4: Maxyn Yare: "+VCFS4T+"\n(G)CSG Senator5: Ghail Argos Hisula: "+VCFS5T+"\n(H)CSG Senator6: Geralyn Brooks: "+VCFS6T+"\n\n   FORDA PARTYLIST:\n(I)CSG President: Jean Rabor Hinnes: "+VCFPF+"\n(J)CSG Vice-president: Elly Jaudian Mansilao: "+VCFVPF+"\n(K)CSG Senator1: Adrian Jay Alvidera Espiritu: "+VCFS1F+"\n(L)CSG Senator2: Aljun Paulo Palmita Jotojot: "+VCFS2F+"\n(M)CSG Senator3: Ellie Fatagane Palacios: "+VCFS3F+"\n(N)CSG Senator4: James Raymund Paza Harayo: "+VCFS4F+"\n(O)CSG Senator5: Larraine Precioso Tedor: "+VCFS5F+"\n(P)CSG Senator6: Mariane Joy Dagangon Arevalo: "+VCFS6F);
        System.out.println("Thank You For Voting");
        System.out.println();
        
        System.out.println("OVERALL VOTING RESULTS");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------\nPRESIDENTS:\nRogelio Cutang Jr.: "+VCFPT+"\nJean Rabor Hinnes: "+VCFPF);
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------\nVICE-PRESIDENTS:\nCarlyle George Epan: "+VCFVPT+"\nElly Jaudian Mansilao: "+VCFVPF); 
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------\nSENATOR1\nMaryjane Geraldizo: "+VCFS1T+"\nAdrian Jay Alvidera Espiritu: "+VCFS1F+"\n-----------------------------------------------------------------------------------------------------------------------\nSENATOR2\nApril Mae Hope Cabil: "+VCFS2T+"\nAljun Paulo Palmita Jotojot: "+VCFS2F+"\n-----------------------------------------------------------------------------------------------------------------------\nSENATOR3\nJohn Florence Taban: "+VCFS3T+"\nEllie Fatagane Palacios: "+VCFS3F+"\n-----------------------------------------------------------------------------------------------------------------------\nSENATOR4\nMaxyn Yare: "+VCFS4T+"\nJames Raymund Paza Harayo: "+VCFS4F+"\n-----------------------------------------------------------------------------------------------------------------------\nSENATOR5\nGhail Argos Hisula: "+VCFS5T+"\nLarraine Precioso Tedor: "+VCFS5F+"\n-----------------------------------------------------------------------------------------------------------------------\nSENATOR6\nGeralyn Brooks: "+VCFS6T+"\nMariane Joy Dagangon Arevalo: "+VCFS6F);
        System.out.println();
        System.out.println("Thank You for voting");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("============================================//===========================\\============================================");
        System.out.println("===========================================//        LIST OF WINNERS      \\===========================================");
        System.out.println("===========================================\\=============================//===========================================");
        System.out.println();
        if (VCFPT > VCFPF) {
            System.out.println("PRESIDENT");
            System.out.println("Rogelio Cutang Jr.");
        } else if (VCFPF > VCFPT) {
            System.out.println("PRESIDENT");
            System.out.println("Jean Rabor Hinnes");
        } else {
            System.out.println("It's a tie!");
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        
        if (VCFVPT > VCFVPF) {
            System.out.println("VICE-PRESIDENT");
            System.out.println("Carlyle George Epan");
        } else if (VCFVPF > VCFVPT){
            System.out.println("VICE-PRESIDENT");
            System.out.println("Elly Jaudian Mansilao");
        } else {
            System.out.println("It's a tie!");
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        
        if (VCFS1T > VCFS1F){
            System.out.println("SENATOR1");
            System.out.println("Maryjane Geraldizo");
        } else if (VCFS1F > VCFS1T){
            System.out.println("SENATOR1");
            System.out.println("Adrian Jay Alvidera Espiritu");
        } else {
            System.out.println("It's a tie!");
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        
        if (VCFS2T > VCFS2F){
            System.out.println("SENATOR2");
            System.out.println("April Mae Hope Cabil");
        } else if (VCFS2F > VCFS2T){
            System.out.println("SENATOR2");
            System.out.println("Aljun Paulo Palmita Jotojot");
        } else {
            System.out.println("It's a tie!");
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        
        if (VCFS3T > VCFS3F){
            System.out.println("SENATOR3");
            System.out.println("John Florence Taban");
        } else if (VCFS3F > VCFS3T){
            System.out.println("SENATOR3");
            System.out.println("Ellie Fatagane Palacios");
        } else {
            System.out.println("It's a tie!");
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        
        if (VCFS4T > VCFS4F){
            System.out.println("SENATOR4");
            System.out.println("Maxyn Yare");
        } else if (VCFS4F > VCFS4T){
            System.out.println("SENATOR4");
            System.out.println("James Raymund Paza Harayo");
        } else {
            System.out.println("It's a tie!");
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        
        if (VCFS5T > VCFS5F){
            System.out.println("SENATOR5");
            System.out.println("Ghail Argos Hisula");
        } else if (VCFS5F > VCFS5T){
            System.out.println("SENATOR5");
            System.out.println("Larraine Precioso Tedor");
        } else {
            System.out.println("It's a tie!");
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        
        if (VCFS6T > VCFS6F){
            System.out.println("SENATOR6");
            System.out.println("Geralyn Brooks");
        } else if (VCFS6F > VCFS6T){
            System.out.println("SENATOR6");
            System.out.println("Mariane Joy Dagangon Arevalo");
        } else {
            System.out.println("It's a tie!");
        }
        
    }    
}
