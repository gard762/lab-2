package ru.university.lab2;

import ru.university.lab2.numbers.Task01Integers;
import ru.university.lab2.numbers.Task02Floating;
import ru.university.lab2.bits.Task03Bitwise;
import ru.university.lab2.strings.Task04Text;
import ru.university.lab2.arrays.Task05Arrays;
import ru.university.lab2.arrays.Task06Matrix;
import ru.university.lab2.methods.Task07Methods;
import ru.university.lab2.menu.Task08Menu;
import ru.university.lab2.util.Task09BuildInfo;

public class Main {
    public static void main(String[] args){
        new Task01Integers().run();
        new Task02Floating().run();
        new Task03Bitwise().run();
        new Task04Text().run();
        new Task05Arrays().run();
        new Task06Matrix().run();
        new Task07Methods().run();
        new Task08Menu().run();
        new Task09BuildInfo().run();
    }
}