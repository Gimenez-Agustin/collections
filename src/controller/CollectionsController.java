package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import model.Book;

public class CollectionsController {

    public static void ListExample() {
        System.out.println("A List is a collection that allow duplicates and behave like array");
        System.out.println("In a List we don't need to specify a number of elements");
        System.out.println("------------------------------------------------------------------");
        List<Book> books = new ArrayList<>();
        Book book = new Book();
        book.setTitle("Book of Mormon");
        books.add(book);
        books.add(book);
        book = new Book();
        book.setTitle("Doctrine and Covenants");
        books.add(book);
        for (Book boo : books) {
            System.out.println(boo.toString());
        }
    }

    public static void SetsExample() {
        System.out.println("A Set is a collection that doesn’t allow duplicates ");
        System.out.println("and also doesn’t allow accessing elements by index.");
        System.out.println("Instead provides methods that check if element or elements exists.");
        System.out.println("------------------------------------------------------------------");
        Set<Book> books = new HashSet<>();
        Book book = new Book();
        book.setTitle("Book of Mormon");
        books.add(book);
        books.add(book);
        book = new Book();
        book.setTitle("Doctrine and Covenants");
        books.add(book);
        for (Book boo : books) {
            System.out.println(boo.toString());
        }
        System.out.println("As you can see we have only 2 elements even though");
        System.out.println("We add the same as the List");
    }

    public static void MapExample() {
        System.out.println("a Map is collection that allow duplicates and is similar to list ");
        System.out.println("except that index elements by key (key can be any object)");
        System.out.println("Map can be assumed as associative array.");
        Map<Integer, Book> books = new HashMap<Integer, Book>();
        Book book = new Book();
        book.setTitle("Book of Mormon");
        Book book1 = new Book();
        book1.setTitle("Doctrine and Covenant");
        Book book2 = new Book();
        book2.setTitle("Pearl of Great Price");
        Book book3 = new Book();
        book3.setTitle("Bible");
        books.put(1, book);
        books.put(2, book1);
        books.put(3, book2);
        books.put(4, book3);
        System.out.println("this is a get method to get a item from the list from an Id");
        System.out.println("book 1: " + books.get(4));
    }

    public static void QueueExample() {
        System.out.println("Elements are added (pushed) and removed (popped) in order they where added.");
        System.out.println("principle is called FIFO (First In, First Out)");
        Queue<Book> books = new LinkedList<>();
        Book book = new Book();
        book.setTitle("Book of Mormon");
        books.add(book);
        book = new Book();
        book.setTitle("Doctrine and Covenant");
        books.add(book);
        book = new Book();
        book.setTitle("Pearl of Great Price");
        books.add(book);
        books.remove();
        System.out.println("Last Item: " + books.element());
    }

    public static void TreeExample() {
        System.out.println("A Tree is a non-linear data structure where data objects");
        System.out.println("are organized in terms of hierarchical relationship.");
        System.out.println("The structure is non-linear in the sense that, unlike");
        System.out.println("simple array and linked list implementation, data in");
        System.out.println("a tree is not organized linearly.");
        TreeSet<String> books = new TreeSet<>();
        books.add("Book of Mormon");
        books.add("Doctrine and Covenant");
        books.add("Pearl of Great Price");
        Iterator<String> itr = books.iterator();
        while (itr.hasNext()) {
            System.out.println("Books: " + itr.next());
        }
    }
}