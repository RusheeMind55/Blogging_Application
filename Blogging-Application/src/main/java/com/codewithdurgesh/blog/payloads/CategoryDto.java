package com.codewithdurgesh.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Data
public class CategoryDto {

	private Integer categoryId;
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	@NotBlank
	@Size(min = 4,message = "Min size of category title is 4")
	private String categoryTitle;

	@NotBlank
	@Size(min = 10, message = "min size of cateogry desc is 10")
	private String categoryDescription;
	public CategoryDto(Integer categoryId,
			@NotBlank @Size(min = 4, message = "Min size of category title is 4") String categoryTitle,
			@NotBlank @Size(min = 10, message = "min size of cateogry desc is 10") String categoryDescription) {
		super();
		this.categoryId = categoryId;
		this.categoryTitle = categoryTitle;
		this.categoryDescription = categoryDescription;
	}

	@Override
	public String toString() {
		return "CategoryDto [categoryId=" + categoryId + ", categoryTitle=" + categoryTitle + ", categoryDescription="
				+ categoryDescription + ", getCategoryId()=" + getCategoryId() + ", getCategoryTitle()="
				+ getCategoryTitle() + ", getCategoryDescription()=" + getCategoryDescription() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
public CategoryDto() {
	
}
	

}
