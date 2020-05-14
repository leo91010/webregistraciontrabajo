package entities;

@Entity
public class Administration {
	
	public String name;
	
	public String address;
	
	public String Refferent;
	
	public String telephone;
	
	public String mobilePhone;
	
	public String email;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRefferent() {
		return Refferent;
	}

	public void setRefferent(String refferent) {
		Refferent = refferent;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	
	

}
