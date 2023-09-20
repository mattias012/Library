public class Book {

  //This class "just creates and handles the books, it is not the library"
  private String name;
  private String author;
  private String year;
  private String edition;
  private Boolean isAvailable;


  public Book (String name, String author, String year, String edition){
      this.name = name;
      this.author = author;
      this.year = year;
      this.edition = edition;
      this.isAvailable = true;
  }

  public void setisAvailable(Boolean isAvailable){
    this.isAvailable = isAvailable;
  }

  public boolean getIsAvailable(){
    return this.isAvailable;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public String getAuthor(){
    return this.author;
  }

  //toString
  public String toString(){
    return "Title: " + this.name + "\n" +
            "Author: " + this.author + "\n" +
            "Year: " + this.year + "\n" +
            "Edition: " + this.edition + "\n" +
            "Available?: " + this.isAvailable;
  }
}
