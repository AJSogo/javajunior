package lesson7.BlackJack;

public class Dealer extends Player {
    @Override
    public boolean doYouNeedMoreCards() {
        if (this.countValueInHand()<17){
            return true;
        }
        return false;
    }
}
