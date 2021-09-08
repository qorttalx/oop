package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User [] us = new User[100];
       // us[0] = new User();
        int i = 0;
        while (true){
            System.out.println("1 - ShowUsers\n2 - AddUser\n3 - redaktor\n4 - Exit");
            int ch = Integer.parseInt(in.nextLine());

            if (ch == 1){
                try {


                for (int i2 = 0; i2 <= us.length; i2++){
               us[i2].ShowInfo();}}
                catch (Exception ex){}
            }

            else if (ch == 2){
                System.out.println("Введите логин");
                String log = in.nextLine();

                System.out.println("Введите пароль");
                String pas = in.nextLine();

                //System.out.println("Введите айди");
                //String id = in.nextLine();
                String a = String.valueOf(i);
                us[i] = new User(log, pas);
                //us[i].setLogin(log);
                //us[i].setPassword(pas);


                System.out.println("Привет мир");

                i++;
            }
            else if (ch == 3){
                System.out.println("id Пользователя: ");
                String poka = in.nextLine();

                for (int i3 = 0; i3 <= us.length; i3++){
                    if (us[i3].getId() == poka){
                        us[i3] = null;
                        break;
                    }
                }


            }

            else {

                break;
            }

        }
        in.close();
    }
}
