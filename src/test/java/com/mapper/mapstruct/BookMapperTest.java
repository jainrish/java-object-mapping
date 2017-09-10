package com.mapper.mapstruct;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mapper.dto.model.BookDto;
import com.mapper.generated.entity.Book;
import com.mapper.generated.entity.InstitutionType;
import com.mapper.generated.entity.Library;

public class BookMapperTest {

	private static Library library;
	private static Book book1, book2;

	@BeforeClass
	public static void setup() {
		library = new Library();
		library.setLibraryID(1);
		library.setBooksCount(10);
		library.setInstitutionType(InstitutionType.ACADEMIC);
		library.setInstitutionCode("AA01");
		
		book1 = new Book();
		book1.setAuthor("author1");
		book1.setBookID(1);
		book1.setName("name1");
		book1.setPages(100);
		
		book2 = new Book();
		book2.setAuthor("author2");
		book2.setBookID(2);
		book2.setName("name2");
		book2.setPages(200);
		
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(book1);
		bookList.add(book2);
		
		library.getBookList().addAll(bookList);
	}
	
	@Test
	public void convertToDtoTest() {
		List<BookDto> bookDto = BookMapper.INSTANCE.map(library.getBookList(), library);
		Assert.assertEquals(2, bookDto.size());
	}
	
	
	
	
}
