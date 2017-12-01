package user_db;

import deliveries.DeliveryStrategy;
import payments.PaymentStrategy;
import shop.ComputerGame;

import java.util.ArrayList;

public class User {

    public static int userIdCounter = 1;

    private int id;
    private String name;
    private int password_hash;
    private double money = 0;
    private String email;
    private PaymentStrategy paymentStrategy;
    private DeliveryStrategy deliveryStrategy;
    private String adress;
    private ArrayList<ComputerGame> gamesHistory = new ArrayList<>();



    public User(String name, String password, String email, double money, PaymentStrategy paymentStrategy, String adress ) {
        this.id = User.userIdCounter++;
        this.name = name;
        this.password_hash = password.hashCode();
        this.adress = adress;
        this.paymentStrategy = paymentStrategy;
        this.money = money;
        this.email = email;
    }


    public ArrayList<ComputerGame> getGamesHistory() {
        return new ArrayList<>(gamesHistory);
    }

    public boolean addToHistory(ComputerGame game ) {
        if(!gamesHistory.contains(game)) {
            gamesHistory.add(game);
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(int password_hash) {
        this.password_hash = password_hash;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return deliveryStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (password_hash != user.password_hash) return false;
        if (money != user.money) return false;
        if (!name.equals(user.name)) return false;
        if (!email.equals(user.email)) return false;
        if (!paymentStrategy.equals(user.paymentStrategy)) return false;
        return adress.equals(user.adress);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + password_hash;
        result = 31 * result + email.hashCode();
        result = 31 * result + paymentStrategy.hashCode();
        result = 31 * result + adress.hashCode();
        return result;
    }
}
