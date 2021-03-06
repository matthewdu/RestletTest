package hummingbirdParser;

import org.json.JSONException;

import com.mashape.unirest.http.JsonNode;

public class Anime {
	private String slug;
	private String status;
	private String url;
	private String title;
	private int episode_count;
	private String cover_image;
	private String synopsis;
	private String show_type;
	
	public Anime(JsonNode myNode) throws JSONException{
		this.title = myNode.getObject().get("title").toString();
		this.status = myNode.getObject().get("status").toString();
		this.url = myNode.getObject().get("url").toString();
		this.episode_count = Integer.parseInt(myNode.getObject().get("episode_count").toString());
		this.cover_image = myNode.getObject().get("cover_image").toString();
		this.show_type = myNode.getObject().get("show_type").toString();
		this.synopsis = myNode.getObject().get("synopsis").toString();
	}
	
	public String toString(){
		return title + "\n"
			+	"Episodes: " + episode_count + "\n"
			+	"Status: " + status + "\n"
			+	"Type: " + show_type + "\n"
			+	"Synopsis: " + synopsis + "\n";
	}
}
