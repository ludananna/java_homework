package generics;

public class GenericTester {
    public static void main(String[] args) {
        Box<Toy> toys = new Box<>();

        Toy doll = new Toy();
        Toy ball = new Toy();
        Toy car = new Toy();

        toys.add(doll);
        toys.add(ball);
        toys.add(car);

        Box<Book> books = new Box<>();

        Book history = new Book();
        Book fairyTales = new Book();
        Book detectives = new Book();

        books.add(history);
        books.add(fairyTales);
        books.add(detectives);


        Box<Food> foods = new Box<>();

        Food pasta = new Food();
        Food pizza = new Food();
        Food fruit = new Food();

        foods.add(pasta);
        foods.add(pizza);
        foods.add(fruit);


        Box<Fantasy> fantasyBox = new Box<>();

        Fantasy liveship = new Fantasy();

        fantasyBox.add(liveship);


        Shelf toyShelf = new Shelf();
        toyShelf.setToys(toys);

        Shelf bookShelf = new Shelf();
        bookShelf.setBooks(books);
//        bookShelf.setBooks(fantasyBox); I think class Fantasy inheritance class Book, but fantasyBox cannot inheritance Box<Book>.

        Shelf foodShelf = new Shelf();
        foodShelf.setFoods(foods);






    }


}
