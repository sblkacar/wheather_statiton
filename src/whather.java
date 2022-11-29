import java.util.Scanner;

public class whather {
    public static void main(String[] args) {
        int wheather;
        Scanner input=new Scanner(System.in);

        System.out.println("lütfen sıcaklık değerini girin");
        wheather=input.nextByte();

       if (wheather<5)
       {
           System.out.println("Kayaga gitmelsin");
       }
       else if ( wheather>5&& wheather<15) {
           System.out.println("sinemaya gitmeslisin");
        }
       else if ( wheather>15&& wheather<25) {
           System.out.println("piknik");
       }
       else if ( wheather>25) {
           System.out.println("yüzme");
       }
    }
}
