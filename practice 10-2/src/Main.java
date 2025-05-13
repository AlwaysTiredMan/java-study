import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하시오:");
        int num=sc.nextInt();
        int sum=0;
        if(num>=1){
            for(int i=1;num>=i;i++){
                if(i%2==1){
                    sum+=i;
                }
            }
            System.out.println("총합:"+sum);
        }
        else{
            System.out.println("양의 정수가 아닙니다.");
        }
    }
}