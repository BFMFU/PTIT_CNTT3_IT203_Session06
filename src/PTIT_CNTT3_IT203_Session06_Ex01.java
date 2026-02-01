public class PTIT_CNTT3_IT203_Session06_Ex01 {

    static class Student {
        String studentId;
        String fullName;
        int birthYear;
        double gpa;

        public Student(String studentId, String fullName, int birthYear, double gpa) {
            this.studentId = studentId;
            this.fullName = fullName;
            this.birthYear = birthYear;
            this.gpa = gpa;
        }

        public void displayInfo() {
            System.out.println("Student ID: " + studentId);
            System.out.println("Full Name: " + fullName);
            System.out.println("Birth Year: " + birthYear);
            System.out.println("GPA: " + gpa);
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        Student sv1 = new Student("SV001", "Nguyen Van A", 2004, 8.5);
        Student sv2 = new Student("SV002", "Tran Thi B", 2003, 7.8);

        sv1.displayInfo();
        sv2.displayInfo();
    }
}
