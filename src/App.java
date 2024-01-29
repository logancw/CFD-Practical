

// -1 to end 
// 200+ is Expert
// < 200 is avg 

import java.util.ArrayList;
import java.util.Scanner;

public class App { 
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);
        boolean stopped = true; 
        ArrayList<Integer> scores = new ArrayList<Integer>();

        System.out.println("Please enter the bowling score (-1 to quit): ");
        int submission = kb.nextInt();

        if(submission == -1){
            System.out.println("Submissions stopped");
        }else{
            scores.add(submission);
            stopped = false;
        }

        while(stopped == false){
            System.out.println("Please enter the bowling score (-1 to quit: ");
            submission = kb.nextInt();
            if(submission== -1){
                System.out.println("Submissions stopped");
                stopped = true;
            }else{
                scores.add(submission);
                stopped = false;
            }
        }

        System.out.println("The bowling scores are: " + scores);
        
        int totalScores = scores.size();
        int elite = 0;
        int average = 0;

        for(int i = 0; i < scores.size(); i++){
            if(scores.get(i) >= 200){
                elite++;
            }else{
                average++;
            }
        }

        double elitePercent = (double)elite / totalScores;
        elitePercent = elitePercent * 100;
        elitePercent = ((int) elitePercent)/100.0;
        System.out.println(" Elite Bowlers %" + elitePercent * 100);

        double averagePercent = (double)average / totalScores;
        averagePercent = averagePercent * 100;
        averagePercent = ((int) averagePercent)/100.0;
        System.out.println(" Average Bowlers %" + (float) averagePercent * 100);


    }
}
