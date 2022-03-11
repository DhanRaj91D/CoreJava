package study;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.entity.BookEntity;

@Repository
public interface Myrepository extends JpaRepository<BookEntity, Integer> {

	public List<BookEntity> findByBookName(String name);

	
}
