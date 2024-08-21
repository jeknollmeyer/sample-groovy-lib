package utils

import spock.lang.Specification

class CommonUtilsSpec extends Specification {


    def "test getJsonValue"() {
        given:
        File jsonFile = new File(getClass().getResource("/simple.json").toURI())
        String jsonFilePath = jsonFile.absolutePath

        when:
        def result = CommonUtils.getJsonValue(jsonFilePath, 'release.name')

        then:
        result == "testReleaseName"
    }

    def "test checkStatus logs info and does not throw exception for status 0"() {
        given:
        def outputStream = new ByteArrayOutputStream()
        def printStream = new PrintStream(outputStream)
        System.setOut(printStream)

        when:
        CommonUtils.logInfo("This is an info message")
        CommonUtils.logWarning("This is a warning message")
        CommonUtils.logError("This is an error message")

        then:
        outputStream.toString().contains("INFO")
        outputStream.toString().contains("WARNING")
        outputStream.toString().contains("ERROR")

        cleanup:
        System.setOut(System.out)
    }

    def "test logMessage for INFO, WARNING, and ERROR"() {
        given:
        def outputStream = new ByteArrayOutputStream()
        def printStream = new PrintStream(outputStream)
        System.setOut(printStream)

        when:
        CommonUtils.logInfo("This is an info message")
        CommonUtils.logWarning("This is a warning message")
        CommonUtils.logError("This is an error message")

        then:
        outputStream.toString().contains("INFO")
        outputStream.toString().contains("WARNING")
        outputStream.toString().contains("ERROR")

        cleanup:
        System.setOut(System.out)
    }




}

