package org.kuzz.chat.users;

public class User
{
	private String userID = null;
	private String username = null;
	private String avatarURL = null;

	public User()
	{
	}

	public String getUserID()
	{
		return userID;
	}

	public void setUserID(String userID)
	{
		this.userID = userID;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getAvatarURL()
	{
		return avatarURL;
	}

	public void setAvatarURL(String avatarURL)
	{
		this.avatarURL = avatarURL;
	}

}
