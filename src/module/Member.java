package module;

public class Member {
	private String user;
	private String email;
	
	
	public Member(String user, String email) {
		super();
		this.user = user;
		this.email = email;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Member [user=" + user + ", email=" + email + "]";
	}
	
	

}
