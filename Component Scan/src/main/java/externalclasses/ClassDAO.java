package externalclasses;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Harvey Braun
 * @version 1.0
 * @since 20.04.2020
 */
@Component
@Getter @Setter
public class ClassDAO {

	@Autowired
	private ClassJDBC objectJDBC;

}
