package DOm;

public class Dome427 {

    private String sn;
    private String name;
    private String author;
    private Double price;

    public Dome427(String sn, String name, String author, Double price) {
        this.sn = sn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Dome427() {
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dome427{" +
                "sn='" + sn + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

