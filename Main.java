import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
// -XX:+ShowCodeDetailsInExceptionMessages
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

        Scanner scan = new Scanner(System.in);// сначала не понимал что нужно снова создавать объект в методе мейн даже если он уже создан в классе
        String month = null;
        String month2 = null;
        int day = 0;

        while (true) {
            System.out.println("\n" + "введите команду" + "\n" + "||список комманд||" + "\n" + "температура воздуха определенного дня = 1" + "\n"
                    + "средняя температура за месяц = 2" + "\n" + "средняя температура за период в неск месяцев = 3" + "\n"
                    + "самая низкая температура за мес = 4" + "\n" + "самая высокая температура за мес = 5" + "\n" + "exit = 6");
            int com1 = scan.nextInt();
            if (com1 == 3) {
                System.out.println("введите первый месяц ||Январь||Февраль||Март||Апрель||Май||Июнь||Июль||Август||Сентябрь||Октябрь||Ноябрь||Декабрь||");
                month = scan.next();
                System.out.println("введите второй месяц ||Январь||Февраль||Март||Апрель||Май||Июнь||Июль||Август||Сентябрь||Октябрь||Ноябрь||Декабрь||");
                month2 = scan.next();
            } else if (com1 == 2 || com1 == 4 || com1 == 5) {
                System.out.println("введите месяц ||Январь||Февраль||Март||Апрель||Май||Июнь||Июль||Август||Сентябрь||Октябрь||Ноябрь||Декабрь||");
                month = scan.next();
            } else if (com1 == 1) {
                System.out.println("введите месяц ||Январь||Февраль||Март||Апрель||Май||Июнь||Июль||Август||Сентябрь||Октябрь||Ноябрь||Декабрь||");
                month = scan.next();
                System.out.println("введите день");
                day = scan.nextInt();
            }else if (com1 == 6){
                System.out.println("exit");
            }else{
                System.out.println("ERROR");
            }

            switch (com1) {
                case 1: // температура воздуха определенного дня
                    if(month.equals("Январь")){
                        System.out.println("температура " + day + " Января " + jan[day]);
                    }else  if(month.equals("Февраль")){
                        System.out.println("температура " + day + " Февраля " + feb[day]);
                    }else  if(month.equals("Март")){
                        System.out.println("температура " + day + " Марта " + mar[day]);
                    }else  if(month.equals("Апрель")){
                        System.out.println("температура " + day + " Апреля " + apr[day]);
                    }else  if(month.equals("Май")){
                        System.out.println("температура " + day + " Мая " + may[day]);
                    }else  if(month.equals("Июнь")){
                        System.out.println("температура " + day + " Июня " + jun[day]);
                    }else  if(month.equals("Июль")){
                        System.out.println("температура " + day + " Июля " + jul[day]);
                    }else  if(month.equals("Август")){
                        System.out.println("температура " + day + " Августа " + avg[day]);
                    }else  if(month.equals("Сентябрь")){
                        System.out.println("температура " + day + " Сентября " + sep[day]);
                    }else  if(month.equals("Октябрь")){
                        System.out.println("температура " + day + " Октября " + oct[day]);
                    }else  if(month.equals("Ноябрь")){
                        System.out.println("температура " + day + " Ноября " + now[day]);
                    }else  if(month.equals("Декабрь")){
                        System.out.println("температура " + day + " Декабря " + dec[day]);
                    }else{
                        System.out.println("ERROR");
                    }
                    break;
                case 2: //средняя температура за месяц
                    if(month.equals("Январь")){
                        int sum = 0;
                        for (int i = 0; i < jan.length; i++) {
                            sum = sum + jan[i];
                        }
                        sum = sum / (jan.length - 1);
                        System.out.println("Средняя t за январь = " + sum);
                    }else  if(month.equals("Февраль")){
                        int sum = 0;
                        for (int i = 0; i < feb.length; i++) {
                            sum = sum + feb[i];
                        }
                        sum = sum / (feb.length - 1);
                        System.out.println("Средняя t за февраль = " + sum);
                    }else  if(month.equals("Март")){
                        int sum = 0;
                        for (int i = 0; i < mar.length; i++) {
                            sum = sum + mar[i];
                        }
                        sum = sum / (mar.length - 1);
                        System.out.println("Средняя t за март = " + sum);
                    }else  if(month.equals("Апрель")){
                        int sum = 0;
                        for (int i = 0; i < apr.length; i++) {
                            sum = sum + apr[i];
                        }
                        sum = sum / (apr.length - 1);
                        System.out.println("Средняя t за апрель = " + sum);
                    }else  if(month.equals("Май")){
                        int sum = 0;
                        for (int i = 0; i < may.length; i++) {
                            sum = sum + may[i];
                        }
                        sum = sum / (may.length - 1);
                        System.out.println("Средняя t за май = " + sum);
                    }else  if(month.equals("Июнь")){
                        int sum = 0;
                        for (int i = 0; i < jun.length; i++) {
                            sum = sum + jun[i];
                        }
                        sum = sum / (jun.length - 1);
                        System.out.println("Средняя t за июнь = " + sum);
                    }else  if(month.equals("Июль")){
                        int sum = 0;
                        for (int i = 0; i < jul.length; i++) {
                            sum = sum + jul[i];
                        }
                        sum = sum / (jul.length - 1);
                        System.out.println("Средняя t за июль = " + sum);
                    }else  if(month.equals("Август")){
                        int sum = 0;
                        for (int i = 0; i < avg.length; i++) {
                            sum = sum + avg[i];
                        }
                        sum = sum / (avg.length - 1);
                        System.out.println("Средняя t за август = " + sum);
                    }else  if(month.equals("Сентябрь")){
                        int sum = 0;
                        for (int i = 0; i < sep.length; i++) {
                            sum = sum + sep[i];
                        }
                        sum = sum / (sep.length - 1);
                        System.out.println("Средняя t за сентябрь = " + sum);
                    }else  if(month.equals("Октябрь")){
                        int sum = 0;
                        for (int i = 0; i < oct.length; i++) {
                            sum = sum + oct[i];
                        }
                        sum = sum / (oct.length - 1);
                        System.out.println("Средняя t за октябрь = " + sum);
                    }else  if(month.equals("Ноябрь")){
                        int sum = 0;
                        for (int i = 0; i < now.length; i++) {
                            sum = sum + now[i];
                        }
                        sum = sum / (now.length - 1);
                        System.out.println("Средняя t за ноябрь = " + sum);
                    }else  if(month.equals("Декабрь")){
                        int sum = 0;
                        for (int i = 0; i < dec.length; i++) {
                            sum = sum + dec[i];
                        }
                        sum = sum / (dec.length - 1);
                        System.out.println("Средняя t за декабрь = " + sum);
                    }else{
                        System.out.println("ERROR");
                    }
                    break;
                case 3: //средняя за неск мес
                    int firstD = 0;
                    int secondD = 0;
                    if(month.equals("Январь")){
                        firstD = 1;
                    }else if(month.equals("Февраль")){
                        firstD = jan.length + 1;
                    }else if(month.equals("Март")){
                        firstD = jan.length+ feb.length + 1;
                    }else if(month.equals("Апрель")){
                        firstD = jan.length+ feb.length + mar.length + 1;
                    }else if(month.equals("Май")){
                        firstD = jan.length+ feb.length + mar.length + apr.length + 1;
                    }else if(month.equals("Июнь")){
                        firstD = jan.length+ feb.length + mar.length + apr.length + may.length + 1;
                    }else if(month.equals("Июль")){
                        firstD = jan.length+ feb.length + mar.length + apr.length + may.length + jun.length + 1;
                    }else if(month.equals("Август")){
                        firstD = jan.length+ feb.length + mar.length + apr.length + may.length + jun.length + jul.length + 1;
                    }else if(month.equals("Сентябрь")){
                        firstD = jan.length+ feb.length + mar.length + apr.length + may.length + jun.length + jul.length + avg.length + 1;
                    }else if(month.equals("Октябрь")){
                        firstD = jan.length+ feb.length + mar.length + apr.length + may.length + jun.length + jul.length + avg.length + sep.length + 1;
                    }else if(month.equals("Ноябрь")){
                        firstD = jan.length+ feb.length + mar.length + apr.length + may.length + jun.length + jul.length + avg.length + sep.length + oct.length + 1;
                    }else if(month.equals("Декабрь")){
                        firstD = jan.length+ feb.length + mar.length + apr.length + may.length + jun.length + jul.length + avg.length + sep.length + oct.length + now.length + 1;
                    }else {
                        System.out.println("ERROR");
                    }

                    if(month2.equals("Январь")){
                        secondD = 1 + jan.length;
                    }else if(month2.equals("Февраль")){
                        secondD = jan.length + 1 + feb.length;
                    }else if(month2.equals("Март")){
                        secondD = jan.length+ feb.length + 1 + mar.length;
                    }else if(month2.equals("Апрель")){
                        secondD = jan.length+ feb.length + mar.length + 1 + apr.length;
                    }else if(month2.equals("Май")){
                        secondD = jan.length+ feb.length + mar.length + apr.length + 1 + may.length;
                    }else if(month2.equals("Июнь")){
                        secondD = jan.length+ feb.length + mar.length + apr.length + may.length + 1 + jun.length;
                    }else if(month2.equals("Июль")){
                        secondD = jan.length+ feb.length + mar.length + apr.length + may.length + jun.length + 1 + jul.length;
                    }else if(month2.equals("Август")){
                        secondD = jan.length+ feb.length + mar.length + apr.length + may.length + jun.length + jul.length + 1 + avg.length;
                    }else if(month2.equals("Сентябрь")){
                        secondD = jan.length+ feb.length + mar.length + apr.length + may.length + jun.length + jul.length + avg.length + 1 + sep.length;
                    }else if(month2.equals("Октябрь")){
                        secondD = jan.length+ feb.length + mar.length + apr.length + may.length + jun.length + jul.length + avg.length + sep.length + 1 + oct.length;
                    }else if(month2.equals("Ноябрь")){
                        secondD = jan.length+ feb.length + mar.length + apr.length + may.length + jun.length + jul.length + avg.length + sep.length + oct.length + 1 + now.length;
                    }else if(month2.equals("Декабрь")){
                        secondD = jan.length+ feb.length + mar.length + apr.length + may.length + jun.length + jul.length + avg.length + sep.length + oct.length + now.length + 1 + dec.length;
                    }else {
                        System.out.println("ERROR");
                    }

                    int avrg = 0;
                    for (int i = firstD; i <= secondD; i++) {
                        avrg = array[i] + avrg;
                    }
                    avrg = avrg / (secondD - firstD);
                    System.out.println("средняя темп = " + avrg);
                    break;
                case 4: //самая низкая температура за мес
                    if(month.equals("Январь")){
                        int min = jan[0];
                        for (int i = 0; i < jan.length; i++) {
                            if(jan[i] < min){
                                min = jan[i];
                            }
                        }
                        System.out.println("min t за январь = " + min);
                    }else  if(month.equals("Февраль")){
                        int min = feb[0];
                        for (int i = 0; i < feb.length; i++) {
                            if(feb[i] < min){
                                min = feb[i];
                            }
                        }
                        System.out.println("min t за февраль = " + min);
                    }else  if(month.equals("Март")){
                        int min = mar[0];
                        for (int i = 0; i < mar.length; i++) {
                            if(mar[i] < min){
                                min = mar[i];
                            }
                        }
                        System.out.println("min t за март = " + min);
                    }else  if(month.equals("Апрель")){
                        int min = apr[0];
                        for (int i = 0; i < apr.length; i++) {
                            if(apr[i] < min){
                                min = apr[i];
                            }
                        }
                        System.out.println("min t за апрель = " + min);
                    }else  if(month.equals("Май")){
                        int min = may[0];
                        for (int i = 0; i < may.length; i++) {
                            if(may[i] < min){
                                min = may[i];
                            }
                        }
                        System.out.println("min t за май = " + min);
                    }else  if(month.equals("Июнь")){
                        int min = jun[0];
                        for (int i = 0; i < jun.length; i++) {
                            if(jun[i] < min){
                                min = jun[i];
                            }
                        }
                        System.out.println("min t за июнь = " + min);
                    }else  if(month.equals("Июль")){
                        int min = jul[0];
                        for (int i = 0; i < jul.length; i++) {
                            if(jul[i] < min){
                                min = jul[i];
                            }
                        }
                        System.out.println("min t за июль = " + min);
                    }else  if(month.equals("Август")){
                        int min = avg[0];
                        for (int i = 0; i < avg.length; i++) {
                            if(avg[i] < min){
                                min = avg[i];
                            }
                        }
                        System.out.println("min t за август = " + min);
                    }else  if(month.equals("Сентябрь")){
                        int min = sep[0];
                        for (int i = 0; i < sep.length; i++) {
                            if(sep[i] < min){
                                min = sep[i];
                            }
                        }
                        System.out.println("min t за сентябрь = " + min);
                    }else  if(month.equals("Октябрь")){
                        int min = oct[0];
                        for (int i = 0; i < oct.length; i++) {
                            if(oct[i] < min){
                                min = oct[i];
                            }
                        }
                        System.out.println("min t за октябрь = " + min);
                    }else  if(month.equals("Ноябрь")){
                        int min = now[0];
                        for (int i = 0; i < now.length; i++) {
                            if(now[i] < min){
                                min = now[i];
                            }
                        }
                        System.out.println("min t за ноябрь = " + min);
                    }else  if(month.equals("Декабрь")){
                        int min = dec[0];
                        for (int i = 0; i < dec.length; i++) {
                            if(dec[i] < min){
                                min = dec[i];
                            }
                        }
                        System.out.println("min t за декабрь = " + min);
                    }else{
                        System.out.println("ERROR");
                    }
                    break;
                case 5: //самая высокая температура за мес
                    if(month.equals("Январь")){
                        int max = jan[0];
                        for (int i = 0; i < jan.length; i++) {
                            if(jan[i] > max){
                                max = jan[i];
                            }
                        }
                        System.out.println("max t за январь = " + max);
                    }else  if(month.equals("Февраль")){
                        int max = feb[0];
                        for (int i = 0; i < feb.length; i++) {
                            if(feb[i] > max){
                                max = feb[i];
                            }
                        }
                        System.out.println("max t за февраль = " + max);
                    }else  if(month.equals("Март")){
                        int max = mar[0];
                        for (int i = 0; i < mar.length; i++) {
                            if(mar[i] > max){
                                max = mar[i];
                            }
                        }
                        System.out.println("max t за март = " + max);
                    }else  if(month.equals("Апрель")){
                        int max = apr[0];
                        for (int i = 0; i < apr.length; i++) {
                            if(apr[i] > max){
                                max = apr[i];
                            }
                        }
                        System.out.println("max t за апрель = " + max);
                    }else  if(month.equals("Май")){
                        int max = may[0];
                        for (int i = 0; i < may.length; i++) {
                            if(may[i] > max){
                                max = may[i];
                            }
                        }
                        System.out.println("max t за май = " + max);
                    }else  if(month.equals("Июнь")){
                        int max = jun[0];
                        for (int i = 0; i < jun.length; i++) {
                            if(jun[i] > max){
                                max = jun[i];
                            }
                        }
                        System.out.println("max t за июнь = " + max);
                    }else  if(month.equals("Июль")){
                        int max = jul[0];
                        for (int i = 0; i < jul.length; i++) {
                            if(jul[i] > max){
                                max = jul[i];
                            }
                        }
                        System.out.println("max t за июль = " + max);
                    }else  if(month.equals("Август")){
                        int max = avg[0];
                        for (int i = 0; i < avg.length; i++) {
                            if(avg[i] > max){
                                max = avg[i];
                            }
                        }
                        System.out.println("max t за август = " + max);
                    }else  if(month.equals("Сентябрь")){
                        int max = sep[0];
                        for (int i = 0; i < sep.length; i++) {
                            if(sep[i] > max){
                                max = sep[i];
                            }
                        }
                        System.out.println("max t за сентябрь = " + max);
                    }else  if(month.equals("Октябрь")){
                        int max = oct[0];
                        for (int i = 0; i < oct.length; i++) {
                            if(oct[i] > max){
                                max = oct[i];
                            }
                        }
                        System.out.println("max t за октябрь = " + max);
                    }else  if(month.equals("Ноябрь")){
                        int max = now[0];
                        for (int i = 0; i < now.length; i++) {
                            if(now[i] > max){
                                max = now[i];
                            }
                        }
                        System.out.println("max t за ноябрь = " + max);
                    }else  if(month.equals("Декабрь")){
                        int max = dec[0];
                        for (int i = 0; i < dec.length; i++) {
                            if(dec[i] > max){
                                max = dec[i];
                            }
                        }
                        System.out.println("max t за декабрь = " + max);
                    }else{
                        System.out.println("ERROR");
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        }
        }

//вот сто пудово можно было короче сделать эту дичь

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
