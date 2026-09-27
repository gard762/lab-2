package ru.university.lab2.util;

public class Task09BuildInfo {
    public void run(){
        System.out.println("Проект собирается вручную:");
        System.out.println("  javac -d out $(find src -name '*.java')");
        System.out.println("  jar cfm lab2.jar manifest.mf -C out .");
        System.out.println("  java -jar lab2.jar");
    }
}