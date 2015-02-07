package shared.models.DTO.params;

public class CreateGameRequest {
	
	private boolean randomTiles;
	private boolean randomNumbers;
	private boolean randomPorts;
	private String name;

	public CreateGameRequest() {
		randomTiles = false;
		randomNumbers = false;
		randomPorts = false;
		name = null;
	}

	public CreateGameRequest(boolean randomTiles, boolean randomNumbers,
			boolean randomPorts, String name) {
		super();
		this.randomTiles = randomTiles;
		this.randomNumbers = randomNumbers;
		this.randomPorts = randomPorts;
		this.name = name;
	}

	public boolean isRandomTiles() {
		return randomTiles;
	}

	public void setRandomTiles(boolean randomTiles) {
		this.randomTiles = randomTiles;
	}

	public boolean isRandomNumbers() {
		return randomNumbers;
	}

	public void setRandomNumbers(boolean randomNumbers) {
		this.randomNumbers = randomNumbers;
	}

	public boolean isRandomPorts() {
		return randomPorts;
	}

	public void setRandomPorts(boolean randomPorts) {
		this.randomPorts = randomPorts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
