package lesson6.Homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[][] tours = new String[100][8];

        UtilsInformation.Information(tours);
        UtilsSearchingTour.searchingTour(tours);

    }
}

