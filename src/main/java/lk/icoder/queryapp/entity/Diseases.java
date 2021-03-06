package lk.icoder.queryapp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

/**
 * @Project query-app
 * @Author DILAN on 10/10/2019
 */
@Entity
@Table(name = "ehtem_diseases")
public class Diseases {

    @Id
    @GeneratedValue
    private Long diseasesId;
    private String diseases;
    private String diseasesCode;
    private Long hospitalId;
    private Long hospitalGroupId;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category;

    @JsonManagedReference
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "diseases_dataid")
    private DiseasesData diseasesData;

    public Long getDiseasesId() {
        return diseasesId;
    }

    public void setDiseasesId(Long diseasesId) {
        this.diseasesId = diseasesId;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public String getDiseasesCode() {
        return diseasesCode;
    }

    public void setDiseasesCode(String diseasesCode) {
        this.diseasesCode = diseasesCode;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public DiseasesData getDiseasesData() {
        return diseasesData;
    }

    public void setDiseasesData(DiseasesData diseasesData) {
        this.diseasesData = diseasesData;
    }
}
