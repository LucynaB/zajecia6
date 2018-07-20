import java.util.Arrays;
import java.util.Random;

public class MirrorArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] tab = new int[10];
        int[] pom = new int[2 * tab.length];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(10);
        }



        for (int i = 0; i < pom.length; i++) {


            if(i<tab.length){
                pom[i] = tab[i];
                pom[pom.length - 1 - i] = tab[i];
            }
            System.out.print(pom[i] + " ");
        }



    }
}
