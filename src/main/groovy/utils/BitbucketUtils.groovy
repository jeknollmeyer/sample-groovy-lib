package utils

class BitbucketUtils {

    static void cloneRepo(String project, String repo, String branch) {
        CommonUtils.logInfo("Executing cloneRepo method with arguments: $project, $repo, $branch")
        String gitKey = System.getenv("GIT_PASSWORD")
        if (!gitKey) {
          CommonUtils.logError("Environment variable GIT_PASSWORD is not set")
        }
        String gitUsername = System.getenv("GIT_USERNAME")
        if (!gitUsername) {
          CommonUtils.logError("Environment variable GIT_USERNAME is not set")
        }
        def gitUrl = "https://${gitUsername}:${gitKey}@scm.company.int/stash/scm/${project}/${repo}.git"
        def cloneDir = new File("build/${repo}-${branch}")

        def command = "git clone -b ${branch} ${gitUrl} build/${repo}"
        CommonUtils.logInfo("Executing 'git clone'")

        try {
            def process = command.execute()
            process.waitFor()

            CommonUtils.logInfo("Command executed with exit value: ${process.exitValue()}")
            CommonUtils.logInfo("Command output: ${process.text}")
            CommonUtils.checkStatus(process.exitValue(), "Cloning repository into ${cloneDir.absolutePath}")
        } catch (Exception e) {
            CommonUtils.logError("Exception during command execution: ${e.message}")
            throw e
        }
    }
}
