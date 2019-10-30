package lk.icoder.queryapp.repository;

import lk.icoder.queryapp.entity.Diseases;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Project query-app
 * @Author DILAN on 10/12/2019
 */
public interface DiseasesRepository extends JpaRepository<Diseases, Long> {

    Diseases findByDiseasesCodeAndHospitalIdAndHospitalGroupId(String diseasesCode, Long hospitalId, Long hospitalGroupId);
}
