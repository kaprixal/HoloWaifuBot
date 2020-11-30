package kaprixal.holowaifu;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Main {
	public static JDA jda;
	public static String prefix = "*";
	// Main method
	public static void main(String[] args) throws LoginException {
		jda = JDABuilder.createDefault("NzUxMzQ2NzgxODMyNjA5ODMz.X1HwOA.p7JjM-OWXDqNo2Mx8iGQmvXNV7I").build();
		jda.getPresence().setStatus(OnlineStatus.IDLE);
		jda.getPresence().setActivity(Activity.watching("Spice & Wolf"));
		
		jda.addEventListener(new Holo1());
		jda.addEventListener(new Holo2());
		jda.addEventListener(new Holo3());
	}
}
