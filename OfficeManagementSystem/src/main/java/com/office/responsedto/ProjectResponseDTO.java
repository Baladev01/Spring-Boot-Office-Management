package com.office.responsedto;

import lombok.Data;

@Data
public class ProjectResponseDTO {

    private Integer id;

    private String projectName;

    private String clientName;

    private String deadline;

    private String projectStatus;

}