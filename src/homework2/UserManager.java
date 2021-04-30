package homework2;

public class UserManager {

	public void add(User user) {
		
		System.out.println(user.getUserName() + user.getLastName() + "  => ad-soyad kaydedildi.");
		System.out.println(user.getNationalIdentity() + user.getAdress() + " => kimlik bilgisi ve adres kaydedildi.");
		System.out.println(" ");
	}
	
	public void addMultiple(User[] users) {
		for(User user:users) {
			add(user);
		}
	}
	
	public void delete(User user) {
		System.out.println(user.getUserName() + " kaydınız silindi.");
	}
}
