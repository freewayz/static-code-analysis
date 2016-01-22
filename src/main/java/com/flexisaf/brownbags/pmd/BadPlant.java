package com.flexisaf.brownbags.checkstyle;

/**
 * Created by peter on 1/22/16.
 */
public abstract class BadPlant {
	private String roots;
	private String trunk;

	protected void validate() {
		if (roots == null) throw new IllegalArgumentException("No roots!");
		if (trunk == null) throw new IllegalArgumentException("No trunk!");
	}

	public abstract void grow();
}
