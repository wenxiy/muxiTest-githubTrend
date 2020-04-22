package service.entity;

import java.util.List;

public class Repositories {

    /**
     * author : claudiodangelis
     * name : qrcp
     * avatar : https://github.com/claudiodangelis.png
     * url : https://github.com/claudiodangelis/qrcp
     * description : ⚡ Transfer files over wifi from your computer to your mobile device by scanning a QR code without leaving the terminal.
     * language : Go
     * languageColor : #00ADD8
     * stars : 4217
     * forks : 221
     * currentPeriodStars : 412
     * builtBy : [{"username":"claudiodangelis","href":"https://github.com/claudiodangelis","avatar":"https://avatars3.githubusercontent.com/u/941963"},{"username":"brualan","href":"https://github.com/brualan","avatar":"https://avatars2.githubusercontent.com/u/22512388"},{"username":"tssva","href":"https://github.com/tssva","avatar":"https://avatars0.githubusercontent.com/u/20547545"},{"username":"hellozee","href":"https://github.com/hellozee","avatar":"https://avatars0.githubusercontent.com/u/12135951"},{"username":"rafa-acioly","href":"https://github.com/rafa-acioly","avatar":"https://avatars0.githubusercontent.com/u/11068059"}]
     */

    private String author;
    private String name;
    private String avatar;
    private String url;
    private String description;
    private String language;
    private String languageColor;
    private int stars;
    private int forks;
    private int currentPeriodStars;
    private List<BuiltByBean> builtBy;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguageColor() {
        return languageColor;
    }

    public void setLanguageColor(String languageColor) {
        this.languageColor = languageColor;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getForks() {
        return forks;
    }

    public void setForks(int forks) {
        this.forks = forks;
    }

    public int getCurrentPeriodStars() {
        return currentPeriodStars;
    }

    public void setCurrentPeriodStars(int currentPeriodStars) {
        this.currentPeriodStars = currentPeriodStars;
    }

    public List<BuiltByBean> getBuiltBy() {
        return builtBy;
    }

    public void setBuiltBy(List<BuiltByBean> builtBy) {
        this.builtBy = builtBy;
    }

    public static class BuiltByBean {
        /**
         * username : claudiodangelis
         * href : https://github.com/claudiodangelis
         * avatar : https://avatars3.githubusercontent.com/u/941963
         */

        private String username;
        private String href;
        private String avatar;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
    }
}
