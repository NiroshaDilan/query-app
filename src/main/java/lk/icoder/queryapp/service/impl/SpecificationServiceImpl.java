package lk.icoder.queryapp.service.impl;

import lk.icoder.queryapp.dto.IcdRequestDto;
import lk.icoder.queryapp.entity.Specification;
import lk.icoder.queryapp.repository.SpecificationRepository;
import lk.icoder.queryapp.service.SpecificationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Project query-app
 * @Author DILAN on 10/29/2019
 */
@Service
@Transactional
public class SpecificationServiceImpl implements SpecificationService {

    private SpecificationRepository specificationRepository;

    public SpecificationServiceImpl(SpecificationRepository specificationRepository) {
        this.specificationRepository = specificationRepository;
    }

    @Override
    public List<Specification> getIcd(IcdRequestDto icdRequestDto) {
        return specificationRepository.getIcd(icdRequestDto);
    }
}
