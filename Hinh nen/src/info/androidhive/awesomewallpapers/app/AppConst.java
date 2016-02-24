package info.androidhive.awesomewallpapers.app;

public class AppConst {

	// Number of columns of Grid View
	// by default 2 but user can configure this in settings activity
	public static final int NUM_OF_COLUMNS = 2;

	// Gridview image padding
	public static final int GRID_PADDING = 2; // in dp

	// Gallery directory name to save wallpapers
	public static final String SDCARD_DIR_NAME = "Hình nền Luong Le";

	// Picasa/Google web album username
	public static final String LUOGLE95 = "luogle95@gmail.com";

	// Public albums list url // _PICASA_USER_
	public static final String URL_PICASA_ALBUMS = "https://picasaweb.google.com/data/feed/api/user/luogle95?kind=album&alt=json"; 

	// Picasa album photos url
	public static final String URL_ALBUM_PHOTOS = "https://picasaweb.google.com/data/feed/api/user/luogle95/albumid/_ALBUM_ID_?alt=json";

	// Picasa recenlty added photos url
	public static final String URL_RECENTLY_ADDED = "https://picasaweb.google.com/data/feed/api/user/luogle95?kind=photo&alt=json";
}