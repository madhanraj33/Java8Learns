package mad.learn.java8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.Chronology;
import java.time.chrono.HijrahChronology;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class NewDateDemo {

	private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(sdf.format(date));

		Calendar cal = Calendar.getInstance();
		System.out.println(sdf.format(cal.getTime()));

		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));

		LocalDate localDate = LocalDate.now();
		System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));

		Instant instant = Instant.now();
		System.out.println("Instant : " + instant);

		LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
		System.out.println("ldt : " + ldt);

		LocalDate with1 = localDate.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("lastDayOfMonth : " + with1);

		LocalDate with2 = localDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("next monday : " + with2);

		// to get the current zone
		ZonedDateTime currentZone = ZonedDateTime.now();
		System.out.println("the current zone is " + currentZone.getZone());
		
		ZoneId dubai = ZoneId.of("Asia/Dubai");
		ZoneId chicago = ZoneId.of("US/Central");

		ZonedDateTime chicagoTimeInstant = currentZone.withZoneSameInstant(chicago);

		ZonedDateTime dubaiTimeInstant = currentZone.withZoneSameInstant(dubai);

		//With current local time
		System.out.println("Cris's flight travel start from Chennai at "
				+ currentZone.format(DateTimeFormatter.ofPattern("dd/MM/yyy hh:MM")) + " and \n stops at dubai at "
				+ dubaiTimeInstant.format(DateTimeFormatter.ofPattern("dd/MM/yyy hh:MM")) + " \n final destination to chicago will reach by " + chicagoTimeInstant.format(DateTimeFormatter.ofPattern("dd/mm/yyy hh:MM")));

		//To adjust time
		LocalDateTime currentDate = LocalDateTime.now();
		LocalDateTime adjustedDate = LocalDateTime.of(currentDate.getYear()+1, currentDate.getMonth().getValue()+1, 
				currentDate.getDayOfMonth()+1,currentDate.getHour(),currentDate.getMinute());
		System.out.println(currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));
		System.out.println(adjustedDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));
		
		//Chronology.getAvailableChronologies().stream().forEach(r -> System.out.println(r));
		
		
		Chronology islamic = HijrahChronology.INSTANCE;
		
		
		System.out.println(islamic.dateNow().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
		
		
		
		// Used to see the available Zone ID's
		// ZoneId.getAvailableZoneIds().stream().forEach(r -> System.out.println(r));
		// ZoneId.getAvailableZoneIds().stream().filter(r ->
		// r.contains("Dubai")).forEach(r -> System.out.println(r));
		// ZoneId.getAvailableZoneIds().stream().filter(r -> r.contains("US")).forEach(r
		// -> System.out.println(r));

	}

}
