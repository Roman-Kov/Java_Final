import java.util.Arrays;

public class Forest {
   private int countOfTreeTypes;
   private int[] forest;

    public Forest(int countOfTreeTypes, int[] forest) {
        this.countOfTreeTypes = countOfTreeTypes;
        this.forest = forest;
    }

    public void count(){
        int[] countOfTree = new int[countOfTreeTypes];
        for (int i = 0; i < countOfTree.length; i++) {
            countOfTree[i] = 0;
        }

        for (int c : forest) {
            countOfTree[c-1]++;
        }

        System.out.println(Arrays.toString(countOfTree));
    }
}
