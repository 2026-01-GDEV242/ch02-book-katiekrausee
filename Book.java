/**
 * This book class is for a simple library management system.
 *
 * @author Katie Krause
 * @version 02/15/26
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Constructor (Exercises 2.85 and 2.92)
     * Initializes author, title, pages, and courseText.
     * refNumber starts empty and borrowed starts at 0.
     */
    public Book(String bookAuthor, String bookTitle, int numberOfPages, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numberOfPages;
        courseText = isCourseText;
        refNumber = "";
        borrowed = 0;
    }

    // Accessors for String fields - Exercise 2.83

    public String getAuthor()
    {
        return author;
    }

    public String getTitle()
    {
        return title;
    }

    // Print utility methods - Exercise 2.84

    public void printAuthor()
    {
        System.out.println(author);
    }

    public void printTitle()
    {
        System.out.println(title);
    }

    // Pages field accessor - Exercise 2.85

    public int getPages()
    {
        return pages; 
    }

    // Print details method - Exercise 2.87

    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);

        // Print refNumber if set - Exercise 2.89
        if (refNumber.length() > 0) {
            System.out.println("Reference Number: " + refNumber);
        } else {
            System.out.println("Reference Number: ZZZ");
        }
        
        // Borrowed Count reporting - Exercise 2.91
        System.out.println("Times Borrowed: " + borrowed);
        
        // Course text reporting - Exericse 2.92
        System.out.println("Course Textbook: " + courseText);
    }
    // refNumber field accessor and mutator - Exercise 2.88
    
    public void setrefNumber(String ref)
    {
        // Exercise 2.90 - must be at least 3 characters
        if (ref.length() >= 3) {
            refNumber = ref;
        } else {
            System.out.println("Error: reference number must be at least 3 characters.");
        }
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    // Borrowed feild methods - Exercise 2.91
    public void borrow()
    {
        borrowed++;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    // courseText accessor - Exercise 2.92
    public boolean isCourseText()
    {
        return courseText;
    }
}
