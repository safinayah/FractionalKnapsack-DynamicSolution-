package javafxapplication23;
/*
بسم الله الرحمن الرحيم
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ayah
 */
public class FileAccess {

    Knapsack p;
    String[] terms;
    int n;
    int time[];
    int profit[];
    String line;

    public FileAccess() {
        this.p = new Knapsack();
        this.n = this.numOfLines();
        this.time = new int[n];
        this.profit = new int[n];

    }

    public Knapsack pass() {

        int i = 0;
        int a = 0;
        int b = 0;
        File x = new File("data");
        if (x.exists()) {
            Scanner input = null;//initilalize input scanner
            try {
                input = new Scanner(x); // Scanning

            } catch (FileNotFoundException ex) {
                System.out.println("noooooo data!!!!!!!!!!!");//handles the exception 
            }

            while (input.hasNext()) {//a loop until the has lines

                String line = input.nextLine(); //reads file line by line
                terms = line.split(" "); //split  each line on the space 
//                 for(int i =0; i <profit.length ;i++){
                a = Integer.parseInt(terms[0]); //weight
                b = Integer.parseInt(terms[1]);//time
                this.profit[i] = a;
                this.time[i] = b;
//                }
//                System.out.println("time array : "+Arrays.toString(time)+"\nProfit Array : "+Arrays.toString(profit)); 
                i++;
            }//end of while loop

        }  //end of if statement 
        p.setProfit(this.profit);
        p.setTime(this.time);
        return p;

    }//end of data method

    public int numOfLines() {//calculates num of file's line
        int num = 0;//initialize num

        File x = new File("data"); //This is used to input the movies text

        if (x.exists()) {//checks of the file exist

            Scanner input = null;//initilalize input scanner
            try {
                input = new Scanner(x);
            } catch (FileNotFoundException ex) {
                System.out.println("File is not exist");
            }

            while (input.hasNext()) {//checks if the file has nextLine
                line = input.nextLine(); // This is used to get to the next line
                if (line != null) {//checks if the file has data
                    num++;//increments number of lines
                }//end of if statement

            }//end of while loop
            input.close();
        }//end of if statement

        return num;//returns number of file's lines
    }//end of method

}//end of class