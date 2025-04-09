public class Practise1 {

    public static void main(String[] args) {
        Human human=new Human(2,2,1);
        Student stu=new Student(2,2,1);
        Teacher teacher=new Teacher(2,2,1);
        
        human.think();
        stu.study();
        teacher.teach();
        teacher.mentor();
    }
}
