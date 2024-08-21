package utils

import groovy.json.JsonSlurper
import java.text.SimpleDateFormat


class CommonUtils {

    // Common logging format
    static void logMessage(String level, String message) {
        def date = new Date()
        def sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        def formattedDate = sdf.format(date)
        println "${level}: ${formattedDate}: ${message}"
    }
    static void logInfo(String message) {
        logMessage("INFO", message)
    }
    static void logWarning(String message) {
        logMessage("WARNING", message)
    }
    static void logError(String message) {
        logMessage("ERROR", message)
    }


    // Check status and log accordingly
    static void checkStatus(int statusCode, String message) {
        if (statusCode == 0) {
            logInfo("${message}")
        } else {
            logError("${message}")
            throw new RuntimeException("Build failed: ${message}")
        }
    }


    static Object getJsonValue(String filePath, String keyPath) {
        def jsonFile = new File(filePath)
        def jsonContent = jsonFile.text
        def jsonSlurper = new JsonSlurper()
        def jsonObject = jsonSlurper.parseText(jsonContent)
        def keys = keyPath.split("\\.")
        def value = jsonObject

        keys.each { key ->
            if (key.isInteger()) {
                value = value[Integer.parseInt(key)]
            } else {
                value = value[key]
            }
        }
        return value
    }
}
