package multitenancy.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import multitenancy.org.model.Locality;

public interface LocalityRepository extends JpaRepository<Locality, Long> {

}
