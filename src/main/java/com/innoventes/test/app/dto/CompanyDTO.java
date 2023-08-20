package com.innoventes.test.app.dto;

import com.innoventes.test.app.customAnnotation.CustomPattern;
import com.innoventes.test.app.customAnnotation.EvenNoOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CompanyDTO {

	private Long id;

	@NotNull(message = "Name is mandatory")
	@Size(min = 5, message = "Name length must be greater than 5 characters")
	private String companyName;

	@Email(message = "please provide a valid email")
	private String email;

	@Nullable
	@PositiveOrZero(message = "Enter valid positive No.")
	@EvenNoOrZero(message = "strength must be even no")
	private Integer strength;

	private String webSiteURL;


	@CustomPattern(message = "invalid input")
	private String companyCode;
}
