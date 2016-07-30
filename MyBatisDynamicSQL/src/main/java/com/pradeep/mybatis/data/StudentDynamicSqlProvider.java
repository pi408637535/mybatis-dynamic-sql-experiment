package com.pradeep.mybatis.data;

import org.apache.ibatis.jdbc.SQL;

import com.pradeep.mybatis.model.Student;

public class StudentDynamicSqlProvider {

	public String findStudentByIdSql(final Integer studentId) {
		return new SQL() {
			{
				SELECT("ID,NAME,BRANCH,PERCENTAGE,PHONE,EMAIL");
				FROM("student");
				WHERE("id=" + studentId);
			}
		}.toString();
	}

	public String insertStudent(final Student student) {
		return new SQL() {
			{
				INSERT_INTO("student");

				if (student.getName() != null) {
					VALUES("NAME", "#{name}");
				}
				if (student.getEmail() != null) {
					VALUES("EMAIL", "#{email}");
				}
				if (student.getPercentage() != null) {
					VALUES("PERCENTAGE", "#{percentage}");
				}
				if (student.getBranch() != null) {
					VALUES("BRANCH", "#{branch}");
				}
				if (student.getPhone() != null) {
					VALUES("PHONE", "#{phone}");
				}
			}
		}.toString();
	}

	public String updateStudent(final Student student) {
		return new SQL() {
			{
				UPDATE("student");
				if (student.getName() != null) {
					SET("NAME = #{name}");
				}
				if (student.getEmail() != null) {
					SET("EMAIL = #{email}");
				}
				WHERE("ID = #{id}");
			}
		}.toString();
	}

	public String deleteStudent(int id) {
		return new SQL() {
			{
				DELETE_FROM("student");
				WHERE("ID = #{id}");
			}
		}.toString();
	}

}
