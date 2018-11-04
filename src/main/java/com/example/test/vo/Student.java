package com.example.test.vo;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间: 2018/5/28 </div>
 *
 * @author lekp
 * @since 1.0
 */
public class Student implements Comparable<Student>{
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if (Integer.valueOf(this.age)>Integer.valueOf(o.getAge())){
            return 1;
        }else {
            return -1;
        }
    }
}
