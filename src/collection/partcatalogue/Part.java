package collection.partcatalogue;

public class Part {
    private String name;
    private String  brand;
    private String number;

    public Part() {
    }

    public Part(String name, String brand, String number) {
        this.name = name;
        this.brand = brand;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Part)) return false;

        Part part = (Part) o;

        if (getName() != null ? !getName().equals(part.getName()) : part.getName() != null) return false;
        if (getBrand() != null ? !getBrand().equals(part.getBrand()) : part.getBrand() != null) return false;
        return getNumber() != null ? getNumber().equals(part.getNumber()) : part.getNumber() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getBrand() != null ? getBrand().hashCode() : 0);
        result = 31 * result + (getNumber() != null ? getNumber().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Part{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", number=" + number +
                '}';
    }
}
