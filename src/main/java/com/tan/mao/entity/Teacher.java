package com.tan.mao.entity;

import com.tan.mao.domain.enums.TeacherType;

import java.util.Date;
import javax.persistence.*;

@Table(name = "teacher")
public class Teacher {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`name`")
    private String name;

    /**
     * ���ͣ�0һ�㣬1�߼���2�ؼ�
     */
    @Column(name = "`type`")
    private TeacherType type;

    @Column(name = "`age`")
    private Integer age;

    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ���ͣ�0һ�㣬1�߼���2�ؼ�
     *
     * @return type - ���ͣ�0һ�㣬1�߼���2�ؼ�
     */
    public TeacherType getType() {
        return type;
    }

    /**
     * �������ͣ�0һ�㣬1�߼���2�ؼ�
     *
     * @param type ���ͣ�0һ�㣬1�߼���2�ؼ�
     */
    public void setType(TeacherType type) {
        this.type = type;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}