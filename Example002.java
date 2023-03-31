import java.util.Arrays;
public class Example002 {
       /**
     * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void main(String[] args) {
        int array[] = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        createArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] createArray(int[] array) {  
        for(int i = 0; i < array.length; i++){
            if(array[i] < 6){
                array[i] = array[i] * 2;
            }
        }
        return array;
    }
}
