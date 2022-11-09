import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //valuables
        double weight,length,result;
        Scanner scanner =new Scanner(System.in);

        //main code
        //Input
        while(true)
        {
        System.out.println("\nHosgeldiniz!!! vicut kutle endeksi hesaplamak icin lutfen kilonuzu giriniz.");
        weight =scanner.nextDouble();
        System.out.println("Lutfen boy uzunlugunuzuda metre cinsinden giriniz.");
        length=scanner.nextDouble();
        //calculation
        result=weight/(length*length);
        System.out.println("vicut kutle endeksiniz :"+result);
        //compare
        if (result<18.5)
            System.out.println("ideal kilonun altındasiniz.");
        else if (result > 18.5 && result < 24.9)
            System.out.println("ideal kilodasiniz.");
        else if (result > 25 && result < 29.9)
            System.out.println("ideal kilonuzun ustundesiniz.");
        else if (result > 30 && result < 39.9)
            System.out.println("ideal kilonuzun cok ustundesiniz.");
        else if (result > 40 )
            System.out.println("Malesef Asırı kilolusunuz.");
        }
    }
}