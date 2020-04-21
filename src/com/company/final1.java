
import java.util.Scanner;

public class final1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        char sample[] = x.toCharArray();
        int length = sample.length-1;
        int result=0;
        for (int i = length; i >=0; i--) {
            char element=sample[i];
            if (element=='1') {
                int pow = (int)Math.pow(2,length-i);
                result = result + pow;
            }
        }
        System.out.print(result);
    }
}

/*
101
 */