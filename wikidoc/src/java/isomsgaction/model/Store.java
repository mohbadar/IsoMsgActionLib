package isomsgaction.model;


/**
 * @author dgrandemange
 *
 */
public class Store {
	
	private int id;
	
	private String name;
	
	private String number;
	
	private byte[] someByteArray;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the someByteArray
	 */
	public byte[] getSomeByteArray() {
		return someByteArray;
	}

	/**
	 * @param someByteArray the someByteArray to set
	 */
	public void setSomeByteArray(byte[] someByteArray) {
		this.someByteArray = someByteArray;
	}

	
}
