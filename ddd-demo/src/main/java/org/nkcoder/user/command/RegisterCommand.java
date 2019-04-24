package org.nkcoder.user.command;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(description = "User register request model")
public class RegisterCommand {

    @NotBlank(message = "policyNumber Can not be empty")
    @ApiModelProperty(value = "PolicyNumber", example = "policy1")
    private String policyNumber;

    @NotBlank(message = "ownerEmail Can not be empty")
    @ApiModelProperty(value = "OwnerEmail", example = "email1")
    private String ownerEmail;
}
