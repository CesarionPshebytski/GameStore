package payments;

import user_db.User;

public interface PaymentStrategy {
    boolean pay(double price, User user);
}
