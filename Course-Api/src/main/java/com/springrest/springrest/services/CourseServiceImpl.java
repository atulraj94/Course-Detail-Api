package com.springrest.springrest.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
//	List<Course> list;
	@Autowired 
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
//		return list;
		
		return courseDao.findAll();
	}
	
	@Override
	public Course getCourse(long courseId) {
		return courseDao.getReferenceById(courseId);
	}
	
	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		Course entity=courseDao.getReferenceById(parseLong);
		courseDao.delete(entity);
	}

}
