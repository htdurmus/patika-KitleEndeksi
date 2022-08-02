import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("*** Vücut Kitle İndeksini Hesaplayan Program ***\n");

        System.out.print("Boyunuzu metre cinsinden giriniz > ");
        double boy=s.nextDouble();
        boy *= boy;
        System.out.print("Kilonuzu giriniz > ");
        double kilo=s.nextDouble();

        double index = kilo / boy;
        System.out.println("Vücut kitle indexiniz: "+index);
    }
}
