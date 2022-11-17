public class Main {
    public static void main(String[] args) {
        String mesaj = "bugün hava çok güzel.";
        int sayi = topla(1, 2);
        int toplam = topla2(2, 3, 4);
        System.out.println(sayi);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("eklendi!");
    }

    public static void sil() {
        System.out.println("Silindi!");

    }

    public static void güncelle() {
        System.out.println("Güncellendi!");
    }

    public static int topla(int sayi1, int sayi2) {
        return (sayi1 + sayi2);
    }

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

}