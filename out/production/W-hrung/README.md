# W-hrung
💱 Währungsrechner

Dies ist eine Java-Desktop-Anwendung (Swing), mit der Beträge zwischen verschiedenen Währungen anhand vordefinierter Wechselkurse umgerechnet werden können.
✨ Funktionen

    Auswahl von Ausgangs- und Zielwährung über Dropdown-Menüs

    Eingabe des Betrags mit Format- und Negativwert-Prüfung

    Automatische Umrechnung beim Drücken der Enter-Taste oder per Button

    Anzeige des verwendeten Wechselkurses

    Protokollierung aller durchgeführten Operationen in einer Log-Datei (/Logs/), inklusive:

        Uhrzeit der Operation

        Ausgangs- und Zielwährung

        Wechselkurs

        Eingegebener Betrag und Ergebnis

    Protokolliert auch Beginn und Ende der Sitzung

🧾 Unterstützte Währungen

    EUR – Euro (€)

    USD – US-Dollar ($)

    GBP – Britisches Pfund (£)

    CHF – Schweizer Franken (CHF)

    DKK – Dänische Krone (kr)

    NOK – Norwegische Krone (kr)

    SEK – Schwedische Krone (kr)

    PLN – Polnischer Złoty (zł)

    ARS – Argentinischer Peso ($)

📁 Projektstruktur

/src
└── Programm/
├── GUI.java
├── Logik.java
└── ZeitStempler.java
/Logs
└── (Sitzungs-Logdateien werden automatisch erstellt)

🛠️ Voraussetzungen

    Java 8 oder höher

▶️ Verwendung

    Starte die Klasse GUI.java.

    Wähle Ausgangs- und Zielwährung und gib den Betrag ein.

    Drücke Enter oder klicke auf den Berechnen-Button.