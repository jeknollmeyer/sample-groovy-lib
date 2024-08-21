package utils

import spock.lang.Specification
import java.nio.file.Files
import java.nio.file.Paths

class BitbucketSpec extends Specification {

    def "test cloneRepo function"() {
        setup:
        String project = 'commercial-devops'
        String repo = 'cera-release-trains'
        String branch = 'master'

        when:
        BitbucketUtils.cloneRepo(project, repo, branch)

        then:
        Files.exists(Paths.get("build", repo))
    }


    def "test cloneRepo function"() {
        setup:
        String project = 'invalidProj'
        String repo = 'invalidRepo'
        String branch = 'master'

         // Redirect standard output
        ByteArrayOutputStream stdout = new ByteArrayOutputStream()
        System.setOut(new PrintStream(stdout))

        when:
        try {
            BitbucketUtils.cloneRepo(project, repo, branch)
        } catch (Exception e) {
            // Expected to throw an exception
        }

        then:
        def output = stdout.toString()
        output.contains("ERROR")

        cleanup:
        // Restore standard output
        System.setOut(System.out)
    }


}
