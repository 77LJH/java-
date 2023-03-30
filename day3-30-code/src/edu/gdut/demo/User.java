package edu.gdut.demo;

public class User {
    private String userName;
    private String passwords;
    private String email;
    private char gender;
    private int age;


    public User() {
    }

    public User(String userName, String passwords, String email, char gender, int age) {
        this.userName = userName;
        this.passwords = passwords;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return passwords
     */
    public String getPasswords() {
        return passwords;
    }

    /**
     * 设置
     * @param passwords
     */
    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "User{userName = " + userName + ", passwords = " + passwords + ", email = " + email + ", gender = " + gender + ", age = " + age + "}";
    }
}
