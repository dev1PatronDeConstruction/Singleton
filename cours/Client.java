//test de connexion

public class Client {
    public static void main(String[] args) {
        //creation de la connexion
        Connexion c = Connexion.createConnexion("paul", "123");
        System.out.println(c.getName() + " " + c.getPass());

        Connexion b = Connexion.createConnexion("daniel", "456");
        System.out.println(b.getName() + " " + b.getPass());

        b.setPass("789");
        System.out.println(c.getName() + " " + c.getPass());
    }
}