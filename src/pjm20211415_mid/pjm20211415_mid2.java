package pjm20211415_mid;

import java.util.Scanner;

public class pjm20211415_mid2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] hand = {"가위", "바위", "보"};
        int myCoin = 10;

        while (myCoin > 0 ) {
            int bet;
            while (true) {
                System.out.print("배팅할 코인 수를 입력하세요: ");
                bet = scanner.nextInt();
                scanner.nextLine(); 
                if (bet <= 0) {
                    System.out.println("배팅할 코인 수는 1 이상이어야 합니다.");
                    continue;
                }
                if (bet > myCoin) {
                    System.out.println("보유한 코인 수를 초과하여 배팅할 수 없습니다.");
                    continue;
                }
                break;
            }
            
            String me;
            while (true) {
                System.out.print("가위, 바위, 보 중 선택하세요: ");
                me = scanner.nextLine();
                if (!"가위".equals(me) && !"바위".equals(me) && !"보".equals(me)) {
                    System.out.println("잘못된 입력입니다. 가위, 바위, 보 중에서 선택하세요.");
                    continue;
                }
                break;
            }
     
            int random = (int) (Math.random() * 3);
            String you = hand[random];

            System.out.println("나 : " + me);
            System.out.println("상대방 : " + you);

            if (me.equals(you)) {
                System.out.println("비겼습니다.");
            } else if ((me.equals("가위") && you.equals("보")) ||
                    (me.equals("바위") && you.equals("가위")) ||
                    (me.equals("보") && you.equals("바위"))) {
                System.out.println("이겼습니다. 코인을 얻습니다.");
                myCoin += bet * 2;
            } else {
                System.out.println("졌습니다. 코인을 잃었습니다");
                myCoin -= bet; 
            }

            System.out.println("나의 남은 코인 : " + myCoin);

            if (myCoin == 0) {
                System.out.println("나의 코인이 모두 소진되었습니다. 가위바위보 종료");
                break;
            } 

            System.out.print("가위바위보를 계속하시겠습니까? (예/아니오): ");
            String again = scanner.nextLine();
            if (!again.equals("예")) {
                System.out.println("가위바위보를 종료합니다.");
                break;
            }
        }
        scanner.close();
    }
}
