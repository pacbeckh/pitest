/*
 * Copyright 2011 Henry Coles
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and limitations under the License. 
 */
package org.pitest.testng;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.testng.AbstractClass;
import com.example.testng.AnnotatedAtClassLevel;
import com.example.testng.AnnotatedAtMethodLevel;

public class TestNGTestUnitFinderTest {

  private TestNGTestUnitFinder testee;

  @Before
  public void setUp() {
    this.testee = new TestNGTestUnitFinder();
  }

  @Test
  public void shouldFindSingleTestUnitForAllPublicMethodsInAnnotatedClass() {
    assertEquals(1, this.testee.findTestUnits(AnnotatedAtClassLevel.class)
        .size());
  }

  @Test
  public void shouldFindTestUnitForEachMethodInClassWithAnnotatedMethods() {
    assertEquals(2, this.testee.findTestUnits(AnnotatedAtMethodLevel.class)
        .size());
  }

  @Test
  public void shouldFindNoTestUnitsInUnannotatedClasses() {
    assertEquals(0, this.testee.findTestUnits(String.class).size());
  }

  @Test
  public void shouldNotFindTestUnitsInAbstractClasses() {
    assertEquals(0, this.testee.findTestUnits(AbstractClass.class).size());
  }

}
