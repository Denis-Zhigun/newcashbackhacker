package ru.netology.domain;

public class CashbackHacker {

    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }

    public static void main(String[] args) {

        System.out.println(1000-1100 % 1000);
    }
}

