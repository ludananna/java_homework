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


        Shelf<Box<Toy>> toyShelf = new Shelf<>();
        toyShelf.addBox(toys);

        Shelf<Box<? extends Book>> bookShelf = new Shelf<>();
        bookShelf.addBox(books);
        bookShelf.addBox(fantasyBox);

        Shelf <Box<Food>>foodShelf = new Shelf<>();
        foodShelf.addBox(foods);


        Shelf<Box<? extends Item>> universalShelf = new Shelf<>();
        universalShelf.addBox(fantasyBox);
        universalShelf.addBox(books);
        universalShelf.addBox(toys);
        universalShelf.addBox(foods);
    }


}
