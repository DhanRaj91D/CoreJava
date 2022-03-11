package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="hobby_tbl")
public class Hobby {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="hobby_id")
	private int id;
	
	@Column(name="hobby_name")
	private String hobby;
	
	@ManyToOne
	private User userid;

	public Hobby() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hobby(int id, String hobby, User userid) {
		super();
		this.id = id;
		this.hobby = hobby;
		this.userid = userid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public User getUserid() {
		return userid;
	}

	public void setUserid(User userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Hobby [id=" + id + ", hobby=" + hobby + ", userid=" + userid + "]";
	}
	
	

}
