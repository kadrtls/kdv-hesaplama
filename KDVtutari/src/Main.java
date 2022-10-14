import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double kdvOranı=0.45;
        Scanner scanner=new Scanner(System.in);
        System.out.println("tuttarı giriniz");
        double tutar= scanner.nextDouble();
        double kdvTutari=tutar*kdvOranı;
        double sonuc=tutar+kdvTutari;

        System.out.println("kdv oranı:" + kdvOranı);
        System.out.println("kdv'li tutar:" + sonuc);
    }
}