public class Grade {
  Name name;
  Subject kor;
  Subject eng;
  Subject math;
  int total;
  float avg;

  Grade() {
    name = new Name();
    kor = new Subject();
    eng = new Subject();
    math = new Subject();
    total = 0;
    avg = 0;
  }

  public String getName() {
    return this.name.getName();
  } 
  public void setName(String name) {
    this.name.setName(name);
  } 
  public int getKor() {
    return this.kor.getScore();
  }
  public void setKor(int kor) {
    this.kor.setScore(kor);
  }
  public int getEng() {
    return this.eng.getScore();
  }
  public void setEng(int eng) {
    this.eng.setScore(eng);
  }
  public int getMath() {
    return this.math.getScore();
  }
  public void setMath(int math) {
    this.math.setScore(math);
  }
  public int getTotal() {
    return total =  getKor() + getEng() + getMath();
  }
  public float getAvg() {
    return avg = getTotal() / 3.f;
  }
  
}