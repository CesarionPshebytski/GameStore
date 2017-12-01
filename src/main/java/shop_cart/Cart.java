package shop_cart;

import deliveries.DeliveryStrategy;
import payments.PaymentStrategy;
import shop.ComputerGame;
import user_db.User;

import java.util.ArrayList;

public class Cart {

    private ArrayList<ComputerGame> gamesInCart = new ArrayList<>();

    private User user;
    private PaymentStrategy paymentStrategy;
    private DeliveryStrategy deliveryStrategy;

    public Cart(ComputerGame computerGame, User user) {
        this.user = user;
        this.gamesInCart.add(computerGame);
        this.paymentStrategy = user.getPaymentStrategy();
        this.deliveryStrategy = user.getDeliveryStrategy();
    }

    public Cart(ComputerGame computerGame, User user, PaymentStrategy paymentStrategy, DeliveryStrategy deliveryStrategy) {
        this.user = user;
        this.deliveryStrategy = deliveryStrategy;
        this.paymentStrategy = paymentStrategy;
        this.gamesInCart.add(computerGame);
    }

    public Cart(Cart cart) {
        this.gamesInCart = cart.gamesInCart;
        this.user = cart.user;
    }

    public boolean addGameToCart(ComputerGame game) {
        if (this.gamesInCart.add(game)) {
            return true;
        }
        return false;
    }

    public boolean deleteGameFromCart(ComputerGame game) {
        if (gamesInCart.remove(game)) {
            return true;
        }
        return false;
    }

    public boolean isInCart(ComputerGame game) {
        return gamesInCart.contains(game);
    }

    public ArrayList<ComputerGame> getGamesInCart() {
        return new ArrayList<>(gamesInCart);
    }

    public void setGamesInCart(ArrayList<ComputerGame> gamesInCart) {
        this.gamesInCart = gamesInCart;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double computeTotalPrice() {
        double res = 0.0;
        for (ComputerGame game:
             gamesInCart) {
            res += game.getGameSpecs().getPrice();
        }
        return res;
    }


    public boolean ship() {
        if(paymentStrategy.pay(computeTotalPrice(),this.user)) {
            return deliveryStrategy.delivered(user.getAdress());
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cart cart = (Cart) o;

        if (!gamesInCart.equals(cart.gamesInCart)) return false;
        return user.equals(cart.user);
    }

    @Override
    public int hashCode() {
        int result = gamesInCart.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }
}
