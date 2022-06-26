package ru.netology.sqr;

public class SQRService {

    public int calcSQR(int x, int y) {
        int n = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= x && i * i <= y) {
                n++;
            }
        }
        return n;
    }
}