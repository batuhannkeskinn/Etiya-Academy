public class Main {
    public static void main(String[] args) {

    //abstract sınıflar asla newlenemez!
        GameCalculator gameCalculator = new OlderGameCalculator();
        gameCalculator.gameOver();
        gameCalculator.hesapla();
    }
}