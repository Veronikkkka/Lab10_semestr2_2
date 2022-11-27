package db;

public class Autorization {
    public boolean Autorize(DataBase db) {
        db.getUserInfo();
        return true;
    }
}
