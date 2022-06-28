package ru.netology.sqr;

public class SQRService {
    public static int calcSQR(int minLimit, int maxLimit) {
        int numberSQR = 0;

        for (int i = 10; i < 99; i++) {
            if (i * i >= minLimit && i * i <= maxLimit) {
                numberSQR = numberSQR + 1;
            }
        }
        return numberSQR;
    }
}