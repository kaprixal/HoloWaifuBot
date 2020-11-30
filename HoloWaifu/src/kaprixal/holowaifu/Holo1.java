package kaprixal.holowaifu;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Holo1 extends ListenerAdapter{
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if (args[0].equalsIgnoreCase(Main.prefix + "holo1")) {	
			EmbedBuilder info = new EmbedBuilder();
			
			info.setTitle("Waifu");
			info.setImage("https://media.discordapp.net/attachments/741583355505541181/751332641520877618/holo32.jpg");
			info.setColor(0xf45642);
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(info.build()).queue();
			info.clear();
			
			}			
	}
}
