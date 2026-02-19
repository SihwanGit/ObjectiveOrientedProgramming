package FinalProgram;


class MyStudent {
   private String name; // 학생의 이름
   private String track; // 학생의 전공 트랙
   private int id; // 학생의 학번
   private double grade; // 학생의 학점 평균
   
   public MyStudent(String name, String track, int id, double grade) {
      this.name = name;
      this.track = track;
      this.id = id;
      this.grade = grade;
   }
   
   public String getName() { return name; }
   public String getTrack() { return track; }
   public int getId() { return id; }
   public double getGrade() { return grade; }
   
   @Override
   public String toString() {
      return name + "," +track + "," + id + "," + grade;
   }
}
