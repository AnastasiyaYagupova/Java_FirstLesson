import java.util.Arrays;
public class Example000 {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false
    
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false
    
        printString("abcd", 5); // abcdabcdabcdabcdabcd
        System.out.println();
        System.out.println(isLeapYear(2020)); // true

        int[] array = createArray(5, 7); // [7,7,7,7,7]
        System.out.println(Arrays.toString(array));


        //int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        //int x = array[2][3];
    }
    
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        if(a+b >= 10 & a+b <= 20){
            return true;
        }
        else{
            return false;
        }
    }
    
    private static boolean isPositive(int x) {
        if(x>= 0){
            return true;
        }
        else{
            return false; 
        }
        
    }
    
    private static void printString(String source, int repeat) {
        for(int i = 1; i <= repeat; i++ ){
            System.out.print(source);
        }
    }
    
    private static boolean isLeapYear(int year) {
        if(year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0 ){
            return true;
        }
        else{
            return false;
        }
    }

    private static int[] createArray(int len, int initialValue) {  
        int array[] = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = initialValue;
        }
        return array;
    }
}