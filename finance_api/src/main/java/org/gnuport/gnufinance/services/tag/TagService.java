package services.tag;

import beans.TagBean;

public class TagService {
	public boolean addTag(String tag) {
		return false;
	}
	
	/**
	 * Searches for a Tag using the name of tag.
	 * @param tag
	 * @return Returns a {@link TagBean} if found, or null if tag was not found.
	 */
	public TagBean searchTag(String tag) {
		return null;
	}

	/**
	 * Searches for a Tag using the id of tag
	 * @param id
	 * @return Returns a {@link TagBena} if found, or null if tag was not found.
	 */
	public TagBean searchTag(long id) {
		return null;
	}
	
	public boolean isTagAvailable(String tag) {
		return false;
	}
	
	public TagBean[] getTags() {
		return null;
	}
}
