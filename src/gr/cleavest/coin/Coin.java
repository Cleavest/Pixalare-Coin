package gr.cleavest.coin;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Coin {

    private Map<CoinType, Integer> coinList;

    public Coin()
    {
        this.coinList = new HashMap<>();
        for (CoinType value : CoinType.values()) {
            coinList.put(value, 0);
        }
    }

    public Coin afterAdd()
    {
        CoinType[] values = CoinType.values();
        int i = 0;

        while (i < (values.length - 1))
        {
            CoinType next = values[i];

            if (coinList.get(next) >= 1000 )
            {
                int temp = coinList.get(next) / 1000;

                CoinType nn = values[i + 1];

                coinList.put(nn, coinList.get(nn) + temp);
            }

            i++;
        }

        return this;
    }

    public Coin afterRemove()
    {

        CoinType[] values = CoinType.values();
        int i = 0;

        while (i < (values.length - 1))
        {
            CoinType next = values[i];

            if (coinList.get(next) < 0)
            {
                CoinType nn = values[i + 1];

                coinList.put(nn, coinList.get(nn) - 1);

                coinList.put(next, coinList.get(next) + 1000);
            }

            i++;
        }

        return this;
    }

    public void remove(Coin coin)
    {
        for (CoinType type : CoinType.values()) {
            coinList.put(type, coinList.get(type) - coin.coinList.get(type));
        }

        afterRemove();
    }

    public void add(Coin coin)
    {

        for (CoinType type : CoinType.values()) {
            coinList.put(type, coinList.get(type) + coin.coinList.get(type));
        }

        afterAdd();
    }

    /**
     * return 1 if this > @param coin
     * return 0 if @param coin > this
     * return -1 if @param coin = this
     */

    public int isHighest(Coin coin)
    {
        CoinType[] values = CoinType.values();
        int i = values.length - 1;
        boolean has = false;
        while (i >= 0 && !has)
        {
            CoinType next = values[i];
            if (this.coinList.get(next) > coin.coinList.get(next))
            {
                return 1;
            } else if (this.coinList.get(next) < coin.coinList.get(next)){
                return 0;
            }

            i--;
        }

        return -1;
    }

    public boolean take(Coin coin)
    {
        if (isHighest(coin) == 0) {
            return false;
        }

        remove(coin);
        return true;
    }

    public String toString()
    {
        StringJoiner joiner = new StringJoiner(" ");

        CoinType[] values = CoinType.values();
        int i = values.length - 1;

        while (i >= 0)
        {
            CoinType next = values[i];

            if (this.coinList.get(next) > 0)
            {
                joiner.add(String.format("%s %s", coinList.get(next) , next.getName()));
            }

            i--;
        }

        return joiner.toString();
    }

    public Coin setTenHundred(int coin) {
        this.coinList.put(CoinType.TEN_HUNDRED, coin);
        return this;
    }

    public Coin seThousand(int coin)
    {
        this.coinList.put(CoinType.THOUSAND, coin);
        return this;
    }

    public Coin setMillion(int coin) {
        this.coinList.put(CoinType.MILLION, coin);
        return this;
    }

    public Coin setBillion(int coin) {
        this.coinList.put(CoinType.BILLION, coin);
        return this;
    }

    public Coin setTrillion(int coin) {
        this.coinList.put(CoinType.TRILLION, coin);
        return this;
    }

    public Coin setQuadrillion(int coin) {
        this.coinList.put(CoinType.QUADRILLION, coin);
        return this;
    }

    public Coin setQuintillion(int coin) {
        this.coinList.put(CoinType.QUINTILLION, coin);
        return this;
    }

    public Coin setSextillion(int coin) {
        this.coinList.put(CoinType.SEXTILLION, coin);
        return this;
    }

    public Coin setSeptillion(int coin) {
        this.coinList.put(CoinType.SEPTILLION, coin);
        return this;
    }

    public Coin setOctillion(int coin) {
        this.coinList.put(CoinType.octillion, coin);
        return this;
    }

    public Coin setNonillion(int coin) {
        this.coinList.put(CoinType.NONILLION, coin);
        return this;
    }
}
