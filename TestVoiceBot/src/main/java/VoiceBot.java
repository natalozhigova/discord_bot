import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class VoiceBot {
    public static void main(String[] args) throws LoginException {
        JDABuilder builder = JDABuilder.createDefault("TOKEN");
        builder.addEventListeners(new Event());
        builder.build();
    }
}
