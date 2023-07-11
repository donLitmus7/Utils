import java.util.Comparator;
public class TestPOJO  {
    private String studentname;
    private int rollno;
    private int studentage;

    public TestPOJO(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }
    public String getStudentname() {
         return studentname;
    }
    public void setStudentname(String studentname) {
	this.studentname = studentname;
    }
    public int getRollno() {
	return rollno;
    }
    public void setRollno(int rollno) {
	this.rollno = rollno;
    }
    public int getStudentage() {
	return studentage;
    }
    public void setStudentage(int studentage) {
 	this.studentage = studentage;
    }	
    public static Comparator<TestPOJO> StuNameComparator = new Comparator<TestPOJO>() {

	public int compare(TestPOJO s1, TestPOJO s2) {
	   String StudentName1 = s1.getStudentname().toUpperCase();
	   String StudentName2 = s2.getStudentname().toUpperCase();

	  
	   return StudentName1.compareTo(StudentName2);

	  
    }};
public static Comparator<TestPOJO> RollNoComparator=new Comparator<TestPOJO>(){
	public int compare(TestPOJO p1,TestPOJO p2){
		
		return (p1.getRollno())-(p2.getRollno());
		
	}
	
	
};
    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }

}