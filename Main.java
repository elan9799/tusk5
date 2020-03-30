import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class Main {
    static int[] array = new int[400]; // не понял каким образом взять конкретно певое число из файла для обозначения массива (да и там ошибку выдовало)
    static Scanner scan = new Scanner(System.in);// и после этого не брать его внутрь массива

    public static void main(String[] args) {
        openFile();
        readFile();

        int [] jan = new int [31];
        int [] feb = new int [28];
        int [] mar = new int [31];
        int [] apr = new int [30];
        int [] may = new int [31];
        int [] jun = new int [30];
        int [] jul = new int [31];
        int [] avg = new int [31];
        int [] sep = new int [30];
        int [] oct = new int [31];
        int [] now = new int [30];
        int [] dec = new int [31];

        int counter = 0;
        for (int i = 1; i < 400; i++) {
            if(i <= 31){
                jan [counter] = array[i];
                counter++;
                if (i == 31){counter = 0;}
            }else if (i > 31 && i <= 31+28){
                feb [counter] = array[i];
                counter++;
                if (i == 31+28){counter = 0;}
            }else if (i > 31+28 && i <= 31+28+31) {
                mar [counter] = array[i];
                counter++;
                if (i == 31+28+31){counter = 0;}
            }else if (i > 31+28+31 && i <= 31+28+31+30) {
                apr [counter] = array[i];
                counter++;
                if (i == 31+28+31+30){counter = 0;}
            }else if (i > 31+28+31+30 && i <= 31+28+31+30+31) {
                may [counter] = array[i];
                counter++;
                if (i == 31+28+31+30+31){counter = 0;}
            }else if (i > 31+28+31+30+31 && i <= 31+28+31+30+31+30) {
                jun [counter] = array[i];
                counter++;
                if (i == 31+28+31+30+31+30){counter = 0;}
            }else if (i > 31+28+31+30+31+30 && i <= 31+28+31+30+31+30+31) {
                jul [counter] = array[i];
                counter++;
                if (i == 31+28+31+30+31+30+31){counter = 0;}
            }else if (i > 31+28+31+30+31+30+31 && i <= 31+28+31+30+31+30+31+31) {
                avg [counter] = array[i];
                counter++;
                if (i == 31+28+31+30+31+30+31+31){counter = 0;}
            }else if (i > 31+28+31+30+31+30+31+31 && i <= 31+28+31+30+31+30+31+31+30) {
                sep [counter] = array[i];
                counter++;
                if (i == 31+28+31+30+31+30+31+31+30){counter = 0;}
            }else if (i > 31+28+31+30+31+30+31+31+30 && i <= 31+28+31+30+31+30+31+31+30+31) {
                oct [counter] = array[i];
                counter++;
                if (i == 31+28+31+30+31+30+31+31+30+31){counter = 0;}
            }else if (i > 31+28+31+30+31+30+31+31+30+31 && i <= 31+28+31+30+31+30+31+31+30+31+30) {
                now [counter] = array[i];
                counter++;
                if (i == 31+28+31+30+31+30+31+31+30+31+30){counter = 0;}
            }else if (i > 31+28+31+30+31+30+31+31+30+31+30 && i <= 31+28+31+30+31+30+31+31+30+31+30+31) {
                dec [counter] = array[i];
                counter++;
                if (i == 31+28+31+30+31+30+31+31+30+31+30+31){counter = 0;}
            }
        }

        while (true) {
            System.out.println("введите команду" + "\n" + "||список комманд||" + "\n" + "температура воздуха определенного дня = 1" + "\n"
                + "средняя температура за месяц = 2" + "\n" + "средняя температура за период в неск месяцев = 3" + "\n"
                + "самая низкая температура за мес = 4" + "\n" + "самая высокая температура за мес = 5" + "\n" + "exit = 6");
            System.out.println("введите дня(число)/месяц/неск месяцев");
            int com1 = scan.nextInt();
            if (com1 == 3){
                String month = scan.next();
                String month2 = scan.next();
            }else if (com1 == 2 || com1 == 4 || com1 == 5){
                String month = scan.next();
            }else if (com1 == 1){
                String month = scan.next();
                int day = scan.nextInt();
            }
        }

        }


        private static void openFile () {
            try {
                scan = new Scanner(new File("res//data.txt"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "файл не найден");
            }

        }
        private static void readFile () {
            int counter = 0;
            while (scan.hasNext()) {
                array[counter] = scan.nextInt();
                counter++;
            }
        }
        private static void out () {
            System.out.println(Arrays.toString(array));
        }
    }
