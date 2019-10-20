package lk.icoder.queryapp.repository;

import lk.icoder.queryapp.entity.Diseases;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Project query-app
 * @Author DILAN on 10/12/2019
 */
public interface DiseasesRepository extends JpaRepository<Diseases, Long> {
}
