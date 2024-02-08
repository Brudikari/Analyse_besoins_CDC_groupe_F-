package fr.noahsigoigne.controlaccess;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class LogSpy {



    private String stockage;
    public LogSpy(){
        stockage = "";
    }
    public String getTime() {
        ZoneId zid = ZoneId.systemDefault();
        ZonedDateTime datetime = ZonedDateTime.now(zid);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu.MM.dd.HH:mm:ss");
        String timeStamp = datetime.format(formatter);
        return timeStamp;
    }
    public void getLogInfos(String infos) {
        // badge.getNom() + " " + this.nom +
        // " KO"; {Horodatage} : {badge} sur {lecteur} - OK / KO
        String nomBadge = infos.split(" ")[0];
        String nomLecteur = infos.split(" ")[1];
        String statut = infos.split(" ")[2];
        stockage += getTime() + " : " + nomBadge + " sur " + nomLecteur + " - " + statut + "\n";


    }
    public String getStockage() {
        return stockage;
    }
}