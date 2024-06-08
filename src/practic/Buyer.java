package practic;

public class Buyer extends Actor{
    public Buyer(String name) {
        super(name);
    }

    @Override
    public void takeInQueue(Actor actor) {

    }

    @Override
    public void takeOrders() {

    }

    @Override
    public void giveOrders() {

    }

    @Override
    public void releaseFromQueue() {

    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void setMakeOrder(boolean flag) {

    }

    @Override
    public void setTakeOrder(boolean flag) {

    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }
}
