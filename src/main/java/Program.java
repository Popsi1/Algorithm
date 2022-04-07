//using System;
//using System.Collections.Generic;

public class Program {
    public static void shortenPath(String path) {
        String[] p=path.split("/");
        for(String w:p){
        System.out.println(p[2]);



        }
    }


    public static void main(String[] args){
        Program program=new Program();
        String a="/foo/../test";
        program.shortenPath(a);

    }
}
