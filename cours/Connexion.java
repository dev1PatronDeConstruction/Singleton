

public final class Connexion{
    private String name;
    private String pass;
    private static Connexion DBConnexion = null;

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    private Connexion(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public static Connexion createConnexion(String name, String pass) {
        if (DBConnexion == null) {
            DBConnexion = new Connexion(name, pass);
        }
        return DBConnexion;
    }

    public String closeConnexion() {
        DBConnexion = null;
        return "Connexion fermée";
    }

}
   
