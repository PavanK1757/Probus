class LinkedinRunner {
    public static void main(String[] args) {

        Linkedin userProfile = new Linkedin();
        userProfile.userNameInfo();

        Linkedin userConnections = new Linkedin();
        userConnections.connectionCount();

        Linkedin userStrength = new Linkedin();
        userStrength.profileStrength();

        Linkedin userEndorsements = new Linkedin();
        userEndorsements.endorsementCount();

        Linkedin userBadge = new Linkedin();
        userBadge.profileBadge();
    }
}
