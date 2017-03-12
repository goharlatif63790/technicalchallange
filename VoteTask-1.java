/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votetask;

import java.util.Scanner;

/**
 *
 * @author UK
 */
public class VoteTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vote1=0,vote2=0,vote3=0,vote4=0,vote5=0, usercount=1;
        int votecount=1,vote;
        Scanner sc=new Scanner(System.in);
        System.out.println("Vote for the candidate\n\n");
        System.out.println("Candidate         to vote press");
        System.out.println("Candidate-1       press 1");
        System.out.println("Candidate-2       press 2");
        System.out.println("Candidate-3       press 3");
        System.out.println("Candidate-4       press 4");
        System.out.println("Candidate-5       press 5");
                
        while(usercount<=5)
        {
      
            votecount=1;
            while(votecount<=3)
        { 
        System.out.println("Voting User "+usercount+"  Vote "+votecount);
        System.out.println("Candidate         to vote press\n");
        System.out.println("Candidate-1       press 1");
        System.out.println("Candidate-2       press 2");
        System.out.println("Candidate-3       press 3");
        System.out.println("Candidate-4       press 4");
        System.out.println("Candidate-5       press 5");
        
        vote=sc.nextInt();
        switch(vote)
        {
            case 1:
                vote1++;
                break;
            case 2:
                vote2++;break;
            case 3:
                vote3++;break;
            case 4:
                vote4++;break;
            case 5:
                vote5++;break;
            default:
                System.out.println("Wrong input");break;
        
        }
        votecount++;
        }
            System.err.println("Voter "+usercount+" has finished voting");
       usercount++;
    }
    System.out.println("Results\n\n");
    System.out.print("press y to see n to exit");
    String r = sc.nextLine();
    if(r=="y")
    {
        System.out.println("Candidate         TotalVote     Percentage");
        System.out.println("Candidate-1       "+vote1+"   "+vote1*100/15+"%");
        System.out.println("Candidate-2       "+vote2+"   "+vote2*100/15+"%");
        System.out.println("Candidate-3       "+vote3+"   "+vote3*100/15+"%");
        System.out.println("Candidate-4       "+vote4+"   "+vote4*100/15+"%");
        System.out.println("Candidate-5       "+vote5+"   "+vote5*100/15+"%");
        }
    else if(r=="n") System.exit(0);
    }
}
