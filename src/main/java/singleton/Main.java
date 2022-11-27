package singleton;

import db.DataBase;
import singleton.User;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Yaroslav", "ya.prytula", 18, new DataBase());
        user.save();
    }
}
