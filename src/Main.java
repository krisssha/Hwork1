public class Main {
    public static void main(String[] args) {


        for (int i = 1; i<=10; i++){
            System.out.println(i);}
        System.out.println();

        for (int a = 10; a >= 1; a--){
            System.out.println(a);}
        System.out.println();

        for (int b = 0; b <= 17; b += 2){
        System.out.println(b);}
        System.out.println();

        for (int g = 1904; g <= 2096; g += 4){
            System.out.println(g + " год является високосным! ");}
        System.out.println();

        for (int s = 7; s <= 98 ; s += 7){
            System.out.println(s);}
        System.out.println();

        System.out.println(1);
        for (int d = 2; d <= 512; d *= 2){
            System.out.println(d);}
        System.out.println();

        int salary = 29000;
        int total = 0;
        for (int l = 1; l <= 12; l++ ) {
            total = total + total/100;
            total = total + salary;
            System.out.println( "Месяц " + l + " , сумма накоплений равна "+ total+ " рублей" );
        }




    }
}