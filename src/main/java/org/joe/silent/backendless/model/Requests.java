package org.joe.silent.backendless.model;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;

public class Requests {

    private static String applicationId = "3ED4278E-9D4E-AFEC-FF3C-E04EF8BB8200";
    private static String RESTApiKey = "1203D09D-A4EC-6DD7-FFB0-63100F032B00";
    private static String tableName = "Person";

    static void create(String name){
        String url = "https://api.backendless.com/" + applicationId + "/" + RESTApiKey + "/data/" + tableName;
        String urlParameters = "{\"person\":\"" + name + "\"}";
        try {
            sendPost(url, "POST", urlParameters, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void read(){
        String url = "https://api.backendless.com/" + applicationId + "/" + RESTApiKey + "/data/" + tableName;
        String urlParameters = "";
        try {
            sendPost(url, "GET", urlParameters, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void update(String objectId, String newName){
        String url = "https://api.backendless.com/" + applicationId + "/" + RESTApiKey + "/data/" + tableName + "/" + objectId;
        String urlParameters = "{\"person\":\"" + newName + "\"}";
        try {
            sendPost(url, "PUT", urlParameters, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void delete(String objectId){
        String url = "https://api.backendless.com/" + applicationId + "/" + RESTApiKey + "/data/" + tableName + "/" + objectId;
        String urlParameters = "";
        try {
            sendPost(url, "DELETE", urlParameters, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String show(){
        String url = "https://api.backendless.com/" + applicationId + "/" + RESTApiKey + "/data/" + tableName;
        String result = "";
        try {
            result = showData(url, "GET");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    private static void sendPost(String url, String requestMethod, String urlParameters, Boolean setOutput) throws Exception {
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        con.setRequestMethod(requestMethod);
        con.setRequestProperty("Content-Type", "application/json");

        if (setOutput) {
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(urlParameters);
            wr.flush();
            wr.close();
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
    }

    private static String showData(String url, String requestMethod) throws Exception {
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        con.setRequestMethod(requestMethod);
        con.setRequestProperty("Content-Type", "application/json");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }

}
