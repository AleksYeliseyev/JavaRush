package com.javarush.task.task14.task1408;

class UkrainianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 50;
    }
    String getDescription(){
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.UKRAINE, this.getCountOfEggsPerMonth());
    }
}
