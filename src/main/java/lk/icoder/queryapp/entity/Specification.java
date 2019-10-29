package lk.icoder.queryapp.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @Project query-app
 * @Author DILAN on 10/10/2019
 */
@Entity
@Table(name = "ehtem_specification")
public class Specification {

    @Id
    @GeneratedValue
    private Long specificationId;
    private Long hospitalId;
    private Long hospitalGroupId;
    private String icdSubVersion;
    private String icdType;
    private String specification;
    private String specificationNo;

    @OneToMany(
            mappedBy = "specification",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private List<Category> categories;

    public Long getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(Long specificationId) {
        this.specificationId = specificationId;
    }

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Long getHospitalGroupId() {
        return hospitalGroupId;
    }

    public void setHospitalGroupId(Long hospitalGroupId) {
        this.hospitalGroupId = hospitalGroupId;
    }

    public String getIcdSubVersion() {
        return icdSubVersion;
    }

    public void setIcdSubVersion(String icdSubVersion) {
        this.icdSubVersion = icdSubVersion;
    }

    public String getIcdType() {
        return icdType;
    }

    public void setIcdType(String icdType) {
        this.icdType = icdType;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getSpecificationNo() {
        return specificationNo;
    }

    public void setSpecificationNo(String specificationNo) {
        this.specificationNo = specificationNo;
    }
}
