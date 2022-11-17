public class Main {
    public static void main(String[] args) {
        int number = 67;
        int remainder = number % 2;
        System.out.println(remainder);
        if (number == 2) {
            System.out.println("Asal Sayıdır.");

        } else if (remainder == 1) {
            System.out.println("Asal Sayıdır");
        }else {
            System.out.println("Asal Sayı Değildir");
        }

    }
}