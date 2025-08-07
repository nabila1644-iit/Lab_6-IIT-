import java.util.*;

public class StudentManagementSystem {
    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();

        Student a = new Student(1104, "nabila", "cs");
        Student b = new Student(2806, "nafisa", "biologicalscience");
        Student c = new Student(2894, "meem", "cs");
        Student d = new Student(4566, "sadia", "pharmacy");
        Student e = new Student(3425, "anicka", "socialscience");
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);
        students.add(e);
        for(Student student:students){
            String s=student.toString();
            System.out.println( s );
        }
        System.out.println("after adding new student at 2nd index");
        Student newstudent=new Student(3142,"sneha","maths");
        students.add(2,newstudent);
        for(Student student:students){
            String s=student.toString();
            System.out.println( s );
        }
        System.out.println("after removing a student from 3rd index");
        students.remove(3);
        for(Student student:students){
            String s=student.toString();
            System.out.println( s );
        }
        System.out.println("hashset students:   ");
        Set<Student>studentSet=new HashSet<>();
        for(Student student:students){
            if(student.getStudentId()%2==0){
                studentSet.add(student);
            }
        }
        for(Student stu:studentSet){
            String s=stu.toString();
            System.out.println( s );
        }
        System.out.println("use of equals");
        Student k= new Student(2806, "nafisa", "biologicalscience");
        System.out.println("is student b and k equal ?"+b.equals(k));
        Student stutofind= new Student(2806, "nafisa", "biologicalscience");
        if(studentSet.contains(stutofind)){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }
       HashMap<Integer,Student>studentmap=new HashMap<Integer, Student>();
        for(Student student:students){
            studentmap.put(student.getStudentId(),student);
        }
        System.out.println(studentmap);
        System.out.println("give the student id to be searched");
        Scanner scanner=new Scanner(System.in);
        int id= scanner.nextInt();
        Student foundStudent=studentmap.get(id);
        if(foundStudent!=null){
            System.out.println("found");
        }
        else{
            System.out.println("sorry, not found");
        }
        scanner.close();
    }
}
