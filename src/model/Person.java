package model;

public class Person {
    private String name;
    private  int age;
    private  double salary;




    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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



    public double getSalary() {
        return salary;
    }




    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toFileLine(){
        String str = name + " "+ age + " " + salary;
        return str;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
