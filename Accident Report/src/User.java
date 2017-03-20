public class User {
    private String name;
    private long studentId;

    public User(String name, long studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public long getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "User name : "+name+"\n"+
                "Student ID : "+studentId+"\n";
    }
    
}
