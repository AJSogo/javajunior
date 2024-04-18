package lesson8.Saper;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите уровень игры");
        System.out.println("1 - Новичок");
        System.out.println("2 - Любитель");
        System.out.println("3 - Профессионал ");
        System.out.println("4 - Особый");

        Scanner scanner = new Scanner(System.in);
        String level = scanner.nextLine();


        SaperField saperField = new SaperField(level);
        saperField.addRandomMines();
        saperField.countAndAddNums();
        saperField.printField();
        saperField.doStep();

        while (saperField.doStep()){ // или будет следующий шаг, или выход из игры
            saperField.printField(); //печтаем текущее поле, и заново запрашиваем шаг
        }


            
        }

    }


