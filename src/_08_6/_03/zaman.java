package _08_6._03;

public class zaman {
 final static int birgundesaatsayisi=24;
 final static int Birsaatdedakikasayisi=60;
 final static int birdakikadasaniyesayisi=60;

  public static int toplamsaniye(int gun,int saat,int dakika){

   int toplamsaniye=
                   gun*
                   zaman.birgundesaatsayisi
                   *zaman.birdakikadasaniyesayisi
                   *zaman.birdakikadasaniyesayisi
                   +saat*
                   zaman.Birsaatdedakikasayisi
                   *zaman.birdakikadasaniyesayisi
                   +dakika*
                   zaman.birdakikadasaniyesayisi;


          return toplamsaniye;
  }
}
