package com.DPM;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            String author = scan.nextLine();
            String title = scan.nextLine();
            double price = Double.parseDouble(scan.nextLine());
            Book book = new Book(author,title,price);
            GoldenEditionBook goldenEditionBook = new GoldenEditionBook(author,title,price);
            System.out.println(book.toString());
            System.out.println(goldenEditionBook.toString());
        }catch (IllegalArgumentException msg){
            System.out.println(msg.getMessage());
        }
    }
}

public class Book {
    private String author;
    private String title;
    private double price;
    public Book(String author, String title, double price){
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(price);
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public void setAuthor(String author) {
        String[] authorNames = author.split(" ");
        if (authorNames.length == 2 && Character.isDigit(authorNames[1].charAt(0))){
            throw new IllegalArgumentException("Author not valid!");
        }
        this.author = author;
    }
    public void setTitle(String title) {
        if (title.length() < 3){
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }
    public void setPrice(double price) {
        if (price < 1){
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }
}

public class GoldenEditionBook extends Book{
    public GoldenEditionBook(String author, String title, double price){
        super(author, title, price);
    }
    @Override
    public double getPrice() {
        return super.getPrice() + super.getPrice() * 0.3;
    }
}