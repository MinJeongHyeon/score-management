import java.util.Scanner;
import java.util.Arrays;
public class Action {
  Scanner sc = new Scanner(System.in);
  Grade[] grade;
  Grade temp;
  Action() {
    grade = new Grade[50];
    for (int i = 0; i < grade.length; i++) {
      grade[i] = new Grade();
    }
  }

public void edit(int count) {
    if (count < 1) {
      System.out.println("정보가 없습니다");
    }
    else {
      Scanner sc = new Scanner(System.in);
      String editName;
      int num = 0;
      
      System.out.println("수정할 학생의 이름을 입력하세요");
      editName = sc.next();
    
      for (int i = 0; i < count; i++) {
        if(grade[i].name.getName().equals(editName)) { 
          System.out.println("1. 국어 2. 영어 3. 수학");
          num=sc.nextInt();
          switch(num) {
            case 1: System.out.println("국어 점수를 다시 입력해주세요"); 
            grade[i].setKor(sc.nextInt());
            System.out.println("국어 점수 수정완료");
            break;
            case 2: System.out.println("영어 점수를 다시 입력해주세요");
            grade[i].setEng(sc.nextInt());
            System.out.println("영어 점수 수정완료");
            break;
            case 3: System.out.println("수학 점수를 다시 입력해주세요");
            grade[i].setMath(sc.nextInt());
            System.out.println("수학 점수 수정완료");
            break;
          }
        }
        else {
          System.out.println("정보가 없습니다");
        }
      }
    }
  }


}