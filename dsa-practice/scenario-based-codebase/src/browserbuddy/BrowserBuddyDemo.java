package browserbuddy;

public class BrowserBuddyDemo {
	public static void main(String[] args) {
        BrowserTab tab = new BrowserTab();
        TabManager manager = new TabManager();

        tab.visit("google.com");
        tab.visit("github.com");
        tab.visit("stackoverflow.com");

        tab.back();
        tab.back();
        tab.forward();

        manager.closeTab(tab);

        BrowserTab restoredTab = manager.restoreTab();
        if (restoredTab != null) {
            System.out.println("Current page: " + restoredTab.getCurrentPage());
        }
    }
}
