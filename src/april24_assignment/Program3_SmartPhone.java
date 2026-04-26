package april24_assignment;

interface Camera {
	default void takePhoto() {
		System.out.println("Photo captured successfully ");

	}
}

interface MusicPlayer {
	default void playMusic() {
		System.out.println("Playing music...");
	}
}

interface SmartFeatures {

	default void connectToWifi() {
		System.out.println("Connected to WiFi");
	}

}

public class Program3_SmartPhone implements Camera, MusicPlayer, SmartFeatures {

	public static void main(String[] args) {
		Program3_SmartPhone sm = new Program3_SmartPhone();
		sm.takePhoto();
		sm.playMusic();
		sm.connectToWifi();

	}

}
