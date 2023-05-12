package in.suraj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="ENQUIRY_STATUS")
public class EnqStatus {
	
	@Id
	private Integer StatusId;
	private String StatusName;

}
