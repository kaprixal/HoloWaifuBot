package kaprixal.holowaifu;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Holo2 extends ListenerAdapter{
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if (args[0].equalsIgnoreCase(Main.prefix + "holo2")) {	
			EmbedBuilder info = new EmbedBuilder();
			
			info.setTitle("Waifu");
			info.setImage("https://cdn.discordapp.com/attachments/741583355505541181/751332572407005215/holo2.jpg");
			info.setColor(0xf45642);
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(info.build()).queue();
			info.clear();
			
			}			
	}
}
