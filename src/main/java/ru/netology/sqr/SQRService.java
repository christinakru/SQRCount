package ru.netology.sqr;

public class SQRService {
    public int GetNumOfSquares(int low, int high) {
        int number = 0;
        for (int i = 10; i < 99; i++) {
            int square = (int)Math.pow(i, 2);
            if(square < low){
                continue;
            }
            if (square > high){
                break;
            }
            number++;
        }
        return number;
    }
}
