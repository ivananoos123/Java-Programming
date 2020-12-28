public class Book {
    private String isbnNUmber;
    private String title;
    private String author;
    private int yearPublished;


    public Book() {
    }

    public Book(String isbnNUmber, String title, String author, int yearPublished) {
        this.isbnNUmber = isbnNUmber;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getIsbnNUmber() {
        return this.isbnNUmber;
    }

    public void setIsbnNUmber(String isbnNUmber) {
        this.isbnNUmber = isbnNUmber;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return this.yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public Book isbnNUmber(String isbnNUmber) {
        this.isbnNUmber = isbnNUmber;
        return this;
    }

    public Book title(String title) {
        this.title = title;
        return this;
    }

    public Book author(String author) {
        this.author = author;
        return this;
    }

    public Book yearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
        return this;
    }

    
    public boolean equals(Object obj) {
        
        if(obj instanceof Book){
            Book b =(Book)obj;
            if(isbnNUmber.equals(b.getIsbnNUmber())==true && title.equals(b.getTitle())==true && author.equals(b.getAuthor())==true && yearPublished == b.getYearPublished()){
                return true;
            }
        }
        return false;
    }


    public String toString() {
        return getIsbnNUmber()+ ","+" " + getTitle() + ","+" "+ getAuthor() + ","+" "+ getYearPublished();
    }
    

    public static void main(String[] args) {
        Book book = new Book("978-0135166307","Core Java Volume 1", "Cay A. Hortsmann", 2018);
        Book book2 = new Book("978-0131873254", "Database Systems: The Complete Book", "Hector Garcia-Monia", 2008);
        System.out.println(book.equals(book2));
    }

 } 