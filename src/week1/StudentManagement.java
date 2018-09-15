package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    private  Student[] students = new Student[100];

    int index = 0;

    int list = students.length;

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
            if(students[i].getGroup() != student_group[j])
                j++;
            student_group[j] = students[i].getGroup();
        }
        for(int m =0; m < j; m++ ){
            System.out.println("Sinh vien thuoc lop " + student_group[m]);
            for(int n=0; n<index; n++ ){
                if(student_group[m] == students[n].getGroup()) {
                    System.out.println(students[n].getInfo());
                }
            }
        }

    }

    void  removeStudent(String id) {
        // TODO:
        for(int i=0; i<list; i++){
            if(students[i].getId() == id){
                for(int j=i; j<list; j++) {

                    students[j] = students[j++];
                }
                list--;
            }
        }
    }
    public void addStudent(Student st) {
        students[index] = st;
        index++;
    }
    /*public void getStudents() {
        for(int i=0;i<index;i++) {
            System.out.print(students[i].getName() + " ");
        }
    }*/







    public static void main(String[] args) {
        // TODO:
        Student student = new Student();

        StudentManagement infoStudents = new StudentManagement();

        student.setName("Truong");
        student.setEmail("17021092@vnu.edu.vn");
        student.setGroup("INT22044");
        student.setIp("17021092");
        Student student1 = new Student();
        Student student2 = new Student("Nguyen Truong", "17021091", "17021091@vnu.edu.vn");
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
        infoStudents.addStudent(student3);


        System.out.println(infoStudents.index);
        infoStudents.studentsByGroup();






    }
}