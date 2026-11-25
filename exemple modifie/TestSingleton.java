public class TestSingleton {
    public static void main(String[] args) {
        Singleton premier = Singleton.getInstance(8, 3);
        premier.afficher();

        Singleton second = Singleton.getInstance(16, 9);
        second.afficher();

        System.out.println("Meme instance : " + (premier == second));

        premier.setValeurs(10, 4);
        System.out.println("Valeurs modifiees via premier :");
        second.afficher();
    }
}
