# sample-groovy-lib
<a name="top"></a>
This repo is used for general automation utilities to be used across various projects.




## Table of Contents
- [Utilities](#utils)
- [Usage](#usage)
- [Contributing](#contribute)
- [Testing](#testing)



<br/><br/>

---
<br/>


<a name="utils"></a>
# Utilities
Below is the documentation of the utility scripts within this repo.

- **utils**
  The `utils` package contains utility classes that provide common functionalities such as interacting with external services, logging, and basic string manipulations.
  - [BitbucketUtils](src/main/groovy/utils/BitbucketUtils.README.md)
  - [CommonUtils](src/main/groovy/utils/CommonUtils.README.md)


[back to top](#top)
<br/><br/>

---
<br/>


<a name="usage"></a>
# Usage
Below is an example of how to consume this groovy library from another project.
Your project shold have a `build.gradle` and be intialized as a gradle project (install gradle, run `gradle init` in root of repo)
Or else if you have the jar locally, you can call the utilities from the jar directly.

## Sample build.gradle
The sample.build.gradle represents an example of what a buld.gradle would look like in another project to import the utils artifact created from this repo and consume/use the utils.
- [sample.build.gradle](src/test/resources/sample.build.gradle)
- Sample of how to call a task (Can run this command in Jenkins/CommandLine/etc:  `./gradlew cloneMainRepo`



[back to top](#top)
<br/><br/>

---
<br/>



<a name="utils"></a>
# Contributing
Contributions are encouraged.
This is a groovy-library project. Code contributions should come in the form of groovy scripts accompanied by spock/spec tests.
**Code Contribution Example**
- Sample Groovy Utility Script:  [SampleUtils.sampleMethod](src/main/groovy/utils/SampleUtils.groovy)
- Sample Groovy Spock/Spec Test: [SampleUtilsSpec](src/test/groovy/utils/SampleUtilsSpec.groovy)
> The `SampleUtils.groovy` script has a single methcd `sampleMethod`
> The `SampleUtilsSpec.groovy` runs a test to call the method and assert the output value.




[back to top](#top)

<br/><br/>

---
<br/>


<a name="testing"></a>
# Testing
This project will execute the spock tests located in [src/test/groovy](src/test/groovy) folder.
Add any sample data for the main class functions to the [src/test/resources](src/test/resources) folder.




[back to top](#top)

<br/><br/>

---
<br/>
