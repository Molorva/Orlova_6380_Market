package practic;

public interface QueueBehaviour {
    void takeInQueue(Actor actor); // войти в очередь
    void takeOrders(); // сделать заказ
    void  giveOrders(); // забрать заказ
    void releaseFromQueue(); // покинуть очередь
}
