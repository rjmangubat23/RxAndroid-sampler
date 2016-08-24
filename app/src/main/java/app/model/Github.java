package app.model;

public class Github {
    private String login;
    private String blog;
    private int public_repos;

    public String getLogin() {
        return login;
    }

    public String getBlog() {
        return blog;
    }

    public int getPublicRepos() {
        return public_repos;
    }
    @Override
    public String toString()
    {
        return "ClassPojo [login = "+login+", blog = "+blog+", public_repos = "+public_repos+"]";
    }
}
