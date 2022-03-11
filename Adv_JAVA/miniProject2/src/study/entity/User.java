package study.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_tbl")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	@Column(name="first_name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="user_name")
	private String uname;
	@Column(name="password")
	private String pass;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="hobby_id")
	private Set<Hobby> hobbies;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User( String name, String email, String uname, String pass) {
		super();
	
		this.name = name;
		this.email = email;
		this.uname = uname;
		this.pass = pass;
	
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Set<Hobby> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<Hobby> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", uname=" + uname + ", pass=" + pass
				+ ", hobbies=" + hobbies + "]";
	}
	
	
	
	

}
