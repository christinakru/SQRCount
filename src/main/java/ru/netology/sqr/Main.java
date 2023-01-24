package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SQRService service = new SQRService();
        System.out.println(service.GetNumOfSquares(0, 100));
    }
}