package demo.project.CBTCsjdbc;

public class Train {
	private int Id;
	private float Length;
	private String Type;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public float getLength() {
		return Length;
	}
	public void setLength(float length) {
		Length = length;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public Train() {
		super();
		setId(Id);
		setLength(Length);
		setType(Type);
	}
	public Train(int id, float length, String type) {
		super();
		Id = id;
		Length = length;
		Type = type;
	}

}
