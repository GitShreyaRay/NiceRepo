package com.nice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nice.entity.Student;

//@Repository
public class ReportRepository /* extends JpaRepository<Student, Long> */{

	/*
	 * //private final EntityManagerFactory emf;
	 * 
	 * //EntityManager entityManager = emf.createEntityManager();
	 * 
	 * public List<Object[]> viewGrades(Long id) { return null;
	 * 
	 * 
	 * //select st.student_id, st.first_name, st.last_name, crs.course_name,
	 * gd.grade from student st inner join grade gd on st.student_id = gd.student_id
	 * //inner join course crs on gd.course_id = crs.course_id and st.student_id = 1
	 * 
	 * Query query = entityManager.
	 * createQuery("SELECT , st.studentId, st.firstName, st.lastName, crs.courseName, gd.grade FROM  Student st"
	 * + "inner join Grade gd on st.studentId = gd.studentId " +
	 * "inner join Course crs on gd.courseId = crs.course_IdAND st.studentId =:id");
	 * query.setParameter("id", id);
	 * 
	 * 
	 * //return query.getResultList(); }
	 */
}
