public class MultiArrayTest {
    public static void main(String[] args) {
        MultiArray ma=new MultiArray(3,4);
        ma.print();


        int min = ma.findMin();
        int max = ma.findMax();
        System.out.println("Min "+ min);
        System.out.println("Max "+ max);

        ma.randomize();
        ma.print();
        min = ma.findMin();
        max = ma.findMax();
        System.out.println("Min "+ min);
        System.out.println("Max "+ max);
    }
}
