package com.scalingo.app;

/**
 * @author Léo Unbekandt
 * @version 2015/03/25
 */

import java.util.*;
import spark.template.velocity.*;
import static spark.Spark.*;

public class App {
	public static void main(String[] args) {
			int port = 4567;
			if(System.getenv("PORT") != null) {
					port = Integer.parseInt(System.getenv("PORT"));
			}
			setPort(port);

			staticFiles.location("/public");
			staticFiles.expireTime(600L);

			get("/", (req, res) -> renderHomepage(req));
	}

	private static String renderHomepage(Request req) {
		return renderTemplate("velocity/index.vm", model);
	}

	private static String renderTemplate(String template, Map model) {
		return new VelocityTemplateEngine().render(new ModelAndView(model, template));
	}
}
