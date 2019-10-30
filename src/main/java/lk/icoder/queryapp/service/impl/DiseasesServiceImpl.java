package lk.icoder.queryapp.service.impl;

import lk.icoder.queryapp.dto.IcdRequestDto;
import lk.icoder.queryapp.entity.Category;
import lk.icoder.queryapp.entity.Diseases;
import lk.icoder.queryapp.entity.Specification;
import lk.icoder.queryapp.repository.DiseasesRepository;
import lk.icoder.queryapp.service.DiseaseService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project query-app
 * @Author DILAN on 10/30/2019
 */
@Service
@Transactional
public class DiseasesServiceImpl implements DiseaseService {

    private DiseasesRepository diseasesRepository;

    public DiseasesServiceImpl(DiseasesRepository diseasesRepository) {
        this.diseasesRepository = diseasesRepository;
    }

    @Override
    public Specification getIcdDiseases(IcdRequestDto icdRequestDto) {

        Specification specification = new Specification();
        Category category = new Category();
        List<Category> categoryList = new ArrayList<>();

        Diseases diseasesObj = new Diseases();
        List<Diseases> diseasesList = new ArrayList<>();


        Diseases diseases = diseasesRepository.findByDiseasesCodeAndHospitalIdAndHospitalGroupId(
                icdRequestDto.getIcdCode(),
                icdRequestDto.getHospitalId(),
                icdRequestDto.getHospitalGroupId());

        diseasesObj.setDiseasesId(diseases.getDiseasesId());
        diseasesObj.setDiseases(diseases.getDiseases());
        diseasesObj.setDiseasesCode(diseases.getDiseasesCode());
        diseasesObj.setDiseasesData(diseases.getDiseasesData());

        diseasesList.add(diseasesObj);

        category.setCategoryid(diseases.getCategory().getCategoryid());
        category.setCategory(diseases.getCategory().getCategory());
        category.setCodeRange(diseases.getCategory().getCodeRange());

        category.setDiseases(diseasesList);

        categoryList.add(category);

        specification.setSpecificationId(diseases.getCategory().getSpecification().getSpecificationId());
        specification.setSpecification(diseases.getCategory().getSpecification().getSpecification());
        specification.setIcdSubVersion(diseases.getCategory().getSpecification().getIcdSubVersion());
        specification.setIcdType(diseases.getCategory().getSpecification().getIcdType());
        specification.setCategories(categoryList);

        return specification;

    }
}
