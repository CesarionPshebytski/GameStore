package payments;

import user_db.User;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public boolean pay(double price, User user) {
        if(user.getMoney() > price) {
            user.setMoney(user.getMoney()-price);
            System.out.println("PAID WITH CREDIT CARD");
            return true;
        }
        System.out.println("YOU ARE A POOR PIECE OF SHIT! GO AND WORK!");
        return false;
    }
}
