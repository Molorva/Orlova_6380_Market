package practic;

public class Main{

    public static void main(String[] args) {
        Market m = new Market();
        m.openingStore();
        Actor a1 = new Buyer("buyer_1");
        Actor a2 = new Buyer("buyer_2");
        Actor a3 = new Buyer("buyer_3");
        m.acceptToMarket(a1);
        m.acceptToMarket(a2);
        m.acceptToMarket(a3);
        m.giveOrders();
        m.giveOrders();
        m.giveOrders();

    }
}