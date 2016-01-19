/*--------------------------------------------------------------*/
/* Licensed to the Apache Software Foundation (ASF) under one   */
/* or more contributor license agreements.  See the NOTICE file */
/* distributed with this work for additional information        */
/* regarding copyright ownership.  The ASF licenses this file   */
/* to you under the Apache License, Version 2.0 (the            */
/* "License"); you may not use this file except in compliance   */
/* with the License.  You may obtain a copy of the License at   */
/*                                                              */
/*   http://www.apache.org/licenses/LICENSE-2.0                 */
/*                                                              */
/* Unless required by applicable law or agreed to in writing,   */
/* software distributed under the License is distributed on an  */
/* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       */
/* KIND, either express or implied.  See the License for the    */
/* specific language governing permissions and limitations      */
/* under the License.                                           */
/*--------------------------------------------------------------*/

package org.corehunter.tests;

import uno.informatics.common.model.ContinuousScale;
import uno.informatics.common.model.DataType;
import uno.informatics.common.model.ScaleType;

/**
 * @author Guy Davenport
 */
public class MockRangeScale extends MockScale implements ContinuousScale {

    private Number min;
    private Number max;

    public MockRangeScale(DataType dataType, ScaleType scaleType, int min, int max) {
        super(dataType, scaleType);

        this.min = min;
        this.max = max;
    }

    public MockRangeScale(DataType dataType, ScaleType scaleType, double min, double max) {
        super(dataType, scaleType);

        this.min = min;
        this.max = max;
    }

    /* (non-Javadoc)
     * @see uno.informatics.model.ContinuousScale#getMaximumValue()
     */
    @Override
    public Number getMaximumValue() {
        // TODO Auto-generated method stub
        return max;
    }

    /* (non-Javadoc)
     * @see uno.informatics.model.ContinuousScale#setMaximumValue(java.lang.Number)
     */
    @Override
    public void setMaximumValue(Number minimumValue) {
        // TODO Auto-generated method stub
    }

    /* (non-Javadoc)
     * @see uno.informatics.model.ContinuousScale#getMinimumValue()
     */
    @Override
    public Number getMinimumValue() {
        // TODO Auto-generated method stub
        return min;
    }

    /* (non-Javadoc)
     * @see uno.informatics.model.ContinuousScale#setMinimumValue(java.lang.Number)
     */
    @Override
    public void setMinimumValue(Number minimumValue) {
        // TODO Auto-generated method stub
    }

}
