public class Student {
    private Name name;
    private int age;
    private Address address;
    private int gpa;
    private String registeredid;

    public Student(){}
    public Student(Name name,int age,int gpa,String registeredid){
        this.gpa=gpa;
        this.registeredid=registeredid;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getRegisteredid() {
        return registeredid;
    }

    public void setRegisteredid(String registeredid) {
        this.registeredid = registeredid;
    }
}

