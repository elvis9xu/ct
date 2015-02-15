package com.xjd.mol.biz.context;

import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 应用上下文
 * 
 * @author elvis.xu
 * @since 2014-12-1
 */
@Component
public class AppContext {
	private static Logger log = LoggerFactory.getLogger(AppContext.class);

	public static final String VAL_ENV_PRODUCT = "product";
	public static final String KEY_ENV = AppContext.class.getName() + ".env";

	protected static AppContext instance;

	protected ApplicationContext springContext;
	protected Properties properties;
	protected boolean isEnvProduct;

	@Autowired
	public AppContext(ApplicationContext springContext, Properties properties) {
		if (instance == null) {
			this.springContext = springContext;
			this.properties = properties;
			if (this.properties != null) {
				isEnvProduct = VAL_ENV_PRODUCT.equalsIgnoreCase(this.properties.getProperty(KEY_ENV));
			}
			log.info("AppContext inited: isEnvProduct=[{}], properties.size=[{}], springContext=[{}]", isEnvProduct, this.properties.size(),
					this.springContext);
		}
	}

	public static boolean isEnvProduct() {
		return isEnvProduct();
	}

	public static ApplicationContext getSpringContext() {
		return instance == null ? null : instance.springContext;
	}

	public static Properties getProperties() {
		return instance == null ? null : instance.properties;
	}

	public static String getProperty(String key) {
		Properties props = getProperties();
		if (props != null) {
			return props.getProperty(key);
		}
		return null;
	}

	public static long getPropertyLong(String key) {
		String prop = StringUtils.trim(getProperty(key));
		if (StringUtils.isEmpty(prop)) {
			throw new RuntimeException("The value of the property '" + key + "' does not set.");
		}
		try {
			return Long.valueOf(prop);
		} catch (NumberFormatException e) {
			throw new RuntimeException("The value of the property '" + key + "' must be Long: " + prop);
		}
	}

}
