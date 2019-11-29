import java.util.Scanner;

public class DZ_k_25_10_19 {
    static Scanner var = new Scanner(System.in);
    static int chislo;
    static String stringChislo;

    public static void main(String[] args) {
        nomer145();
    }

    /*
    133
    133
    133
     */
    public static void nomer133() {
        int max = 0, kolvo = 1;
        while (true) {
            stringChislo = var.next();
            try {
                chislo = Integer.parseInt(stringChislo);
            } catch (NumberFormatException e) {
                break;
            }
            if (max < chislo) {
                max = chislo;
                kolvo = 1;
            } else if (max == chislo) {
                kolvo++;
            }
            System.out.println("Промежуточный результат: " + kolvo);
        }
        System.out.println("Количество максимальных элементов: " + kolvo);
    }

    /*
    134
    134
    134
     */
    public static void nomer134() {

        String Stroka1;
        String Stroka2 = "";
        int chislo, kolvo = 0;
        while (true) {
            stringChislo = var.next();
            try {
                chislo = Integer.parseInt(stringChislo);
            } catch (NumberFormatException e) {
                break;
            }
            Stroka1 = Integer.toString(chislo * chislo);
            if (Stroka2.contains(Stroka1)) {
            } else {
                Stroka2 = Stroka2 + "\n " + Stroka1;
                kolvo++;
            }
            System.out.println("Промежуточный результат: " + kolvo);
        }
        System.out.println("Количество различных значений квадратов: " + kolvo);
    }

    /*
    135
    135
    135
     */
    public static void nomer135() {
        float chislo, sum = 0, counter = 0, srar = 0;
        while (true) {
            stringChislo = var.next();
            try {
                chislo = Float.parseFloat(stringChislo.trim());
            } catch (NumberFormatException e) {
                break;
            }
            sum += chislo;
            counter += 1;
            srar = sum / counter;
            System.out.println("Промежуточный результат: " + srar);
        }

        System.out.println("Среднее арифметическое: " + srar);
    }

    /*
    136
    136
    136
     */
    public static void nomer136() {
        int chisloprev = -1, maxmon = 1, maxnow = 1;
        while (true) {
            stringChislo = var.next();
            try {
                chislo = Integer.parseInt(stringChislo);
            } catch (NumberFormatException e) {
                break;
            }
            if (chislo == chisloprev) {
                maxnow++;
            } else {
                maxmon = maxnow;
                maxnow = 1;
            }
            chisloprev = chislo;
            if (maxmon > maxnow) {
                System.out.println("Промежуточный результат: " + maxmon);
            } else {
                System.out.println("Промежуточный результат: " + maxnow);
            }
        }
        if (maxmon > maxnow) {
            System.out.println("Максимальное число идущих подряд одинаковых элементов: " + maxmon);
        } else {
            System.out.println("Максимальное число идущих подряд одинаковых элементов: " + maxnow);
        }
    }

    /*
    137
    137
    137
     */
    public static void nomer137() {
        int max = 0, begin = 0, end = 0, nomer = 1;
        while (true) {
            stringChislo = var.next();
            try {
                chislo = Integer.parseInt(stringChislo);
            } catch (NumberFormatException e) {
                break;
            }
            if (chislo > max) {
                max = chislo;
                begin = nomer;
            } else if (chislo == max) {
                end = nomer;
            }
            nomer++;
            System.out.println("Промежуточный результат: " + begin + " и " + end);
        }
        System.out.println("Номер первого максимального элемента: " + begin + "\n Номер последнего максимального элемента:" + end);
    }

    /*
    138
    138
    138
     */
    public static void nomer138() {
        int nomer = 1, cond = 0;
        while (true) {
            stringChislo = var.next();
            try {
                chislo = Integer.parseInt(stringChislo);
            } catch (NumberFormatException e) {
                break;
            }
            if (chislo == 0 && cond == 0) {
                cond = nomer;
            }
            nomer++;
            System.out.println("Промежуточный результат: " + cond);
        }
        System.out.println("Номер первого '0': " + cond);
    }

    /*
    139
    139
    139
     */
    public static void nomer139() {
        int chisloprev = -1, counter = 0;
        while (true) {
            stringChislo = var.next();
            try {
                chislo = Integer.parseInt(stringChislo);
            } catch (NumberFormatException e) {
                break;
            }
            if (chislo > chisloprev) {
                counter++;
            }
            chisloprev = chislo;
            System.out.println("Промежуточный результат: " + counter);
        }
        System.out.println("Число элементов, больших предыдущего: " + counter);
    }

    /*
    140
    140
    140
     */
    public static void nomer140() {
        int min1 = 2147483647, min2 = 2147483647;
        while (true) {
            stringChislo = var.next();
            try {
                chislo = Integer.parseInt(stringChislo);
            } catch (NumberFormatException e) {
                break;
            }
            if (chislo < min1) {
                min1 = chislo;
            } else if (chislo > min1 && chislo < min2) {
                min2 = chislo;
            }
            if (min2 != 2147483647) {
                System.out.println("Промежуточный результат: " + min2);
            } else {
                System.out.println("Промежуточный результат: No");
            }
        }
        if (min2 != 2147483647) {
            System.out.println("Второй по величине элемент: " + min2);
        } else {
            System.out.println("No");
        }
    }

    /*
    141
    141
    141
     */
    /*
    public static void nomer141() {
        int x = -1, y = -1, z = -1;
        for (int i = 0; i < 3; i++) {
            stringChislo = var.next();
            try {
                chislo = Integer.parseInt(stringChislo);
            } catch (NumberFormatException e) {
                break;
            }
            if (i == 0){
                x = chislo;
            } else if (i == 1){
                y = chislo;
            } else if (i == 2){
                z = chislo;
            }
            System.out.println(x + " " + y + " " + z);
        }
        while (true) {
            stringChislo = var.next();
            try {
                chislo = Integer.parseInt(stringChislo);
            } catch (NumberFormatException e) {
                break;
            }
            x = y;
            y = z;
            z = chislo;
            System.out.println(x + " " + y + " " + z);
        }
    }
    */
    /*
    142
    142
    142
     */
    /*
    public static void nomer142() {
        int chisloprev = -1, maxmon = 1, maxnow = 1;
        while (true) {
            stringChislo = var.next();
            try {
                chislo = Integer.parseInt(stringChislo);
            } catch (NumberFormatException e) {
                break;
            }
            if (chislo >= chisloprev) {
                while (chislo >= chisloprev) {
                    maxnow++;
                    stringChislo = var.next();
                    try {
                        chislo = Integer.parseInt(stringChislo);
                    } catch (NumberFormatException e) {
                        break;
                    }
                    chisloprev = chislo;
                }
            }
            if (maxnow > maxmon) {
                maxmon = maxnow;
            }
            maxnow = 1;
            if (chislo < chisloprev){
                while (chislo <= chisloprev)
                maxnow++;
                stringChislo = var.next();
                try {
                    chislo = Integer.parseInt(stringChislo);
                } catch (NumberFormatException e) {
                    break;
                }
                chisloprev = chislo;
            }
            if (maxnow > maxmon) {
                maxmon = maxnow;
            }
            maxnow = 1;
            chisloprev = chislo;
        }
        if (maxmon > maxnow) {
            System.out.println(maxmon);
        } else {
            System.out.println(maxnow);
        }
    }
    */
    /*
    143
    143
    143
     */
    public static void nomer143() {
        int chisloprev = 0, counter = 0;
        while (true) {
            stringChislo = var.next();
            try {
                chislo = Integer.parseInt(stringChislo);
            } catch (NumberFormatException e) {
                break;
            }
            if (chisloprev == 0 && chislo == 1) {
                counter++;
            }
            chisloprev = chislo;
            System.out.println("Промежуточный результат: " + counter);
        }
        System.out.println("Число групп из единиц, разделенных нулями: " + counter);
    }

    /*
    144
    144
    144
     */
    public static void nomer144() {
        int chislo1, chislo2, chislo3, chislo4, chislo5, chislo6, counter = 0;
        while (true) {
            stringChislo = var.next();
            try {
                chislo1 = Integer.parseInt(stringChislo);
            } catch (NumberFormatException e) {
                break;
            }
            if (chislo1 == 1) {
                stringChislo = var.next();
                try {
                    chislo2 = Integer.parseInt(stringChislo);
                } catch (NumberFormatException e) {
                    break;
                }
                System.out.println("Промежуточный результат: " + counter);
                if (chislo2 == 2) {
                    stringChislo = var.next();
                    try {
                        chislo3 = Integer.parseInt(stringChislo);
                    } catch (NumberFormatException ex) {
                        break;
                    }
                    System.out.println("Промежуточный результат: " + counter);
                    if (chislo3 == 3) {
                        stringChislo = var.next();
                        try {
                            chislo4 = Integer.parseInt(stringChislo);
                        } catch (NumberFormatException exe) {
                            break;
                        }
                        System.out.println("Промежуточный результат: " + counter);
                        if (chislo4 == 4) {
                            stringChislo = var.next();
                            try {
                                chislo5 = Integer.parseInt(stringChislo);
                            } catch (NumberFormatException exep) {
                                break;
                            }
                            System.out.println("Промежуточный результат: " + counter);
                            if (chislo5 == 5) {
                                stringChislo = var.next();
                                try {
                                    chislo6 = Integer.parseInt(stringChislo);
                                } catch (NumberFormatException exept) {
                                    break;
                                }
                                System.out.println("Промежуточный результат: " + counter);
                                if (chislo6 == 6) {
                                    counter++;
                                    System.out.println("Промежуточный результат: " + counter);
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Промежуточный результат: " + counter);
        }
        System.out.println("Количество вхождений фрагмента 1, 2, 3, 4, 5, 6: " + counter);
    }
    /*
    145
    145
    145
     */
    public static void nomer145() {
        int chislo1, chislo2, counter = 0;
        boolean flag = false;
        while (true) {
            stringChislo = var.next();
            try {
                chislo1 = Integer.parseInt(stringChislo);
            } catch (NumberFormatException e) {
                break;
            }
            System.out.println("Промежуточный результат: " + counter);
            if (chislo1 == 1) {
                stringChislo = var.next();
                try {
                    chislo2 = Integer.parseInt(stringChislo);
                } catch (NumberFormatException e) {
                    break;
                }
                System.out.println("Промежуточный результат: " + counter);
                if (chislo2 == 2) {
                    stringChislo = var.next();
                    try {
                        chislo1 = Integer.parseInt(stringChislo);
                    } catch (NumberFormatException ex) {
                        break;
                    }
                    System.out.println("Промежуточный результат: " + counter);
                    if (chislo1 == 1) {
                        stringChislo = var.next();
                        try {
                            chislo2 = Integer.parseInt(stringChislo);
                        } catch (NumberFormatException exe) {
                            break;
                        }
                        System.out.println("Промежуточный результат: " + counter);
                        if (chislo2 == 2) {
                            stringChislo = var.next();
                            try {
                                chislo1 = Integer.parseInt(stringChislo);
                            } catch (NumberFormatException exep) {
                                break;
                            }
                            System.out.println("Промежуточный результат: " + counter);
                            if (chislo1 == 1) {
                                stringChislo = var.next();
                                try {
                                    chislo2 = Integer.parseInt(stringChislo);
                                } catch (NumberFormatException exept) {
                                    break;
                                }
                                System.out.println("Промежуточный результат: " + counter);
                                if (chislo2 == 2) {
                                    counter++;
                                    stringChislo = var.next();
                                    try {
                                        chislo1 = Integer.parseInt(stringChislo);
                                    } catch (NumberFormatException exep) {
                                        break;
                                    }
                                    System.out.println("Промежуточный результат: " + counter);
                                    while (true) {
                                        if (chislo1 == 1) {
                                            stringChislo = var.next();
                                            try {
                                                chislo2 = Integer.parseInt(stringChislo);
                                            } catch (NumberFormatException exepti) {
                                                flag = true;
                                                break;
                                            }
                                            System.out.println("Промежуточный результат: " + counter);
                                            if (chislo2 != 2){
                                                break;
                                            } else {
                                                ++counter;
                                                stringChislo = var.next();
                                                try {
                                                    chislo1 = Integer.parseInt(stringChislo);
                                                } catch (NumberFormatException exeptio) {
                                                    flag = true;
                                                    break;
                                                }
                                                System.out.println("Промежуточный результат: " + counter);
                                                if (chislo1 != 1){
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (flag){
                break;
            }
        }
        System.out.println("Количество вхождений фрагмента 1, 2, 1, 2, 1, 2: " + counter);
    }
}

