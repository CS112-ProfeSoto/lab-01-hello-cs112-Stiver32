public class Book {

    //one instance variable
    private String title;

    //default constructor (no params)
    public Book()
    {
        this.title = "Unkown";
    }

    //Full constructor (takes value for instance variable)
    public Book(String title)
    {
        this.title = title;
    }

    //Mutator / Setter method
    public void setTitle(String title)
    {
        this.title = title;
    }

    //Accessor / getter method
    public String getTitle()
    {
        return this.title;
    }

    //toString method
    @Override
    public String toString()
    {
        return "Book Title: " + title;
    }

    //equals method 

    @Override 
    public boolean equals(Object obj)
    {
        if (this == obj) //check if same object
            return true;

        if (obj == null || getClass() != obj.getClass()) // check if object is null or not same class
            return false;

        //typecast and compare instance variable
        Book otherBook = (Book) obj;
        return this.title.equals(otherBook.title);
    }



    
}
