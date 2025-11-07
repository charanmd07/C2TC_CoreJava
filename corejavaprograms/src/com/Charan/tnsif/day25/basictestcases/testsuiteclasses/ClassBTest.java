//test case for development 
package com.Charan.tnsif.day25.basictestcases.testsuiteclasses;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class ClassBTest {
	@Test
	@Tag("development")
	void testCaseA(TestInfo testInfo) { //run in all environments
	}
}
