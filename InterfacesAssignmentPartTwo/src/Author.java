public class Author implements Comparable<Author>{
    private String firstName;
    private String lastName;
    private String bookTitle;

    public Author(String firstName, String lastName, String bookTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookTitle = bookTitle;
    }
    public Author(){
        this("No First Name", "No last name", "No book title" );
    }
    public Author(Author other){
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.bookTitle = other.bookTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String toString(){
        return getFirstName() + ", " + getLastName() +"; " + getBookTitle();
    }

    @Override
    public int compareTo(Author a) {
        if(this.lastName.compareTo(a.lastName) != 0){
            return this.lastName.compareTo(a.lastName);
        }
        else if(this.firstName.compareTo(a.firstName) != 0){
            return this.firstName.compareTo(a.firstName);
        }
        else{

                return this.bookTitle.compareTo(a.bookTitle);
            }
        }
    }

