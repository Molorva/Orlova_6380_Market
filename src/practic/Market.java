package practic;
import java.util.*;

//Реализовать класс Market и все методы, которые он обязан реализовывать.
//Методы из интерфейса QueueBehaviour, имитируют работу очереди,
// MarketBehaviour – помещает и удаляет человека из очереди, метод update –
// обновляет состояние магазина (принимает и отдаёт заказы)


public class Market implements MarketBehaviour,QueueBehaviour{

    private List<Actor> actors = new ArrayList<>();
    private Integer capacityMarket =10;
    private List<Product> products = new ArrayList<>();

    public Integer getCapacityMarket() { // узнать вместительность магазина
        return capacityMarket;
    }

    public List<Product> getProducts() {
        return products;
    }


    public void openingStore(){
        int coont = 0;
        for (int i = 0; i < 3; i++) {
            update();
        }
        System.out.println("Полки магазина заполнены! \nМагазин будет работать пока есть товар!");
        System.out.println(getProducts());

    }

    @Override
    public void update() { // обновление магазина
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название товара");
        String product = scan.nextLine();
        System.out.println("Введите цену товара");
        String price = scan.nextLine();
        products.add(new Product(product, Float.parseFloat(price)));
        System.out.println("---------------------------------------");
    }


    @Override
    public void acceptToMarket(Actor actor) { //вошел в магазин
        if(capacityMarket > 0){
            capacityMarket--;
            actors.add(actor);
            takeInQueue(actor);
        } else {
            System.out.println("Извините, магазин переполнен, приходите позже. Спасибо!");
        }
    }

    @Override
    public void takeInQueue(Actor actor) { // войти в очередь
        System.out.println("Вы " + actors.size() + " в очереди");
        takeOrders();
    }

    @Override
    public void takeOrders() {// сделать заказ
        System.out.println("Ваш заказ принят! Мы примем все стальные заказы и начнем их выдавать. Ожидайте!");
        System.out.println("\n");
    }


    @Override
    public  void giveOrders() { // получить заказ
        String order = getProducts().getFirst().getName();
        System.out.println("Вот ваш заказ - " + order);
        System.out.println("С вас " + getProducts().getFirst().getPrice() + " монет");
        getProducts().removeFirst();
        releaseFromQueue();
    }



    @Override
    public void releaseFromQueue() { // покинуть очередь
        actors.removeFirst();
        releaseFromMarket();
    }

    @Override
    public void releaseFromMarket() {// покинул магазин
        System.out.println("До свидания! \nПриходите еще!");
        System.out.println("\n");
        capacityMarket++;
    }


}
