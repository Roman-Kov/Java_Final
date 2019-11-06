import java.util.Arrays;

public class ArrayMethods {

    public int[] cutAfter4(int[] arr) {

        boolean find4 = false;
        int pos = 0;


        if(arr.length == 0) {
            try{
                throw new RuntimeException("Массив не содержит элементов");
            }catch (RuntimeException e){
                System.err.println(e.getMessage());
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4){
                find4 = true;
                pos = i + 1;
            }
        }

        if(!find4) {
            throw new RuntimeException("Массив не содержит 4");
        }

        int[] newArr = new int[arr.length - pos];
        System.arraycopy(arr, pos, newArr,0, newArr.length);
        //System.out.println(Arrays.toString(arr) + " : " + Arrays.toString(newArr));
        return newArr;
    }

    public boolean have1o4(int[] arr){
        boolean have_1 = false;
        boolean have_4 = false;

        for (int c:arr) {
            have_1 = c == 1 ? true : have_1;
            have_4 = c == 4 ? true : have_4;
            if(c != 1 && c != 4 ) throw new RuntimeException("Массив содержит элементы отличные от 1 или 4");
        }
        return (have_1 && have_4);
    }
}
