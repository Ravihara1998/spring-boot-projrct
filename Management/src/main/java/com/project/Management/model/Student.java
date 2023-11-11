package com.project.Management.model;

public class Student {

    private String name;
    private String mobile;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, String mobile, String email, String nic, int id) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.nic = nic;
        this.id = id;
    }

    private String nic;
    private int id;
}
