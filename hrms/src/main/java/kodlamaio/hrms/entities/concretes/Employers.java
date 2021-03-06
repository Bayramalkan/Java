package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employers")
public class Employers extends User{
	
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="web_address")
	private String webAddress;
	
	@Column(name="email_verify")
	private boolean emailVerify;
	
	@Column(name="system_personnel_verify")
	private boolean systemPersonnelVerify;
	
	
	public Employers() {}
	
	
	public Employers(int id, String companyName, String phoneNumber, String webAddress, boolean emailVerify,
			boolean systemPersonnelVerify) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.phoneNumber = phoneNumber;
		this.webAddress = webAddress;
		this.emailVerify = emailVerify;
		this.systemPersonnelVerify = systemPersonnelVerify;
	}
}
