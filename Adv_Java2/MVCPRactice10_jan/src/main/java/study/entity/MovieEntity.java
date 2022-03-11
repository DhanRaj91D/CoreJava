package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movie_MVC")
public class MovieEntity {
	
	@Id
	@Column(name = "movie_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "movie_name")
	private String name;
	
	@Column(name = "movie_rating")
	private int rating;
	
	@Column(name = "movie_catg")
	private String catagery;

	public MovieEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MovieEntity( String name, int rating, String catagery) {
		super();
		
		this.name = name;
		this.rating = rating;
		this.catagery = catagery;
	}

	public MovieEntity(int id, String name, int rating, String catagery) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.catagery = catagery;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getCatagery() {
		return catagery;
	}

	public void setCatagery(String catagery) {
		this.catagery = catagery;
	}

	@Override
	public String toString() {
		return "MovieEntity [id=" + id + ", name=" + name + ", rating=" + rating + ", catagery=" + catagery + "]";
	}
	
	

}
