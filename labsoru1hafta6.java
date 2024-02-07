import java.util.Random;
import java.util.Scanner;
public class labsoru1hafta6 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        int a=r.nextInt(128);
        
        
        if(alp_checker((char)a)==true){

            System.out.println("this number is a letter");
            System.out.println("this number is a letter and equavalent to " + (chara);

        }
        else{
            System.out.println("this number is not a letter");

        }

    }
    public static boolean alp_checker(char x){
        if(('a' <=x && x<= 'z') || ('A'<=x&& x<='Z')){
            return true;
        }
        else{
            return false;
        }
    }
    
}