package JDBC;

public class Student {

    private int id;
    private String name;
    private String sex;
    private String age;
    private String birthdy;
    private int classid;

    public Student(int id, String name, String sex, String age, String birthdy, int classid) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.birthdy = birthdy;
        this.classid = classid;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthdy() {
        return birthdy;
    }

    public void setBirthdy(String birthdy) {
        this.birthdy = birthdy;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public Student() {
    }
    public void show() {
        System.out.println("StuentBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", birthdy='" + birthdy + '\'' +
                ", classid=" + classid +
                '}');

    }
}

