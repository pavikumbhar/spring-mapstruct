package com.pavikumbhar.mapper;

import org.mapstruct.MapperConfig;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.ReportingPolicy;

@MapperConfig(componentModel = "spring",
			   nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
			   unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapperConfiguration {

}
