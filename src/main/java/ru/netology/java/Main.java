package ru.netology.java;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();

        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванович";
        post.subcription = true;
        post.birthday.day = "10";
        post.birthday.month = "01";
        post.birthday.year = "1990";
    }
}