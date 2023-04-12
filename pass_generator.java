import java.util.Scanner;
import java.util.Random;

class main{

    static void password(int length){
        String word = "abcdefghijklmnopqrstuvwxyz1234567890!@#$^&*";
        char passChar[] = word.toCharArray();
        char result[] = new char[length];
        Random random = new Random();
        for(int i = 0 ; i < length ; i++){
            result[i] = passChar[random.nextInt(word.length())];
            System.out.print(result[i]);
        }
        System.out.println("\n");

    }





    public static void main(String arg[]){
        System.out.println(" Password Generator.....");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of password....");
        int passLength = sc.nextInt();
        password(passLength);
        
    }
}
