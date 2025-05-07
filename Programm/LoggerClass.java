package Programm;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerClass {

	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd-HH:mm:ss");
	static LocalDateTime jetzt = LocalDateTime.now();
	static String jetztFormat = jetzt.format(formatter);

	static String pfad = "Programm/Logs/";
	static String dateiname = "SessionLog-" + jetztFormat + ".txt";
	static String komplettPfad = pfad + dateiname;
	public static void dataLog(){

		File log = new File(pfad);
		if(!log.exists()){
			log.mkdir();
		}
		File logDatei = new File(log, dateiname);

		try{
			if(logDatei.createNewFile()){
				System.out.println("Log Datei erstellt" + logDatei.getAbsolutePath());
			} else {
				System.out.println("LogDatei existiert bereits");
			}
		} catch (IOException e){
			System.out.println("Fehler beim Erstellen der Logdatei");
			e.printStackTrace();
		}
		FileWriter logKopf = null;
		DateTimeFormatter formatterTag = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		try {
			logKopf = new FileWriter(komplettPfad,true);
			logKopf.write("Session Log um " + getZeitDate() + " geöffnet\n Operation Log:\n");
			logKopf.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}


	}

	public static void logger(String w1, String w2, double wechselkuers, String mengue, String ergebnis){

		try {
			FileWriter log = new FileWriter(komplettPfad,true);
			log.write("\nOperation" + getZeit() + " -> AusgangW: " + w1 + " / ZielW: " + w2 + "    | Wechselkurs:" + wechselkuers + "| Mengue: " + mengue + " | Betrag: " + ergebnis);
			log.close();
		} catch (IOException e) {
			throw new RuntimeException("Fehler beim schreiben in der Logdatei",e);
		}
	}
	public static String getZeit(){
		DateTimeFormatter formatterZeit = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime jetztUhr = LocalDateTime.now();
		return jetztUhr.format(formatterZeit);
	}

	public static String getZeitDate(){
		DateTimeFormatter formatterZeit = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH:mm:ss");
		LocalDateTime jetztDateUhr = LocalDateTime.now();
		return jetztDateUhr.format(formatterZeit);
	}


	public static void closer(){
		try (FileWriter closer = new FileWriter(komplettPfad, true)) {

			closer.write("\n\nSession um " + getZeitDate() + " geschlossen");
			closer.close();
		} catch (IOException e) {
			throw new RuntimeException("Fehler beim schreiben in der Logdatei",e);
		}
	}

}
