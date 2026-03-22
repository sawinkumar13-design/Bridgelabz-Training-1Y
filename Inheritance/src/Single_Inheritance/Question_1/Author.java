package Single_Inheritance.Question_1;

public class Author extends Book{

    private String name = "xyz";
    private String bio = "Software developer ";

    public Author(String title, int publicationYear) {
        super(title, publicationYear);
    }

    @Override
    public void showDetail() {
        super.showDetail();
        System.out.println("Name : "+name);
        System.out.println("bio : "+bio);
    }
}
