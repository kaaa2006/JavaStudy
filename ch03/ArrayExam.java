package ch03;

import java.util.Scanner;

public class ArrayExam {

   public static void main(String[] args) {
      String masterId = "master";
      String masterPw = "1234";

      Scanner input = new Scanner(System.in);
      String[] drink = { "콜라", "사이다", "커피" };
      int[] price = { 2000, 1700, 2500 };
      int[] stock = { 10, 10, 10 };

      boolean run = true;

      while (run) {
         System.out.println("====자판기 프로그램을 실행====");
         System.out.println("선택창");
         System.out.println("1. 관리자 모드");
         System.out.println("2. 사용자 모드");
         System.out.println("3. 프로그램 종료");
         System.out.print(">>> ");
         int choice = input.nextInt();

         switch (choice) {
         case 1:
            masterMode(drink, price, stock, masterId, masterPw, input);
            break;
         case 2:
            usersMode(drink, price, stock, input);
            break;
         case 3:
            run = false;
            System.out.println("프로그램을 종료합니다.");
            break;
         default:
            System.out.println("잘못된 선택입니다.");
         }
      }
   }

   private static void usersMode(String[] drink, int[] price, int[] stock, Scanner input) {
      boolean usersModerun = true;

      while (usersModerun) {
         System.out.println("사용자모드에 들어오셨습니다.");
         System.out.println("1. 음료 구매");
         System.out.println("2. 수량 확인");
         System.out.println("3. 나가기");
         System.out.print(">>> ");
         int userChoice = input.nextInt();

         switch (userChoice) {
         case 1:
            System.out.println("음료를 선택하세요:");
            for (int i = 0; i < drink.length; i++) {
               System.out.println((i + 1) + ". " + drink[i] + " (" + price[i] + "원)");
            }
            System.out.print(">>> ");
            int drinkChoice = input.nextInt() - 1;

            if (drinkChoice >= 0 && drinkChoice < drink.length) {
               if (stock[drinkChoice] > 0) {
                  System.out.print("현금을 넣어주세요 (" + price[drinkChoice] + "원): ");
                  int cheMoney = input.nextInt();

                  if (cheMoney >= price[drinkChoice]) {
                     int change = cheMoney - price[drinkChoice];
                     System.out.println(drink[drinkChoice] + "를 구매하셨습니다.");
                     System.out.println("거스름돈: " + change + "원");
                     stock[drinkChoice]--;
                  } else {
                     System.out.println("금액이 부족합니다.");
                  }
               } else {
                  System.out.println("죄송합니다. 품절입니다.");
               }
            } else {
               System.out.println("잘못된 선택입니다.");
            }
            break;

         case 2:
            System.out.println("수량 확인:");
            for (int i = 0; i < stock.length; i++) {
               System.out.println("[" + drink[i] + "] : " + stock[i] + "개 남음");
            }
            break;

         case 3:
            usersModerun = false;
            break;

         default:
            System.out.println("잘못된 입력입니다.");
         }
      }
   }

   private static void masterMode(String[] drink, int[] price, int[] stock,
         String masterId, String masterPw, Scanner input) {

      boolean isLoggedIn = false;

      while (!isLoggedIn) {
         System.out.print("로그인 ID 입력 >>> ");
         String mid = input.next();
         System.out.print("비밀번호 입력 >>> ");
         String mpw = input.next();

         if (masterId.equals(mid) && masterPw.equals(mpw)) {
            System.out.println("로그인 성공!");
            isLoggedIn = true;
         } else {
            System.out.println("로그인 실패. 다시 시도해주세요.");
         }
      }

      boolean masterModerun = true;

      while (masterModerun) {
         System.out.println("관리자 모드입니다.");
         System.out.println("1. 메뉴 이름 변경");
         System.out.println("2. 가격 변경");
         System.out.println("3. 음료 리필");
         System.out.println("4. 나가기");
         System.out.print(">>> ");
         int masterChoice = input.nextInt();

         switch (masterChoice) {
         case 1:
            for (int i = 0; i < drink.length; i++) {
               System.out.print(drink[i] + "의 새 이름 입력: ");
               drink[i] = input.next();
            }
            break;

         case 2:
            for (int i = 0; i < price.length; i++) {
               System.out.print(drink[i] + "의 새 가격 입력: ");
               price[i] = input.nextInt();
            }
            break;

         case 3:
            for (int i = 0; i < stock.length; i++) {
               System.out.print(drink[i] + "의 리필 수량 입력: ");
               stock[i] = input.nextInt();
            }
            break;

         case 4:
            masterModerun = false;
            break;

         default:
            System.out.println("잘못된 선택입니다.");
         }
      }
   }
}
