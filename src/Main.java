import java.util.Scanner;

interface Product {
    void setName(String name);
    String getName();
    void setPrice(double price);
    double getPrice();
    void setRating(int rating);
    int getRating();
}

class Purchase implements Product {
    private String name;
    private double price;
    private int rating;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public int getRating() {
        return rating;
    }
}

interface User {
    void setLogin(String login);
    String getLogin();
    void setPassword(String password);
    String getPassword();
}

class Customer implements User {
    private String login;
    private String password;

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }
}

class Seller implements User {
    private String login;
    private String password;

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }
}


class Buy implements Product, User {
    private final Product product;
    private final User user;

    public Buy(Product product, User user) {
        this.product = product;
        this.user = user;
    }

    public void buy() {
        System.out.println(user.getLogin() + " преобрёл товар " + product.getName());
    }

    @Override
    public void setName(String name) {
        product.setName(name);
    }

    @Override
    public String getName() {
        return product.getName();
    }

    @Override
    public void setPrice(double price) {
        product.setPrice(price);
    }

    @Override
    public double getPrice() {
        return product.getPrice();
    }

    @Override
    public void setRating(int rating) {
        product.setRating(rating);
    }

    @Override
    public int getRating() {
        return product.getRating();
    }

    public static void main(String[] args) {
        Purchase book = new Purchase();
        Customer customer = new Customer();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите название товара: ");
        String productName = scanner.nextLine();
        book.setName(productName);

        System.out.print("Укажите цену товара: ");
        double price = scanner.nextDouble();
        book.setPrice(price);

        System.out.print("Укажите рейтинг товара: ");
        int rating = scanner.nextInt();
        book.setRating(rating);

        scanner.nextLine();

        System.out.print("Укажите логин покупателя: ");
        String login = scanner.nextLine();
        customer.setLogin(login);

        System.out.print("Укажите пароль покупателя: ");
        String password = scanner.nextLine();
        customer.setPassword(password);

        Buy buy = new Buy(book, customer);

        buy.buy();
    }

    @Override
    public String getLogin() {
        return user.getLogin();
    }

    @Override
    public void setLogin(String login) {
        user.setLogin(login);
    }

    @Override
    public String getPassword() {

        return user.getPassword();
    }

    @Override
    public void setPassword(String password) {
        user.setPassword(password);
    }
}