package com.company;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Main {

    public static void main(String[] args) {
	// Числа (числитель и знаменатель):
        double x,y;
        // Заголовок окна:
        String title="Деление чисел";
        // Текст сообщения (начальное значение):
        String text="Результат деления: ";
        // Переменная определяет тип сообщения:
        int type;
        // Считывание числителя:
        x=Double.parseDouble(JOptionPane.showInputDialog("Введите числитель"));
        // Считывание знаменателя:
        y=Double.parseDouble(JOptionPane.showInputDialog("Введите знаменатель"));
        // Условный оператор: равен ли нулю знаменатель?
        if (y!=0) {type=JOptionPane.PLAIN_MESSAGE; // Знаменатель не равен нулю
            text=text+x+"/"+y+"="+x/y;}
        else {type= JOptionPane.ERROR_MESSAGE; // Знаменатель равен нулю
            text=text+"деление на ноль!";}
        // Отображение окна с сообщением:
        JOptionPane.showMessageDialog(null,text,title,type);
    }
}
