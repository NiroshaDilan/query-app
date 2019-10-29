package lk.icoder.queryapp.repository.specification;

import lk.icoder.queryapp.dto.IcdRequestDto;
import lk.icoder.queryapp.entity.Specification;

import java.util.List;

/**
 * @Project query-app
 * @Author DILAN on 10/29/2019
 */
public interface SpecificationRepositoryCustom {

    List<Specification> getIcd(IcdRequestDto icdRequestDto);
}
