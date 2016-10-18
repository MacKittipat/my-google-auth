package com.mackittipat.mygoogleauth.job;

import java.io.Console;
import java.io.FileWriter;
import java.io.IOException;

public class InitJob {

    public static void init(){

        Console console = System.console();

        System.out.println("Please input your key: ");
        String key = new String(console.readPassword());

        System.out.println("Please input prefix password: ");
        String prefixPassword = new String(console.readPassword());

        System.out.println("Please input file path: ");
        String path = console.readLine();

        StringBuilder data = new StringBuilder();
        data.append("secret: '").append(key).append("'\n");
        data.append("prefix-password: '").append(prefixPassword).append("'\n");

        try {
            FileWriter fw = new FileWriter(path);
            fw.write(data.toString());
            fw.close();
        }catch (IOException e){
            System.out.println("Can not write data to file");
        }

    }
}
