package mad.learn.java8;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class RepeatingAnnoSports {

	@Retention(RetentionPolicy.RUNTIME)
	public @interface Games {
		Game[] value() default {};
	}

	@Game(day = "Sunday", name = "Cricket")
	@Game(day = "Friday", name = "Hockey")
	@Game(day = "Saturday", name = "Football")
	public interface GameDays {

	}

	@Repeatable(value = Games.class)
	public @interface Game {
		String name();
		String day();
	};

	public static void main(String[] args) {
		        
        Games game = GameDays.class.getAnnotation(Games.class); 
        System.out.println("John like to play ");
        for(Game gameday : game.value()) {
        	System.out.println(gameday.name() +" on "+gameday.day());
        }
        
        
		
	}

}
