package methodes;

public class Beer {

    private String name;
    private String type;
    private int alcoholAmount;
    private double volume;

    public Beer(String name, String type, int alcoholAmount, double volume) {
        this.name = name;
        this.type = type;
        this.alcoholAmount = alcoholAmount;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAlcoholAmount() {
        return alcoholAmount;
    }

    public void setAlcoholAmount(int alcoholAmount) {
        this.alcoholAmount = alcoholAmount;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object another) {
        if (another == null) {
            return false;
        }

        if (this == another) {
            return true;
        }

        if (!(another instanceof Beer)) {
            return false;
        }

        Beer anotherBeer = (Beer) another;
        if (!this.name.equals(anotherBeer.name)) {
            return false;
        }
        if (!this.type.equals(anotherBeer.type)) {
            return false;
        }

        if (this.alcoholAmount != anotherBeer.alcoholAmount) {
            return false;
        }

        if (this.volume != anotherBeer.volume) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (volume + alcoholAmount);
        result = result + name.hashCode();
        result = result + type.hashCode();
        result = result * 2;
        return result;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", alcoholAmount=" + alcoholAmount +
                ", volume=" + volume +
                '}';
    }

}
