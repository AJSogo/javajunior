package lesson7.BlackJack;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BlackJack {

    private Koloda koloda = new Koloda();
    private ArrayList<Player> players = new ArrayList<>(); /*эти штуки называются дженерики*/

    public BlackJack() {
        koloda.prepare();
    }

    public void addPlayerToGame(Player player) {
        players.add(player);
    }

    public void dealTwoCardsToAllPlayers() {
        for (Player player : players) { //прошлись по всем игрокам и крупье
            player.addCardToHand(koloda.randomCard()); //дали первую карту для сохранения
            player.addCardToHand(koloda.randomCard()); //дали вторую карту
        }
    }

    public void dealRestCardsToAllPlayers() {
        for (Player player : players) { //прошлись по всем играм и крупье
            while (player.doYouNeedMoreCards()) { //проявление полиморфизма
                player.addCardToHand(koloda.randomCard()); // дали карту на сохранение
            }
        }
    }

    public void printWinner() {
        //* 13 13 22 12 10 **\


        // ставим флажок False всем у кого перебор
        for (Player player : players) {

            if (player.countValueInHand() > 21) {
                player.setCanWin(false);
            }

        }
        if (countPlayersWhoCanWin() == 0) { // если у всех перебор, находим крупье и печатаем его
            for (Player player : players) {
                if (player instanceof Dealer) {
                    System.out.println("Выиграл: " + player.getName());
                    player.openHand();
                    return; //выходим из метода, проверки не нужны, мы уже не нашли победителя
                }
            }
        }

        int winnerValue = 1;
        for (Player player : players) {// ищем максимальный балл ближе к 21 и игрок должен быть еще в игре
            if (player.isCanWin() && player.countValueInHand() > winnerValue) {
                winnerValue = player.countValueInHand();
            }
        }

        for (Player player: players){
            if (player.countValueInHand() == winnerValue){
                System.out.println("Выиграл: " + player.getName());
                player.openHand();
            }
        }

    }

    public int countPlayersWhoCanWin() {
        int count = 0;
        for (Player player : players) {

            if (player.isCanWin()) {
                count++;
            }
        }
        return count;
    }


}
