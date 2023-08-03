/**
 * 
 */
package io.github.mdimitri.repository;

import io.github.mdimitri.domain.model.Follower;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * @author Marcus Dimitri
 *
 */
@ApplicationScoped
public class FollowerRepository implements PanacheRepository<Follower> {

}
