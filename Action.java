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
static void inputRecord() {
    System.out.println("이름을 입력하세요");
    grade[count].setName(sc.next());
    System.out.println("국어 점수를 입력하세요");
    grade[count].setKor(sc.nextInt());
    System.out.println("영어 점수를 입력하세요");
    grade[count].setEng(sc.nextInt());
    System.out.println("수학 점수를 입력하세요");
    grade[count].setMath(sc.nextInt());
  }

// 데이터 정렬
  static void sortRecord() {
    while(true) {
      System.out.println("정렬기준 선택.(1:이름순 2:총점순 3:메뉴");
      
      int sort = 0;

      do{
        try{
          sort = new Scanner(System.in).nextlnt();

          if(sort >= 1 && sort <= 3) {
            break;
          }else {
            throw new Exception();
          }
        }catch(Exception e) {
          system.out.println("잘못된 입력값입니다. 다시 입력해주세요.");
          System.out.println("정렬기준 선택.(1:이름순 2:총점순 3:메뉴");
        }
      }while(true);

      if(sort==1)
        Collections.sort(record, new NameAscending());
      else if(sort==2)
        Collevtions.sort(record, new TotalDescending());
      else {
        return;
    }
  }
  }

// 출력
  static void outputRecord() {
      if(count < 1) {
        System.out.println("정보가 없습니다");
      }else{
        // i : 비교할 횟수
        for(int i = 0; i< count-1; i++) {
               
      for (int i = 0; i < count; i++) {
        System.out.print(grade[i].getName()+"\t");
        System.out.print(grade[i].getKor()+"\t"); 
        System.out.print(grade[i].getEng()+"\t");
        System.out.print(grade[i].getMat()+"\t");
        System.out.print(grade[i].getTotal()+"\t");
        System.out.println(grade[i].getAvg());
  }
  }
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

                    found = true;
                    record.remove();
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
