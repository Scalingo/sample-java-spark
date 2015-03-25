package com.scalingo.app;

/**
 * @author Léo Unbekandt
 * @version 2015/03/25
 */

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        int port = 4567;
        if(System.getenv("PORT") != null) {
            port = Integer.parseInt(System.getenv("PORT"));
        }
        setPort(port);
        get("/hello", (req, res) -> "Hello World");
    }
}
