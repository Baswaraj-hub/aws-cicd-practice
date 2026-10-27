import spock.lang.Specification

class HelloTest extends Specification {

    def "application should return the expected greeting"() {
        given: "a Hello application"
        def app = new Hello()

        when: "the greeting is requested"
        def actual = app.getGreeting()

        then: "the greeting should match"
        actual == "Automatic CI/CD build triggered!"
    }
}