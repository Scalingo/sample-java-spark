package com.scalingo.app;

/**
 * @author Leo Unbekandt
 * @version 2015/03/25
 */

import java.util.*;
import spark.template.velocity.*;
import static spark.Spark.*;
import spark.ModelAndView;

public class App {
	public static void main(String[] args) {
		int port = 3000;

		if (System.getenv("PORT") != null) {
			port = Integer.parseInt(System.getenv("PORT"));
		}
		setPort(port);

		staticFiles.location("/public");

		get("/", (req, res) -> {
			Map<String, Object> model = new HashMap<>();
			return new VelocityTemplateEngine().render(
				new ModelAndView(model, "velocity/index/index.vm")
			);
		});
      	get("/hello", (req, res) -> "Hello World");
	}
}
