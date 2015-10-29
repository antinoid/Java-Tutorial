package vererbung;

/*
 * Bei der Vererbung sucht man Gemeinsamkeiten zwischen verschiedenen Klassen
 * Beispiel:
 * Fahrzeug
 * -> Auto
 * -> LkW
 */
public class TestKlasse {

    public static void main(String[] args) {
        Fahrzeug fahrzeug = new Auto("Ford Focus ST");
        Fahrzeug fahrzeug2 = new LkW("MAN TGX");
    }
}
