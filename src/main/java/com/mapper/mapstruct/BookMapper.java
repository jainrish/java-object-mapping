package com.mapper.mapstruct;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import com.mapper.dto.model.BookDto;
import com.mapper.generated.entity.Book;
import com.mapper.generated.entity.Library;

@Mapper
public abstract class BookMapper {

	public static final BookMapper INSTANCE = Mappers
			.getMapper(BookMapper.class);

	@Mappings({
			@Mapping(target = "libraryID", ignore = true),
			@Mapping(target = "name", source = "name"),
			@Mapping(target = "author", source = "author"),
			@Mapping(target = "pages", source = "pages"),
			@Mapping(target = "id", expression = "java(String.valueOf(book.getBookID()))"), })
	@Named("toBookDto")
	protected abstract BookDto map(Book book);

	@Mappings({
			@Mapping(target = "libraryID", expression = "java(String.valueOf(library.getLibraryID()))"),
			@Mapping(target = "name", ignore = true),
			@Mapping(target = "author", ignore = true),
			@Mapping(target = "pages", ignore = true),
			@Mapping(target = "id", ignore = true), })
	public abstract BookDto map(@MappingTarget BookDto bookDto, Library library);

	@IterableMapping(qualifiedByName = "toBookDto")
	public abstract List<BookDto> map(List<Book> books);

	protected List<BookDto> map(List<Book> books, Library library) {
		  List<BookDto> dtoList = map(books);
	        for (BookDto bookDto : dtoList) {
	            map(bookDto, library);
	        }
	        return dtoList;
	}
}
