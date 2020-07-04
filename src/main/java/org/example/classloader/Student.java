package org.example.classloader;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentId;
    private String school;
    private List<Book> books;
    class Book{
        String bookId;
        String bookName;
        Book(String id,String name){
            this.bookId=id;
            this.bookName=name;
        }
         public void printf(){
            System.out.println(bookId+" "+bookName);
        }
    }
    public Student(){
        books=new ArrayList<>();
    }
    public Student(String id,String school){
        this.studentId=id;
        this.school=school;
        books=new ArrayList<>();
    }
    protected Student(String id,String school,String bookId,String bookName){
        this.studentId=id;
        this.school=school;
        books=new ArrayList(){{
            add(new Book(bookId,bookName));
        }};
    }
    public String getStudentId(){
        return studentId;
    }
    protected String getSchool(){
        return school;
    }
    void addBook(String bookId,String bookName){
        books.add(new Book(bookId,bookName));
    }
    public void printBooks(){
        for (Book book : books) {
            book.printf();
        }
    }
}
