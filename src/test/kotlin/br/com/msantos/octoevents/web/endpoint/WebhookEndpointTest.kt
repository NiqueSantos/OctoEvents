package br.com.msantos.octoevents.web.endpoint

import io.restassured.RestAssured.*
import io.restassured.http.ContentType
import org.junit.jupiter.api.Test


/**
 * @author monique.santos
 * @since 1.0.0
 *
 * */
class WebhookEndpointTest: ServerTest() {

    @Test
    fun testCreateEvent() {

            given()
                .contentType(ContentType.JSON)
                .body(validPayload)
            .When()
                .post("/webhook")
            .then()
                .statusCode(201)
    }

    @Test
    fun testErrorInvalidPayloadCreateEvent() {

            given()
                .contentType(ContentType.JSON)
                .body(invalidPayload)
            .When()
                .post("/webhook")
            .then()
                .statusCode(500)
    }

    private val validPayload: String = "{\n" +
        "   \"action\": \"reopened\",\n" +
                "   \"issue\": {\n" +
                "    \"url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/issues/5\",\n" +
                "    \"repository_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents\",\n" +
                "    \"labels_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/issues/5/labels{/name}\",\n" +
                "   \"comments_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/issues/5/comments\",\n" +
                "    \"events_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/issues/5/events\",\n" +
                "    \"html_url\": \"https://github.com/NiqueSantos/OctoEvents/issues/5\",\n" +
                "    \"id\": 437813957,\n" +
                "    \"node_id\": \"MDU6SXNzdWU0Mzc4MTM5NTc=\",\n" +
                "    \"number\": 10,\n" +
                "    \"title\": \"Issue - teste\",\n" +
                "    \"user\": {\n" +
                "    \"login\": \"NiqueSantos\",\n" +
                "    \"id\": 16803356,\n" +
                "    \"node_id\": \"MDQ6VXNlcjE2ODAzMzU2\",\n" +
                "    \"avatar_url\": \"https://avatars1.githubusercontent.com/u/16803356?v=4\",\n" +
                "    \"gravatar_id\": \"\",\n" +
                "    \"url\": \"https://api.github.com/users/NiqueSantos\",\n" +
                "    \"html_url\": \"https://github.com/NiqueSantos\",\n" +
                "    \"followers_url\": \"https://api.github.com/users/NiqueSantos/followers\",\n" +
                "    \"following_url\": \"https://api.github.com/users/NiqueSantos/following{/other_user}\",\n" +
                "    \"gists_url\": \"https://api.github.com/users/NiqueSantos/gists{/gist_id}\",\n" +
                "    \"starred_url\": \"https://api.github.com/users/NiqueSantos/starred{/owner}{/repo}\",\n" +
                "    \"subscriptions_url\": \"https://api.github.com/users/NiqueSantos/subscriptions\",\n" +
                "    \"organizations_url\": \"https://api.github.com/users/NiqueSantos/orgs\",\n" +
                "    \"repos_url\": \"https://api.github.com/users/NiqueSantos/repos\",\n" +
                "    \"events_url\": \"https://api.github.com/users/NiqueSantos/events{/privacy}\",\n" +
                "    \"received_events_url\": \"https://api.github.com/users/NiqueSantos/received_events\",\n" +
                "   \"type\": \"User\",\n" +
                "        \"site_admin\": false\n" +
                "    },\n" +
                "    \"labels\": [\n" +
                "    ],\n" +
                "    \"state\": \"open\",\n" +
                "    \"locked\": false,\n" +
                "    \"assignee\": null,\n" +
                "    \"assignees\": [\n" +
                "    ],\n" +
                "    \"milestone\": null,\n" +
                "    \"comments\": 1,\n" +
                "    \"created_at\": \"2019-04-26T19:28:18Z\",\n" +
                "    \"updated_at\": \"2019-04-26T19:40:42Z\",\n" +
                "    \"closed_at\": null,\n" +
                "    \"author_association\": \"OWNER\",\n" +
                "    \"body\": \"ok\"\n" +
                "    },\n" +
                "    \"repository\": {\n" +
                "    \"id\": 183075360,\n" +
                "    \"node_id\": \"MDEwOlJlcG9zaXRvcnkxODMwNzUzNjA=\",\n" +
                "    \"name\": \"OctoEvents\",\n" +
                "    \"full_name\": \"NiqueSantos/OctoEvents\",\n" +
                "    \"private\": false,\n" +
                "    \"owner\": {\n" +
                "    \"login\": \"NiqueSantos\",\n" +
                "    \"id\": 16803356,\n" +
                "    \"node_id\": \"MDQ6VXNlcjE2ODAzMzU2\",\n" +
                "    \"avatar_url\": \"https://avatars1.githubusercontent.com/u/16803356?v=4\",\n" +
                "    \"gravatar_id\": \"\",\n" +
                "    \"url\": \"https://api.github.com/users/NiqueSantos\",\n" +
                "    \"html_url\": \"https://github.com/NiqueSantos\",\n" +
                "    \"followers_url\": \"https://api.github.com/users/NiqueSantos/followers\",\n" +
                "    \"following_url\": \"https://api.github.com/users/NiqueSantos/following{/other_user}\",\n" +
                "    \"gists_url\": \"https://api.github.com/users/NiqueSantos/gists{/gist_id}\",\n" +
                "    \"starred_url\": \"https://api.github.com/users/NiqueSantos/starred{/owner}{/repo}\",\n" +
                "    \"subscriptions_url\": \"https://api.github.com/users/NiqueSantos/subscriptions\",\n" +
                "    \"organizations_url\": \"https://api.github.com/users/NiqueSantos/orgs\",\n" +
                "    \"repos_url\": \"https://api.github.com/users/NiqueSantos/repos\",\n" +
                "    \"events_url\": \"https://api.github.com/users/NiqueSantos/events{/privacy}\",\n" +
                "    \"received_events_url\": \"https://api.github.com/users/NiqueSantos/received_events\",\n" +
                "    \"type\": \"User\",\n" +
                "    \"site_admin\": false\n" +
                "    },\n" +
                "    \"html_url\": \"https://github.com/NiqueSantos/OctoEvents\",\n" +
                "    \"description\": \"Teste Jaya Tech\",\n" +
                "    \"fork\": false,\n" +
                "    \"url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents\",\n" +
                "    \"forks_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/forks\",\n" +
                "    \"keys_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/keys{/key_id}\",\n" +
                "    \"collaborators_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/collaborators{/collaborator}\",\n" +
                "    \"teams_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/teams\",\n" +
                "    \"hooks_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/hooks\",\n" +
                "    \"issue_events_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/issues/events{/number}\",\n" +
                "    \"events_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/events\",\n" +
                "    \"assignees_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/assignees{/user}\",\n" +
                "    \"branches_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/branches{/branch}\",\n" +
                "    \"tags_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/tags\",\n" +
                "    \"blobs_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/git/blobs{/sha}\",\n" +
                "    \"git_tags_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/git/tags{/sha}\",\n" +
                "    \"git_refs_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/git/refs{/sha}\",\n" +
                "    \"trees_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/git/trees{/sha}\",\n" +
                "    \"statuses_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/statuses/{sha}\",\n" +
                "    \"languages_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/languages\",\n" +
                "    \"stargazers_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/stargazers\",\n" +
                "    \"contributors_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/contributors\",\n" +
                "    \"subscribers_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/subscribers\",\n" +
                "    \"subscription_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/subscription\",\n" +
                "    \"commits_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/commits{/sha}\",\n" +
                "    \"git_commits_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/git/commits{/sha}\",\n" +
                "    \"comments_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/comments{/number}\",\n" +
                "    \"issue_comment_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/issues/comments{/number}\",\n" +
                "    \"contents_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/contents/{+path}\",\n" +
                "    \"compare_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/compare/{base}...{head}\",\n" +
                "    \"merges_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/merges\",\n" +
                "    \"archive_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/{archive_format}{/ref}\",\n" +
                "    \"downloads_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/downloads\",\n" +
                "    \"issues_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/issues{/number}\",\n" +
                "    \"pulls_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/pulls{/number}\",\n" +
                "    \"milestones_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/milestones{/number}\",\n" +
                "    \"notifications_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/notifications{?since,all,participating}\",\n" +
                "    \"labels_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/labels{/name}\",\n" +
                "    \"releases_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/releases{/id}\",\n" +
                "    \"deployments_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/deployments\",\n" +
                "    \"created_at\": \"2019-04-23T18:38:44Z\",\n" +
                "    \"updated_at\": \"2019-04-26T13:44:10Z\",\n" +
                "    \"pushed_at\": \"2019-04-26T13:44:08Z\",\n" +
                "    \"git_url\": \"git://github.com/NiqueSantos/OctoEvents.git\",\n" +
                "    \"ssh_url\": \"git@github.com:NiqueSantos/OctoEvents.git\",\n" +
                "    \"clone_url\": \"https://github.com/NiqueSantos/OctoEvents.git\",\n" +
                "    \"svn_url\": \"https://github.com/NiqueSantos/OctoEvents\",\n" +
                "    \"homepage\": null,\n" +
                "    \"size\": 1,\n" +
                "    \"stargazers_count\": 0,\n" +
                "    \"watchers_count\": 0,\n" +
                "    \"language\": null,\n" +
                "    \"has_issues\": true,\n" +
                "    \"has_projects\": true,\n" +
                "    \"has_downloads\": true,\n" +
                "    \"has_wiki\": true,\n" +
                "    \"has_pages\": false,\n" +
                "    \"forks_count\": 0,\n" +
                "    \"mirror_url\": null,\n" +
                "    \"archived\": false,\n" +
                "    \"disabled\": false,\n" +
                "    \"open_issues_count\": 2,\n" +
                "    \"license\": null,\n" +
                "    \"forks\": 0,\n" +
                "    \"open_issues\": 2,\n" +
                "    \"watchers\": 0,\n" +
                "    \"default_branch\": \"master\"\n" +
                "    },\n" +
                "    \"sender\": {\n" +
                "    \"login\": \"NiqueSantos\",\n" +
                "    \"id\": 16803356,\n" +
                "    \"node_id\": \"MDQ6VXNlcjE2ODAzMzU2\",\n" +
                "    \"avatar_url\": \"https://avatars1.githubusercontent.com/u/16803356?v=4\",\n" +
                "    \"gravatar_id\": \"\",\n" +
                "    \"url\": \"https://api.github.com/users/NiqueSantos\",\n" +
                "    \"html_url\": \"https://github.com/NiqueSantos\",\n" +
                "    \"followers_url\": \"https://api.github.com/users/NiqueSantos/followers\",\n" +
                "    \"following_url\": \"https://api.github.com/users/NiqueSantos/following{/other_user}\",\n" +
                "    \"gists_url\": \"https://api.github.com/users/NiqueSantos/gists{/gist_id}\",\n" +
                "    \"starred_url\": \"https://api.github.com/users/NiqueSantos/starred{/owner}{/repo}\",\n" +
                "    \"subscriptions_url\": \"https://api.github.com/users/NiqueSantos/subscriptions\",\n" +
                "    \"organizations_url\": \"https://api.github.com/users/NiqueSantos/orgs\",\n" +
                "    \"repos_url\": \"https://api.github.com/users/NiqueSantos/repos\",\n" +
                "    \"events_url\": \"https://api.github.com/users/NiqueSantos/events{/privacy}\",\n" +
                "    \"received_events_url\": \"https://api.github.com/users/NiqueSantos/received_events\",\n" +
                "    \"type\": \"User\",\n" +
                "    \"site_admin\": false\n" +
                "    }\n" +
                "    }"


    private val invalidPayload: String = "{\n" +
            "   \"action\": \"BLABLAAAA\",\n" +
            "   \"issue\": {\n" +
            "    \"url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/issues/5\",\n" +
            "    \"repository_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents\",\n" +
            "    \"labels_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/issues/5/labels{/name}\",\n" +
            "   \"comments_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/issues/5/comments\",\n" +
            "    \"events_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/issues/5/events\",\n" +
            "    \"html_url\": \"https://github.com/NiqueSantos/OctoEvents/issues/5\",\n" +
            "    \"id\": 437813957,\n" +
            "    \"node_id\": \"MDU6SXNzdWU0Mzc4MTM5NTc=\",\n" +
            "    \"number\": 10,\n" +
            "    \"title\": \"Issue - teste\",\n" +
            "    \"user\": {\n" +
            "    \"login\": \"NiqueSantos\",\n" +
            "    \"id\": 16803356,\n" +
            "    \"node_id\": \"MDQ6VXNlcjE2ODAzMzU2\",\n" +
            "    \"avatar_url\": \"https://avatars1.githubusercontent.com/u/16803356?v=4\",\n" +
            "    \"gravatar_id\": \"\",\n" +
            "    \"url\": \"https://api.github.com/users/NiqueSantos\",\n" +
            "    \"html_url\": \"https://github.com/NiqueSantos\",\n" +
            "    \"followers_url\": \"https://api.github.com/users/NiqueSantos/followers\",\n" +
            "    \"following_url\": \"https://api.github.com/users/NiqueSantos/following{/other_user}\",\n" +
            "    \"gists_url\": \"https://api.github.com/users/NiqueSantos/gists{/gist_id}\",\n" +
            "    \"starred_url\": \"https://api.github.com/users/NiqueSantos/starred{/owner}{/repo}\",\n" +
            "    \"subscriptions_url\": \"https://api.github.com/users/NiqueSantos/subscriptions\",\n" +
            "    \"organizations_url\": \"https://api.github.com/users/NiqueSantos/orgs\",\n" +
            "    \"repos_url\": \"https://api.github.com/users/NiqueSantos/repos\",\n" +
            "    \"events_url\": \"https://api.github.com/users/NiqueSantos/events{/privacy}\",\n" +
            "    \"received_events_url\": \"https://api.github.com/users/NiqueSantos/received_events\",\n" +
            "   \"type\": \"User\",\n" +
            "        \"site_admin\": false\n" +
            "    },\n" +
            "    \"labels\": [\n" +
            "    ],\n" +
            "    \"state\": \"open\",\n" +
            "    \"locked\": false,\n" +
            "    \"assignee\": null,\n" +
            "    \"assignees\": [\n" +
            "    ],\n" +
            "    \"milestone\": null,\n" +
            "    \"comments\": 1,\n" +
            "    \"created_at\": \"2019-04-26T19:28:18Z\",\n" +
            "    \"updated_at\": \"2019-04-26T19:40:42Z\",\n" +
            "    \"closed_at\": null,\n" +
            "    \"author_association\": \"OWNER\",\n" +
            "    \"body\": \"ok\"\n" +
            "    },\n" +
            "    \"repository\": {\n" +
            "    \"id\": 183075360,\n" +
            "    \"node_id\": \"MDEwOlJlcG9zaXRvcnkxODMwNzUzNjA=\",\n" +
            "    \"name\": \"OctoEvents\",\n" +
            "    \"full_name\": \"NiqueSantos/OctoEvents\",\n" +
            "    \"private\": false,\n" +
            "    \"owner\": {\n" +
            "    \"login\": \"NiqueSantos\",\n" +
            "    \"id\": 16803356,\n" +
            "    \"node_id\": \"MDQ6VXNlcjE2ODAzMzU2\",\n" +
            "    \"avatar_url\": \"https://avatars1.githubusercontent.com/u/16803356?v=4\",\n" +
            "    \"gravatar_id\": \"\",\n" +
            "    \"url\": \"https://api.github.com/users/NiqueSantos\",\n" +
            "    \"html_url\": \"https://github.com/NiqueSantos\",\n" +
            "    \"followers_url\": \"https://api.github.com/users/NiqueSantos/followers\",\n" +
            "    \"following_url\": \"https://api.github.com/users/NiqueSantos/following{/other_user}\",\n" +
            "    \"gists_url\": \"https://api.github.com/users/NiqueSantos/gists{/gist_id}\",\n" +
            "    \"starred_url\": \"https://api.github.com/users/NiqueSantos/starred{/owner}{/repo}\",\n" +
            "    \"subscriptions_url\": \"https://api.github.com/users/NiqueSantos/subscriptions\",\n" +
            "    \"organizations_url\": \"https://api.github.com/users/NiqueSantos/orgs\",\n" +
            "    \"repos_url\": \"https://api.github.com/users/NiqueSantos/repos\",\n" +
            "    \"events_url\": \"https://api.github.com/users/NiqueSantos/events{/privacy}\",\n" +
            "    \"received_events_url\": \"https://api.github.com/users/NiqueSantos/received_events\",\n" +
            "    \"type\": \"User\",\n" +
            "    \"site_admin\": false\n" +
            "    },\n" +
            "    \"html_url\": \"https://github.com/NiqueSantos/OctoEvents\",\n" +
            "    \"description\": \"Teste Jaya Tech\",\n" +
            "    \"fork\": false,\n" +
            "    \"url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents\",\n" +
            "    \"forks_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/forks\",\n" +
            "    \"keys_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/keys{/key_id}\",\n" +
            "    \"collaborators_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/collaborators{/collaborator}\",\n" +
            "    \"teams_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/teams\",\n" +
            "    \"hooks_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/hooks\",\n" +
            "    \"issue_events_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/issues/events{/number}\",\n" +
            "    \"events_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/events\",\n" +
            "    \"assignees_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/assignees{/user}\",\n" +
            "    \"branches_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/branches{/branch}\",\n" +
            "    \"tags_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/tags\",\n" +
            "    \"blobs_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/git/blobs{/sha}\",\n" +
            "    \"git_tags_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/git/tags{/sha}\",\n" +
            "    \"git_refs_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/git/refs{/sha}\",\n" +
            "    \"trees_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/git/trees{/sha}\",\n" +
            "    \"statuses_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/statuses/{sha}\",\n" +
            "    \"languages_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/languages\",\n" +
            "    \"stargazers_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/stargazers\",\n" +
            "    \"contributors_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/contributors\",\n" +
            "    \"subscribers_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/subscribers\",\n" +
            "    \"subscription_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/subscription\",\n" +
            "    \"commits_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/commits{/sha}\",\n" +
            "    \"git_commits_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/git/commits{/sha}\",\n" +
            "    \"comments_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/comments{/number}\",\n" +
            "    \"issue_comment_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/issues/comments{/number}\",\n" +
            "    \"contents_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/contents/{+path}\",\n" +
            "    \"compare_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/compare/{base}...{head}\",\n" +
            "    \"merges_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/merges\",\n" +
            "    \"archive_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/{archive_format}{/ref}\",\n" +
            "    \"downloads_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/downloads\",\n" +
            "    \"issues_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/issues{/number}\",\n" +
            "    \"pulls_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/pulls{/number}\",\n" +
            "    \"milestones_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/milestones{/number}\",\n" +
            "    \"notifications_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/notifications{?since,all,participating}\",\n" +
            "    \"labels_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/labels{/name}\",\n" +
            "    \"releases_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/releases{/id}\",\n" +
            "    \"deployments_url\": \"https://api.github.com/repos/NiqueSantos/OctoEvents/deployments\",\n" +
            "    \"created_at\": \"2019-04-23T18:38:44Z\",\n" +
            "    \"updated_at\": \"2019-04-26T13:44:10Z\",\n" +
            "    \"pushed_at\": \"2019-04-26T13:44:08Z\",\n" +
            "    \"git_url\": \"git://github.com/NiqueSantos/OctoEvents.git\",\n" +
            "    \"ssh_url\": \"git@github.com:NiqueSantos/OctoEvents.git\",\n" +
            "    \"clone_url\": \"https://github.com/NiqueSantos/OctoEvents.git\",\n" +
            "    \"svn_url\": \"https://github.com/NiqueSantos/OctoEvents\",\n" +
            "    \"homepage\": null,\n" +
            "    \"size\": 1,\n" +
            "    \"stargazers_count\": 0,\n" +
            "    \"watchers_count\": 0,\n" +
            "    \"language\": null,\n" +
            "    \"has_issues\": true,\n" +
            "    \"has_projects\": true,\n" +
            "    \"has_downloads\": true,\n" +
            "    \"has_wiki\": true,\n" +
            "    \"has_pages\": false,\n" +
            "    \"forks_count\": 0,\n" +
            "    \"mirror_url\": null,\n" +
            "    \"archived\": false,\n" +
            "    \"disabled\": false,\n" +
            "    \"open_issues_count\": 2,\n" +
            "    \"license\": null,\n" +
            "    \"forks\": 0,\n" +
            "    \"open_issues\": 2,\n" +
            "    \"watchers\": 0,\n" +
            "    \"default_branch\": \"master\"\n" +
            "    },\n" +
            "    \"sender\": {\n" +
            "    \"login\": \"NiqueSantos\",\n" +
            "    \"id\": 16803356,\n" +
            "    \"node_id\": \"MDQ6VXNlcjE2ODAzMzU2\",\n" +
            "    \"avatar_url\": \"https://avatars1.githubusercontent.com/u/16803356?v=4\",\n" +
            "    \"gravatar_id\": \"\",\n" +
            "    \"url\": \"https://api.github.com/users/NiqueSantos\",\n" +
            "    \"html_url\": \"https://github.com/NiqueSantos\",\n" +
            "    \"followers_url\": \"https://api.github.com/users/NiqueSantos/followers\",\n" +
            "    \"following_url\": \"https://api.github.com/users/NiqueSantos/following{/other_user}\",\n" +
            "    \"gists_url\": \"https://api.github.com/users/NiqueSantos/gists{/gist_id}\",\n" +
            "    \"starred_url\": \"https://api.github.com/users/NiqueSantos/starred{/owner}{/repo}\",\n" +
            "    \"subscriptions_url\": \"https://api.github.com/users/NiqueSantos/subscriptions\",\n" +
            "    \"organizations_url\": \"https://api.github.com/users/NiqueSantos/orgs\",\n" +
            "    \"repos_url\": \"https://api.github.com/users/NiqueSantos/repos\",\n" +
            "    \"events_url\": \"https://api.github.com/users/NiqueSantos/events{/privacy}\",\n" +
            "    \"received_events_url\": \"https://api.github.com/users/NiqueSantos/received_events\",\n" +
            "    \"type\": \"User\",\n" +
            "    \"site_admin\": false\n" +
            "    }\n" +
            "    }"

}