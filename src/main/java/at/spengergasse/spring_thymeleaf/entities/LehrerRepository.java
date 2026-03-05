package at.spengergasse.spring_thymeleaf.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// Repository-Interface für Lehrer
@Repository
public interface LehrerRepository extends JpaRepository<Lehrer, Integer> {
}
