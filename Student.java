
import java.util.Objects;
public class Student {

    private int studentId;
    private String studentName;
    private String major;
    public Student(int studentId,String studentName,String major){
        this.studentId=studentId;
        this.studentName=studentName;
        this.major=major;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null||this.getClass()!=obj.getClass())return false;
        Student otherstudent=(Student) obj;
        return this.studentId==otherstudent.studentId;
    }
    @Override
    public int hashCode(){
        return Objects.hash(studentId);
    }
}
