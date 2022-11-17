//Abstract override zorunlu kılar fakat final gibi cimri değildir paylaşımcıdır.
public abstract class GameCalculator {
    public abstract void hesapla() ;


    public void gameOver() {
        System.out.println("Oyun Bitti!");
    }
}
