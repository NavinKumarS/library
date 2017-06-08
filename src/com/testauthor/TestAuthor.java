package com.testauthor;

import java.sql.SQLException;

import com.AuthorDao.AuthorDao;
import com.author.Author;

public class TestAuthor {

	public static void main(String[] args) throws SQLException {
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
		authordao.delete(author);
		authordao.select2(author);
		authordao.select3(author);
		authordao.select4(author);
	     authordao.select5(author);
		authordao.select6(author);
	}

}
