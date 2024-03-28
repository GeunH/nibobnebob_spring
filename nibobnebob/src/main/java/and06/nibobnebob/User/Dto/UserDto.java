package and06.nibobnebob.User.Dto;

public class UserDto {
	private String email;
	private String password;
	private String provider;
	private String nickName;
	private String region;
	private String birthdate;
	private boolean isMale;

	public UserDto(String email, String password, String provider, String nickName, String region, String birthdate,
			boolean isMale) {
		super();
		this.email = email;
		this.password = password;
		this.provider = provider;
		this.nickName = nickName;
		this.region = region;
		this.birthdate = birthdate;
		this.isMale = isMale;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	
}
