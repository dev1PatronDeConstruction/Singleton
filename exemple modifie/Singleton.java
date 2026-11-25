public final class Singleton {
    private static Singleton instance;

    private int x;
    private int y;

    private Singleton() {
        this.x = 0;
        this.y = 0;
    }

    private Singleton(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getInstance(int x, int y) {
        if (instance == null) {
            instance = new Singleton(x, y);
        }
        return instance;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setValeurs(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int somme() {
        return x + y;
    }

    public int produit() {
        return x * y;
    }

    public double moyenne() {
        return (x + y) / 2.0;
    }

    public int difference() {
        return x - y;
    }

    public void afficher() {
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("Somme = " + somme());
        System.out.println("Produit = " + produit());
        System.out.println("Moyenne = " + moyenne());
        System.out.println("Difference = " + difference());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Une instance Singleton ne peut pas etre clonee.");
    }
}
