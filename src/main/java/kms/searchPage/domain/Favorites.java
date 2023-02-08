package kms.searchPage.domain;

import lombok.Data;

@Data
public class Favorites {
	private Long id;
	private String pageName;
	private Integer pageNum;

	public Favorites() {
	}

	public Favorites(String pageName, Integer pageNum, Integer quantity) {
		this.pageName 	= pageName;
		this.pageNum 	= pageNum;
	}
}
