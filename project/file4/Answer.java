
package com.faisal;
import javax.persistence.*;
@Table(name="answer")//--->>> Annotations
@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//--->>For auto-increment
	private int id0;
	private String studentname;
	private String answer;
	public int getId0() {
		return id0;
	}
	public void setId0(int id0) {
		this.id0 = id0;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	

	
}