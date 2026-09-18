public class Book {

    private String title;
    private String author;
    private int publicationYear;
    private boolean read;

    Book(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.read = false;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
    public boolean isRead(){
        return read;
    }

    public void printInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        if(read == true){
            System.out.println("Have read?" + " Yes");
        }else{
            System.out.println("Have read? " + "Not Yet");
        }
    }

    public void markAsRead(){
        read = true;
    }
    public void markAsUnread(){
        read = false;
    }

    public boolean isClassic(int currentYear) {
        if(currentYear - 20 > publicationYear){
            System.out.println("Classic");
            return true;
        }else{
            System.out.println("");
            return false;
        }

        }

    }





