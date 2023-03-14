package trandinhhongjv10;

import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {int n,i;
       int sum=0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương n");
        n= scanner.nextInt();
        for (  i=2;i<=n;i+=2){
            sum+=i;

        }
        System.out.println("Tổng của các số chẵn từ 0-n là "+ sum   );
        }
    }

