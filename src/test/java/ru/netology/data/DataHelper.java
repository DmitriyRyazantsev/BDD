package ru.netology.data;

import lombok.Value;

import java.util.Random;

public class DataHelper {
    private DataHelper() {
    }

    public static VereficationCode getVereficationCode() {
        return new VereficationCode("12345");
    }

    public static AutoInfo getAutoInfo() {
        return new AutoInfo("vasya","qwerty123");
    }

    public static  CardInfo getFirstCardInfo() {
        return new CardInfo("5559 0000 0000 0001");
    }
    public static  CardInfo getSecondCardInfo() {
        return new CardInfo("5559 0000 0000 0002");
    }
    public static int generateValidAmount(int balance) {
        return new Random().nextInt(balance)+1;
    }
    public static int generateInvalidAmount(int balance) {
        return Math.abs(balance) + new Random().nextInt(10000);
    }
    @Value

}
