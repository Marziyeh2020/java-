package _09_6.soru;

import java.util.ArrayList;

public class User {
    String name;
    Role role;
    Statu statu;


    public User(String name, Role role, Statu statu) {
        this.name = name;
        this.role = role;
        this.statu = statu;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                '}';
    }
}
