package methodes;


public class BeerTester {
    public static void main(String[] args) {

        Beer beer = new Beer("Sokol","light",6,0.5);
        int hashCode = beer.hashCode();
        System.out.println(hashCode);

        String toString = beer.toString();
        System.out.println(toString);
        System.out.println();



        Beer darkBeer = new Beer("Baltika","dark",6,0.5);
        int hashCod = darkBeer.hashCode();
        System.out.println(hashCod);

        System.out.println(beer.equals(darkBeer));
        System.out.println(beer == darkBeer);

    }
}
