package trandinhhongjv10;

import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập : ");
        int n = input.nextInt();
        int sum=0;
        for (int i = 2; i <=n; i+=2) {
                sum+=i;
        }
        System.out.println("tong " + sum);
    }
}
