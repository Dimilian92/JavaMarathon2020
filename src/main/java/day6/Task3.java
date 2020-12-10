package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher myTeacher = new Teacher();
        myTeacher.setName("Семен");
        myTeacher.setSubject("Трудовик");
        Student meLikeStudent = new Student();
        meLikeStudent.setName("Димоооон");
        myTeacher.evaluate(meLikeStudent);


    }
}

class Teacher{
    String name;
    String subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student){
        int grade = (int)(Math.random()*5);
        String gradeStr;
        switch (grade){
            case 0:
            case 1:
            case 2:
                gradeStr = "неудовлетворительно";
                break;
            case 3:
                gradeStr = "удовлетворительно";
                break;
            case 4:
                gradeStr = "хорошо";
                break;
            case 5:
                gradeStr = "отлично";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + grade);
        }
        System.out.println("Преподаватель " + name +" оценил студента с именем "+student.name+" по предмету "+subject+" на оценку "+gradeStr+".");
    }
}

class Student{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
