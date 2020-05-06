package com.javarush.games.minesweeper;


public class GameObject {
    public int x;
    public int y;
    public boolean isMine;              // Ячейка - мина
    public int countMineNeighbors;      // Колтчество мин-соседей
    public boolean isOpen;
    public boolean isFlag;
    
    public GameObject(int x, int y, boolean isMine){
        this.x = x;
        this.y = y;
        this.isMine = isMine;
    }
}