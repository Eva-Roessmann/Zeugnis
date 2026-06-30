# 📜 Zeugnisanwendung - Klassen, Listen und Bubblesort
> **Titel:** Zeugnisanwendung
> **Zweck:** Verständnis von Klassen, Objekten, ArrayLists und eines selbst implementierten Sortieralgorithmus (Bubblesort) in Java vertiefen
---
## 📋 Projektinformationen
| Feld | Inhalt |
|------|-------|
| **Projektname** | Zeugnisanwendung |
| **Typ** | Schulprojekt |
| **Klasse** | 1aAPC |
| **Schuljahr** | 2025/26 |
| **Abgabedatum** | 02.06.2026 |
| **Autor** | Rößmann Eva |
| **Lehrer** | G. Jarz |
| **Fach** | Applikationsentwicklung |
---
## 🎯 Projektbeschreibung
Dieses Projekt erstellt ein digitales **Zeugnis** für eine Person in Java.
Die Klasse `Zeugnis` speichert Schülername, Geburtsdatum und Zeugnisdatum sowie eine Liste von **Schulfächern** (maximal 10 Stück). Aus den Noten der Fächer wird automatisch ein **Notendurchschnitt** berechnet. Die Fächer werden anschließend mit einem **selbst implementierten Bubblesort** (über `Collections.swap()`, **nicht** über die Standard-Sortierfunktion) aufsteigend nach Note sortiert. Am Ende wird ein selbst gestaltetes Zeugnis mit allen Daten in der Konsole ausgegeben.
---
## 🛠️ Entwicklungsumgebung
### Verwendete Software & Tools
| Tool / Software | Version | Zweck |
|---|---|---|
| **IntelliJ IDEA** | 2025.3.4.1 | Code-Editor & IDE |
| **Java SDK** | 21+ | Programmiersprache |
| **Terminal/Console** | - | Programmausführung |
### 💻 Betriebssystem
- ✅ Windows 11
- ✅ macOS
- ✅ Linux
---
### 📊 Beispiel-Ausführung
```
Schülername: Max Mustermann
Geburtsdatum (TT.MM.JJJJ): 12.04.2008
Zeugnisdatum (TT.MM.JJJJ): 30.06.2026

Fächer eingeben (Bezeichnung 'X' zum Beenden):
Fach: Mathematik
Note (1-5): 3
Fach: Deutsch
Note (1-5): 2
Fach: Englisch
Note (1-5): 1
Fach: X

==================================
              ZEUGNIS
==================================
Name:            Max Mustermann
Geburtsdatum:    12.04.2008
----------------------------------
Fach                      Note
----------------------------------
Englisch                  1
Deutsch                   2
Mathematik                3
----------------------------------
Notendurchschnitt: 2,00
==================================
Zeugnisdatum: 30.06.2026
```
---
### 🔍 Detaillierte Code-Analyse
| Code-Element | Erklärung |
|---|---|
| `class Schulfach` | Speichert Bezeichnung und Note eines einzelnen Fachs |
| `class Zeugnis` | Verwaltet Personendaten, Fächerliste und Notendurchschnitt |
| `ArrayList<Schulfach> faecher;` | Dynamische Liste, die maximal 10 Fächer aufnimmt |
| `addSubject(fach)` | Fügt ein neues Fach hinzu, sofern noch unter 10 Fächern |
| `berechneDurchschnitt()` | Summiert alle Noten und teilt durch die Fächeranzahl |
| `sortSubjects()` | Sortiert die Fächer aufsteigend nach Note mittels selbst implementiertem Bubblesort |
| `Collections.swap(faecher, j, j+1)` | Vertauscht zwei Elemente in der ArrayList (anstelle eines eigenen temp-Tauschs) |
| `printCertificate()` | Gibt das fertig gestaltete Zeugnis mit allen Daten aus |
| `Scanner sc = new Scanner(System.in);` | Scanner für Benutzereingaben erstellen |
| `while (!bezeichnung.equalsIgnoreCase("X"))` | Liest so lange Fächer ein, bis der Benutzer "X" eingibt |
| `sc.close();` | Scanner schließen |
---
## 📚 Verwendete Java-Konzepte
- Klassen und Objekte (Schulfach, Zeugnis, Main)
- ArrayList und generische Typen (`ArrayList<Schulfach>`)
- Konstruktoren
- Bubblesort-Algorithmus (eigene Implementierung)
- `Collections.swap()`
- Schleifen (while, for, for-each)
- Verzweigungen (if/else)
- Benutzereingaben mit `Scanner`
- formatierte Ausgabe mit `System.out.printf`
---
## 📖 Wichtige Funktionen der eigenen Zeugnis-Klasse
| Funktion | Beschreibung |
|---|---|
| `new Zeugnis(name, geb, datum);` | Erstellt ein neues Zeugnis-Objekt mit Basisdaten über den Konstruktor |
| `zeugnis.addSubject(new Schulfach("Mathe", 2));` | Fügt das Fach "Mathe" mit Note 2 zum Zeugnis hinzu |
| `zeugnis.berechneDurchschnitt();` | Berechnet den Notendurchschnitt aus allen Fächern |
| `zeugnis.sortSubjects();` | Sortiert die Fächer aufsteigend nach Note (eigener Bubblesort) |
| `zeugnis.printCertificate();` | Gibt das vollständige Zeugnis in der Konsole aus |
---
## 📜 Lizenz
Dieses Projekt wurde im Rahmen des Schulunterrichts erstellt.
```
Copyright © 2026 Rößmann Eva
Schulprojekt - rdata GmbH
Nicht für kommerzielle Nutzung vorgesehen
```
---
