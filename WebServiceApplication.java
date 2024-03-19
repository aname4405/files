import java.sql.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WebServiceApplication {

	public static void main(String[] args) throws Throwable {
	//	SpringApplication.run(WebServiceApplication.class, args);
		ApplicationContext applicationContext = SpringApplication.run(WebServiceApplication.class, args);

		EventService service = applicationContext.getBean(EventService.class);

		runTest(service);
	}

	private static void runTest(EventService eventService) {
		printAllEvents(eventService);
}

	private static long printAllEvents(EventService eventService) {
		long lastIdUsed = 0;
		for (Event event: eventService.getAllEvents()) {
			System.out.println("Date " + event.getDate());
			//System.out.println("Start Time " + event.getStartTime());
			System.out.println("Duration" + event.getDuration());
			System.out.println("Max Number " + event.getMaxNumber());
			System.out.println("Cost " + event.getCost());
			System.out.println("SongList " + event.getSongList());

			if(lastIdUsed < event.getId()) {
				lastIdUsed = event.getId();
			}
		}
		return lastIdUsed;
	}
}
