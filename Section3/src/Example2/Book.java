package Example2;

public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content){
        this.name = name;
        this.published = published;
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public int getPublished() {
        return published;
    }

    //The equals method in Object class only
    // returns whether or not two  objects reference same memory location
    @Override
    public boolean equals(Object obj){
        //if objects reference same location in memory return true
        if(this == obj){
            return true;
        }

        //if object not a instance of Book, return false
        if(!(obj instanceof Book)){
            return false;
        }

        //convert object to book object
        Book book = (Book)obj;

        //check if all values are same, if so return true
        return this.name.equals(book.name) && this.content.equals(book.content)
                && this.published == book.published;
    }

    @Override
    public int hashCode(){
        //if name is null, return year of publication as hash value
        if(this.name == null){
            return this.published;
        }
        //add year and hashcode of String name and return it as hash value
        return this.published + this.name.hashCode();
    }

    @Override
    public String toString(){
        return "Name: " + this.name + " (" + this.published + ")\n" +
                "Content: " + this.content;
    }
}
