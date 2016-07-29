package com.raremile.universitypro.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBConfig {
	private static final Logger LOG = LoggerFactory.getLogger(DBConfig.class);

	static {
		LOG.debug("Loading MySQL driver");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			LOG.error("Could not load the driver", e);
		}
	}
}
