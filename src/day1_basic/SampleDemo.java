package day1_basic;

public class SampleDemo {
    public static void main(String[] args) {
        student s = new student();
        s.setSid(301);
        s.setSname("Dia");
        s.setAvg(85.6f);

        System.out.println("Student id:" + s.getSid());
        System.out.println("Student Name:" + s.getSname());
        System.out.println("Student Average:" + s.getAvg());
        
        System.out.println(s.toString());
    }
}

