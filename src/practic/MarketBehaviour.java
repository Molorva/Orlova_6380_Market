package practic;

import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(Actor actor); // вошел в магазин
    void releaseFromMarket(); // покинул магазин
    void update(); // обновить
}
