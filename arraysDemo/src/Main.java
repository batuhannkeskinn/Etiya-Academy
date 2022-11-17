public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2= "Batu";
        String ogrenci3= "Kaan";
                String[] ogrenciler = new String[3];
                ogrenciler[0]="Engin";
                ogrenciler[1]="Batu";
                ogrenciler[2]="Kaan";
                for (int i = 0 ; i<ogrenciler.length ; i++){
                System.out.println(ogrenciler[i]);
                }
                for(String ogrenci:ogrenciler){
                    System.out.println(ogrenci);
                }
        }
}