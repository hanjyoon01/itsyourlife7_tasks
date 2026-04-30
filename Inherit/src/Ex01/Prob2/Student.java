package Ex01.Prob2;

public class Student {
    public static void main(String args[]){
        Student stu = new Student("장동건", "jspprogram",
                500000);
        stu.calcReturnFee();
        stu.print();
    }

    String name;
    String subject;
    int fee;
    double returnFee;

    Student(String name, String subject, int fee) {
        this.name = name;
        this.subject = subject;
        this.fee = fee;
    }

    void  calcReturnFee(){
        if(subject.equals("javaprogram")){
            returnFee = fee * 0.25;
        } else if(subject.equals("jspprogram")){
            returnFee = fee * 0.2;
        } else {
            System.out.println("그런 과정명은 없습니다.");
        }
    }

    void print(){
        System.out.printf("%s 씨의 과정명은 %s이고 교육비는 %d원이며 환급금은 %.1f원입니다.", name, subject, fee, returnFee);
    }
}