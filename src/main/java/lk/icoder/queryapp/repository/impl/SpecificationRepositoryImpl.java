package lk.icoder.queryapp.repository.impl;

import lk.icoder.queryapp.dto.IcdRequestDto;
import lk.icoder.queryapp.entity.*;
import lk.icoder.queryapp.repository.specification.SpecificationRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Project query-app
 * @Author DILAN on 10/29/2019
 */
@Repository
public class SpecificationRepositoryImpl implements SpecificationRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Specification> getIcd(IcdRequestDto icdRequestDto) {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Specification> criteriaQuery = criteriaBuilder.createQuery(Specification.class);

        Root<Specification> specificationRoot = criteriaQuery.from(Specification.class);

        ListJoin<Specification, Category> categoryListJoin = specificationRoot.join(Specification_.categories);
        ListJoin<Category, Diseases> diseasesListJoin = categoryListJoin.join(Category_.diseases);

        List<Predicate> predicates = new ArrayList<>();

        predicates.add(criteriaBuilder
                .equal(specificationRoot.get(Specification_.hospitalId), icdRequestDto.getHospitalId()));

        predicates.add(criteriaBuilder
                .equal(specificationRoot.get(Specification_.hospitalGroupId), icdRequestDto.getHospitalGroupId()));

        predicates.add(criteriaBuilder
                .equal(specificationRoot.get(Specification_.icdType), icdRequestDto.getIcdType()));

        predicates.add(criteriaBuilder
                .like(diseasesListJoin.get(Diseases_.diseasesCode),  icdRequestDto.getIcdCode()  + "%"));

        criteriaQuery.where(predicates.toArray(new Predicate[0]));

        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}



















