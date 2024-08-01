package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<Integer>();
        String str = "";

        while (!str.equals("exit")) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num2 = sc.nextInt();

            sc.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            char cha = sc.nextLine().charAt(0);

            int result = 0;

            switch (cha) {
                /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    continue;
            }

            System.out.println("결과: " + result);
            /* 연산의 결과를 배열에 저장합니다. */
            intList.add(result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            str = sc.nextLine();

            if (str.equals("remove")) {
                if (!intList.isEmpty()) {
                    intList.remove(0);
                    System.out.println("가장 먼저 저장된 연산 결과가 삭제되었습니다.");
                } else {
                    System.out.println("삭제할 결과가 없습니다.");
                }
            } else if (str.equals("inquiry")) {
                System.out.println("저장된 연산 결과:");
                for (int i : intList) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
        // Scanner 객체를 닫습니다
    }
}

