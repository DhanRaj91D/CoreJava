package study.emtity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Subscription", uniqueConstraints= {
		@UniqueConstraint(columnNames="s-ID")
})
public class Subscription {

}
