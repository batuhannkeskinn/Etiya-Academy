public class Main {
    public static void main(String[] args) {
    sayiBulmaca();

    }
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 1;
        boolean varMi=false;
        for (int sayi : sayilar){
            if(sayi == aranacak){
                varMi = true ;
                break;
            }
        }
        if(varMi){
            System.out.println("Sayılar Mevcut"+ aranacak);
        }else {
            System.out.println("Sayılar mevcut değil" + aranacak);
        }
    }
    public static void mesajVer(int aranacak){
        System.out.println("Sayı mevcut : "+aranacak);
    }
}