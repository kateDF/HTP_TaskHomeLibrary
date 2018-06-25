package by.htp.library.entity;

public abstract class EntityDB {
	private int id;

	public EntityDB(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
