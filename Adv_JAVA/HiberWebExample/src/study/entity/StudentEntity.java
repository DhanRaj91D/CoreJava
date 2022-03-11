package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Student_tbl")
public class StudentEntity {

	@Id
	@Column(name = "Stud_ID")
	private int id;

	@Column(name = "Stud_name")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StudentEntity() {

	}

	public StudentEntity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", name=" + name + "]";
	}

}
