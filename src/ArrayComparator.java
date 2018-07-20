public class ArrayComparator {
    private boolean result;

    boolean compare(int[] tab1, int[] tab2) {
        if (tab1.length == tab2.length) {
            for (int i = 0; i < tab1.length; i++) {
                if (tab1[i] != tab2[i]) {
                    result = false;
                    break;
                } else
                    result = true;
            }
        } else
            result = false;

        return result;

    }

    boolean compare(int[][] tab1, int[][] tab2) {
        if (tab1.length == tab2.length) {//równa liczba wierszy
            for (int i = 0; i < tab1.length; i++) {
                if (tab1[i].length == tab2[i].length) {//równa liczba kolumn
                    if (compare(tab1[i], tab2[i])) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
//
                } else {
                    result = false;
                    break;
                }


            }

        } else
            result = false;

        return result;
    }
}
