package test;


import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;


public class Script_api{


    // Cette method permet de vérifier si le lien peut get une Url avec un bolean
    public Boolean script_test(String lien) throws IOException {

    URL url = new URL(lien);

    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");
    int status = con.getResponseCode();

    // Retourne true si on peut get l'url
    if (status == 200){
        return true;
    }
    if (status == 404){

        return false;
    }
    // Retourne false si on peut pas get l'url
    else{
        return false;
        }
    }

    public Object script_test_404(String lien) throws IOException{
        URL url = new URL(lien);

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int status = con.getResponseCode();

        // Retourne 404 si on peut get l'url
        if (status == 404){
            return "erreur 404";
        }

        if (status == 200){
            return true;
        }
        // Retourne false si on peut pas get l'url
        else{
            return false;
        }
    }

}
