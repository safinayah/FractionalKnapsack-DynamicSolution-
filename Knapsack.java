package javafxapplication23;

/*
بسم الله الرحمن الرحيم
 */


import java.util.Arrays;

/**
 *
 * @author ayah
 */
public class Knapsack {

    private int[] profit;
    private int[] time;
    private int maxTime;
    private int finalProfit;

    public Knapsack(int[] profit, int[] time, int maxTime) {
        this.profit = profit;
        this.time = time;
    
    }

    public Knapsack(int[] profit, int[] time) {
        this.profit = profit;
        this.time = time;

    }
    
    Knapsack() {
    }

    public int getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
    }

    public int[] getProfit() {
        return profit;
    }

    public void setProfit(int[] profit) {
        this.profit = profit;
    }

    public int[] getTime() {
        return this.time;
    }

    public void setTime(int[] time) {
        this.time = time;
    }
   public int getFinalProfit() {
        return finalProfit;
    }

    public void setFinalProfit(int finalProfit) {
        this.finalProfit = finalProfit;
    }


    /*the res method is to calculate the final profit*/
    public int[][] res(int max) {
        
        int array[][] = new int[this.profit.length][max];//2D array 
       

        int oneHourWeight[] = new int[this.profit.length];
        int[] currentTime = new int[max];

        for (int i = 0; i < this.profit.length; i++) {//a loppt to fill oneHourWeight -> oneHourWeihght = this.profit for each project / the this.time to get the full this.time 
            oneHourWeight[i] = this.profit[i] / this.time[i];
        }//end of for loop
//        System.out.println("\nOHW = : " + Arrays.toString(time));

        for (int i = 1; i < max; i++) {//a loop to fill the current Time array
            currentTime[i] = i;
        }//end of foor loop 

        for (int i = 0; i < this.profit.length; i++) {//fills the fisrt col
            for (int j = 1; j < max && this.time[0] >= j; j++) {
                array[0][j] = oneHourWeight[0] * currentTime[j] ;
            }//end of inner loop
        }//end of outer loop 

        for (int i = 1; i < this.profit.length; i++) {//a nested loop is to fill the array starting in the sec col 
            for (int j = 0; j < max && this.time[i] >= j; j++) {
                if (array[i - 1][j] == 0) {//cases which the this.time of previous column is less than thu current
                    array[i][j] = currentTime[j] * oneHourWeight[i];//no need to compare becuase the data in i-1,j is zero 
//                    System.out.println(Arrays.deepToStrin  System.out.println(i+" " + j+ " "+highest(array, i-1, j));
                    
                } else {//cases which the previous column data not equal to zero 
//                    System.out.println("hete");
                    array[i][j] = Math.max(currentTime[j] * oneHourWeight[i], array[i - 1][j]);
                }//end of else statement

            }//end of inner for loop 
        }//inner of outer loop     

//       System.out.println(Arrays.deepToString(array));//prints the 2D array 
        return array;
    }//end of method 

    public static int[] highest(int num[][]) {//a simple method to find the highest value un each col
        
        int longestRow = 0, highest=0,tmp=0;
        int[] arr= new int [num.length] ;
        for (int row = 0; row < num.length; row++) {
            if (num[row].length > longestRow) {
                longestRow = num[row].length;
            }//end of if statement
        }//end og for loop 

        for (int col = 0; col < longestRow; col++) {
            highest = Integer.MIN_VALUE;
            for (int row = 0; row < num.length; row++) {
                if (col < num[row].length && num[row][col] > highest) {
                    tmp = num[row][col];
                    arr[row]= tmp;
                    highest=tmp;
                }//end of if statement
                 
            }//end of inner for loop
          
        }//end of outer for loop 
        return arr;
    }//end of method

    @Override
    public String toString() {
        return "Knapsack{" + "profit=" + profit + ", this.time=" + this.time + '}';
    }



 

}
