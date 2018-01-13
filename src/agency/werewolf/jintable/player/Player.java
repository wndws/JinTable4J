package agency.werewolf.jintable.player;

import java.util.UUID;

public abstract class Player {

	private UUID uuid;

	public Player() {
		uuid = UUID.randomUUID();
	}

}
