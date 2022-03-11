package study;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.entity.MovieEntity;

@Repository
public interface MyRepository extends JpaRepository<MovieEntity, Integer> {


	public List<MovieEntity> findByName(String name);
	
	
}
