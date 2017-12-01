package deliveries;

import user_db.User;

public class AdressStrategy implements DeliveryStrategy{

    @Override
    public boolean delivered(String adress) {

        return true;
    }
}
