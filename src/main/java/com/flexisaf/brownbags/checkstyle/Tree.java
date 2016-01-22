package com.flexisaf.brownbags.checkstyle;

import java.util.List;

/**
 * Created by peter on 1/22/16.
 */

public class Tree extends BadPlant {
	private List leaves;

	@Override
	protected void validate() {
		super.validate();
		if (leaves == null) throw new IllegalArgumentException("No leaves!");
	}

	public void grow() {
		validate();
	}
}
