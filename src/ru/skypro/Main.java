package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        String capitalLetters = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + capitalLetters);


        String forAdministration = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела - " + forAdministration);

        String fullName1 = "Иванов Семён Семёнович";
        String validFullName1 = fullName1.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + validFullName1);
    }
}
