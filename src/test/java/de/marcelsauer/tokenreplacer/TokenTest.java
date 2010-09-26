/**
 * Token Replacer
 * Copyright (C) 2010 Marcel Sauer <marcel DOT sauer AT gmx DOT de>
 *
 * This file is part of Token Replacer.
 *
 * Token Replacer is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * Token Replacer is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Token Replacer. If not, see <http://www.gnu.org/licenses/>.
 */
package de.marcelsauer.tokenreplacer;

import org.junit.Test;

/**
 * @author msauer
 * 
 */
public class TokenTest {

	@Test(expected=IllegalArgumentException.class)
	public void thatEmptyTokenNameResultsInException() {
		new Token("");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void thatEmptyGeneratorResultsInException() {
		new Token("aa").replacedBy("");
	}

}
