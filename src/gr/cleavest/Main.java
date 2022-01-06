package gr.cleavest;

import gr.cleavest.coin.Coin;

public class Main {

    public static void main(String[] args) {

        // Remove
        Coin coin = new Coin().setBillion(1);
        Coin coin1 = new Coin().setMillion(999);

        coin.remove(coin1);
        System.out.println(coin.toString());

        //Add
        Coin coin2 = new Coin().setBillion(1);
        Coin coin3 = new Coin().setMillion(999);

        coin2.add(coin3);
        System.out.println(coin2.toString());

    }
}
