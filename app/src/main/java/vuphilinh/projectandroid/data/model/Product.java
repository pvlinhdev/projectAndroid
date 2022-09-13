package vuphilinh.projectandroid.data.model;

public class Product {
    public int id;
    public String name;
    public String img;
    public double price;
    public int quantity;
    public int categoryId;

    public Product(int id, String name, String img, double price, int quantity, int categoryId) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.quantity = quantity;
        this.categoryId = categoryId;
    }

    public Product(int id, String name, String img, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
