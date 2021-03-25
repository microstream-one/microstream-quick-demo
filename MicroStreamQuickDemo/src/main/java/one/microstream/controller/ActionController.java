package one.microstream.controller;

import java.time.Instant;
import java.util.stream.IntStream;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import one.microstream.Application;


@Controller("/action")
public class ActionController
{
	@Get
	@Produces(MediaType.TEXT_PLAIN)
	public void action()
	{
		IntStream.rangeClosed(1, 50).forEach(i ->
		{
			Application.instants.add(Instant.now().plusSeconds(i));
		});
		
		Application.storageManager.store(Application.instants);
	}
}
