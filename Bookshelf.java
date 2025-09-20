import java.util.*;
public class Bookshelf {
    Map<String, List<String>>catalog;
    Set<String>books;
    Bookshelf(){
        catalog=new HashMap<>();
        books=new HashSet<>();
    }
    public void addBook(String genre,String BookTitle){
        if(books.contains(BookTitle)){
            System.out.println(BookTitle);
            return;
        }
        catalog.put(genre,new LinkedList<>());
        catalog.get(genre).add(BookTitle);
        books.add(BookTitle);
        System.out.println(BookTitle+" -> "+genre);
    }
    public void BorrowBook(String genre, String Booktitle){
        List<String> dummy=catalog.get(genre);
        if(dummy!=null && dummy.remove(Booktitle)){
            books.remove(Booktitle);
            System.out.println(Booktitle);
        }else{
            System.out.println(Booktitle);
        }
    }
    public void retunBook(String genre,String BookTitle){
        addBook(genre,BookTitle);
    }
    public void display(){
        System.out.println("-----------------------------------BookShelf----------------------------------------");
        for(String g:catalog.keySet()){
            System.out.println("Genre :->  "+ g);
            for(String book:catalog.get(g)){
                System.out.println("--"+book);
            }
        }
    }


    public static void main(String[] args) {
        Bookshelf shelf=new Bookshelf();
        shelf.addBook("java","manish bhatt");
        shelf.addBook("c++","prakash satyamurti");
        shelf.addBook("bahubali","Katappa");
        shelf.addBook("teri meri prem kahani","Aashiq");
        shelf.display();
    }
}
