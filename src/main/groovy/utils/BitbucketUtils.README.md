# BitbucketUtils
<a name="top"></a>
This class handles bitbucket operations such as cloning a repo, pushing to a repo, etc.
Parent package: **utils**


## Table of Contents
- [Methods](#methods)
  - [cloneRepo](#cloneRepo)


<br/><br/>

---
<br/>



<a name="methods"></a>
## Methods

<a name="cloneRepo"></a>
- **cloneRepo(project, repo, branch)**
Expects that "GIT_USERNAME" and "GIT_PASSWORD" are set as env vars on the system calling the method.

  Parameters:
  - `project`: (String) The bitbucket project name.
  - `repo`: (String) The bitbucket repo name under the given project.
  - `branch`: (String) The specific branch to clone from the repo.

  Returns:
  - `void`

  Outcome:
  - Clones a specific branch of a Bitbucket repository into the build folder like `build/$repo-$branch`



<br/><br/>

---
<br/>
