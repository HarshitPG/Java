import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String a = Integer.toString(num);
        double ans=0;
        int stringLength = a.length();
        for (int i = 0; i <stringLength ; i++) {
            char ch = a.charAt(i);
            int b = Integer.parseInt(String.valueOf(ch));
            double c = Math.pow(b, stringLength);
            ans = ans+c;
        }
        if(num == ans){
            System.out.print("Its a ArmstrongNumber");
        }else {
            System.out.print("Not a ArmstrongNumber");
        }
    }
}
