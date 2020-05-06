package com.javarush.task.task14.task1408;

class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 100;
    }
    String getDescription(){
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.RUSSIA, this.getCountOfEggsPerMonth());
    }

}