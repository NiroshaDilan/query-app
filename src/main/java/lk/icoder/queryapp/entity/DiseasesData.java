package lk.icoder.queryapp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * @Project query-app
 * @Author DILAN on 10/10/2019
 */

@Entity
@Table(name = "ehtem_diseases_data")
public class DiseasesData {

    @Id
    @GeneratedValue
    private Long diseasesDataid;
    private Long hospitalId;
    private Long hospitalGroupId;

    @Column(columnDefinition = "nclob")
    private String diseasesData;

    @JsonBackReference
    @OneToOne(
            mappedBy = "diseasesData",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            optional = false)
    private Diseases diseases;

    public String getDiseasesData() {
        return diseasesData;
    }

    public void setDiseasesData(String diseasesData) {
        this.diseasesData = diseasesData;
    }

    public Long getDiseasesDataid() {
        return diseasesDataid;
    }

    public void setDiseasesDataid(Long diseasesDataid) {
        this.diseasesDataid = diseasesDataid;
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

    public Diseases getDiseases() {
        return diseases;
    }

    public void setDiseases(Diseases diseases) {
        this.diseases = diseases;
    }
}
