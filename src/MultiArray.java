import java.util.Arrays;
import java.util.Random;

public class MultiArray {
    private int[][] multiArray;
    Random rand = new Random();

    MultiArray(int n, int m) {
        multiArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                multiArray[i][j] = rand.nextInt(100);
            }
        }

    }


    void print() {
        for (int i = 0; i < multiArray.length; i++) {
            System.out.println(Arrays.toString(multiArray[i]));
        }
    }

    void randomize() {
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = rand.nextInt(100);
            }
        }
    }

    int findMin(){
        int min=multiArray[0][0];
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                if(multiArray[i][j]<min){
                    min=multiArray[i][j];
                }
            }
        }

        return min;
    }

    int findMax(){
        int max=multiArray[0][0];
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                if(multiArray[i][j]>max){
                    max=multiArray[i][j];
                }
            }
        }

        return max;
    }

}
