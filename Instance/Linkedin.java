class Linkedin {
    public String username = "DefaultUser";
    public int connections;
    public double profileScore;
    public float endorsements;
    public long posts;
    public boolean premium;
    public char badge;

    public String userNameInfo() {
        System.out.println(username);
        username = "Pavan Kumar";
        System.out.println(username);
        return username;
    }

    public int connectionCount() {
        System.out.println(connections);
        connections = 500;
        System.out.println(connections);
        return connections;
    }

    public double profileStrength() {
        System.out.println(profileScore);
        profileScore = 87.5;
        System.out.println(profileScore);
        return profileScore;
    }

    public float endorsementCount() {
        System.out.println(endorsements);
        endorsements = 34.7f;
        System.out.println(endorsements);
        return endorsements;
    }

    public char profileBadge() {
        System.out.println(badge);
        badge = 'G';   // G for "Gold" badge
        System.out.println(badge);
        return badge;
    }
}

