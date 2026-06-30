package com.office.requestdto;

import com.office.enums.ProjectStatus;
import lombok.Data;

@Data
public class ProjectRequestDTO {

    private String projectName;

    private String clientName;

    private String deadline;

    private ProjectStatus projectStatus;

}