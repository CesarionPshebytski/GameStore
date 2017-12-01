package shop_cart;

public class DiscountCart extends CartDecorator{

    public DiscountCart(Cart cart) {
        super(cart);
    }

    @Override
    public double computeTotalPrice() {
        return super.computeTotalPrice()*0.8;
    }


}
