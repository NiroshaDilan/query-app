package lk.icoder.queryapp.controller;

import lk.icoder.queryapp.dto.IcdRequestDto;
import lk.icoder.queryapp.entity.Specification;
import lk.icoder.queryapp.service.DiseaseService;
import lk.icoder.queryapp.service.SpecificationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Project query-app
 * @Author DILAN on 10/30/2019
 */
@RestController
@RequestMapping("/api/specification/")
public class SpecificationController {

    private SpecificationService specificationService;
    private DiseaseService diseaseService;

    public SpecificationController(SpecificationService specificationService,
                                   DiseaseService diseaseService) {
        this.specificationService = specificationService;
        this.diseaseService = diseaseService;
    }

    @PostMapping
    public ResponseEntity<List<Specification>> getIcdCodes(@RequestBody IcdRequestDto icdRequestDto) {

        List<Specification> icd = specificationService.getIcd(icdRequestDto);
        return new ResponseEntity<>(icd, HttpStatus.OK);
    }

    @PostMapping("/icd")
    public ResponseEntity<Specification> getIcdCodesByDisease(@RequestBody IcdRequestDto icdRequestDto) {
        return new ResponseEntity<>(diseaseService.getIcdDiseases(icdRequestDto), HttpStatus.OK);
    }
}
