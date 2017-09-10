package com.mapper.mapstruct;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mapper.dto.model.LibraryDto;
import com.mapper.generated.entity.InstitutionType;
import com.mapper.generated.entity.Library;

public class LibraryMapperTest {

	private static Library library;

	@BeforeClass
	public static void setup() {
		library = new Library();
		library.setLibraryID(1);
		library.setBooksCount(10);
		library.setInstitutionType(InstitutionType.ACADEMIC);
		library.setInstitutionCode("AA01");
	}

	@Test
	public void convertToDtoTest() {
		LibraryDto libraryDto = LibraryMapper.INSTANCE.convertToDto(library);
		Assert.assertEquals("1", libraryDto.getId());
		Assert.assertEquals(10, libraryDto.getBooksCount().intValue());
		Assert.assertEquals("AA01", libraryDto.getInstitutionCode());
		Assert.assertEquals("ACADEMIC", libraryDto.getInstitutionType());
	}

}
