package com.ba.model;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel(value = "My Pet model",description = " My Pet")
public class Pet {
	
	@ApiModelProperty(value = "Id field of the pet object ")
	private int id;
	
	@ApiModelProperty(value = "Name field of the pet object ")

	private String name;
	
	@ApiModelProperty(value = "Date field of the pet object ")
	private Date date;

}
