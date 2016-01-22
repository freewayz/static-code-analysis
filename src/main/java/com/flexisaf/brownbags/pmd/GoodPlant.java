package com.flexisaf.brownbags.pmd;

/**
 * Created by peter on 1/22/16.
 */
public abstract  class GoodPlant {
	private String roots;
	private String trunk;

	private void validate() {
		if (roots == null) throw new IllegalArgumentException("No roots!");
		if (trunk == null) throw new IllegalArgumentException("No trunk!");
		validateEx();
	}

	protected void validateEx() { }

	public abstract void grow();
}
