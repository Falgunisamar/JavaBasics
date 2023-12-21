import java.util.Scanner;

public class Maxthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
            if(a>b&&a>c){
                System.out.println(a + " is the maximum!");
            }
            else if(b>a&&b>c){
                System.out.println(b + " is the maximum!");
            }
            else{
                System.out.println(c + " is the maximum!");
            }
        

    }
}
