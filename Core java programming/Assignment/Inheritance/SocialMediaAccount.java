
 class SocialMediaAccount 
{
	String user_name;
	String email;
	String is_public;
	String is_verified;
	String country_origin;
	int no_of_post;
	int like;
	int comments;
	int created_at;
	int no_of_impression;
	
 SocialMediaAccount()
{
	System.out.println("default constructor of social media account");
	user_name = "pragati";
	email = "pragati@gmail.com";
	is_public = "private";
	is_verified = "not verified";
	country_origin = "India";
	no_of_post = 58;
	like = 1000;
	comments = 290;
	created_at = 29/9/2019;
	no_of_impression = 500;
}

 SocialMediaAccount(String user_name, String email, String is_public, String is_verified, String country_origin,
		int no_of_post, int like, int comments, int created_at, int no_of_impression) {

	System.out.println("parameterized constructor social media account");
	this.user_name = user_name;
	this.email = email;
	this.is_public = is_public;
	this.is_verified = is_verified;
	this.country_origin = country_origin;
	this.no_of_post = no_of_post;
	this.like = like;
	this.comments = comments;
	this.created_at = created_at;
	this.no_of_impression = no_of_impression;
}

 String getUser_name() {
	return user_name;
}

 void setUser_name(String user_name) {
	this.user_name = user_name;
}

 String getEmail() {
	return email;
}

 void setEmail(String email) {
	this.email = email;
}

 String getIs_public() {
	return is_public;
}

 void setIs_public(String is_public) {
	this.is_public = is_public;
}

 String getIs_verified() {
	return is_verified;
}

 void setIs_verified(String is_verified) {
	this.is_verified = is_verified;
}

 String getCountry_origin() {
	return country_origin;
}

 void setCountry_origin(String country_origin) {
	this.country_origin = country_origin;
}

 int getNo_of_post() {
	return no_of_post;
}

 void setNo_of_post(int no_of_post) {
	this.no_of_post = no_of_post;
}

 int getLike() {
	return like;
}

 void setLike(int like) {
	this.like = like;
}

 int getComments() {
	return comments;
}

 void setComments(int comments) {
	this.comments = comments;
}

 int getCreated_at() {
	return created_at;
}

 void setCreated_at(int created_at) {
	this.created_at = created_at;
}

 int getNo_of_impression() {
	return no_of_impression;
}

 void setNo_of_impression(int no_of_impression) {
	this.no_of_impression = no_of_impression;
}

void display()//class  display here
  {
		
		System.out.println("user_name is:"+this.user_name);
		System.out.println("email is:"+this.email);
		System.out.println("is_public is:"+this.is_public);
		System.out.println("is_verified is:"+this.is_verified);
		System.out.println("country_origin is:"+this.country_origin);
		System.out.println("no_of_post is:"+this.no_of_post);
		System.out.println("like is:"+this.like);
		System.out.println("comments is:"+this.comments);
		System.out.println("created_at is:"+this.created_at);
		System.out.println("no_of_impression is:"+this.no_of_impression);
		System.out.println("\n\n");

  }

}

class IstagramAccount extends SocialMediaAccount
{

	int no_of_followers;
	int no_of_following;
	int highlights;
	int no_of_post_archived;
	int no_of_story_archived;
	int no_of_audio_saved;
	
	
	 IstagramAccount() 
	{
		super();
		System.out.println("default constructor");
		
	}


	 IstagramAccount(String user_name, String email, String is_public, String is_verified, String country_origin,
				int no_of_post, int like, int comments, int created_at, int no_of_impression,int no_of_followers, int no_of_following, int highlights, int no_of_post_archived,
			int no_of_story_archived, int no_of_audio_saved) {
		super(user_name,  email,  is_public,  is_verified,  country_origin, no_of_post,  like,  comments,  created_at,  no_of_impression);
		System.out.println("parameterized constructor");
		this.no_of_followers = no_of_followers;
		this.no_of_following = no_of_following;
		this.highlights = highlights;
		this.no_of_post_archived = no_of_post_archived;
		this.no_of_story_archived = no_of_story_archived;
		this.no_of_audio_saved = no_of_audio_saved;
	}


	 int getNo_of_followers() {
		return no_of_followers;
	}


	 void setNo_of_followers(int no_of_followers) {
		this.no_of_followers = no_of_followers;
	}


	 int getNo_of_following() {
		return no_of_following;
	}


	 void setNo_of_following(int no_of_following) {
		this.no_of_following = no_of_following;
	}


	 int getHighlights() {
		return highlights;
	}


	 void setHighlights(int highlights) {
		this.highlights = highlights;
	}


	 int getNo_of_post_archived() {
		return no_of_post_archived;
	}


	 void setNo_of_post_archived(int no_of_post_archived) {
		this.no_of_post_archived = no_of_post_archived;
	}


	 int getNo_of_story_archived() {
		return no_of_story_archived;
	}


	 void setNo_of_story_archived(int no_of_story_archived) {
		this.no_of_story_archived = no_of_story_archived;
	}


	 int getNo_of_audio_saved() {
		return no_of_audio_saved;
	}


	 void setNo_of_audio_saved(int no_of_audio_saved) {
		this.no_of_audio_saved = no_of_audio_saved;
	}
	void display()//class  display here
	  {
		   super.display();
			System.out.println("\n\n");
			System.out.println("this is instagram account class");
			System.out.println("no_of_followers is:"+this.no_of_followers);
			System.out.println("no_of_following is:"+this.no_of_following);
			System.out.println("highlights is:"+this.highlights);
			System.out.println("no_of_post_archived is:"+this.no_of_post_archived);
			System.out.println("no_of_story_archived is:"+this.no_of_story_archived);
			System.out.println("no_of_audio_saved is:"+this.no_of_audio_saved);
			System.out.println("\n\n");

	  }
	
}

class LikedIn extends SocialMediaAccount
{
	int no_of_connection;
	int no_of_profileview;
	int no_of_jobs_applied;
	
	 LikedIn()
	{
		System.out.println("default constructor");
	}

	 LikedIn(String user_name, String email, String is_public, String is_verified, String country_origin,
				int no_of_post, int like, int comments, int created_at, int no_of_impression,int no_of_connection, int no_of_profileview, int no_of_jobs_applied) {
			super(user_name,  email,  is_public,  is_verified,  country_origin, no_of_post,  like,  comments,  created_at,  no_of_impression);

		System.out.println("parameterized constructor");
		this.no_of_connection = no_of_connection;
		this.no_of_profileview = no_of_profileview;
		this.no_of_jobs_applied = no_of_jobs_applied;
	}

	 int getNo_of_connection() {
		return no_of_connection;
	}

	 void setNo_of_connection(int no_of_connection) {
		this.no_of_connection = no_of_connection;
	}

	 int getNo_of_profileview() {
		return no_of_profileview;
	}

	 void setNo_of_profileview(int no_of_profileview) {
		this.no_of_profileview = no_of_profileview;
	}

	 int getNo_of_jobs_applied() {
		return no_of_jobs_applied;
	}

	 void setNo_of_jobs_applied(int no_of_jobs_applied) {
		this.no_of_jobs_applied = no_of_jobs_applied;
	}
	
	void display()//class  display here
	  {
			super.display();
			//System.out.println("\n\n");
			System.out.println("this is linkedin class");
			System.out.println("no_of_connection is:"+this.no_of_connection);
			System.out.println("no_of_profileview is:"+this.no_of_profileview);
			System.out.println("no_of_jobs_applied is:"+this.no_of_jobs_applied);
			System.out.println("\n\n");

	  }
	
}

class Youtube extends SocialMediaAccount
{
	int no_of_subscribers;
	int watching_time;
	int is_monetized;
	 int estimated_revenue;
	 
	  Youtube()
	 {
		 System.out.println("default constructor");
	}

	  Youtube(String user_name, String email, String is_public, String is_verified, String country_origin,
				int no_of_post, int like, int comments, int created_at, int no_of_impression,int no_of_subscribers, int watching_time, int is_monetized, int estimated_revenue) {
			super(user_name,  email,  is_public,  is_verified,  country_origin, no_of_post,  like,  comments,  created_at,  no_of_impression);

		System.out.println("parameterized constructor");
		this.no_of_subscribers = no_of_subscribers;
		this.watching_time = watching_time;
		this.is_monetized = is_monetized;
		this.estimated_revenue = estimated_revenue;
	 }

	  int getNo_of_subscribers() {
		 return no_of_subscribers;
	 }

	  void setNo_of_subscribers(int no_of_subscribers) {
		 this.no_of_subscribers = no_of_subscribers;
	 }

	  int getWatching_time() {
		 return watching_time;
	 }

	  void setWatching_time(int watching_time) {
		 this.watching_time = watching_time;
	 }

	  int getIs_monetized() {
		 return is_monetized;
	 }

	  void setIs_monetized(int is_monetized) {
		 this.is_monetized = is_monetized;
	 }

	  int getEstimated_revenue() {
		 return estimated_revenue;
	 }

	  void setEstimated_revenue(int estimated_revenue) {
		 this.estimated_revenue = estimated_revenue;
	 }
	
	 void display()//class  display here
	  { 
		 	super.display();
			//System.out.println("\n\n");
	        System.out.println("this is youtube class");
			System.out.println("no_of_subscribers is:"+this.no_of_subscribers);
			System.out.println("watching_time is:"+this.watching_time);
			System.out.println("is_monetized is:"+this.is_monetized);
			System.out.println("estimated_revenue is:"+this.estimated_revenue);
			System.out.println("\n\n");

	  }
	 
}

class DemoSocialMediaAccount
{
	public static void main(String[] args)
	{
		SocialMediaAccount s1=new SocialMediaAccount();
		s1.display();
		
		IstagramAccount a1=new IstagramAccount();
		a1.display();
		
		LikedIn l1=new LikedIn();
		l1.display();
		
		Youtube y1=new Youtube();
		y1.display();
		
	}
}