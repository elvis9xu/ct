package com.xjd.ct.utl.valid.constraints;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.xjd.ct.utl.respcode.RespCode;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { DateConstraintValidator.class })
public @interface Date {

	DatePattern pattern() default DatePattern.yyyyMMddHHmmss;

	String message() default RespCode.RESP_0002;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	public static enum DatePattern {
		yyMM("yyMM")
		, yyyyMM("yyyyMM")
		, yyyyMMdd("yyyyMMdd")
		, yyyyMMddHHmmss("yyyyMMddHHmmss");

		private String value;

		DatePattern(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

	}
}
