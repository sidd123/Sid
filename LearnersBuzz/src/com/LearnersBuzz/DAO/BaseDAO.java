package com.LearnersBuzz.DAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class BaseDAO {
	private static final Logger logger = LoggerFactory.getLogger(BaseDAO.class);
	@Autowired
	private MongoTemplate mongoTemplate;
}
