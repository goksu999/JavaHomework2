package homework2;

public class User {
	
	//Fields
	private int id;
	private String userName;
	private String userLastName;
	private String nationalIdentity;
	private String adress;
	
	//Constructor
	public User(int id, String name, String lastName, String nationalIdentity, String adress) {
		super();
		this.id = id;
		this.userName = name;
		this.userLastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.adress = adress;
	}

	//Getter-Setter
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLastName() {
		return userLastName;
	}


	public void setLastName(String lastName) {
		this.userLastName = lastName;
	}


	public String getNationalIdentity() {
		return nationalIdentity;
	}


	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
}
