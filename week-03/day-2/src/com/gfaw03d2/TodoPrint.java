package com.gfaw03d2;

public class TodoPrint {
    public static void main(String[] args) {
        String output;
        String myTodo = "My todo:\n";
        String todoText = " - Buy milk\n";
        String download = " - Download games\n";
        String diablo = "\t - Diablo";

        output = myTodo + todoText + download + diablo;

        System.out.println(output);
    }
}
