package com.testauthor;

import com.AuthorDao.AuthorDao;
import com.author.Author;

public class TestAuthor {

	public static void main(String[] args) {
		Author author=new Author();
		AuthorDao authordao=new AuthorDao();
	
		author.setIsbn(23);
		author.setContent("environmental science");
		author.setAuthor("ramesh");
		author.setPrice(400);
		author.setStatus("published");
		author.setTitle("java");
		author.setPublishdate(2710200);
		
		authordao.save(author);
		authordao.update(author);
		authordao.select(author);

	}

}
