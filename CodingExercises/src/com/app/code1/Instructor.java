package com.app.code1;

public class Instructor {
    public long id;
	public String name;
	public String title;
	public String department;
	public Book[] books;
	
	public Instructor(long id, String name, String title, String department, Book[] books) {
		
		this.id = id;
		this.name = name;
		this.title = title;
		this.department = department;
		this.books = books;
	}
	
	public Instructor(long id, String name, String title, String department) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.department = department;
		
	}
	
	public Instructor(long id, String name, String title) {
		this.id = id;
		this.name = name;
		this.title = title;
	}
	
	public Instructor(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getMostRecentBookTitle() {
		System.out.println("Most recent book : ");
		String bookName = books[books.length - 1].title.toString(); 
		
		return bookName;
	
	}
	 
	public Book updateBook(int index, String title) {
		Book oldtitle = books[index];
		books[index] = new Book(title);
		return oldtitle;
		
		
	}

	public Book updateBook(int index, Book book) {
		Book oldtitle = books[index];
		books[index] = book;
		System.out.println("latest book:   " + books[index].getTitle());
		return oldtitle;
	
	}
	
	public static void main(String[] args) {
		Book book1 = new Book("Java for Beginners");
        Book book2 = new Book("Scala for Beginners");
        Book book3 = new Book("Effective Python");
		
		Instructor instructor = new Instructor(101, "John", "Assistant Professor", "Computer Science", new Book[]{book1, book2, book3});
		System.out.println(instructor.getMostRecentBookTitle());
	    System.out.println("old book title: " + instructor.updateBook(1, "Effective C#").getTitle());
				
		Book book4 = new Book("Introduction to Data Mining");
	    System.out.println("old book title: " + instructor.updateBook(1, book4).getTitle());
	}
}