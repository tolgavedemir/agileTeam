package projectvendingmachine;

public class Runner {

    public static void main(String[] args) {
        Products products=new Products();

        Methods method=new Methods();
        method.select(products);

    }
}
