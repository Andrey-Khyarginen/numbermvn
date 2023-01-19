package ru.netology.sqr.main;
public class SQRService {
    public int calcSQRt(int x, int y) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if ((i * i >= x) & (i * i <= y))
               counter = counter + 1;
        }
        return counter;
    }
}
