package in.suraj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.suraj.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
