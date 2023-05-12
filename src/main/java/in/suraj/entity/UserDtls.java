package in.suraj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="USER_DTLS")
public class UserDtls {
	
	@Id
	private Integer UserId;
	private String Name;
	private String Email;
	private Integer Phno;
	private String Pwd;
	private String AccStatus;

}
