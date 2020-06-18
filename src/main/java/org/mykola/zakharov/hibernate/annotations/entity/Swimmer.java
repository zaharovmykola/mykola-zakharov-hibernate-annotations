package org.mykola.zakharov.hibernate.annotations.entity;

import javax.persistence.*;

@Entity
@Table(name="Swimmers")
public class Swimmer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "age")
    private int age;
    @Column(name = "record_meters")
    private Integer recordMeters;
    @Column(name = "last_name", length = 25)
    private String lastName;

    public Swimmer() {
    }

    public Swimmer(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getRecordMeters() {
        return recordMeters;
    }

    public void setRecordMeters(Integer recordMeters) {
        this.recordMeters = recordMeters;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Swimmer{" +
                "id=" + id +
                ", age=" + age +
                ", recordMeters=" + recordMeters +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
