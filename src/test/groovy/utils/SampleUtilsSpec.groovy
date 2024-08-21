package utils

import spock.lang.Specification

class SampleUtilsSpec extends Specification {

    def "SampleMethod should return 'Hello from Groovy!'"() {
        expect:
        SampleUtils.sampleMethod() == "Hello from Groovy!"
    }
}
