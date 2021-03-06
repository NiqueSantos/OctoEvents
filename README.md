# Octo Events

Octo Events é um microserviço construído com Kotlin e Javalin suportado pelo MongoDB. Este microservce expõe dois endpoints responsáveis por manipular Issues Events criadas a partir do GitHub.

A ideia principal da aplicação é ouvir as Issues Events do Github através da prévia configuração de um webhook e disponibilzá-las para uso via rest api.

# Pré-Requisitos

Softwares necessários para desenvolvimento:

- JDK 1.8 ou superior
- GIT 2.13.1.windows.2 ou superior
- Gradle 3.5.1 ou superior
- MongoBD 3.8.3 ou superior
- Ngrok

Softwares necessários para execução dos testes:

- Koin-test 0.9.3 ou superior
- Junit-jupiter-api 5.4.1 ou superior
- Rest-assured 3.3.0 ou superior

Dependências de Build

- Javalin
- Kmongo
- Koin
- Konfig
- Gson

# Event Endpoint

http://localhost:7000/issues/{number}/events

Response Json (exemplo)

[ { "action": "OPENED", "number": 5, "title": "Issue - teste", "createdAt": "Apr 26, 2019 4:28:18 PM", "updatedAt": "Apr 26, 2019 4:28:18 PM", "comments": "0", "login": "NiqueSantos", "body": "ok", "id": 437813957 }, { "action": "CREATED", "number": 5, "title": "Issue - teste", "createdAt": "Apr 26, 2019 4:28:18 PM", "updatedAt": "Apr 26, 2019 4:31:06 PM", "comments": "1", "login": "NiqueSantos", "body": "ok", "id": 437813957 }, { "action": "CLOSED", "number": 5, "title": "Issue - teste", "createdAt": "Apr 26, 2019 4:28:18 PM", "updatedAt": "Apr 26, 2019 4:35:42 PM", "comments": "1", "login": "NiqueSantos", "body": "ok", "id": 437813957 }, { "action": "REOPENED", "number": 5, "title": "Issue - teste", "createdAt": "Apr 26, 2019 4:28:18 PM", "updatedAt": "Apr 26, 2019 4:40:42 PM", "comments": "1", "login": "NiqueSantos", "body": "ok", "id": 437813957 } ]

HttpStatus suportados:

HttpStatus.BAD_REQUEST_400 HttpStatus.CREATED_201 HttpStatus.INTERNAL_SERVER_ERROR_500

# Webhook Endpoint

http://localhost:7000/webhook

Payload válido (exemplo)

{ "action": "reopened", "issue": { "url": "https://api.github.com/repos/NiqueSantos/OctoEvents/issues/5", "repository_url": "https://api.github.com/repos/NiqueSantos/OctoEvents", "labels_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/issues/5/labels{/name}", "comments_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/issues/5/comments", "events_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/issues/5/events", "html_url": "https://github.com/NiqueSantos/OctoEvents/issues/5", "id": 437813957, "node_id": "MDU6SXNzdWU0Mzc4MTM5NTc=", "number": 5, "title": "Issue - teste", "user": { "login": "NiqueSantos", "id": 16803356, "node_id": "MDQ6VXNlcjE2ODAzMzU2", "avatar_url": "https://avatars1.githubusercontent.com/u/16803356?v=4", "gravatar_id": "", "url": "https://api.github.com/users/NiqueSantos", "html_url": "https://github.com/NiqueSantos", "followers_url": "https://api.github.com/users/NiqueSantos/followers", "following_url": "https://api.github.com/users/NiqueSantos/following{/other_user}", "gists_url": "https://api.github.com/users/NiqueSantos/gists{/gist_id}", "starred_url": "https://api.github.com/users/NiqueSantos/starred{/owner}{/repo}", "subscriptions_url": "https://api.github.com/users/NiqueSantos/subscriptions", "organizations_url": "https://api.github.com/users/NiqueSantos/orgs", "repos_url": "https://api.github.com/users/NiqueSantos/repos", "events_url": "https://api.github.com/users/NiqueSantos/events{/privacy}", "received_events_url": "https://api.github.com/users/NiqueSantos/received_events", "type": "User", "site_admin": false }, "labels": [], "state": "open", "locked": false, "assignee": null, "assignees": [], "milestone": null, "comments": 1, "created_at": "2019-04-26T19:28:18Z", "updated_at": "2019-04-26T19:40:42Z", "closed_at": null, "author_association": "OWNER", "body": "ok" }, "repository": { "id": 183075360, "node_id": "MDEwOlJlcG9zaXRvcnkxODMwNzUzNjA=", "name": "OctoEvents", "full_name": "NiqueSantos/OctoEvents", "private": false, "owner": { "login": "NiqueSantos", "id": 16803356, "node_id": "MDQ6VXNlcjE2ODAzMzU2", "avatar_url": "https://avatars1.githubusercontent.com/u/16803356?v=4", "gravatar_id": "", "url": "https://api.github.com/users/NiqueSantos", "html_url": "https://github.com/NiqueSantos", "followers_url": "https://api.github.com/users/NiqueSantos/followers", "following_url": "https://api.github.com/users/NiqueSantos/following{/other_user}", "gists_url": "https://api.github.com/users/NiqueSantos/gists{/gist_id}", "starred_url": "https://api.github.com/users/NiqueSantos/starred{/owner}{/repo}", "subscriptions_url": "https://api.github.com/users/NiqueSantos/subscriptions", "organizations_url": "https://api.github.com/users/NiqueSantos/orgs", "repos_url": "https://api.github.com/users/NiqueSantos/repos", "events_url": "https://api.github.com/users/NiqueSantos/events{/privacy}", "received_events_url": "https://api.github.com/users/NiqueSantos/received_events", "type": "User", "site_admin": false }, "html_url": "https://github.com/NiqueSantos/OctoEvents", "description": "Teste Jaya Tech", "fork": false, "url": "https://api.github.com/repos/NiqueSantos/OctoEvents", "forks_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/forks", "keys_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/keys{/key_id}", "collaborators_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/collaborators{/collaborator}", "teams_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/teams", "hooks_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/hooks", "issue_events_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/issues/events{/number}", "events_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/events", "assignees_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/assignees{/user}", "branches_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/branches{/branch}", "tags_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/tags", "blobs_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/git/blobs{/sha}", "git_tags_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/git/tags{/sha}", "git_refs_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/git/refs{/sha}", "trees_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/git/trees{/sha}", "statuses_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/statuses/{sha}", "languages_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/languages", "stargazers_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/stargazers", "contributors_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/contributors", "subscribers_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/subscribers", "subscription_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/subscription", "commits_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/commits{/sha}", "git_commits_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/git/commits{/sha}", "comments_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/comments{/number}", "issue_comment_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/issues/comments{/number}", "contents_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/contents/{+path}", "compare_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/compare/{base}...{head}", "merges_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/merges", "archive_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/{archive_format}{/ref}", "downloads_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/downloads", "issues_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/issues{/number}", "pulls_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/pulls{/number}", "milestones_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/milestones{/number}", "notifications_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/notifications{?since,all,participating}", "labels_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/labels{/name}", "releases_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/releases{/id}", "deployments_url": "https://api.github.com/repos/NiqueSantos/OctoEvents/deployments", "created_at": "2019-04-23T18:38:44Z", "updated_at": "2019-04-26T13:44:10Z", "pushed_at": "2019-04-26T13:44:08Z", "git_url": "git://github.com/NiqueSantos/OctoEvents.git", "ssh_url": "git@github.com:NiqueSantos/OctoEvents.git", "clone_url": "https://github.com/NiqueSantos/OctoEvents.git", "svn_url": "https://github.com/NiqueSantos/OctoEvents", "homepage": null, "size": 1, "stargazers_count": 0, "watchers_count": 0, "language": null, "has_issues": true, "has_projects": true, "has_downloads": true, "has_wiki": true, "has_pages": false, "forks_count": 0, "mirror_url": null, "archived": false, "disabled": false, "open_issues_count": 2, "license": null, "forks": 0, "open_issues": 2, "watchers": 0, "default_branch": "master" }, "sender": { "login": "NiqueSantos", "id": 16803356, "node_id": "MDQ6VXNlcjE2ODAzMzU2", "avatar_url": "https://avatars1.githubusercontent.com/u/16803356?v=4", "gravatar_id": "", "url": "https://api.github.com/users/NiqueSantos", "html_url": "https://github.com/NiqueSantos", "followers_url": "https://api.github.com/users/NiqueSantos/followers", "following_url": "https://api.github.com/users/NiqueSantos/following{/other_user}", "gists_url": "https://api.github.com/users/NiqueSantos/gists{/gist_id}", "starred_url": "https://api.github.com/users/NiqueSantos/starred{/owner}{/repo}", "subscriptions_url": "https://api.github.com/users/NiqueSantos/subscriptions", "organizations_url": "https://api.github.com/users/NiqueSantos/orgs", "repos_url": "https://api.github.com/users/NiqueSantos/repos", "events_url": "https://api.github.com/users/NiqueSantos/events{/privacy}", "received_events_url": "https://api.github.com/users/NiqueSantos/received_events", "type": "User", "site_admin": false } }

HttpStatus suportados:

HttpStatus.BAD_REQUEST_400 HttpStatus.CREATED_201 HttpStatus.INTERNAL_SERVER_ERROR_500
