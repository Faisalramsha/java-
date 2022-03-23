package com.faisal;

import javax.persistence.*;

import java.util.*;

@Table(name="question")
@Entity
public class QuestionJava {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String qname;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="qid")
	
	private List<Answer> answers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
}