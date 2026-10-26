import spock.lang.Specification

class HelloTest extends Specification {

    def "application should return the expected greeting"() {
        given: "the expected greeting"
        def expected = "Automatic CI/CD build triggered!"

        when: "the application greeting is obtained"
        def actual = "Automatic CI/CD build triggered!"

        then: "the greeting should match"
        actual == expected
    }
}