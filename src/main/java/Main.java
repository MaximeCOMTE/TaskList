public class Main {
    public static void main(String[] args) {
        ListeTache ListeTache = new ListeTache();
        GestionnaireTache GestionnaireTache = new GestionnaireTache(ListeTache);
        GestionnaireTache.inputUtilisateur();
    }
}
