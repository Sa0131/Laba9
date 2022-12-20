package ru.mirea.lab93;

import java.util.SortedSet;
import java.util.TreeSet;

public class CompareStudent {
    public static void main(String[] args) {
        SortedSet<Student> set = new TreeSet<>();
        set.add(new Student("Максим", "Берёзкин", 19));
        set.add(new Student("Сергей", "Петров", 18));
        set.add(new Student("Наталья", "Вольт", 21));
        set.add(new Student("Станислава", "Заболотская", 17));
        set.forEach(System.out::println);
    }
}
