import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Action action = new Action();
    int count = 0;
    int select = 0;

    while (true) {
      System.out.println("번호를 입력하세요");
      System.out.println("1. 성적 입력 2. 성적 출력 3. 성적 정렬 4. 성적 삭제 5. 성적 수정 6. 종료");
      select = sc.nextInt();


      switch (select) {
        case 1:
        action.inputRecord(count);
        count++;
        break;
        case 2:
        action.outputRecord(count);
        break;
        case 3:
        action.sortRecord(count);
        break;
        case 4:
        action.deleteRecord(count);
        break;
        case 5:
        action.edit(count);
        break;
        case 6:
        System.exit();
      }
       
    
      }
    }
}