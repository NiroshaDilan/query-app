package lk.icoder.queryapp.repository;

import lk.icoder.queryapp.entity.DiseasesData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Project query-app
 * @Author DILAN on 10/12/2019
 */
public interface DiseasesDataRepository extends JpaRepository<DiseasesData, Long> {
}
