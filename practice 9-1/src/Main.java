import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력하시오:");
        num = sc.nextInt();
        if(num>=1 && num<=100){
            System.out.println("1부터 100사이의 정수입니다!");
        }
        else if(num>100 || num<1){
            System.out.println("1부터 100사이의 정수가 아닙니다!");
        }
    }
}