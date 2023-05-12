package in.suraj.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="STUDENT_ENQUIRIES")
public class StudentEnq {
	
	@Id
	private Integer EnquiryId;
	private String StudentName;
	private Integer Phno;
	private String ClassMode;
	private String CourseName;
	private String EnquiryStatus;
	private Date CreatedDate;
	private Date UpdatedDate;
	

}
