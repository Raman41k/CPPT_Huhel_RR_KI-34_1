import java.io.*;
import java.util.*;

public class lab2 {

    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        int SIZE;
        int k = 0;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Введіть розмір квадратної матриці: ");
        SIZE = in.nextInt();
        in.nextLine();
        nRows = SIZE - (SIZE / 2);
        arr = new char[nRows][];
        for (int i = 0; i < nRows; i++) {
            arr[i] = new char[SIZE - k];
            k += 2;
        }
        k = 1;
        int counter = 0;
        boolean run = true;
        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();

        exit:
        for (int i = 0; i < nRows; i++) {
            while(run){
                System.out.print("  ");
                ++counter;
                if(counter == k){
                    ++k;
                    counter = 0;
                    run = false;
                }
            }
            for (int j = 0; j < arr[i].length; j++) {
                if (filler.length() == 1) {
                    arr[i][j] = (char) filler.codePointAt(0);
                    System.out.print(arr[i][j] + " ");
                    fout.print(arr[i][j] + " ");
                } else if (filler.length() == 0) {
                    System.out.print("\nНе введено символ заповнювач");
                    break exit;
                } else {
                    System.out.print("\nЗабагато символів заповнювачів");
                    break exit;
                }
            }
            System.out.print("\n");
            fout.print("\n");
            run = true;
        }
        fout.flush();
        fout.close();

    }
}