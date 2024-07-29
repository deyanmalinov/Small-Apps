package com.DPM;
public class Articles_2 {

    private String title;

    private String content;

    private String author;

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Articles_2(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public void edit(String newContend){
        this.content = newContend;
    }
    public void changeAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public void rename (String rename){
        this.title = rename;
    }
}