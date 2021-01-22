package com.company;
import java.util.*;
public class Main {
    private static int DEFAULT_SIZE = 10;

    public static void main(String[] args) {

        double n = 1.2;
        int mas[];
        mas = new int[DEFAULT_SIZE];
        System.out.print( "Mассив: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round(Math.random() * 20);
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");
        bubbleSort(mas); //сортировка массива
        sredznschmas(mas);// вызов функици для нахождения среднего числа
        mas_length(mas);//
    }

    //----------------------------------------------------------------------------
    static void mas_length(int ...nums){
        int result = 0 ;
        for ( int n: nums)
            result += 1;
        System.out.println("\nВ данном массиве " + result + " элементов(а)");
    }
    //----------------------------------------------------------------------------
    public static void sredznschmas(int[] smass){
        double SZ =0;
        for(int i = 0; i <  smass.length; i++) {
            SZ=SZ+smass[i]; //сумма всех элеметов массива
        }
        SZ=SZ/ smass.length; // деление суммы  на кол-во элементов
        System.out.println("\nСредннее арифметическое:  "+SZ); }
    //----------------------------------------------------------------------------
    public static void bubbleSort(int[] mass) {
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = mass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (mass[j] > mass[j + 1]) {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                }
            }
        }
        System.out.print( "Отсортированный массив: ");
        for(int i = 0; i <  mass.length; i++) {
            System.out.print(mass[i] + "  ");
        }
    }
}