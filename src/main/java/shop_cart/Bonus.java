package shop_cart;

import shop.ComputerGame;
import shop.GameSpecs;
import shop.Genres;
import shop.Platforms;

public class Bonus extends CartDecorator {

    public Bonus(Cart cart) {
        super(cart);
    }

    @Override
    public boolean ship() {
        if (computeTotalPrice() < super.getUser().getMoney()) {
            super.addGameToCart(new ComputerGame(new GameSpecs("1", 1.99, 1, Genres.ACTION,
                                                                Platforms.LINUX, "qeq")));
            return super.ship();
        }
        return false;
//        algorithm: check if that piece of shit can pay for his games -> add game to cart ( with price zero, don't be a shit ) -> super.ship()
    }
}
