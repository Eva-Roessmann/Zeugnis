// Klasse Schulfach
// -----------------
// Repräsentiert ein einzelnes Schulfach mit Bezeichnung und Note.
public class Schulfach {
    String bezeichnung;   // Name des Fachs (z.B. "Mathematik")
    int note;             // Note des Fachs (1 = Sehr Gut ... 5 = Nicht Genügend)

    // Konstruktor: erstellt ein neues Schulfach mit Bezeichnung und Note
    public Schulfach(String bezeichnung, int note) {
        this.bezeichnung = bezeichnung;   // übergebene Bezeichnung speichern
        this.note = note;                 // übergebene Note speichern
    }
}
