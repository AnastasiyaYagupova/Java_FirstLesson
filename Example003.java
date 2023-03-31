public class Example003 {
    /**
  * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
  * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
  * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
  * * Также заполнить элементы побочной диагонали
  *  //int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
  */
 public static void main(String[] args) {
     int[][] array = new int[5][5];
     createArray(array);
     PrintArray(array);
 }

 private static void createArray(int [][] array) { 
     for(int i = 0; i < array[0].length; i++){
         for(int j = 0; j < array[1].length; j++){
             if(i == j){
                 array[i][j] = 1;
             }
         }
     }
     int count_i = array[0].length-1;
     int count_j = 0;
     for(int i = array[0].length-1; i >=0; i--){
         for(int j = 0; j < array[1].length;j++){
             if(i == count_i && j == count_j){
                 array[i][j] = 1;
                 count_i--;
                 count_j++;
             }
         }
     }
 }
 private static void PrintArray(int [][] array){
     for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array[0].length; j++)

             System.out.print(array[i][j] + " ");

         System.out.println();
     }
 }
}
