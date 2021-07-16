package com.example.demo;

import Model.Returnmodel.allReturnWeather;
import Model.Returnmodel.returnSys;
import Model.Returnmodel.returnWeather;
import Model.openWeather;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
@GetMapping("/file")
public static String File() throws FileNotFoundException {
    String token="";
    Scanner file=new Scanner(new File("cities.json"));
    List <String> temp=new ArrayList<String>();
    while (file.hasNextLine()){
        token=file.next();
        temp.add(token);
        String[]tempArray=temp.toArray(new String[0]);

        for (String s:tempArray){
            return s;
        }
    }
    file.close();
    return "null";
}

    @GetMapping("/read")
    public static allReturnWeather GetMyRequest()throws IOException{
    URL urlForGetRequest = new URL("https://api.openweathermap.org/data/2.5/weather?id=1248991&units=metric&APPID=fd5b48e2cfe820a34626e79d5309799b");
    String readLine = null;
    HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
    conection.setRequestMethod("GET");
    int responseCode = conection.getResponseCode();

    if (responseCode == HttpURLConnection.HTTP_OK) {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(conection.getInputStream()));
        StringBuffer response = new StringBuffer();
        while ((readLine = in .readLine()) != null) {
            response.append(readLine);
        } in .close();

        Gson gson=new GsonBuilder().create();
        openWeather openWeather=gson.fromJson(response.toString(), Model.openWeather.class);
        System.out.println(openWeather.getClouds());
        allReturnWeather allReturnWeather = new allReturnWeather();
        returnSys returnSys  = new returnSys();
        returnSys.setCountry(openWeather.getSys().getCountry());
        returnSys.setSunrise(openWeather.getSys().getSunrise());
        returnSys.setSunset(openWeather.getSys().getSunset());
        allReturnWeather.setReturnSys(returnSys);
        ArrayList<returnWeather> returnWeatherList = new ArrayList<>();
        openWeather.getWeather().forEach( x -> {
            returnWeather returnWeather1 = new returnWeather();
            returnWeather1.setDescription(x.getDescription());
            returnWeather1.setMain(x.getMain());
            returnWeatherList.add(returnWeather1);
        });
        allReturnWeather.setReturnWeather(returnWeatherList);
        allReturnWeather.setClouds(openWeather.getClouds());
        allReturnWeather.setId(openWeather.getId());
        allReturnWeather.setMain(openWeather.getMain());
        allReturnWeather.setDt(openWeather.getDt());
        allReturnWeather.setName(openWeather.getName());
        allReturnWeather.setVisibility(openWeather.getVisibility());
        allReturnWeather.setWind(openWeather.getWind());
        return allReturnWeather;
    } else {
        System.out.println("GET NOT WORKED");
        return null;
    }
}
}

