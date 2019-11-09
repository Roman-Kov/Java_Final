public class SpiralMatrix {
    private int n;
    private int m;
    private int[][] arr;

    public SpiralMatrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                arr[i][j] = 0;
            }
        }

        makeSpiralMatrix();
    }

    private void makeSpiralMatrix(){

        int i = 0;
        int j = 0;

        // флаги с1-4 определяют направление движения заполнения матрицы; с1 - слева направо,
        // с2 - сверху вниз, с3 - справа налево, с4 - снизу вверх
        boolean c1 = true;
        boolean c2 = false, c3 = false, c4 = false;


        for (int k = 1; k <= n*m ; k++) {

            if(c1 && arr[i][j] == 0){
                arr[i][j] = k;
                if(j < m -1 && arr[i][j+1] == 0)j++;
            }
            else if (c1){c1 = false; c2 = true; i++;}

            if(c2 && arr[i][j] == 0){
                arr[i][j] = k;
                if(i < n -1 && arr[i+1][j] == 0)i++;

            }
            else if(c2) {c2 = false; c3 = true; j--;}

            if(c3 && arr[i][j] == 0){
                arr[i][j] = k;
                if(j > 0 && arr[i][j-1] == 0)j--;

            }
            else if(c3) {c3 = false; c4 = true; i--;}

            if(c4 && arr[i][j] == 0){
                arr[i][j] = k;
                if(i > 0 && arr[i-1][j] == 0)i--;
                else if(arr[i-1][j] != 0){c4 = false; c1 = true; j++;}

            }
            else if(c4) {c4 = false; c1 = true; j++;}
        }
    }



    public void print(){
        for (int[] a: arr) {
            for ( int b : a) {
                if(b < 10) System.out.print(" " + b + " ");
                else System.out.print(b + " ");
            }
            System.out.println();
        }
    }

}
