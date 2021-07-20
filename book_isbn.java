class ISBN
{
    private int countryNumber;  private int publisherNumber;  private int titleNumber;  private int checkDigit; //instance variable
    /**
     * Constructor for objects of class ISBN
     */  public ISBN()  { countryNumber = 0;  publisherNumber = 0;  titleNumber = 0;
        checkDigit = 0;
    }

    //Method to return the ISBN as a string
    public String getISBN( )
    { return countryNumber + " " + publisherNumber + " " +titleNumber+ " "
            + checkDigit;
    }

    //Method to set the ISBN of book
    public void setISBN(int n1, int n2, int n3, int n4)
    {
        countryNumber = n1;  publisherNumber = n2;  titleNumber = n3;
        checkDigit = n4;
    }
}

public class Book
{
    private String title;  private String author;  private String publisher;  private String city;  private String date;  private float price;  private ISBN isbnNumber; // object of class ISBN

    // Constructor
    public Book(String t, String au, String pu, String ci, String d, float pr)
    { title = t;
        author = au;
        publisher = pu;  city = ci;  date = d;  price = pr;
        isbnNumber = new ISBN ( );
    }
    // Method to set the book's ISBN
    public void setBookISBN (int n1, int n2, int n3, int n4)
    { isbnNumber.setISBN (n1, n2, n3, n4);
    }
    //Method to return the author
    public String getAuthor ()
    { return author; }

    //Method to return the book's ISBN as a string
    public String getBookISBN ( )
    { return isbnNumber.getISBN ( ) ;
    }
    // Method to print detatils of the book
    public void printDetails ( )
    { System.out.println ("Book Title: " + title);
        System.out.println ("Book Author: " + author);
        System.out.println ("Publisher: " + publisher);
        System.out.println("ISBN:"+getBookISBN());
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Book obj=new Book("Object First with Java","David j. Barnes and Michael Kolling","Prentice Hall","Delhi","19/1/2021",450.0f);
        obj.setBookISBN(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
        obj.printDetails();
    }
} 
}
