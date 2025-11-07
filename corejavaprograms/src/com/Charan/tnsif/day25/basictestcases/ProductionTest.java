//program to demonstrate test suite
package com.Charan.tnsif.day25.basictestcases;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import com.Charan.tnsif.day25.basictestcases.testsuiteclasses.ClassATest;
import com.Charan.tnsif.day25.basictestcases.testsuiteclasses.ClassBTest;



@Suite
@SelectClasses({ClassATest.class,ClassBTest.class})
//@SelectPackages("com.tns.basictestcases.testsuiteclasses")
@IncludeTags("production")
//@IncludeTags({"production","development"})
public class ProductionTest
{
}