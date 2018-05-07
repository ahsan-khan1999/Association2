public class Person {

    
    private Name name;
    //private Name middleName;
    //private Name lastName;
    private int age;
    private Address address;


    public Person(){}
    public Person(Name name,int age){
        this.name = name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display(){
        System.out.println("Name" +name );
        System.out.println("age" +age);
        System.out.println("Address" +address);
    }
}
