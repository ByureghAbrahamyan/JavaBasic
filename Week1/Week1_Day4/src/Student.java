public class Student {

    private String name;
    private int age;
    private int JS;
    private int Math;
    private int English;

    public Student(String name, int age, int JS, int math, int english) {
        this.name = name;
        this.age = age;
        this.JS = JS;
        Math = math;
        English = english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", JS=" + JS +
                ", Math=" + Math +
                ", English=" + English +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getJS() {
        return JS;
    }

    public void setJS(int JS) {
        this.JS = JS;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int averageFunc(){
      return (this.JS + this.English + this.Math) / 3;
    }
}

