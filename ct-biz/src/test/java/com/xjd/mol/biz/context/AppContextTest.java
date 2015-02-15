package com.xjd.mol.biz.context;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppContextTest {
	private static Logger log = LoggerFactory.getLogger(AppContextTest.class);

	@Test
	public void test() {
		log.info("HELLO, This is slf4j to log4j2");
	}

}
