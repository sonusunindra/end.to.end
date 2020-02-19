package sonu.dra.sb.end.to.end;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sonu.dra.sb.end.to.end.model.Employee;

import javax.transaction.Transactional;

//@Repository
public interface AppRepository extends JpaRepository<Employee, Long> {

    @Modifying
    @Query(value="UPDATE employee emp SET emp.designation=:designation WHERE emp.eid=:eid",nativeQuery = true)
    @Transactional
    int updateEmployee(@Param("eid") Long eid, @Param("designation") String designation);
}
