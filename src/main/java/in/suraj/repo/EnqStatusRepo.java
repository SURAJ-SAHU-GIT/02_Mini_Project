package in.suraj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.suraj.entity.EnqStatus;

public interface EnqStatusRepo extends JpaRepository<EnqStatus, Integer> {

}
