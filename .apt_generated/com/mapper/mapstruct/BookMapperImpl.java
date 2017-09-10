package com.mapper.mapstruct;

import com.mapper.dto.model.BookDto;
import com.mapper.generated.entity.Book;
import com.mapper.generated.entity.Library;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-09-10T21:01:15+0530",
    comments = "version: 1.2.0.CR1, compiler: Eclipse JDT (IDE) 1.1.0.v20140509-1235, environment: Java 1.8.0_111 (Oracle Corporation)"
)
public class BookMapperImpl extends BookMapper {

    @Override
    protected BookDto map(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDto bookDto = new BookDto();

        bookDto.setName( book.getName() );
        bookDto.setPages( book.getPages() );
        bookDto.setAuthor( book.getAuthor() );

        bookDto.setId( String.valueOf(book.getBookID()) );

        return bookDto;
    }

    @Override
    public List<BookDto> map(List<Book> books) {
        if ( books == null ) {
            return null;
        }

        List<BookDto> list = new ArrayList<BookDto>( books.size() );
        for ( Book book : books ) {
            list.add( map( book ) );
        }

        return list;
    }

    @Override
    public BookDto map(BookDto bookDto, Library library) {
        if ( library == null ) {
            return null;
        }

        bookDto.setLibraryID( String.valueOf(library.getLibraryID()) );

        return bookDto;
    }
}
