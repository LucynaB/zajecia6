public class ArrayTest {
    public static void main(String[] args) {
        int[] tab1 = {0, 2, 3, 4};
        int[] tab2 = {1, 2, 3, 4};

        ArrayComparator ac = new ArrayComparator();
        boolean czyRowne1 = ac.compare(tab1, tab2);
        System.out.println(czyRowne1);

        int[][] tab3 = new int[2][];
        int[][] tab4 = new int[2][];
        tab3[0] = new int[]{1,2,3};
        tab3[1] = new int[]{1,2,3};
        tab4[0] = new int[]{1,2,3};
        tab4[1] = new int[]{1,2,0};
        //tab4[2] = new int[]{1,2,3};
        Boolean czyRowne2 = ac.compare(tab3,tab4);
        System.out.println(czyRowne2);

    }
}
