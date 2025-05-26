
package com.weather;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;
import java.net.*;
import jakarta.json.*;

@WebServlet("/weather")
public class WeatherServlet extends HttpServlet {
    private static final String API_KEY = ""; // OpenWeather API key

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String city = request.getParameter("city");
        String apiURL = "https://api.openweathermap.org/data/2.5/weather?q=" + city +
                "&appid=" + API_KEY + "&units=metric";

        URL url = new URL(apiURL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        InputStreamReader reader = new InputStreamReader(conn.getInputStream());
        JsonReader jsonReader = Json.createReader(reader);
        JsonObject jsonObject = jsonReader.readObject();

        String temp = jsonObject.getJsonObject("main").get("temp").toString();
        String desc = jsonObject.getJsonArray("weather").getJsonObject(0).getString("description");

        request.setAttribute("city", city);
        request.setAttribute("temp", temp);
        request.setAttribute("desc", desc);

        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request, response);
    }
}
