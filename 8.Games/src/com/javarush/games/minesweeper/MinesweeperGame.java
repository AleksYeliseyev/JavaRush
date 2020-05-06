package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 3;                      // Размер игрового поля
    private static final String MINE = "\uD83D\uDCA3";      // Картинка - мина
    private static final String FLAG = "\uD83D\uDEA9";      // Картинка - флажок
    static int countRecursion = 1;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private int countFlags;                                 // Количество флагов

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        // При клике на ячейку вызываем метод открытия ячейки
        openTile(x, y);
    }

    private void openTile(int x, int y) {
        gameField[y][x].isOpen = true;
        setCellColor(x, y, Color.DARKBLUE);
        // Если количество мин соседей = 0 и ячейка не мина, выводим в ней пустую строку (пробел)...
        if ((gameField[y][x].countMineNeighbors == 0) && (!gameField[y][x].isMine)) {
            System.out.println("Пустая ячейка" + gameField[y][x].isOpen);

            //setCellNumber(x, y, Integer.parseInt(" "));  // Разобраться как вывести пробел вместо 0
            setCellNumber(x, y, 0);
            // ...определяем список пустых соседей
            //List<GameObject> neighbors = getNeighbors(gameField[y][x]);
            System.out.println("Список соседей создан");
            // ...и для каждого не открытого соседа рекурсивно вызываем метод openTile(int, int)
            System.out.println("Старт рекурсии" + countRecursion);
            countRecursion++;
            for (GameObject go : getNeighbors(gameField[y][x])) {
                System.out.println("   y = " + y + "      x = " + x);
                System.out.println("go.y = " + go.y + "   go.x = " + go.x);
                //gameField[go.y][go.x].isOpen = true;
                setCellNumber(go.x, go.y, 0);
                openTile(go.x, go.y);
            }
            return;
        } else // Если ячейка - мина, то выводим в ней символ мины
            if (gameField[y][x].isMine) {
                setCellValue(x, y, MINE);
                // ...иначе выводим в ячейке количество мин соседей
            } else {
                System.out.println("Непустая ячейка - " + gameField[y][x].countMineNeighbors);
                setCellNumber(x, y, gameField[y][x].countMineNeighbors);
            }
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                    System.out.println("Mines = " + countMinesOnField);
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.GRAY);
            }
        }
        countMineNeighbors();
        countFlags = countMinesOnField;
    }

    private void countMineNeighbors() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                if (!gameField[y][x].isMine) {
                    List<GameObject> neighbors = getNeighbors(gameField[y][x]);
                    for (int i = 0; i < neighbors.size(); i++) {
                        if (neighbors.get(i).isMine) {
                            gameField[y][x].countMineNeighbors++;
                        }
                    }
                }
            }
        }
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                // Добавить условие проверки - открыта проверяемая ячейка или нет
                /*if (gameField[y][x].isOpen = true){
                    continue;
                }*/
                result.add(gameField[y][x]);
            }
        }
        return result;
    }
}