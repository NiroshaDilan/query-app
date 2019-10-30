package lk.icoder.queryapp.service;

import lk.icoder.queryapp.dto.IcdRequestDto;
import lk.icoder.queryapp.entity.Diseases;
import lk.icoder.queryapp.entity.Specification;

import java.util.List;

/**
 * @Project query-app
 * @Author DILAN on 10/30/2019
 */
public interface DiseaseService {

    Specification getIcdDiseases(IcdRequestDto icdRequestDto);
}
