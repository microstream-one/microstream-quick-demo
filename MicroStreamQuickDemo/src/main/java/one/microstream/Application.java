package one.microstream;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import io.micronaut.runtime.Micronaut;
import one.microstream.storage.types.EmbeddedStorage;
import one.microstream.storage.types.EmbeddedStorageManager;


public class Application
{
	
	public static EmbeddedStorageManager	storageManager;
	public static List<Instant>				instants	= new ArrayList<>();
	
	public static void main(String[] args)
	{
		Micronaut.run(Application.class, args);
		
		storageManager = EmbeddedStorage.start(instants);
		storageManager.storeRoot();
		
		System.out.println(instants.size() + " entries in the database");
	}
}
