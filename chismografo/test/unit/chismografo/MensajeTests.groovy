package chismografo



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Mensaje)
class MensajeTests {

    void testSomething() {
       Mensaje msg = Mensaje.create()
			 Assert.assertNotNull("Can't create Message object", msg)
    }
}
