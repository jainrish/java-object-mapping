package com.mapper.mapstruct;

import com.mapper.dto.model.LibraryDto;
import com.mapper.generated.entity.Library;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-09-10T19:09:23+0530",
    comments = "version: 1.2.0.CR1, compiler: Eclipse JDT (IDE) 1.1.0.v20140509-1235, environment: Java 1.8.0_111 (Oracle Corporation)"
)
public class LibraryMapperImpl implements LibraryMapper {

    @Override
    public LibraryDto convertToDto(Library library) {
        if ( library == null ) {
            return null;
        }

        LibraryDto libraryDto = new LibraryDto();

        libraryDto.setInstitutionCode( library.getInstitutionCode() );
        libraryDto.setBooksCount( library.getBooksCount() );

        libraryDto.setInstitutionType( library.getInstitutionType().toString() );
        libraryDto.setId( String.valueOf(library.getLibraryID()) );

        return libraryDto;
    }
}
