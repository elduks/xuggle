/*******************************************************************************
 * Copyright (c) 2008, 2010 Xuggle Inc.  All rights reserved.
 *  
 * This file is part of Xuggle-Utils.
 *
 * Xuggle-Utils is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Xuggle-Utils is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Xuggle-Utils.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/

package com.xuggle.test_utils;

import java.util.UUID;

/**
 * A collection of utilities that might be useful for testing.
 * 
 * @author aclarke
 *
 */
public class TestUtils
{
  private TestUtils() {}
  
  /**
   * This method returns the name of the method that called it.
   * @return the name of the calling method, or a unique name if unknown.
   */
  public static String getNameOfCallingMethod()
  {
    try {
      throw new RuntimeException();
    }
    catch(RuntimeException e)
    {
      e.fillInStackTrace();
      StackTraceElement[] elements = e.getStackTrace();
      if (elements != null && elements.length > 2)
      {
        return elements[1].getMethodName();
      }
    }
    return "unknownMethod"+UUID.randomUUID().toString(); 
  }
}
