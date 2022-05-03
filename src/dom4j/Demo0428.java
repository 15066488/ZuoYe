package dom4j;

public class Demo0428 {
    private String name;
    private String sn;
    private String author;
    private  Double price;

    public Demo0428(String name, String sn, String author, Double price) {
        this.name = name;
        this.sn = sn;
        this.author = author;
        this.price = price;
    }

    public Demo0428() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
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
        return "Demo0428{" +
                "name='" + name + '\'' +
                ", sn='" + sn + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
