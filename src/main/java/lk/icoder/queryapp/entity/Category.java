package lk.icoder.queryapp.entity;


import javax.persistence.*;
import java.util.List;

/**
 * @Project query-app
 * @Author DILAN on 10/10/2019
 */
@Entity
@Table(name = "ehtem_category")
public class Category {

    @Id
    @GeneratedValue
    private Long categoryid;
    private Long hospitalId;
    private Long hospitalGroupId;
    private String codeRange;
    private String category;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "specification_id")
    private Specification specification;

    @OneToMany(
            mappedBy = "category",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private List<Diseases> diseases;

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
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

    public String getCodeRange() {
        return codeRange;
    }

    public void setCodeRange(String codeRange) {
        this.codeRange = codeRange;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public List<Diseases> getDiseases() {
        return diseases;
    }

    public void setDiseases(List<Diseases> diseases) {
        this.diseases = diseases;
    }
}
