package application;

import entites.Comment;
import entites.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        //Instanciando o primeiro post
        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zeland",
                "I'm going to visit this wonderful country",
                12
        );

        //Instanciando os comentários do Post 01
        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");

        p1.addComment(c1);
        p1.addComment(c2);

        //Instanciando o segundo post
        Post p2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Goode night guys",
                "See you tomorrow",
                5
        );

        //Instanciando os comentários do Post 02
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println("-----------------------------");
        System.out.println("---------- Post 01 ----------");
        System.out.println(p1);

        System.out.println("-----------------------------");
        System.out.println("---------- Post 02 ----------");
        System.out.println(p2);
        System.out.println("-----------------------------");

        sc.close();

    }
}