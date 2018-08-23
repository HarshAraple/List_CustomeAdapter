package com.custome_adapter.harsharaple.add_list_adapter;

public class Student {
    private int stu_id;
    private String stu_name;
    private String stu_gender;
    private int stu_image;


    public Student(String stu_name,String stu_gender,int stu_image)
    {
        this.stu_name = stu_name;
        this.stu_gender = stu_gender;
        this.stu_image = stu_image;

    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_gender() {
        return stu_gender;
    }

    public void setStu_gender(String stu_gender) {
        this.stu_gender = stu_gender;
    }

    public int getStu_image() {
        return stu_image;
    }

    public void setStu_image(int stu_image) {
        this.stu_image = stu_image;
    }
}
