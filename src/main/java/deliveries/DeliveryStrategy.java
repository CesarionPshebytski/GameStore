package deliveries;

import user_db.User;

public interface DeliveryStrategy {
    boolean delivered(String adress);
}
