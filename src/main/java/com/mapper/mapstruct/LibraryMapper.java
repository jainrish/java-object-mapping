package com.mapper.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import com.mapper.dto.model.LibraryDto;
import com.mapper.generated.entity.Library;

@Mapper
public interface LibraryMapper {

	public static final LibraryMapper INSTANCE = Mappers.getMapper(LibraryMapper.class);
	
	@Mapping(target = "id", expression="java(String.valueOf(library.getLibraryID()))")
    @Mapping(source = "booksCount", target = "booksCount")
	@Mapping(source = "institutionCode", target = "institutionCode")
	@Mapping(target = "institutionType", expression = "java(library.getInstitutionType().toString())")
	@Named("toLibraryDto")
	LibraryDto convertToDto(Library library);
	
	
}
