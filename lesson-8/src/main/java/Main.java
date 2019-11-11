public class Main {
    public static void main(String[] args) {

        int[] trees_1 = new int[]{1, 2, 4, 5, 3, 3, 3, 1};

        int[] trees_2 = new int[]{5, 1, 5, 2, 2, 4, 1, 4, 5, 1, 5, 3, 2, 4, 4, 4, 5, 1,
                3, 4, 2, 2, 1, 2, 4, 4, 4, 5, 4, 3, 5, 4, 4, 5, 5, 1, 4, 1, 5, 3, 1,
                4, 5, 3, 3, 4, 2, 2, 4, 4, 5, 5, 1, 1, 1, 4, 5, 5, 4, 4, 2, 4, 3, 1,
                3, 3, 1, 1, 3, 1, 3, 4, 4, 3, 2, 2, 1, 3, 4, 4, 2, 3, 4, 2, 4, 4, 1,
                4, 4, 4, 2, 1, 2, 4, 1, 5, 2, 2, 5, 4, 2, 2, 3, 1, 5, 5, 3, 5, 3, 1,
                4, 5, 4, 2, 1, 3, 1, 2, 1, 4, 1, 3, 4, 2, 2, 5, 2, 3, 1, 1, 2, 3, 3,
                4, 4, 2, 4, 1, 2, 2, 2, 5, 1, 5, 1, 2, 2, 1, 3, 3, 4, 3, 5, 3, 5, 1,
                2, 1, 3, 3, 2, 4, 1, 4, 3, 5, 1, 2, 1, 2, 3, 2, 1, 3, 2, 2, 4, 3, 2,
                1, 5, 1, 4, 5, 4, 4, 5, 5, 4, 2, 3, 5, 1, 3, 4, 3, 2, 4, 5, 2, 5, 2,
                4, 1, 4, 5, 2, 3, 3, 4, 4, 3, 5, 2, 2, 3, 5, 1, 2, 4, 3, 4, 4, 3, 2,
                2, 1, 4, 5, 5, 1, 5, 2, 4, 5, 5, 4, 2, 2, 1, 5, 1, 3, 4, 2, 4, 2, 2,
                4, 3, 5, 2, 2, 4, 4, 4, 5, 5, 2, 5, 5, 2, 5, 1, 1, 5, 5, 4, 1, 2, 4,
                1, 2, 2, 5, 4, 5, 1, 5, 4, 4, 5, 5, 5, 3, 3, 4, 3, 3, 5, 3, 2, 2, 2,
                2, 2, 1, 2, 5, 2, 3, 4, 3, 5, 5, 2, 4, 5, 3, 4, 3, 1, 3, 2, 1, 1, 5,
                4, 4, 2, 3, 1, 3, 4, 2, 4, 1, 3, 5, 1, 5, 3, 5, 2, 3, 4, 4, 1, 3, 1,
                5, 5, 1, 2, 2, 1, 3, 1, 5, 1, 2, 2, 1, 5, 1, 3, 3, 2, 1, 3, 2, 5, 1,
                1, 2, 3, 5, 5, 4, 3, 1, 3, 3, 1, 5, 4, 2, 3, 4};

        Forest smallForest = new Forest(5, trees_1);
        Forest bigForest = new Forest(5, trees_2);

        System.out.print("smallForest: "); smallForest.count();
        System.out.print("bigForest: "); bigForest.count();
    }
}
