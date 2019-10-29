package lk.icoder.queryapp.entity;

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

    @OneToOne(
            mappedBy = "diseasesData",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            optional = false)
    private Diseases diseases;

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
