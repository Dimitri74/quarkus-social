/**
 * 
 */
package io.github.mdimitri;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;

import jakarta.ws.rs.core.Application;





/**
 * @author Marcus Dimitri
 *
 */
@OpenAPIDefinition(
        info = @Info(
                title = "API Quarkus Social",
                version = "1.0",
                contact = @Contact(
                        name = "Marcus Dimitri B.Costa",
                        url = "https://github.com/Dimitri74",
                        email = "marcusdbcosta@gmail.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0.html")
        )
)
public class QuarkusSocialApplication extends Application {
}
