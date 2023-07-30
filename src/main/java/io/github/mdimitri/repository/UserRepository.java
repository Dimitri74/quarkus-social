/**
 * 
 */
package io.github.mdimitri.repository;

import io.github.mdimitri.domain.model.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * @author dell
 *
 */
@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {
	
	

}
