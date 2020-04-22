package service.entity;

public class Developers {


    /**
     * username : jquense
     * name : Jason Quense
     * url : https://github.com/jquense
     * avatar : https://avatars2.githubusercontent.com/u/339286
     * repo : {"name":"yup","description":"Dead simple Object schema validation","url":"https://github.com/jquense/yup"}
     */

    private String username;
    private String name;
    private String url;
    private String avatar;
    private RepoBean repo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public RepoBean getRepo() {
        return repo;
    }

    public void setRepo(RepoBean repo) {
        this.repo = repo;
    }

    public static class RepoBean {
        /**
         * name : yup
         * description : Dead simple Object schema validation
         * url : https://github.com/jquense/yup
         */

        private String name;
        private String description;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
