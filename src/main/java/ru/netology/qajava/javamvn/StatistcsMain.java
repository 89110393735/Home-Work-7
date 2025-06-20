package ru.netology.qajava.javamvn;

class StatisticsService {
    public long findMax(long[] incomes) {

        long currentMax = incomes[0];
        for (long income : incomes) {
            if (currentMax < income) {
                currentMax = income;
            }
        }
        return currentMax;

    }
}