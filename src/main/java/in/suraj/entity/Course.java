package in.suraj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="COURSES")
public class Course {
	
	@Id
	private Integer CourseId;
	private String CourseName;

}
