package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    }
    public static int allAmount(int [] purchases){
        int amount = 0;
        for (int purchase:purchases) {
            amount += purchase;
        }
        return amount;
    }

    public static int amountAverage(int[] purchases) {
        return allAmount(purchases) / purchases.length;
    }

    public static int monthMax(int[] purchases) {
        int max = purchases[0];
        int number = 0;
        int numberMax = 0;
        for (int purchase : purchases) {
            number++;
            if (max <= purchase) {
                max = purchase;
                numberMax = number;
            }
        }
        return numberMax;
    }
    public static int monthMin(int[] purchases) {
        int min = purchases[0];
        int number = 0;
        int numberMin = 0;
        for (int purchase : purchases) {
            number++;
            if (min >= purchase) {
                min = purchase;
                numberMin = number;
            }
        }
        return numberMin;
    }
    public static int  quantityUnderAverage(int[] purchases) {
        int average = amountAverage(purchases);
        int month = 0;
        int quantityUnder = 0;
        for (int purchase : purchases) {
            if (purchase < average) {
                month++;
                quantityUnder = month;
            }
        }
        return quantityUnder;
    }
    public static int quantityOverAverage(int[] purchases) {
        int average = amountAverage(purchases);
        int month = 0;
        int quantityOver = 0;
        for (int purchase : purchases) {
            if (purchase > average) {
                month++;
                quantityOver = month;
            }
        }
        return quantityOver;


    }

}