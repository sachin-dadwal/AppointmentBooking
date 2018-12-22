package user;

import java.time.LocalTime;

public class User {
	private String cName;
	private String cAge;
	private LocalTime cTime;
	private String cMobilenumber;
	private String cEmail;

	public User() {
	}

	public User(String cName, String cAge, LocalTime cTime, String cMobilenumber, String cEmail) {
		super();
		this.cName = cName;
		this.cAge = cAge;
		this.cTime = cTime;
		this.cMobilenumber = cMobilenumber;
		this.cEmail = cEmail;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAge() {
		return cAge;
	}

	public void setcAge(String cAge) {
		this.cAge = cAge;
	}

	public LocalTime getcTime() {
		return cTime;
	}

	public void setcTime(LocalTime cTime) {
		this.cTime = cTime;
	}

	public String getcMobilenumber() {
		return cMobilenumber;
	}

	public void setcMobilenumber(String cMobilenumber) {
		this.cMobilenumber = cMobilenumber;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

}
