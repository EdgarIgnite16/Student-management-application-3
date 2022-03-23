package DTO;

import java.util.Arrays;

public class StudentDTO {
    private String idStudent;
    private String name;
    private String email;
    private String phoneNumber;
    private int sex;
    private String address;
    private byte[] avatar;

    public StudentDTO() {
    }

    public StudentDTO(String idStudent, String name, String email,
                      String phoneNumber, int sex, String address, byte[] avatar) {
        this.idStudent = idStudent;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.address = address;
        this.avatar = avatar;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "idStudent='" + idStudent + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                ", avatar=" + Arrays.toString(avatar) +
                '}';
    }
}
