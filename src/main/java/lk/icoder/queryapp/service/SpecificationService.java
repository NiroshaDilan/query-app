package lk.icoder.queryapp.service;

import lk.icoder.queryapp.dto.IcdRequestDto;
import lk.icoder.queryapp.entity.Specification;

import java.util.List;

/**
 * @Project query-app
 * @Author DILAN on 10/29/2019
 */
public interface SpecificationService {

    public List<Specification> getIcd(IcdRequestDto icdRequestDto);
}
