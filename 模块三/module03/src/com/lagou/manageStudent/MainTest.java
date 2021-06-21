package com.lagou.manageStudent;

import java.util.LinkedList;
import java.util.List;

/**
 * 编程实现学生信息管理系统的测试
 */
public class MainTest {

	public static void main(String[] args) {

		// 1.创建一个集合用于存储所有学生信息
		List<Student> studentList = new LinkedList<>();

		// 2.通过集合进行学生信息的增删改查操作
		ManageStudent manageStudent = new ManageStudent(studentList);
		ViewStudent viewStudent = new ViewStudent(manageStudent);
		viewStudent.showMenu();

		// 3.关闭扫描器
		ScannerStudent.closeScanner();
	}

}
