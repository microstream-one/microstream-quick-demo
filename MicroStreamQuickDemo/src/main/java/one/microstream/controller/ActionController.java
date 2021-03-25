package one.microstream.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;


@Controller("/action")
public class ActionController
{
	@Get
	@Produces(MediaType.TEXT_PLAIN)
	public void action()
	{
		
	}
}
