/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle,
    int bookPages, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages; 
        refNumber = "";
        
    }
    public boolean isCourseText()
    {
        return courseText;
    }
    public void setcourseText(boolean courseText)
    {
        this.courseText = courseText;
    }
    public String getAuthor()
    {

    return author;
}
public String getTitle(){
    return title;
}
public String getRefNumber()
{
    return refNumber;
}
public int getBorrowed()
{
    return borrowed;
}
public void setRefNumber(String ref)
{
    if (ref.length() >= 3)
    {
        refNumber = ref;
}
else
{System.out.println("Reference number must be at"+
    " least 3 characters");
}
}
public void borrow()
{
    borrowed = borrowed + 1;
}
public int getPages()
{
    return pages;
}
public void printAuthor()
{
    System.out.println("Author:" + author);
}
public void printTitle()
{
  System.out.println("Title: " + title);  
}
public void printDetails()
{
   System.out.println("Title: "+ title + ",Author: " 
   + author + ", Pages: " + pages);
   if (refNumber.length()>0)
   {
       System.out.println ("Reference number:" + refNumber);
    }
    else
    {
        System.out.println("ZZZ");
    }
    System.out.println ("\"" + title + "\" has been borrowed" 
    + borrowed + " times"); 
}

}

