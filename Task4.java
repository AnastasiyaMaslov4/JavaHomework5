
// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

public class Task4 {
    public static void main(String[] args) {
        String[][] arr = new String[8][8];
        // Заполняем массив пустыми строками
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = " ";
            }
        }
        
        arr[0][0] = "Ф"; // Поставим первого ферзя на клетку А1

        // Отмечаем использованную горизонталь
        for (int i = 0; i < arr.length; i++) {
            if (!arr[0][i].equals("Ф")) arr[0][i] = "Х";
        }

        // Отмечаем использованную вертикаль
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i][0].equals("Ф")) arr[i][0] = "Х";
        }

        // Отмечаем использованную диагональ
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i][i].equals("Ф")) arr[i][i] = "Х";
        }

        printArray(arr);
        System.out.println();

        for (int i = 1; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if (!arr[i][k].equals("Х")) {
                    arr[i][k] = "Ф";
                    for (int j = 0; j < arr.length; j++) {
                        if (!arr[i][j].equals("Ф")) arr[i][j] = "Х"; 
                        if (!arr[j][k].equals("Ф")) arr[j][k] = "Х";
                    }
                    if (i<arr.length-1 && k<arr.length-1) arr[i+1][k+1] = "Х";
                    if (i<arr.length-1 && k<arr.length-1) arr[i+1][k-1] = "Х"; 
                          
                }
        
            }
        
        }

        printArray(arr);


    }

    public static void printArray(String arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "|");
            }
            System.out.println();
        }
    }

}
