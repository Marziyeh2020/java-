package _09_6.soru;

import java.util.ArrayList;

public class soru {
    //bir user yetkilendirme modul yapin
    //rol:mudur admin satis personel akif ,pasif oldugunu beli edin

    public static void main(String[] args) {
        ArrayList<User> userlar=new ArrayList<>();
       User user1=new User("iman", Role.Admin,Statu.Aktif);
        User user2=new User("marziyeh", Role.Mudur,Statu.Aktif);
        User user3=new User("lucky", Role.Personel,Statu.Aktif);
        User user4=new User("iman", Role.Satiş,Statu.Aktif);
        userlar.add(user1);
        userlar.add(user2);
        userlar.add(user3);
        userlar.add(user4);
        for (User u:userlar){
            System.out.println(u);
        }
        System.out.println("*********");
        usersil(user4,userlar);
        for (User u:userlar){
            System.out.println(u);
        }
    }

    public static void usersil(User user,ArrayList<User> userlar){
        if (user.role==Role.Admin)
            System.out.println("admin silinemez");
        else
           userlar.remove(user);
    }



}
