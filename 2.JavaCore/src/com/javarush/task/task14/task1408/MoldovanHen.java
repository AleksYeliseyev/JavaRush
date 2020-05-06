package com.javarush.task.task14.task1408;

class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }
    String getDescription(){
        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.MOLDOVA, this.getCountOfEggsPerMonth());
    }
}