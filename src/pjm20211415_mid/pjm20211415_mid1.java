package pjm20211415_mid;

import java.util.Scanner;

public class pjm20211415_mid1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] hand = {"가위", "바위", "보"};


        while (true) {
            System.out.print("가위, 바위, 보 중 선택하세요: ");
            String me = scanner.nextLine();
            
            if (!"가위".equals(me) && !"바위".equals(me) && !"보".equals(me)) {
                System.out.println("잘못된 입력입니다. 가위, 바위, 보 중에서 선택하세요.");
                continue;
            }
            	
            int random = (int) (Math.random() * 3);
            String you = hand[random];

            System.out.println("나 : " + me);
            System.out.println("상대방: " + you);

            if (me.equals(you)) {
                System.out.println("비겼습니다.");
            } 
            
            else if ((me.equals("가위") && you.equals("보")) ||
                       (me.equals("바위") && you.equals("가위")) ||
                       (me.equals("보") && you.equals("바위"))) {
                System.out.println("나의 승리");
            } 
            else {
                System.out.println("상대방의 승리");
            }

            System.out.print("가위바위보를 계속하시겠습니까? (예/아니오): ");
            String again = scanner.nextLine();
            if (!again.equals("예")) {
                System.out.println("가위바위보를 그만합니다.");
                break;
            }
        }
        scanner.close();
    }
}
