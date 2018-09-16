package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String email;

    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName(){

        return name;
    }
    public String getId(){

        return id;
    }
    public String getGroup(){

        return group;
    }
    public String getEmail(){

        return email;
    }
    public void setName(String n){

        name = n;
    }
    public void setIp(String i){
        id = i;
    }
    public void setGroup(String g) {

        group = g;
    }
    public void setEmail(String e){

        email = e;
    }

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name = "Student1";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        name = n;
        id = sid;
        email = em;
        group = "INT22042";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    String getInfo() {
        // TODO:
        System.out.println("Name : " + name );
        System.out.println("Id : " + id );
        System.out.println("Group : " + group );
        System.out.println("Email : " + email );
        return null; // xóa dòng này sau khi cài đặt
    }
}
