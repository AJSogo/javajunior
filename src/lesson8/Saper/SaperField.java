package lesson8.Saper;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SaperField {

    private int[][] fieldWithMines; // оставляем это поле пустым,
    //так как мы не знаем, какой уровень выберет пользователь
    private int countMines;
    private boolean[][] fieldToOpen;
    private int countClosedCellsToWin = 0;

    public SaperField(String level) {
        if (level.equals("1") || level.equalsIgnoreCase("новичок")) {
            fieldWithMines = new int[9 + 2][9 + 2];
            fieldToOpen = new boolean[9 + 2][9 + 2];
            countMines = 10;
            countClosedCellsToWin = countMines + ((9 + 9) * 2) + 4;
        }
        if (level.equals("2") || level.equalsIgnoreCase("любитель")) {
            fieldWithMines = new int[16 + 2][16 + 2];
            fieldToOpen = new boolean[16 + 2][16 + 2];
            countMines = 40;
            countClosedCellsToWin = countMines + ((16 + 16) * 2) + 4;
        }
        if (level.equals("3") || level.equalsIgnoreCase("профессионал")) {
            fieldWithMines = new int[16 + 2][32 + 2];
            fieldToOpen = new boolean[16 + 2][32 + 2];
            countMines = 100;
            countClosedCellsToWin = countMines + ((16 + 32) * 2) + 4;
        }
        if (level.equals("4") || level.equalsIgnoreCase("особый")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество строк:");
            int row = scanner.nextInt();
            System.out.println("Введите количество столбцов:");
            int col = scanner.nextInt();
            System.out.println("Введите количество мин:");
            countMines = scanner.nextInt();
            fieldWithMines = new int[row + 2][col + 2];
            fieldToOpen = new boolean[row + 2][col + 2];
            countClosedCellsToWin = countMines + ((col + row) * 2) + 4;
        }

    }


    public void addRandomMines() {
        for (int i = 0; i < countMines; i++) {
            int row = ThreadLocalRandom.current().nextInt(1, fieldWithMines.length - 1);
            int col = ThreadLocalRandom.current().nextInt(1, fieldWithMines[0].length - 1);
            if (fieldWithMines[row][col] != -1) {
                fieldWithMines[row][col] = -1;
            } else {
                i--;
            }
        }
    }

    public void countAndAddNums() {
        for (int i = 0; i < fieldWithMines.length; i++) {
            for (int j = 0; j < fieldWithMines[0].length; j++) {
                // заполняем всех соседей +1 к числу, если в клеточке мина
                if (fieldWithMines[i][j] == -1) {
                    if (fieldWithMines[i - 1][j - 1] != -1) {

                        fieldWithMines[i - 1][j - 1] = fieldWithMines[i - 1][j - 1] + 1;
                    }
                    if (fieldWithMines[i - 1][j] != -1) {

                        fieldWithMines[i - 1][j - 1] = fieldWithMines[i - 1][j] + 1;
                    }
                    if (fieldWithMines[i - 1][j + 1] != -1) {

                        fieldWithMines[i - 1][j + 1] = fieldWithMines[i - 1][j + 1] + 1;
                    }
                    if (fieldWithMines[i + 1][j + 1] != -1) {

                        fieldWithMines[i + 1][j + 1] = fieldWithMines[i + 1][j + 1] + 1;
                    }
                    if (fieldWithMines[i][j - 1] != -1) {

                        fieldWithMines[i][j - 1] = fieldWithMines[i][j - 1] + 1;
                    }
                    if (fieldWithMines[i + 1][j - 1] != -1) {

                        fieldWithMines[i + 1][j - 1] = fieldWithMines[i + 1][j - 1] + 1;
                    }
                    if (fieldWithMines[i + 1][j] != -1) {

                        fieldWithMines[i + 1][j] = fieldWithMines[i + 1][j] + 1;
                    }
                    if (fieldWithMines[i][j + 1] != -1) {

                        fieldWithMines[i][j + 1] = fieldWithMines[i][j + 1] + 1;
                    }

                }

            }
        }
    }

    public void printField() {
        System.out.println("-----------Ваше Поле: ----------");
        for (int i = 1; i < fieldWithMines.length - 1; i++) { // обходим первую и последнюю строку
            for (int j = 1; j < fieldWithMines[0].length - 1; j++) { //обходим первую и последнюю колонку
                if (fieldToOpen[i][j] == true) {
                    System.out.print(fieldWithMines[i][j] + " ");

                } else { //если клеточка закрыта
                    System.out.print("X" + " ");
                }
            }
            System.out.println();
        }
    }

    public void printFieldEndGame() {
        System.out.println("----------Ваше Поле: ---------");
        for (int i = 1; i < fieldWithMines.length - 1; i++) { // обходим первую и последнюю строку
            for (int j = 1; j < fieldWithMines[0].length - 1; j++) { //обходим первую и последнюю колонку
                if (fieldToOpen[i][j] == true || fieldWithMines[i][j] == -1) { //если клеточка открыта или там мина
                    System.out.print(fieldWithMines[i][j] + " ");

                } else { //если клеточка закрыта
                    System.out.print("X" + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean doStep() {

        if (countClosedCellsToWin == this.getCountClosedCells()) {
            System.out.println(" -- ВЫ ВЫИГРАЛИ!! --");
            this.printFieldEndGame();
            return false;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите строку:");
        int row = scanner.nextInt();
        System.out.println("Выберите колонку:");
        int col = scanner.nextInt();
        if (row <= 0 || row >= fieldWithMines.length - 1 || col <= 0 || col >= fieldWithMines[0].length - 1) {
            // если индексы некорректны
            System.out.println("Повторите ввод!! Неправильные индексы");
            this.doStep(); // рекурсивный метод вызова
        }

        if (fieldToOpen[row][col] == true){
            System.out.println("Вы УЖЕ ранее открывали эту ячейку, повторите ввод!!!");
            this.doStep(); // рекурсивный метод вызова
        } //

        //100% знаем что индексы нам точно подходят
        if (fieldWithMines[row][col] == -1) {
            System.out.println("Вы проиграли!!!");
            this.printFieldEndGame();
            return false; // даем ответ, что еще один шаг не нужен
        } else {
            //если в ячейке не мина, то мы должны продолжить дальше
            fieldToOpen[row][col] = true;
            return true; //даем ответ, что еще нужен шаг следующий
        }


    }

    private int getCountClosedCells() {
        int count = 0;
        for (int i = 0; i < fieldToOpen.length; i++) {
            for (int j = 0; j < fieldToOpen.length; j++) {
                if (fieldToOpen[i][j] == false) {
                    count++;
                }

            }
        }
        return count;
    }

}


