package agency.werewolf.jintable.game;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import agency.werewolf.jintable.player.Player;

/** ゲームクラスです。 **/
public abstract class Game {

	private final UUID uuid;
	private final List<Player> playerList;
	private GameStatus status;
	private GameRule rule;

	protected Game(){
		playerList = new ArrayList<Player>();
		uuid = UUID.randomUUID();
	}

	/** ゲーム固有のUUIDを返します。 **/
	public UUID getUuid() {
		return uuid;
	}

	/** ゲームに参加しているプレイヤーを返します。 **/
	public List<Player> getPlayerList() {
		return playerList;
	}

	/** ゲームのステイタスを返します。 **/
	public GameStatus getStatus() {
		return status;
	}

	/** ゲームのルールを返します。 **/
	public GameRule getRule() {
		return rule;
	}

}
