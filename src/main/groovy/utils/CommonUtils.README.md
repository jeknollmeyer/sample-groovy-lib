# CommonUtils
<a name="top"></a>
This class handles general methods for things like log messages, process status checking, pull a json value from jsonPath, etc.
Parent package: **utils**


## Table of Contents
- [Methods](#methods)
  - [logInfo | logWarning | logError](#log)
  - [checkStatus](#status)
  - [getJsonValue](#json)

<br/><br/>

---
<br/>



<a name="methods"></a>
## Methods

<a name="log"></a>
- **logInfo(message) || logWarning(message) || lotError(message)**

  Parameters:
  - `message`: (String) The log statement you want to print.

  Returns:
  - `void`

  Outcome:
  - Prints a log message like "INFO: ${formattedDate}: ${message}"
    - `logInfo("This is a info message")` -> "INFO: 2024-08-16 11:17:46: This is a info message"
    - `logWarning("This is a warning message")` -> "INFO: 2024-08-16 11:17:46: This is a warning message"
    - `logError("This is a error message")` -> "INFO: 2024-08-16 11:17:46: This is a error message"

<a name="status"></a>
- **checkStatus(statusCode, message)**

  Parameters:
  - `statusCode`: (Integer) The status code from some completed process.
  - `message`: (String) A message to describe the process to check.

  Returns:
  - `void`

  Outcome:
  - Prints a INFO or ERROR message along with the status message describing the process that was checked.
  - Throws an ERROR if statusCode != 0

<a name="json"></a>
- **getJsonValue(filePath, keyPath)**

  Parameters:
  - `filePath`: (String) The path of the JSON file to parse.
  - `keyPath`: (String) The json object path to retrieve the value for.

  Returns:
  - `value`: Returns the value of the keyPath that was queried.

  Outcome:
  - Returns the value of the keyPath from the JSON file
  - `getJsonValue("src/test/resources/simple.json", "release.name") -> returns the "release"."name" value == "testReleaseName"



[back to top](#top)

<br/><br/>

---
<br/>
