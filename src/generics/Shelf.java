package generics;

public class Shelf {

    private Box<Toy> toys;
    private Box<Book> books;
    private Box<Food> foods;



    public void setToys(Box<Toy> toys) {
        this.toys = toys;
    }


    public void setBooks(Box<Book> books) {
        this.books = books;
    }


    public void setFoods(Box<Food> foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "toys=" + toys +
                ", books=" + books +
                ", foods=" + foods +
                '}';
    }

}
