package shop_cart;

import shop.ComputerGame;
import user_db.User;

import java.util.ArrayList;

public abstract class CartDecorator extends Cart{

    private Cart cart;

    public CartDecorator(Cart cart) {
        super(cart);
        this.cart = new Cart(cart);
    }

    @Override
    public boolean addGameToCart(ComputerGame game) {
        return this.cart.addGameToCart(game);
    }

    @Override
    public boolean deleteGameFromCart(ComputerGame game) {
        return this.cart.deleteGameFromCart(game);
    }

    @Override
    public boolean isInCart(ComputerGame game) {
        return this.cart.isInCart(game);
    }

    @Override
    public ArrayList<ComputerGame> getGamesInCart() {
        return this.cart.getGamesInCart();
    }

    @Override
    public void setGamesInCart(ArrayList<ComputerGame> gamesInCart) {
        this.cart.setGamesInCart(gamesInCart);
    }

    @Override
    public User getUser() {
        return this.cart.getUser();
    }

    @Override
    public void setUser(User user) {
        this.cart.setUser(user);
    }

    @Override
    public double computeTotalPrice() {
        return this.cart.computeTotalPrice();
    }

    @Override
    public boolean ship() {
        return this.cart.ship();
    }

    @Override
    public boolean equals(Object o) {
        return this.cart.equals(o);
    }

    @Override
    public int hashCode() {
        return this.cart.hashCode();
    }
}
