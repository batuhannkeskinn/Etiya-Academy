public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2,2.2,3.4,4.4,7.4,6.5};
        double total = 0;
        double max = myList[0];

        for(double number:myList){
            if (max<number){
            max = number ;
        }
            total = total + number;
            System.out.println(number);

        }
        System.out.println("Toplam = " + total);
        System.out.println(max);
    }
}