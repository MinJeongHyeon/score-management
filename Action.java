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



}