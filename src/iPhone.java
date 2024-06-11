public class iPhone implements MusicPlayer, Phone, InternetBrowser {

    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music...");
    }

    @Override
    public void selectTrack(String trackName) {
        System.out.println("Selecting track: " + trackName);
    }

    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Making call to: " + phoneNumber);
    }

    @Override
    public void receiveCall(String phoneNumber) {
        System.out.println("Receiving call from: " + phoneNumber);
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to: " + url);
    }

    @Override
    public void reloadPage() {
        System.out.println("Reloading page...");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing browser...");
    }
}
