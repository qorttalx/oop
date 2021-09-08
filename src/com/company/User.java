package com.company;

public class User {
    private static int maxId = 0;
    private String info;
    private String login;
    private String password;
    private int id;

    public static void setMaxId(int maxId) {
        User.maxId = maxId;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public static int getMaxId() {
        return maxId;
    }

    public String getInfo() {
        return info;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }


    //private static int mid;
    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.id = maxId;
        maxId++;
    }





    public void ShowInfo(){

        System.out.println("имя пажилого: " + login);
        System.out.println("пароль: " + password);
        System.out.println("айди гопника: " + id);
    }

    public void AddUser(String l, String p){
        //maxId++;
        this.login = l;
        this.password = p;
        //this.id = id;

        this.info = info + " " + l + " " + p + " " + maxId;
        System.out.println(info);
        //user = info;
        maxId++;
    }

    public void RedaktorUser(String l, String p){


    }
}
