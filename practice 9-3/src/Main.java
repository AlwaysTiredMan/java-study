import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu=0,price=0;
        String coffee="";
        String size="";
        String plus="";

        System.out.println("1.아메리카노 3000원 \n2.카페라떼 4000원 \n3.카푸치노 4500원");
        System.out.print("종류를 정해주세요:");
        menu=sc.nextInt();
        switch(menu) {
            case 1:
                coffee="아메리카노";
                price=3000;
                break;
            case 2:
                coffee="카페라떼";
                price=4000;
                break;
            case 3:
                coffee="카푸치노";
                price=4500;
                break;
        }
        System.out.println("1.Small \n2.Medium +500 \n3.Large +1000");
        System.out.print("사이즈를 정해주세요:");
        menu=sc.nextInt();
        switch(menu) {
            case 1:
                size="Small";
                break;
            case 2:
                size="Medium";
                price+=500;
                break;
            case 3:
                size="Large";
                price+=1000;
                break;
        }
        System.out.println("1.기본 \n2.샷 추가 +500 \n3.시럽 추가 +300 \n4.샷과 시럽 추가 +800");
        System.out.print("추가 사항을 정해주세요:");
        menu=sc.nextInt();
        switch(menu) {
            case 1:
                plus="기본";
                break;
            case 2:
                plus="샷 추가";
                price+=500;
                break;
            case 3:
                plus="시럽 추가";
                price+=300;
                break;
            case 4:
                plus="샷과 시럽 추가";
                price+=800;
                break;
        }
        System.out.println("주문하신 메뉴는 "+coffee+"에"+" 사이즈는 "+size+" 이고 "
                +plus+"해서 총 "+price+"원 입니다.");
    }
}