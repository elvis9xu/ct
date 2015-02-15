package com.xjd.mol.biz;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:config/mol-biz.xml" })
public class TestBasePure {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	public void baseTest() {
		assertThat(applicationContext).isNotNull();
	}
}
