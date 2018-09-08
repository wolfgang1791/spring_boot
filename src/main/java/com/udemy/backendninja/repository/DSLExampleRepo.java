package com.udemy.backendninja.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;
import com.udemy.backendninja.entity.Course;
import com.udemy.backendninja.entity.QCourse;


@Repository("querydsl")   // se llama desde un controlador con los paramtros
public class DSLExampleRepo {
	
	@PersistenceContext
	QCourse qcourse = QCourse.course;
	
	private EntityManager em;
	
	public Course find(boolean exist) {
		
		JPAQuery<Course> query = new JPAQuery<Course>(em);
		
		Predicate pred1 = qcourse.description.endsWith("OP");
		
		BooleanBuilder predbuilder = new BooleanBuilder(pred1);
		
		if(exist) {
			Predicate pred2 = qcourse.id.eq(23);
			predbuilder.and(pred2);
		}
		else
		{
			Predicate pred3 = qcourse.name.endsWith("OP");
			predbuilder.or(pred3);
		}
		
		
	return query.select(qcourse).from(qcourse).where(predbuilder).fetchOne();
	//	List<Course> courses = query.select(qcourse).from(qcourse).where(qcourse.hours.between(20, 50)).fetch();
		
	}
	
	
}
