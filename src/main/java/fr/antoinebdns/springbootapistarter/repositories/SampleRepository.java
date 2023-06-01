package fr.antoinebdns.springbootapistarter.repositories;

import fr.antoinebdns.springbootapistarter.models.SampleModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<SampleModel, Long> {
}
