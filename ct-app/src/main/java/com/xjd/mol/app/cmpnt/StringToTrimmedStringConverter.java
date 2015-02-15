package com.xjd.mol.app.cmpnt;

import org.springframework.core.convert.converter.Converter;

public class StringToTrimmedStringConverter implements Converter<String, String> {

	@Override
	public String convert(String source) {
		return source == null ? null : source.trim();
	}

}
