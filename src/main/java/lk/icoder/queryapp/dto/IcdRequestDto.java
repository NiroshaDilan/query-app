package lk.icoder.queryapp.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @Project query-app
 * @Author DILAN on 10/29/2019
 */
@Getter
@Setter
public class IcdRequestDto {

    private String icdType;
    private String icdCode;
    private Long hospitalId;
    private Long hospitalGroupId;
}
