package edu.indiana.cs.c212;

import java.util.*;

/**
 * This is a simple class that models a Course.  Each Course has a course name, 
 * a list of students, and a UUID (unique user ID).  For more information on UUIDs see:
 * http://docs.oracle.com/javase/7/docs/api/java/util/UUID.html
 * 
 * Note: All of these fields are already given to you.
 */
public class Course {
    private String        courseName;
    private List<Student> students;
    private UUID          id;

    /**
     * The no arguments constructor for Course. The courseName should be null (which it is by default, so you
     * don't need to do anything) , and the id should be a random UUID.
     * The students ArrayList has already been set for you.
     */
    public Course() {
        students = new ArrayList<Student>(); //Leave this be.
        //FIXME Set the value of id to be a random UUID
        id = UUID.randomUUID();
        
    }
    
    /**
     * A single-argument constructor for the Course class. You should set the courseName to the
     * given name and the id to a random UUID.  The students ArrayList has already been set for you. 
     * 
     * @param courseName
     */
    public Course(String courseName){
    	students = new ArrayList<Student>(); //Leave this be.
    	//FIXME Set the value of id to be a random UUID and the course name to the given name
    	this.id = UUID.randomUUID();
    	this.courseName = courseName;
    }
    
    /**
     * A two-argument constructor for the Course class.  You should set the courseName to the
     * give name, the id to a random UUID, and the students to the given list of students.
     * 
     * @param courseName
     * @param students
     */
    public Course(String courseName, List<Student> students){
    	//FIXME Set the id to a random UUID, the course name to the given name, and the course's students to the given students
    	this.id = UUID.randomUUID();
    	this.courseName = courseName;
    	this.students = students;
    }

    /**
     * Returns the id of the course
     * 
     * @return the UUID of this course
     */
    public UUID getId() {
        //FIXME Return the id value.
    	return id;
    }

    /**
     * Sets the id of the course to the given id
     * 
     * @param id
     */
    public void setId(UUID id) {
        //FIXME set the id value
    	this.id = UUID.randomUUID();
    }
    
    /**
     * Returns the name of the course
     * 
     * @return
     */
    public String getCourseName() {
        //FIXME Return the courseName value.
    	return courseName;
    }

    /**
     * Sets the name of the course to the given courseName
     * 
     * @param courseName
     */
    public void setCourseName(String courseName) {
    	this.courseName = courseName;
        //FIXME set the courseName value
    }

    /**
     * Returns a list of all the students in the class
     * 
     * @return
     */
    public List<Student> getStudents() {
    	//FIXME return the actually set of enrolled students.
    	return students;
    }

    /**
     * Sets the list of students in the class to the given list
     * 
     * @param students
     */
    public void setStudents(List<Student> students) {
    	this.students = students;
        //FIXME Set the students value

    }

    /**
     * This method takes a student and adds them to the list of enrolled students.
     * Students may be rejected or not enrolled for 1 of 2 reasons
     * 1) They are already enrolled (i.e already a member of students)
     * 2) Their enrollment would cause the number of students to exceed the maximum
     *    number of students for the course.
     *
     * @param student The student to be added.
     * @return true if and only if the student has been successfully enrolled in the course
     */
    public Boolean enrollStudent(Student student) {
    	//FIXME return the correct Boolean value
    	return null ;
    }
    
    /**
     * Checks to see if the given student is enrolled in the course
     * 
     * @param student
     * @return true if and only if the given student is enrolled in the course
     */
    public Boolean isEnrolled(Student student){ 
        //FIXME return the correct Boolean value
    	return null;
    }

    /**
     * Removes the given student from the course. If the student is not enrolled,
     * do nothing.
     *
     * @param student The student to be removed.
     */
    public void removeStudent(Student student) {
        //FIXME remove the given student from the course
    }
    


    /**
     * The maximum number of students allowed to be enrolled in the class at a given time.
     * Does it matter that this is static?
     */
    public static final int COURSE_ENROLLMENT_LIMIT = 90;
}
