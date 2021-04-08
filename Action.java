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
 //데이터 제거 메서드
    static void deleteRecord() {
        while(true) {
          displayRecord();
          System.out.println("삭제하고싶은 데이터를 입력하세요.");

          do {
            try {
              Scanner s = new Scanner(System.in);
              String input = s.nextLine().trim();

              if(!input.equalslgnoreCase("exit")) {
                int length = record.size();
                boolean found = false;
                for(int i=0; i < length; i++) {
                  Editname editname = (Editname)record.get(i);
                  if(input.equals(editname.editName)) {
                    found = true;
                    record.remove()
                    break;
                  }
                }
                if(found) {
                  System.out.println("삭제완료");
                } else {
                  System.out.println("동일한 정보가 없습니다.");
                }
                break;
              } else {
                return;
              } catch(exception e) {
                System.out.println("다시 입력해주세요.");
                break;
              }
            } while(true);
          }            
        }                              
  }

}