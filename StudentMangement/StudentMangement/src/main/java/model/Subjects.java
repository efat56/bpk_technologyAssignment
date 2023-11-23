package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Subjects")
public class Subjects {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int subId;
	private String subject;
	private int maxMarks;
	private int marks;
	
	
//	@ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "reportCardId")  
//    private ReportCard reportCard;
	@ManyToOne
	@JoinColumn(name = "reportCardId")
	private ReportCard reportCard;
	
	public Subjects() {
		// TODO Auto-generated constructor stub
	}

	

	public Subjects(String subject, int maxMarks, int marks) {
		super();
		this.subject = subject;
		this.maxMarks = maxMarks;
		this.marks = marks;
	}



	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public ReportCard getReportCard() {
		return reportCard;
	}

	public void setReportCard(ReportCard reportCard) {
		this.reportCard = reportCard;
	}

	@Override
	public String toString() {
		return "Subjects [subId=" + subId + ", subject=" + subject + ", maxMarks=" + maxMarks + ", marks=" + marks
				+ ", reportCard=" + reportCard + "]";
	}

	
	
}
