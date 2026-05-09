public class Student {
    int id;
    String name;
    double marks;
    String school;
    public Student(int id, String name,double marks,String school){
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.school = school;
    }
    @Override
    public String toString(){
        return "[ "+id+", "+name+", "+marks+", "+school+" ]";
    }
}
