package com.javarush.games.minesweeper;


public class GameObject {
    public int x;
    public int y;
    public boolean isMine;              // Ячейка - мина
    public int countMineNeighbors;      // Количество мин-соседей у ячейки
    public boolean isOpen;              // Ячейка открыта
    public boolean isFlag;
    
    public GameObject(int x, int y, boolean isMine){
        this.x = x;
        this.y = y;
        this.isMine = isMine;
    }
}