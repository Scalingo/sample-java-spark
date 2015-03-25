package com.scalingo.app;

/**
 * @author Léo Unbekandt
 * @version 2015/03/25
 */

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
