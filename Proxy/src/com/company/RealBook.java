package com.company;

import java.text.MessageFormat;

public class RealBook implements Book{

    private String title;
    private String author;
    private String content;

    public RealBook(final String title, final String author) {
        this.title = title;
        this.author = author;
        loadContentFromDatabase(title, author);
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getContent() {
        return content;
    }

    private void loadContentFromDatabase(final String title, final String author) {
        System.out.println("Loading content from database...");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = MessageFormat.format("IVery large content", title, author);
    }
}
