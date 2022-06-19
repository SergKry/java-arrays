package ru.netology.stats.services;

public class StatsService {

    public int amount(int[] sales) {
        int amount = 0;
        for (long sale : sales) {
            amount += sale;
        }
        return amount;
    }

    public int averageAmount(int[] sales) {

        return amount(sales) / sales.length;
    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] >= sales[maxMonth])
                maxMonth = i;
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth])
                minMonth = i;
        }
        return minMonth + 1;
    }

    public int quantityMonthLessAverage(int[] sales) {
        int countMonth = 0;
        int averageAmount = averageAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount)
                countMonth++;
        }
        return countMonth;
    }

    public int quantityMonthMoreAverage(int[] sales) {
        int countMonth = 0;
        int averageAmount = averageAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount)
                countMonth++;
        }
        return countMonth;
    }
}




