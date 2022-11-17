import java.util.Locale;

public class Main {
    public static void main(String[] args) {
    String mesaj = "Hava Çok Güzel";
        System.out.println(mesaj);
        //verilen cümlede ki boşuklar da dahil bulunan tüm elemanları sayar.
        System.out.println("eleman saysı = " + mesaj.length());
        //4. elemanın ne olduğunun çıktısını verir.
        System.out.println("5. eleman = "+mesaj.charAt(4));
        // verilen mesajının sondan ekleme yapılmasını sağlar.
        System.out.println(mesaj.concat(" yaşasın!"));
        //başlangıç harfinin belirtilen duruma uyuyorsa True uymuyorsa False döndürür.
        System.out.println(mesaj.startsWith("B"));
        //ilk 5 karakteri çağırır.
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5,karakterler,0);
        System.out.println(karakterler);
        // İstenen harfi Baştan kaçıncı olduğunu söyler.
        System.out.println(mesaj.indexOf('a'));
        // İstenen Harfi En son da bulur ve başa doğru sayar.
        System.out.println(mesaj.lastIndexOf("a"));
       // -------------------------------------------------------
            //oldchar kısmına verilen ifadeyi, newChar'a çevirir.
        System.out.println(mesaj.replace(' ' , '-'));
        //verilen index kadar ilerler sonrasını çıktı verir.
        System.out.println(mesaj.substring(2,4));
        //kurulan cümleyi kelime kelime parçalara ayırmak için kullanılır.
        for(String kelime : mesaj.split(" ")){
            System.out.println(kelime);
            //Metni Küçük Harglere çevirir.
            System.out.println(mesaj.toLowerCase());
            //Metni Büyük Haflere Çevirir.
            System.out.println(mesaj.toUpperCase());
            System.out.println();
        }







    }
}