package week1;


public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    private  Student[] students = new Student[100];
    int index = 0;
    public  boolean sameGroup(Student s1, Student s2) {
        // TODO:
        String students1 = s1.getGroup();
        String students2 = s2.getGroup();
        if(students1.equals(students2)){
            return true;
        }
        return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        // TODO:
        String student_group[] = new String[index];
        int j=0;
        student_group[j] = students[j].getGroup();
        for(int i=1; i<index; i++){
            if(students[i].getGroup() != students[j].getGroup());
                j++;
            student_group[j] = students[i].getGroup();
        }

        for(int m =0; m <= j; m++ ){
            System.out.println("Sinh vien thuoc lop " + student_group[m]);
            for(int n=0; n < index; n++ ){
                if(student_group[m] == students[n].getGroup()) {
                    System.out.println(students[n].getInfo() + "\n");
                }
            }
        }

    }

    void  removeStudent(String id) {
        // TODO:
        for(int i=0; i<index; i++){
            if(students[i].getId() == id){
                for(int j=i; j<(index-1); j++) {

                    students[j].setGroup(students[j+1].getGroup());
                    students[j].setIp(students[j+1].getId());
                    students[j].setName(students[j+1].getName());
                    students[j].setEmail(students[j+1].getEmail());
                }
                index--;
            }
        }
    }
    public void addStudent(Student st) {
        students[index] = st;
        index++;
    }
    public static void main(String[] args) {
        // TODO:
        Student student = new Student();

        StudentManagement infoStudents = new StudentManagement();

        student.setName("Student");
        student.setEmail("17021092@vnu.edu.vn");
        student.setGroup("INT22044");
        student.setIp("id");
        Student student1 = new Student();
        Student student2 = new Student("Student2", "17021091", "17021091@vnu.edu.vn");
        Student student3 = new Student(student1);

        System.out.println(student.getName() + "\n");
        System.out.println(student.getInfo() + "\n");
        System.out.println(student1.getInfo() + "\n");
        System.out.println(student2.getInfo() + "\n");
        System.out.println(student3.getInfo() + "\n");

        //Thu samegroup();
        System.out.println(infoStudents.sameGroup(student1, student2));
        System.out.println(infoStudents.sameGroup(student1, student3));

        infoStudents.addStudent(student);
        infoStudents.addStudent(student1);
        infoStudents.addStudent(student2);

        infoStudents.removeStudent("id");

        infoStudents.studentsByGroup();






    }
}